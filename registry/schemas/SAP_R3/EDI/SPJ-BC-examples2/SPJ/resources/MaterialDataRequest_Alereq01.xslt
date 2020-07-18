<?xml version="1.0" encoding="UTF-8"?>

<!--
This is a sample XSLT stylesheet demonstrating transformming from an external XML format to the SAP IDOC-XML format.
-->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="xml" version="1.0" indent="yes"/>
  
  <xsl:template match="/">
    <ALEREQ01>
      <IDOC BEGIN="1">
        <EDI_DC40 SEGMENT="1">
          <TABNAM>EDI_DC40</TABNAM>
          <DIRECT>2</DIRECT>
          <SNDPRT>LS</SNDPRT>
          <SNDPRN>SPJ</SNDPRN>
          <MESTYP>MATFET</MESTYP>
          <IDOCTYP>ALEREQ01</IDOCTYP>
        </EDI_DC40>
        <E1ALER1 SEGMENT="1">
          <MESTYP>MATMAS</MESTYP>
          <MESTYP40>MATMAS</MESTYP40>
          <E1ALEQ1 SEGMENT="1">
            <OBJVALUE>MATNR</OBJVALUE>
            <SIGN>I</SIGN>
            <OPTION>EQ</OPTION>
            <LOW><xsl:value-of select="MaterialDataRequest/MaterialNumber/text()"/></LOW>
          </E1ALEQ1>
        </E1ALER1>
      </IDOC>
    </ALEREQ01>
  </xsl:template>
  
</xsl:stylesheet>
