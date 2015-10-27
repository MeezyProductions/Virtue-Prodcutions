/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class212 implements Interface25
{
    Class207 this$0;
    Class411 aClass411_2247;
    static int anInt2248;
    public static int anInt2249;
    
    public void method140(Class216 class216, int i) {
	if (null != ((Class212) this).aClass411_2247)
	    class216.method3030(16711680).method113
		(((Class142)
		  (((Class207) ((Class212) this).this$0).anInterface24_2232
		       .method131
		       ((short) -6424).method63
		   (((Class212) this).aClass411_2247.anInt4711 * 1862601893,
		    1732524853))),
		 ((Class212) this).aClass411_2247.anObject4712, -1939007169);
    }
    
    public void method138(Class216 class216) {
	if (null != ((Class212) this).aClass411_2247)
	    class216.method3030(16711680).method113
		(((Class142)
		  (((Class207) ((Class212) this).this$0).anInterface24_2232
		       .method131
		       ((short) 12892).method63
		   (((Class212) this).aClass411_2247.anInt4711 * 1862601893,
		    1165144540))),
		 ((Class212) this).aClass411_2247.anObject4712, -1939007169);
    }
    
    public void method141(Class216 class216) {
	if (null != ((Class212) this).aClass411_2247)
	    class216.method3030(16711680).method113
		(((Class142)
		  (((Class207) ((Class212) this).this$0).anInterface24_2232
		       .method131
		       ((short) -14725).method63
		   (((Class212) this).aClass411_2247.anInt4711 * 1862601893,
		    370363568))),
		 ((Class212) this).aClass411_2247.anObject4712, -1939007169);
    }
    
    public void method139(Class216 class216) {
	if (null != ((Class212) this).aClass411_2247)
	    class216.method3030(16711680).method113
		(((Class142)
		  (((Class207) ((Class212) this).this$0).anInterface24_2232
		       .method131
		       ((short) -3558).method63
		   (((Class212) this).aClass411_2247.anInt4711 * 1862601893,
		    695756717))),
		 ((Class212) this).aClass411_2247.anObject4712, -1939007169);
    }
    
    Class212(Class207 class207, ByteBuffer class528_sub42) {
	((Class212) this).this$0 = class207;
	if (class528_sub42.readUnsignedShort(-472734844) != 65535) {
	    class528_sub42.pointer -= -264964202;
	    ((Class212) this).aClass411_2247
		= ((Class207) class207).anInterface24_2232.method131
		      ((short) -10963).method8255(class528_sub42, 1708332344);
	} else
	    ((Class212) this).aClass411_2247 = null;
    }
    
    static final void method2962(Class648 class648, int i) {
	Class229 class229
	    = Class623_Sub1.method9755((((Class648) class648).anIntArray8394
					[(((Class648) class648).anInt8395
					  -= 1239022665) * 717927929]),
				       (byte) 36);
	class229.aClass229Array2542 = null;
	class229.aClass229Array2390 = null;
	Class39.method811(class229, 1435904523);
    }
    
    static final void method2963(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) 0);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class210.method2950(class229, class226, class648, -1184992693);
    }
    
    static final void method2964(Class648 class648, int i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_1_, (byte) -104);
	Class226 class226 = Class380.aClass226Array3970[i_1_ >> 16];
	Class493.method5953(class229, class226, class648, 1694498955);
    }
    
    static final void method2965(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_2_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_3_ = (((Class648) class648).anIntArray8394
		    [1 + ((Class648) class648).anInt8395 * 717927929]);
	Class79 class79
	    = (Class79) Class208.aClass5_Sub10_2239.method63(i_3_, 2122778268);
	if (class79.method1140((short) 255))
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= ((Class596) client.gameScene.method5976
				  ((short) 11822).method63(i_2_, 2137807702))
		      .method7117(i_3_, class79.aString811, (byte) 90);
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= (((Class596) client.gameScene.method5976
				   ((short) 26367).method63(i_2_, 1702661261))
		       .method7112
		   (i_3_, 1875093329 * class79.anInt809, 1447807984));
    }
    
    static final void method2966(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_4_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_5_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 1]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_4_ - i_5_;
    }
}
