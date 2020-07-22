package spjexamples.xml;

// -----( B2B Java Code Template v1.2
// -----( CREATED: Wed Nov 06 18:58:43 PST 2002
// -----( ON-HOST: I800790.pal.sap-ag.de

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<B2B-START-IMPORTS>> ---
import com.wm.pkg.sap.idoc.*;
// --- <<B2B-END-IMPORTS>> ---

public final class receiving
{
	// ---( internal utility methods )---

	final static receiving _instance = new receiving();

	static receiving _newInstance() { return new receiving(); }

	static receiving _cast(Object o) { return (receiving)o; }

	// ---( server methods )---



    public static final Values Xml2IdocWithJava (Values in)
    {
        Values out = in;
		// --- <<B2B-START(Xml2IdocWithJava)>> ---
		// @sigtype java 3.0
			try {
				// convert the node to Values object
				Service.doInvoke("pub.web", "documentToRecord", in);
		
				// retrive data from the external XML document (which is already converted to Values)
				String materialNumber = in.getValues("boundNode").getValues("MaterialDataRequest").getString("MaterialNumber");
		
				// instantiate a new version 3 IDOC instance
				IDOC idoc = new IDOC(true);
		
				// get the control record and set the control fileds
				IDOCControl ctrl = idoc.getControlRecord();
				ctrl.setField("DIRECT", "2");
				ctrl.setField("SNDPRT", "LS");
				ctrl.setField("SNDPRN", "SPJ");
				ctrl.setField("MESTYP", "MATFET");
				ctrl.setField("IDOCTYP", "ALEREQ01");
		
				// instantiate a E1ALER1 segment, populate its fields
				IDOCSegment segE1ALER1 = new IDOCSegment("E1ALER1");
				segE1ALER1.setSDATA("MESTYP", "MATMAS");
				segE1ALER1.setSDATA("MESTYP40", "MATMAS");
		
				// instantiate a E1ALEQ1 segment, populate its fields
				IDOCSegment segE1ALEQ1 = new IDOCSegment("E1ALEQ1");
				segE1ALEQ1.setSDATA("OBJVALUE", "MATNR");
				segE1ALEQ1.setSDATA("SIGN", "I");
				segE1ALEQ1.setSDATA("OPTION", "EQ");
		
				// using data that's retrieved from input XML document
				segE1ALEQ1.setSDATA("LOW", materialNumber);
		
				// assemble the IDOC using the segments
				//appends the E1ALER1 segment to the empty IDoc as the top level segment
				idoc.append(segE1ALER1);
		
				//inserts the E1ALEQ1 segment after E1ALER1, as a child
				idoc.insert("E1ALER1", segE1ALEQ1, true);
		
				// get a Values object for the IDOC instance
				Values pipelineIDOC = idoc.getValues();
		
				// get the target server name from the config file
				Values valIn = new Values();
				valIn.put("configKey", "sapdest");
				valIn.put("defaultConfigValue", "SID");
				Values valOut = Service.doInvoke("spjexamples.util", "getConfigValue", valIn);
				String serverName = valOut.getString("configValue");
				// set the target server name 
				pipelineIDOC.put("serverName", serverName);
		
				// for debugging
		//		in.put("pipelineIDOC", pipelineIDOC);
		
				// posting the IDOC to SAP
				Service.doInvoke("pub.sap.transport.ALE", "OutboundProcess", pipelineIDOC);
		
			} catch (Exception ex) {
				ex.printStackTrace();
				Service.throwError(ex);
			}
		// --- <<B2B-END>> ---
        return out;
                
	}
}

