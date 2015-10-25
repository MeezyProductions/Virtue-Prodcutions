/* Class283_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class283_Sub1 extends Class283
{
    int anInt9914 = 0;
    
    public int method9021() {
	((Class283_Sub1) this).anInt9914 += 1513424757;
	if (126 == -1110159139 * ((Class283_Sub1) this).anInt9914)
	    ((Class283_Sub1) this).anInt9914 = 0;
	return -1110159139 * ((Class283_Sub1) this).anInt9914;
    }
    
    public int method9022(byte i) {
	((Class283_Sub1) this).anInt9914 += 1513424757;
	if (126 == -1110159139 * ((Class283_Sub1) this).anInt9914)
	    ((Class283_Sub1) this).anInt9914 = 0;
	return -1110159139 * ((Class283_Sub1) this).anInt9914;
    }
    
    public void method9023(ByteBuffer class528_sub42, int i, int i_0_) {
	int i_1_ = class528_sub42.pointer * -185904669;
	int i_2_ = class528_sub42.readUnsignedByte((byte) 3);
	method3826(Class552.method6716(i_2_ & 0x1, (byte) 31), 58384044);
	if (0 != (i_2_ & 0x8)) {
	    Class294 class294
		= Class144.method1713(class528_sub42.readUnsignedByte((byte) 24),
				      857980141);
	    if (((Class283_Sub1) this).aClass294_3082 != class294) {
		try {
		    method3831(class294, true, -943019581);
		} catch (Exception_Sub4 exception_sub4) {
		    exception_sub4.printStackTrace();
		}
	    }
	}
	if (0 != (i_2_ & 0x10)) {
	    Class297 class297
		= Class654.method7841(class528_sub42.readUnsignedByte((byte) 10),
				      1252741651);
	    if (((Class283_Sub1) this).aClass297_3084 != class297) {
		try {
		    method3763(class297, true, -1303280395);
		} catch (Exception_Sub4 exception_sub4) {
		    exception_sub4.printStackTrace();
		}
	    }
	}
	if (1 == (i_2_ >> 7 & 0x1)) {
	    int i_3_ = class528_sub42.readUnsignedShort(148718052);
	    if (((i_3_
		  >> 98093493 * ((Class288) Class288.aClass288_3176).anInt3169)
		 & 0x1)
		== 1)
		((Class283_Sub1) this).aClass422_3090
		    .method5056(class528_sub42);
	    if (1 == (i_3_ >> (((Class288) Class288.aClass288_3162).anInt3169
			       * 98093493)
		      & 0x1))
		((Class283_Sub1) this).aClass422_3101
		    .method5056(class528_sub42);
	    if (1 == (i_3_ >> (((Class288) Class288.aClass288_3164).anInt3169
			       * 98093493)
		      & 0x1))
		((Class283_Sub1) this).aClass422_3093
		    .method5056(class528_sub42);
	    if (((i_3_
		  >> ((Class288) Class288.aClass288_3175).anInt3169 * 98093493)
		 & 0x1)
		== 1)
		((Class283_Sub1) this).aClass422_3080
		    .method5056(class528_sub42);
	    if (((i_3_
		  >> ((Class288) Class288.aClass288_3166).anInt3169 * 98093493)
		 & 0x1)
		== 1) {
		((Class283_Sub1) this).aFloat3105
		    = class528_sub42.method9635(-1669932667);
		((Class283_Sub1) this).aFloat3106
		    = class528_sub42.method9635(-1414320570);
	    }
	    if (((i_3_
		  >> 98093493 * ((Class288) Class288.aClass288_3167).anInt3169)
		 & 0x1)
		== 1) {
		((Class283_Sub1) this).aFloat3109
		    = class528_sub42.method9635(-1771640842);
		((Class283_Sub1) this).aFloat3110
		    = class528_sub42.method9635(-1558583939);
	    }
	    if (((i_3_
		  >> 98093493 * ((Class288) Class288.aClass288_3168).anInt3169)
		 & 0x1)
		== 1)
		((Class283_Sub1) this).aClass298_3089
		    = Class264.method3656(class528_sub42.readUnsignedByte((byte) 7),
					  (byte) -7);
	    if (((i_3_
		  >> ((Class288) Class288.aClass288_3177).anInt3169 * 98093493)
		 & 0x1)
		== 1) {
		((Class283_Sub1) this).anInt3094
		    = class528_sub42.readTriByte(-408224183) * -750125065;
		class528_sub42.readUnsignedByte((byte) 61);
	    }
	    if (1 == (i_3_ >> (((Class288) Class288.aClass288_3170).anInt3169
			       * 98093493)
		      & 0x1)) {
		int i_4_ = class528_sub42.readUnsignedByte((byte) 72);
		((Class283_Sub1) this).aBool3107 = (i_4_ & 0x1) == 1;
		((Class283_Sub1) this).aBool3112 = (i_4_ & 0x2) == 2;
	    }
	    if (1 == (i_3_ >> 98093493 * (((Class288) Class288.aClass288_3171)
					  .anInt3169)
		      & 0x1)) {
		int i_5_ = class528_sub42.readUnsignedByte((byte) 16);
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
		    int i_7_ = class528_sub42.readUnsignedByte((byte) 66);
		    int i_8_ = class528_sub42.readUnsignedByte((byte) 101);
		    if (0 == i_7_)
			method3780(i_8_, -1024523871);
		    else {
			Class273 class273
			    = Class35.method781(class528_sub42
						    .readUnsignedByte((byte) 4),
						-561570537);
			boolean bool = true;
			Iterator iterator
			    = ((Class283_Sub1) this).aClass692_3115.iterator();
			while (iterator.hasNext()) {
			    Class528_Sub21_Sub8 class528_sub21_sub8
				= (Class528_Sub21_Sub8) iterator.next();
			    if (class528_sub21_sub8.anInt11574 * 811527563
				== i_8_) {
				class528_sub21_sub8.method10539(class528_sub42,
								935868723);
				bool = false;
				break;
			    }
			}
			if (bool)
			    method3781(Class446.method5400(i_8_, class273,
							   class528_sub42,
							   (byte) 73),
				       1051607030);
		    }
		}
	    }
	    if (((i_3_
		  >> ((Class288) Class288.aClass288_3172).anInt3169 * 98093493)
		 & 0x1)
		== 1) {
		((Class283_Sub1) this).anInt3113
		    = class528_sub42.readUnsignedShort(852769423) * 2009865609;
		((Class283_Sub1) this).aFloat3114
		    = class528_sub42.method9635(-1959112281);
	    }
	    if (1 == (i_3_ >> (((Class288) Class288.aClass288_3173).anInt3169
			       * 98093493)
		      & 0x1))
		((Class283_Sub1) this).aClass289_3087
		    = Class214.method2970(class528_sub42.readUnsignedByte((byte) 35),
					  -224576891);
	    if (((i_3_
		  >> ((Class288) Class288.aClass288_3174).anInt3169 * 98093493)
		 & 0x1)
		== 1) {
		((Class283_Sub1) this).aClass422_3088
		    .method5056(class528_sub42);
		((Class283_Sub1) this).aClass422_3102
		    .method5056(class528_sub42);
		((Class283_Sub1) this).aFloat3103
		    = class528_sub42.method9635(-2085166611);
		((Class283_Sub1) this).aFloat3104
		    = class528_sub42.method9635(-1438073034);
	    }
	    if (((i_3_
		  >> 98093493 * ((Class288) Class288.aClass288_3165).anInt3169)
		 & 0x1)
		== 1)
		class528_sub42.method9635(-1422097331);
	    if (((i_3_
		  >> 98093493 * ((Class288) Class288.aClass288_3163).anInt3169)
		 & 0x1)
		== 1)
		((Class283_Sub1) this).aFloat3086
		    = class528_sub42.method9635(-1805796044);
	}
	if (((Class283_Sub1) this).aClass684_3083 != null
	    && 1 == (i_2_ >> 5 & 0x1))
	    ((Class283_Sub1) this).aClass684_3083.method7990(class528_sub42,
							     717927929);
	if (null != ((Class283_Sub1) this).aClass326_3085
	    && (i_2_ >> 6 & 0x1) == 1)
	    ((Class283_Sub1) this).aClass326_3085.method4244(class528_sub42,
							     (byte) 105);
	if (class528_sub42.pointer * -185904669 - i_1_ != i)
	    throw new RuntimeException(new StringBuilder().append
					   (-185904669 * (class528_sub42
							  .pointer) - i_1_)
					   .append
					   (",").append
					   (i).toString());
    }
    
    public int method9024() {
	((Class283_Sub1) this).anInt9914 += 1513424757;
	if (126 == -1110159139 * ((Class283_Sub1) this).anInt9914)
	    ((Class283_Sub1) this).anInt9914 = 0;
	return -1110159139 * ((Class283_Sub1) this).anInt9914;
    }
    
    public Class283_Sub1(Interface29 interface29) {
	super(Class301.aClass301_3341, interface29);
    }
}
