This is the download for the SAP Professional Journal Business Connector article. 

List of files
================================================================================
The following files are included:

  PerlServer.exe - this is a simple Perl script which acts as an HTTP server. It's handy for testing outbound HTTP transmissions.

  ExtBom.dtd - this is the DTD file of the external Bill Of Material XML format. It's the target format of the outbound IDoc mapping examples.
  ExtBomSample1.xml - a sample external Bill of Material XML document.

  MaterialDataRequest.dtd - this is the DTD file of the external XML document, which is used as the source format of the inbound IDoc mapping examples.
  MaterialDataRequestSample1.xml - this is the sample XML file that can be used as the source for the inbound IDoc mapping examples.

  Bommat03Sample1.xml - a sample IDoc-XML document for BOMMAT03 IDoc type.
  Alereq01Sample1.xml - a sample IDoc-XML document for ALEREQ01 IDoc type.

  Bommat03PacketPipeline.xml and Bommat03SinglePipeline.xml - these are captured pipeline files which contain sample IDoc packet and sample single IDoc respectively.

  com\spj\sbcarticle\Lookup.jar - the Java source code for the Java extension function, which is invoked from XSLT stylesheet.
  SpjSbcArticle.jar - the JAR created by compiling and packaging the above Java source. It should be put into the code\jars directory of the Business Connector SAP package, e.g., c:\sapbc46\server\package\SAP\code\jars. The BC server needs to be restarted to load the JAR.

  SPJ.zip - the example SPJ package for the Business Connector. All the BC elements are contained in this package. To load the package into BC, copy the SPJ.zip file to the replicate\inbound directory of your BC server, e.g. c:\sapbc46\server\replicate\inbound, start the BC server, and use Internet Explorer to access the BC Admin page at http://<sbchost>:<sbcport>, e.g. http://localhost:5555. Then select Packages -> Management -> Install Inbound Releases, select SPJ.zip, check "Activate upon installation", then click "Install Release". After the package is successfully installed, you should be able to view the content in the BC Developer. If you want to change the package elements, you may need to lock it first, by right-click on the element, then select "lock".

  readme.txt - this readme file.

List of elements contained in the example SPJ package
================================================================================
The example SPJ package for the Business Connector contains the following elements:
SPJ
  +- spjexamples
       +- idoc
            +- outbound
                 +- processBommat03PacketWithFlow
                 +- processBommat03PacketWithXslt
                 +- processBommat03SingleWithJava
                 +- testProcessBommat03SingleWithJava
       +- records
            +- Alereq01Rec
            +- BillOfMaterialRec
            +- Bommat03IdocRec
            +- Bommat03Rec
            +- ComponentRec
            +- E1stopmRec
            +- ExtBomRec
            +- MaterialDataRequestRec
            +- Orders02Rec
            +- schema_Alereq01Rec
            +- schema_Bommat03Rec
            +- schema_ExtBomRec
            +- schema_MaterialDataRequestRec
            +- schema_Orders02Rec
       +- util
            +- getConfigValue
            +- lookupDB
            +- lookupFile
            +- lookupStringTable
       +- xml
            +- receiving
                 +- Xml2IdocWithFlow
                 +- Xml2IdocWithJava
                 +- Xml2IdocWithXslt
                 +- testXml2IdocWithJava

The detailed explanations of all the examples can be found in the corresponding sections of the article text.


Errata
================================================================================
The errata list is a list of error(s) and their corrections that were found after the article went to print.

(1) Page 74 column 1 3rd paragraph, the last sentence:
      ... embedded element ExtBom/BillOfMaterials.
    Should be
      ... embedded element ExtBom/BillOfMaterials/BillOfMaterial.
      
(2) Page 88 Listing 11: Database Lookup via JDBC, line 16-18:
      16      if (rs != null) {
      17        rs.next();
      18        value = rs.getString("value");
    Should be:
      16      if (rs.next()) {
      17
      18        value = rs.getString("value");

    Correspondingly, page 88 column 2 line 6-14:
      ... If the database table lookup is successful, there should be one row in the ResultSet object; otherwise, the ResultSet object will be null. So, we first check that there is data returned as the result of the query (line 16), then we move the cursor to the first row of the ResultSet via rs.next() (line 17) and retrieve the value of the appropriate field (in this case value) as a string (line 18) ... 

    Should be:
      ... If the database table lookup is successful, there should be one row in the ResultSet object; otherwise, the ResultSet object will contain no rows.  So, we first check that there is data returned as the result of the query by trying to move the cursor to the first row of the ResultSet via rs.next() (line 16).  If the rs.next() returns true, we then retrieve the value of the appropriate field (in this case value) of the row as a string (line 18) ...
