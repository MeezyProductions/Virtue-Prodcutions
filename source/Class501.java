/* Class501 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class501
{
    Class501() {
	/* empty */
    }
    
    final int method6095(long l) {
	long l_0_ = method6109(1062125662);
	if (l_0_ > 0L)
	    Class511_Sub1.method9241(l_0_);
	return method6096(l);
    }
    
    abstract int method6096(long l);
    
    abstract void method6097();
    
    abstract long method6098();
    
    abstract void method6099();
    
    abstract long method6100(int i);
    
    abstract void method6101();
    
    abstract long method6102();
    
    abstract int method6103(long l);
    
    abstract void method6104(byte i);
    
    abstract int method6105(long l);
    
    abstract int method6106(long l);
    
    final int method6107(long l) {
	long l_1_ = method6109(1062125662);
	if (l_1_ > 0L)
	    Class511_Sub1.method9241(l_1_);
	return method6096(l);
    }
    
    final int method6108(long l) {
	long l_2_ = method6109(1062125662);
	if (l_2_ > 0L)
	    Class511_Sub1.method9241(l_2_);
	return method6096(l);
    }
    
    abstract long method6109(int i);
    
    static final void method6110(Class648 class648, int i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_3_, (byte) 92);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -1428356149 * class229.anInt2402;
    }
    
    static final void method6111(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.anInt11104 * 1235220883;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 641800047 * client.anInt10862;
    }
    
    static void method6112(int i, int i_4_) {
	Class98.anInt1245 = 0;
	int i_5_ = client.gameScene.method6029((short) 26549);
	int i_6_ = client.gameScene.method5967(328193085);
	Class466 class466 = client.gameScene.method6006((byte) 0);
	Class538 class538 = client.gameScene.method5973((byte) 30);
	Class5_Sub15 class5_sub15
	    = client.gameScene.method5976((short) 17060);
	int i_7_ = i;
	if (Class108.myPlayer != null) {
	    int i_8_ = ((Class108.myPlayer
			 .sceneXQueue[0])
			>> 3);
	    int i_9_ = ((Class108.myPlayer
			 .sceneYQueue[0])
			>> 3);
	    if (i_8_ >= 0 && i_8_ < Class148_Sub1.aBoolArrayArray8790.length
		&& i_9_ >= 0
		&& i_9_ < Class148_Sub1.aBoolArrayArray8790[i_8_].length
		&& Class148_Sub1.aBoolArrayArray8790[i_8_][i_9_])
		i_7_ = 0;
	}
	for (int i_10_ = 0; i_10_ < i_5_; i_10_++) {
	    for (int i_11_ = 0; i_11_ < i_6_; i_11_++) {
		for (int i_12_ = i_7_; i_12_ <= i + 1 && i_12_ <= 3; i_12_++) {
		    if ((i_12_ < i
			 || class466.method5632(i, i_12_, i_10_, i_11_,
						(short) -1714))
			&& !(Class473.method5826
			     ((Interface60) class538.method6591(i_12_, i_10_,
								i_11_,
								-1146489453),
			      class5_sub15, i_10_, i_11_, -2133470843))
			&& !(Class473.method5826
			     (((Interface60)
			       class538.method6583(i_12_, i_10_, i_11_,
						   client.anInterface62_11170,
						   2023995019)),
			      class5_sub15, i_10_, i_11_, -2076120983))
			&& !(Class473.method5826
			     ((Interface60) class538.method6600(i_12_, i_10_,
								i_11_,
								(byte) -35),
			      class5_sub15, i_10_, i_11_, -1999918778))
			&& !(Class473.method5826
			     ((Interface60) class538.method6555(i_12_, i_10_,
								i_11_,
								-881923819),
			      class5_sub15, i_10_, i_11_, -1959023501))) {
			/* empty */
		    }
		}
	    }
	}
    }
}
