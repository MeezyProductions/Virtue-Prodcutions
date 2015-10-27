/* Class671 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class671
{
    static Class500 aClass500_8524;
    int anInt8525;
    Class578 aClass578_8526;
    static Class539 aClass539_8527;
    
    public Class645_Sub1_Sub2_Sub1 method7942(int i) {
	Class528_Sub2 class528_sub2
	    = ((Class528_Sub2)
	       (client.aClass692_11042.method8137
		((long) ((((Class671) this).aClass578_8526.anInt7606
			  * -2013577247) << 28
			 | (-173815201
			    * ((Class671) this).aClass578_8526.anInt7608) << 14
			 | (961465569
			    * ((Class671) this).aClass578_8526.anInt7607)))));
	if (null == class528_sub2)
	    return null;
	Class578 class578 = client.gameScene.method5966(1273279609);
	int i_0_ = (961465569 * ((Class671) this).aClass578_8526.anInt7607
		    - 961465569 * class578.anInt7607);
	int i_1_ = (((Class671) this).aClass578_8526.anInt7608 * -173815201
		    - -173815201 * class578.anInt7608);
	if (i_0_ >= 0 && i_1_ >= 0
	    && i_0_ < client.gameScene.method6029((short) 7411)
	    && i_1_ < client.gameScene.method5967(1462233146)
	    && client.gameScene.method5973((byte) 56) != null) {
	    for (Class528_Sub1 class528_sub1
		     = ((Class528_Sub1)
			class528_sub2.aClass688_10201.method8034(895606552));
		 null != class528_sub1;
		 class528_sub1 = (Class528_Sub1) class528_sub2
						     .aClass688_10201
						     .method8037(1339933255)) {
		if (class528_sub1.anInt10200 * -48406585
		    == ((Class671) this).anInt8525 * -1952699819)
		    return ((Class645_Sub1_Sub2_Sub1)
			    (client.gameScene.method5973((byte) 100)
				 .method6597
			     ((((Class671) this).aClass578_8526.anInt7606
			       * -2013577247),
			      i_0_, i_1_, (short) 2011)));
	    }
	}
	return null;
    }
    
    public Class671(Class578 class578, int i) {
	((Class671) this).aClass578_8526 = class578;
	((Class671) this).anInt8525 = -713063683 * i;
    }
    
    static Class699[] method7943(int i) {
	return (new Class699[]
		{ Class699.aClass699_8729, Class699.aClass699_8732,
		  Class699.aClass699_8730 });
    }
    
    static final void method7944(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class516_Sub1.method9258(class229, class226, class648, 566245614);
    }
}
