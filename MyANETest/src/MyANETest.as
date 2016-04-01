package
{
	import flash.display.Sprite;
	import flash.display.StageAlign;
	import flash.display.StageScaleMode;
	
	import org.fluidea.FirstANE;
	
	public class MyANETest extends Sprite
	{		
		private var ane:FirstANE
		
		public function MyANETest()
		{
			stage.align = StageAlign.TOP_LEFT;
			stage.scaleMode = StageScaleMode.NO_SCALE;
			
			ane = new FirstANE();
			// 判断是否可以运行
			if (ane.isSupported()) {
				// 调用 sayHello 并输出返回值
				trace(ane.sayHello("Hi, Android"));
			}
		}
		
	}
}