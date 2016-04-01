package org.fluidea;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class SayHelloFunction implements FREFunction {

	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {
		
		FREObject result = null;

		Log.i ("SayHelloFunction", "call");

		try {

			FREObject msg = arg1[0];

			String s = msg.getAsString();

			Log.i("SayHelloFunction", "String from AS: " + s);
			
			result = FREObject.newObject("Response from Java:" + s);
		}

		catch (Exception e) {

			Log.i ("SayHelloFunction", e.getMessage());
		}

		return result;
	}

}
