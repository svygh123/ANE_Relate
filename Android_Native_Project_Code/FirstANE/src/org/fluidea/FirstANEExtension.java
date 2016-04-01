package org.fluidea;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class FirstANEExtension implements FREExtension {

	private FirstANEContext context;
	
	private String tag = "FirstANEExtension";
	
	@Override
	public FREContext createContext(String arg0) {
		 Log.i(tag, "Creating context"); 
	     if( context == null) context = new FirstANEContext(); 
	     return context; 
	}

	@Override
	public void dispose() {
		Log.i(tag, "dispose");
	}

	@Override
	public void initialize() {
		Log.i(tag, "initialize");
	}

}
