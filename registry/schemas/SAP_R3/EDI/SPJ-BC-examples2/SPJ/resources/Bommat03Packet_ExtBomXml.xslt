<?xml version="1.0" encoding="UTF-8"?>

<!--
This is a sample XSLT stylesheet demonstrating transformming from SAP IDOC-XML format to an external XML format.
We use the Navigational Stylesheet XSLT design pattern here.
For the sake of simplicity, following assumptions/restrictions are assumed:
  There is only one instance of the BOMMAT03 IDOC in the source XML document.
  There is only one instance of E1MASTM segment under E1STZUM segment.
  There is only one instance of E1STPOM segment under E1STZUM sgement.
-->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:lookup="java:com.spj.sbcarticle.Lookup">
  <xsl:output method="xml" version="1.0" indent="yes"/>
  
  <xsl:script implements-prefix="lookup" language="java" src="java:com.spj.sbcarticle.Lookup"/>
  
  <xsl:template match="BOMMAT03">
  	<BillOfMaterials>
  		<xsl:apply-templates/>
  	</BillOfMaterials>
  </xsl:template>
  
  <xsl:template match="IDOC">
    <xsl:call-template name="process-bommat03idoc"/>
  </xsl:template>	
  
  <!-- process one BOMMAT03 IDOC instance -->
  <xsl:template name="process-bommat03idoc">
    <BillOfMaterial>
      <xsl:attribute name="MaterialNumber">
      	<xsl:value-of select="E1STZUM/E1MASTM/MATNR/text()"/>
      </xsl:attribute>
      <Category>
        <xsl:value-of select="E1STZUM/STLTY/text()"/>
      </Category>
      <Plant>
        <xsl:value-of select="E1STZUM/E1MASTM/WERKS/text()"/>
      </Plant>
      <ValidFromDate>
        <xsl:call-template name="convert-date">
          <xsl:with-param name="instring" select="E1STZUM/E1STKOM/DATUV/text()"/>
        </xsl:call-template>
      </ValidFromDate>
      <Quantity>
        <xsl:value-of select="E1STZUM/E1STKOM/BMENG_C/text()"/>
      </Quantity>
      <UnitOfMeasure>
        <xsl:value-of select="E1STZUM/E1STKOM/BMEIN/text()"/>
      </UnitOfMeasure>
      <Components>
        <xsl:for-each select="E1STZUM/E1STPOM">
          <xsl:call-template name="process-e1stpom"/>
        </xsl:for-each>
      </Components>
    </BillOfMaterial>
  </xsl:template>
  
  <!-- convert date from yyyymmdd to yy-mm-dd -->
  <xsl:template name="convert-date">
    <xsl:param name="instring" />
    <xsl:value-of select="substring($instring, 3, 2)"/><xsl:text>-</xsl:text><xsl:value-of select="substring($instring, 5,   2)"/><xsl:text>-</xsl:text><xsl:value-of select="substring($instring,   7, 2)"/>
  </xsl:template>
  
  <!-- process one E1STPOM segment instance -->
  <xsl:template name="process-e1stpom">
    <Component>
      <xsl:attribute name="itemnumber">
        <xsl:value-of select="POSNR/text()"/>
      </xsl:attribute>
      <MaterialNumber><xsl:value-of select="IDNRK/text()"/></MaterialNumber>

      <ItemCategory>
      	<xsl:call-template name="lookup-item-category">
      	  <xsl:with-param name="key" select="POSTP/text()"/>
	      </xsl:call-template>
       </ItemCategory>

      <Quantity><xsl:value-of select="MENGE_C/text()"/></Quantity>
      <UnitOfMeasure><xsl:value-of select="MEINS/text()"/></UnitOfMeasure>
    </Component>
  </xsl:template>
  
  <!-- lookup ItemCategory -->
  <xsl:template name="lookup-item-category">
    <xsl:param name="key"/>
    <!-- using xsl:choose to perform simple lookup -->
<!--
    <xsl:choose>
      <xsl:when test="$key = 'key1'">value1</xsl:when>
      <xsl:when test="$key = 'key2'">value2</xsl:when>
      <xsl:when test="$key = 'key3'">value3</xsl:when>
      <xsl:when test="$key = 'key4'">value4</xsl:when>
      <xsl:when test="$key = 'key5'">value5</xsl:when>
      <xsl:when test="$key = 'key6'">value6</xsl:when>
      <xsl:when test="$key = 'key7'">value7</xsl:when>
      <xsl:when test="$key = 'key8'">value8</xsl:when>
      <xsl:when test="$key = 'key9'">value9</xsl:when>
      <xsl:when test="$key = 'D'">Document item</xsl:when>
      <xsl:when test="$key = 'I'">PM structure element</xsl:when>
      <xsl:when test="$key = 'K'">Class item</xsl:when>
      <xsl:when test="$key = 'L'">Stock item</xsl:when>
      <xsl:when test="$key = 'M'">Phantom material</xsl:when>
      <xsl:when test="$key = 'N'">Non-stock item</xsl:when>
      <xsl:when test="$key = 'R'">Variable-size item</xsl:when>
      <xsl:when test="$key = 'T'">Text item</xsl:when>
    </xsl:choose>
-->
    <!-- calling Java extension function to perform lookup -->
    <xsl:value-of select="lookup:lookup(string($key))" />    
    
  </xsl:template>
</xsl:stylesheet>
