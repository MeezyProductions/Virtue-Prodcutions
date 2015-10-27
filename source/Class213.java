/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class213 implements IClientEnum
{
    public static Class213 aClass213_2250 = new Class213(1, 0);
    public static Class213 aClass213_2251 = new Class213(0, 1);
    public static Class213 aClass213_2252 = new Class213(2, 2);
    int anInt2253;
    int anInt2254;
    static boolean aBool2255;
    
    Class213(int i, int i_0_) {
	((Class213) this).anInt2253 = i * 145027661;
	((Class213) this).anInt2254 = -888042867 * i_0_;
    }
    
    public int method68() {
	return ((Class213) this).anInt2254 * -301578171;
    }
    
    public int method71() {
	return ((Class213) this).anInt2254 * -301578171;
    }
    
    public int method5() {
	return ((Class213) this).anInt2254 * -301578171;
    }
    
    public int method6() {
	return ((Class213) this).anInt2254 * -301578171;
    }
    
    public int method72() {
	return ((Class213) this).anInt2254 * -301578171;
    }
    
    public static Class213[] method2967(int i) {
	return (new Class213[]
		{ aClass213_2251, aClass213_2250, aClass213_2252 });
    }
    
    public int method73() {
	return ((Class213) this).anInt2254 * -301578171;
    }
    
    public static final void method2968(int i) {
	if (-213699943 * client.anInt11065 != -1
	    && -1 != client.anInt10988 * -1427953027) {
	    int i_1_ = (((client.anInt10991 * 1414509155
			  * (-1206937049 * client.anInt11134
			     - 1505565631 * client.anInt11188))
			 >> 16)
			+ client.anInt11188 * 1505565631);
	    client.anInt10991 += 1627152203 * i_1_;
	    if (1414509155 * client.anInt10991 >= 65535) {
		client.anInt10991 = -28401483;
		if (!client.aBool10974)
		    client.aBool10994 = true;
		else
		    client.aBool10994 = false;
		client.aBool10974 = true;
	    } else {
		client.aBool10994 = false;
		client.aBool10974 = false;
	    }
	    float f = (float) (1414509155 * client.anInt10991) / 65535.0F;
	    float[] fs = new float[3];
	    int i_2_ = 1320502914 * client.anInt10989;
	    for (int i_3_ = 0; i_3_ < 3; i_3_++) {
		int i_4_ = ((client.anIntArrayArrayArray10986
			     [client.anInt11065 * -213699943][i_2_][i_3_])
			    * 3);
		int i_5_
		    = 3 * (client.anIntArrayArrayArray10986
			   [-213699943 * client.anInt11065][i_2_ + 1][i_3_]);
		int i_6_
		    = (3
		       * ((client.anIntArrayArrayArray10986
			   [-213699943 * client.anInt11065][2 + i_2_][i_3_])
			  - ((client.anIntArrayArrayArray10986
			      [-213699943 * client.anInt11065][i_2_ + 3][i_3_])
			     - (client.anIntArrayArrayArray10986
				[client.anInt11065 * -213699943][2 + i_2_]
				[i_3_]))));
		int i_7_ = (client.anIntArrayArrayArray10986
			    [-213699943 * client.anInt11065][i_2_][i_3_]);
		int i_8_ = i_5_ - i_4_;
		int i_9_ = i_4_ - 2 * i_5_ + i_6_;
		int i_10_ = i_5_ + ((client.anIntArrayArrayArray10986
				     [client.anInt11065 * -213699943][i_2_ + 2]
				     [i_3_])
				    - i_7_) - i_6_;
		fs[i_3_]
		    = (((float) i_8_ + f * (f * (float) i_10_ + (float) i_9_))
		       * f) + (float) i_7_;
	    }
	    Class578 class578 = client.gameScene.method5966(1273279609);
	    Class626.anInt8136
		= (((int) fs[0] - -1650867712 * class578.anInt7607)
		   * 1636412895);
	    Class137.anInt1630 = -1124026061 * (int) fs[1];
	    Class227.anInt2347
		= ((int) fs[2] - 1200930304 * class578.anInt7608) * 397871753;
	    float[] fs_11_ = new float[3];
	    int i_12_ = -607210462 * client.anInt10990;
	    for (int i_13_ = 0; i_13_ < 3; i_13_++) {
		int i_14_ = ((client.anIntArrayArrayArray10986
			      [-1427953027 * client.anInt10988][i_12_][i_13_])
			     * 3);
		int i_15_
		    = ((client.anIntArrayArrayArray10986
			[client.anInt10988 * -1427953027][1 + i_12_][i_13_])
		       * 3);
		int i_16_
		    = ((client.anIntArrayArrayArray10986
			[-1427953027 * client.anInt10988][i_12_ + 2][i_13_])
		       - ((client.anIntArrayArrayArray10986
			   [client.anInt10988 * -1427953027][i_12_ + 3][i_13_])
			  - (client.anIntArrayArrayArray10986
			     [client.anInt10988 * -1427953027][2 + i_12_]
			     [i_13_]))) * 3;
		int i_17_ = (client.anIntArrayArrayArray10986
			     [-1427953027 * client.anInt10988][i_12_][i_13_]);
		int i_18_ = i_15_ - i_14_;
		int i_19_ = i_16_ + (i_14_ - i_15_ * 2);
		int i_20_
		    = ((client.anIntArrayArrayArray10986
			[-1427953027 * client.anInt10988][2 + i_12_][i_13_])
		       - i_17_ + i_15_ - i_16_);
		fs_11_[i_13_] = (f * ((float) i_20_ * f + (float) i_19_)
				 + (float) i_18_) * f + (float) i_17_;
	    }
	    float f_21_ = fs_11_[0] - fs[0];
	    float f_22_ = (fs_11_[1] - fs[1]) * -1.0F;
	    float f_23_ = fs_11_[2] - fs[2];
	    double d = Math.sqrt((double) (f_23_ * f_23_ + f_21_ * f_21_));
	    Class309_Sub1.anInt9907
		= ((int) (Math.atan2((double) f_22_, d) * 2607.5945876176133)
		   & 0x3fff) * 2028903323;
	    Class653.anInt8429
		= ((int) (-Math.atan2((double) f_21_, (double) f_23_)
			  * 2607.5945876176133)
		   & 0x3fff) * -1829176741;
	    Class48.anInt548
		= (-1623194183
		   * (((((client.anIntArrayArrayArray10986
			  [client.anInt11065 * -213699943][2 + i_2_][3])
			 - (client.anIntArrayArrayArray10986
			    [-213699943 * client.anInt11065][i_2_][3]))
			* (1414509155 * client.anInt10991))
		       >> 16)
		      + (client.anIntArrayArrayArray10986
			 [client.anInt11065 * -213699943][i_2_][3])));
	}
    }
    
    public static void method2969(int i, int i_24_) {
	if (i < 1)
	    Class518_Sub1.anInt10683 = Class518_Sub1.anInt10684 * 1398074233;
	else
	    Class518_Sub1.anInt10683 = i * -573999957;
    }
}
