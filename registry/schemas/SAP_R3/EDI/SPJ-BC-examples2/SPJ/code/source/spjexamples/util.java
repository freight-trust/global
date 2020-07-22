package spjexamples;

// -----( B2B Java Code Template v1.2
// -----( CREATED: Wed Nov 06 16:06:44 PST 2002
// -----( ON-HOST: I800790.pal.sap-ag.de

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<B2B-START-IMPORTS>> ---
import java.io.*;
import java.util.*;
// --- <<B2B-END-IMPORTS>> ---

public final class util
{
	// ---( internal utility methods )---

	final static util _instance = new util();

	static util _newInstance() { return new util(); }

	static util _cast(Object o) { return (util)o; }

	// ---( server methods )---




	public static final void getConfigValue (IData pipeline)
        throws ServiceException
	{
		// --- <<B2B-START(getConfigValue)>> ---
		// @sigtype java 3.5
		// [i] field:0:required configKey
		// [i] field:0:required defaultConfigValue
		// [o] field:0:required configValue
	// get pipeline input
	IDataCursor pipelineCursor = pipeline.getCursor();
	String	configKey = IDataUtil.getString( pipelineCursor, "configKey" );
	String	defaultConfigValue = IDataUtil.getString( pipelineCursor, "defaultConfigValue" );
	
	// lookup using the pre-loaded configProp
	String value = configProp.getProperty(configKey, defaultConfigValue);

	IDataUtil.put( pipelineCursor, "configValue", value);
	pipelineCursor.destroy();


		// --- <<B2B-END>> ---

                
	}



	public static final void lookupFile (IData pipeline)
        throws ServiceException
	{
		// --- <<B2B-START(lookupFile)>> ---
		// @sigtype java 3.5
		// [i] field:0:required key
		// [o] field:0:required value
	// get pipeline input
	IDataCursor pipelineCursor = pipeline.getCursor();
	String	key = IDataUtil.getString( pipelineCursor, "key" );

	// perform the lookup using the pre-loaded lookupProp
	String value = lookupProp.getProperty(key, "not found");

	// pipeline output
	IDataUtil.put( pipelineCursor, "value", value );
	pipelineCursor.destroy();
		// --- <<B2B-END>> ---

                
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
	
	// use static data member to cache the config data
	private static Properties configProp;
	// use static initializer to pre-load the config data from the file
	static {
	  try {
	    String configFilename = "packages/SPJ/resources/config.txt";
	    FileInputStream fis = new FileInputStream(new File(configFilename));
		configProp = new Properties();
		configProp.load(fis);
	    fis.close();
	  } catch (Exception ex) {
	    ex.printStackTrace();
	  }
	}
	// --- <<B2B-END-SHARED>> ---
}

