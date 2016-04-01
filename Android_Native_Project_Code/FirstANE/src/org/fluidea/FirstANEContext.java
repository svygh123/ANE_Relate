package org.fluidea;

import java.util.HashMap;
import java.util.Map;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class FirstANEContext extends FREContext
{
	
	@Override 
    public void dispose() { 
        Log.i("FirstANEContext", "Dispose context"); 
    } 
 
    @Override 
    public Map<String, FREFunction> getFunctions() { 
        Log.i("FirstANEContext", "Creating function Map"); 
        Map<String, FREFunction> functionMap = new HashMap<String, FREFunction>(); 
 
        functionMap.put("sayHello", new SayHelloFunction() ); 
        return functionMap;
    } 
}
