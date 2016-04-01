package org.fluidea 
{
	
	import flash.external.ExtensionContext;
	
	/**
	 * ...
	 * @author svygh123
	 */
	public class FirstANE 
	{
		
		private var context:ExtensionContext;
		
		public function FirstANE() 
		{
			try
			{
				context = ExtensionContext.createExtensionContext("org.fluidea.FirstANE", null);
			}catch (e:Error)
			{
				trace("e:" + e);
			}
		}
		
		public function isSupported():Boolean
		{
			return context != null;
		}
		
		public function sayHello(message:String):String
		{
			var retval:String;
			retval = context.call("sayHello", message) as String;
			return retval;
		}
		
		public function dispose():void
		{
			context.dispose();
		}
		
	}

}