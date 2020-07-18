package spjexamples.idoc;

// -----( B2B Java Code Template v1.2
// -----( CREATED: Tue May 27 22:50:35 PDT 2003
// -----( ON-HOST: I800790.pal.sap-ag.de

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<B2B-START-IMPORTS>> ---
import java.io.*;
import java.util.*;
import java.sql.*;
import com.wm.pkg.sap.idoc.*;
// --- <<B2B-END-IMPORTS>> ---

public final class outbound
{
	// ---( internal utility methods )---

	final static outbound _instance = new outbound();

	static outbound _newInstance() { return new outbound(); }

	static outbound _cast(Object o) { return (outbound)o; }

	// ---( server methods )---



    public static final Values processBommat03SingleWithJava (Values in)
    {
        Values out = in;
		// --- <<B2B-START(processBommat03SingleWithJava)>> ---
		// @sigtype java 3.0
			// declaration of the IDOC segments
			IDOCSegment segE1STZUM = null;
			IDOCSegment segE1MASTM = null;
			IDOCSegment segE1STKOM = null;
			IDOCSegment segE1STPOM = null;
		
			// declaration of the fields
			// header (base) level data
			String category = null;
			String plant = null;
			String baseMaterialNumber = null;
			String strDATUV = null;
			String validFromDate = null;
			String baseQuantity = null;
			String baseUOM = null;
			// line item (component) level data
			String componentItemNumber = null;
			String componentMaterialNumber = null;
			String itemCategory = null;
			String componentQuantity = null;
			String componentUOM = null;
		  
			Values idoc_pipeline = in;
		
			try {
				// instantiate the IDOC based on the data in the pipeline
				IDOC idoc = new IDOC(idoc_pipeline);
		
				// find the E1STZUM segment and get the interested filed values
				segE1STZUM = idoc.findSegment("E1STZUM");
				category = segE1STZUM.getSDATA("STLTY");
		
				// find the E1MASTM segment and get the interested filed values
				segE1MASTM = idoc.findSegment("E1MASTM");
				plant = segE1MASTM.getSDATA("WERKS");
				baseMaterialNumber = segE1MASTM.getSDATA("MATNR");
		
				// find the E1STKOM segment and get the interested filed values
				segE1STKOM = idoc.findSegment("E1STKOM");
		
				// perform value transformation for date field
				strDATUV = segE1STKOM.getSDATA("DATUV");
				validFromDate = strDATUV.substring(2, 4) + "-" + strDATUV.substring(4, 6) + "-" + strDATUV.substring(6, 8);
		
				baseQuantity = segE1STKOM.getSDATA("BMENG_C");
				baseUOM = segE1STKOM.getSDATA("BMEIN");
				
				// loop throug all E1STPOM segments, get interested field values, and compose a record list
				int index = 0;
				segE1STPOM = null;
				Vector vecComponent = new Vector();
				// start from index 0, search for all E1STPOM segments
				while ((segE1STPOM = idoc.findSegment("E1STPOM", index)) != null) {
				  // set the index for next search, to start from the next segment
					index = segE1STPOM.getIndex() + 1;
					
					// get interested field values
					componentItemNumber = segE1STPOM.getSDATA("POSNR");
					componentMaterialNumber = segE1STPOM.getSDATA("IDNRK");
		
					// perform value lookup
					//   using property file
					itemCategory = lookupFile(segE1STPOM.getSDATA("POSTP") );
		/*			//   using DB table
					itemCategory = lookupDB(segE1STPOM.getSDATA("POSTP") );
		*/
					componentQuantity = segE1STPOM.getSDATA("MENGE_C");
					componentUOM = segE1STPOM.getSDATA("MEINS");
		
					// create a Record for the Component element
					Values valComponent = new Values();
					valComponent.put("@itemnumber", componentItemNumber);
					valComponent.put("MaterialNumber", componentMaterialNumber);
					valComponent.put("ItemCategory", itemCategory);
					valComponent.put("Quantity", componentQuantity);
					valComponent.put("UnitOfMeasure", componentUOM);
					
					// add the Component record to the Components vector
					vecComponent.add(valComponent);
				}
				
				// convert the Components vector to a Record List
				int size = vecComponent.size();
				Values[] component = new Values[size];
				for (int i=0; i < size; i++) {
					component[i] = (Values) vecComponent.elementAt(i);
				}
		
				Values components = new Values();
				components.put("Component", component);
		
				// assemble the record corresponds to the target XML format
				Values valBillOfMaterial = new Values();
				valBillOfMaterial.put("@MaterialNumber", baseMaterialNumber);
				valBillOfMaterial.put("Category", category);
				valBillOfMaterial.put("Plant", plant);
				valBillOfMaterial.put("ValidFromDate", validFromDate);
				valBillOfMaterial.put("Quantity", baseQuantity);
				valBillOfMaterial.put("UnitOfMeasure", baseUOM);
				valBillOfMaterial.put("Components", components);
		
				Values valXML = new Values();
				valXML.put("BillOfMaterial", valBillOfMaterial);
		
				// use pub.web:recordToDocument to convert the record to a XML string
				in.put("boundNode", valXML);
				Service.doInvoke("pub.web", "recordToDocument", in);
				String xmlString = in.getString("xmldata");
		
				// get the $tid value from the pipeline
				String tid = in.getString("$tid");
		
				// use pub.client:http to post the XML string to the external HTTP server
				in.put("url", "http://localhost:4242");
				in.put("method", "POST");
				Values data = new Values();
				data.put("string", xmlString);
				in.put("data", data);
				Values headers = new Values();
				headers.put("Content-type", "text/xml");
				headers.put("trans-id", tid);
				in.put("headers", headers);
		
				Service.doInvoke("pub.client", "http", in);
			} catch (Exception e) {
				Service.throwError(e);
			}
		// --- <<B2B-END>> ---
        return out;
                
	}

	// --- <<B2B-START-SHARED>> ---
	// use static data member to cache the lookup data
	private static Properties lookupProp;
	// use static initializer to pre-load the lookup data from the file
	static {
	  try {
	    String lookupFilename = "packages/SPJ/resources/SbcLookupFile.txt";
	    FileInputStream fis = new FileInputStream(new File(lookupFilename));
		lookupProp = new Properties();
		lookupProp.load(fis);
	    fis.close();
	  } catch (Exception ex) {
	    ex.printStackTrace();
	  }
	}
	
	private static String lookupFile(String key) {
		// lookup
		String value = lookupProp.getProperty(key, "not found");
		return value;
	}
	
	private static String lookupDB(String key) {
		String value = "not found";
	
		// use JDBC to lookup value
		try {
			Connection con = DriverManager.getConnection("jdbc:odbc:SbcLookup", "", "");
			Statement stmt = con.createStatement();
			String queryStr = "select value from SbcLookupTable where key = '" + key + "'";
			ResultSet rs = stmt.executeQuery(queryStr);
			if (rs.next()) {
				value = rs.getString("value");
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return value;
	}
	// --- <<B2B-END-SHARED>> ---
}

