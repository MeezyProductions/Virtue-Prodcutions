/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Map;

public abstract class Class313 implements Interface4
{
    Map aMap3441;
    
    Class313(Map map) {
	((Class313) this).aMap3441 = map;
    }
    
    static void method4148(int i) {
	if (null == Class581.aClass151_7645
	    || (Class581.aClass151_7645.method1766()
		!= Class581.aTwitchWebcamFrameData7639.width)
	    || (Class581.aClass151_7645.method1767()
		!= Class581.aTwitchWebcamFrameData7639.height))
	    Class581.aClass151_7645
		= (Class587.aClass173_7714.method2382
		   (Class581.aTwitchWebcamFrameData7639.buffer, 0,
		    Class581.aTwitchWebcamFrameData7639.width,
		    Class581.aTwitchWebcamFrameData7639.width,
		    Class581.aTwitchWebcamFrameData7639.height, false));
	else
	    Class581.aClass151_7645.method1770
		(0, 0, Class581.aTwitchWebcamFrameData7639.width,
		 Class581.aTwitchWebcamFrameData7639.height,
		 Class581.aTwitchWebcamFrameData7639.buffer, 0,
		 Class581.aTwitchWebcamFrameData7639.width);
    }
}
