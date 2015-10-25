/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.Map;

public class Class13
{
    public static final int anInt186 = 1700;
    public static final int anInt187 = 125000;
    
    Class13() throws Throwable {
	throw new Error();
    }
    
    static final void method625(int i, int i_0_, byte i_1_) {
	if (Class518_Sub1.aFloat7023 < Class518_Sub1.aFloat6991) {
	    Class518_Sub1.aFloat7023
		+= (double) Class518_Sub1.aFloat7023 / 30.0;
	    if (Class518_Sub1.aFloat7023 > Class518_Sub1.aFloat6991)
		Class518_Sub1.aFloat7023 = Class518_Sub1.aFloat6991;
	    Class181_Sub5.method8959(1103637621);
	    Class518_Sub1.anInt6987 = (int) Class518_Sub1.aFloat6991 >> 1;
	    Class518_Sub1.aByteArrayArrayArray6998
		= Class610_Sub1.method9733(Class518_Sub1.anInt6987, (byte) 1);
	} else if (Class518_Sub1.aFloat7023 > Class518_Sub1.aFloat6991) {
	    Class518_Sub1.aFloat7023
		-= (double) Class518_Sub1.aFloat7023 / 30.0;
	    if (Class518_Sub1.aFloat7023 < Class518_Sub1.aFloat6991)
		Class518_Sub1.aFloat7023 = Class518_Sub1.aFloat6991;
	    Class181_Sub5.method8959(-1722444034);
	    Class518_Sub1.anInt6987 = (int) Class518_Sub1.aFloat6991 >> 1;
	    Class518_Sub1.aByteArrayArrayArray6998
		= Class610_Sub1.method9733(Class518_Sub1.anInt6987, (byte) 1);
	}
	if (1448122373 * Class518_Sub1.anInt10692 != -1
	    && -642791413 * Class518_Sub1.anInt10687 != -1) {
	    int i_2_ = (Class518_Sub1.anInt10692 * 1448122373
			- Class200_Sub1.anInt9820 * -1004126987);
	    if (i_2_ != 0)
		i_2_ /= Math.min(Class518_Sub1.anInt10706 * 2132063485,
				 Math.abs(i_2_));
	    int i_3_ = (Class518_Sub1.anInt10687 * -642791413
			- -1160116407 * Class98.anInt1256);
	    if (i_3_ != 0)
		i_3_ /= Math.min(Class518_Sub1.anInt10706 * 2132063485,
				 Math.abs(i_3_));
	    Class200_Sub1.anInt9820
		= (i_2_ + Class200_Sub1.anInt9820 * -1004126987) * 7573341;
	    Class98.anInt1256
		= -1406821639 * (i_3_ + -1160116407 * Class98.anInt1256);
	    if (0 == i_2_ && 0 == i_3_) {
		Class518_Sub1.anInt10692 = -847541453;
		Class518_Sub1.anInt10687 = 1998421085;
	    }
	    Class181_Sub5.method8959(162332884);
	}
	Iterator iterator = Class518_Sub1.aHashMap10694.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class57 class57
		= (Class57) ((Map.Entry) iterator.next()).getValue();
	    ((Class57) class57).anInt684 -= 1428912547;
	    if (0 == ((Class57) class57).anInt684 * 520061451) {
		if (-575704719 * ((Class57) class57).anInt685 <= 1
		    && !Class518_Sub1.aBool10698)
		    iterator.remove();
		else {
		    ((Class57) class57).anInt685 -= 1612525457;
		    ((Class57) class57).anInt684
			= Class518_Sub1.anInt10683 * -1460871447;
		}
	    }
	}
	iterator = Class518_Sub1.aHashMap10688.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class57 class57
		= (Class57) ((Map.Entry) iterator.next()).getValue();
	    ((Class57) class57).anInt684 -= 1428912547;
	    if (520061451 * ((Class57) class57).anInt684 == 0) {
		if (-575704719 * ((Class57) class57).anInt685 <= 1
		    && !Class518_Sub1.aBool10698)
		    iterator.remove();
		else {
		    ((Class57) class57).anInt685 -= 1612525457;
		    ((Class57) class57).anInt684
			= -1460871447 * Class518_Sub1.anInt10683;
		}
	    }
	}
	if (Class518_Sub1.aBool10702 && Class480.aClass688_5454 != null) {
	    for (Class528_Sub3 class528_sub3
		     = ((Class528_Sub3)
			Class480.aClass688_5454.method8034(2060411696));
		 null != class528_sub3;
		 class528_sub3
		     = ((Class528_Sub3)
			Class480.aClass688_5454.method8037(-1387161459))) {
		Class239 class239
		    = ((Class239)
		       (Class518_Sub1.aClass5_Sub6_6975.method63
			(-123895777 * (((Class528_Sub3) class528_sub3)
				       .aClass528_Sub25_10210.anInt10420),
			 -491687836)));
		if (class528_sub3.method9243(i, i_0_, 1479853356)) {
		    if (null != class239.aStringArray2620) {
			if (class239.aStringArray2620[4] != null)
			    Class280.method3738
				(class239.aStringArray2620[4],
				 class239.aString2605, -1, 1012, -1,
				 (long) (-123895777
					 * (((Class528_Sub3) class528_sub3)
					    .aClass528_Sub25_10210
					    .anInt10420)),
				 class239.anInt2649 * -1770862541, 0, true,
				 false,
				 (long) (-123895777
					 * (((Class528_Sub3) class528_sub3)
					    .aClass528_Sub25_10210
					    .anInt10420)),
				 false, 1785020890);
			if (class239.aStringArray2620[3] != null)
			    Class280.method3738
				(class239.aStringArray2620[3],
				 class239.aString2605, -1, 1011, -1,
				 (long) (-123895777
					 * (((Class528_Sub3) class528_sub3)
					    .aClass528_Sub25_10210
					    .anInt10420)),
				 class239.anInt2649 * -1770862541, 0, true,
				 false,
				 (long) (-123895777
					 * (((Class528_Sub3) class528_sub3)
					    .aClass528_Sub25_10210
					    .anInt10420)),
				 false, 192097779);
			if (null != class239.aStringArray2620[2])
			    Class280.method3738
				(class239.aStringArray2620[2],
				 class239.aString2605, -1, 1010, -1,
				 (long) (-123895777
					 * (((Class528_Sub3) class528_sub3)
					    .aClass528_Sub25_10210
					    .anInt10420)),
				 class239.anInt2649 * -1770862541, 0, true,
				 false,
				 (long) ((((Class528_Sub3) class528_sub3)
					  .aClass528_Sub25_10210.anInt10420)
					 * -123895777),
				 false, 1000112533);
			if (class239.aStringArray2620[1] != null)
			    Class280.method3738
				(class239.aStringArray2620[1],
				 class239.aString2605, -1, 1009, -1,
				 (long) ((((Class528_Sub3) class528_sub3)
					  .aClass528_Sub25_10210.anInt10420)
					 * -123895777),
				 class239.anInt2649 * -1770862541, 0, true,
				 false,
				 (long) (-123895777
					 * (((Class528_Sub3) class528_sub3)
					    .aClass528_Sub25_10210
					    .anInt10420)),
				 false, 549992216);
			if (class239.aStringArray2620[0] != null)
			    Class280.method3738
				(class239.aStringArray2620[0],
				 class239.aString2605, -1, 1008, -1,
				 (long) ((((Class528_Sub3) class528_sub3)
					  .aClass528_Sub25_10210.anInt10420)
					 * -123895777),
				 class239.anInt2649 * -1770862541, 0, true,
				 false,
				 (long) ((((Class528_Sub3) class528_sub3)
					  .aClass528_Sub25_10210.anInt10420)
					 * -123895777),
				 false, 1473264629);
		    }
		    if (!((Class528_Sub3) class528_sub3).aClass528_Sub25_10210
			 .aBool10426) {
			((Class528_Sub3) class528_sub3)
			    .aClass528_Sub25_10210.aBool10426
			    = true;
			Class504.method6119(Cs2Context.aClass561_7518,
					    (-123895777
					     * (((Class528_Sub3) class528_sub3)
						.aClass528_Sub25_10210
						.anInt10420)),
					    class239.anInt2649 * -1770862541,
					    -1046705289);
		    }
		    if (((Class528_Sub3) class528_sub3).aClass528_Sub25_10210
			.aBool10426)
			Class504.method6119(Cs2Context.aClass561_7520,
					    (((Class528_Sub3) class528_sub3)
					     .aClass528_Sub25_10210
					     .anInt10420) * -123895777,
					    -1770862541 * class239.anInt2649,
					    -1925263687);
		} else if (((Class528_Sub3) class528_sub3)
			   .aClass528_Sub25_10210.aBool10426) {
		    ((Class528_Sub3) class528_sub3).aClass528_Sub25_10210
			.aBool10426
			= false;
		    Class504.method6119(Cs2Context.aClass561_7515,
					((((Class528_Sub3) class528_sub3)
					  .aClass528_Sub25_10210.anInt10420)
					 * -123895777),
					-1770862541 * class239.anInt2649,
					264209187);
		}
	    }
	}
    }
    
    static void method626(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [717927929 * ((Class648) class648).anInt8395 - 1]
	    = ((Class256)
	       (Class669.aClass25_Sub1_8522.method63
		((((Class648) class648).anIntArray8394
		  [717927929 * ((Class648) class648).anInt8395 - 1]),
		 -785549862))).aBool2813 ? 1 : 0;
    }
}
