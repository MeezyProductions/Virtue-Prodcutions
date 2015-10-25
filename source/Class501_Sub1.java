/* Class501_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class501_Sub1 extends Class501
{
    long aLong10127;
    int anInt10128;
    long aLong10129;
    long aLong10130 = 0L;
    int anInt10131;
    long[] aLongArray10132;
    static Class698 aClass698_10133;
    
    Class501_Sub1() {
	((Class501_Sub1) this).aLong10127 = 0L;
	((Class501_Sub1) this).aLong10129 = 0L;
	((Class501_Sub1) this).aLongArray10132 = new long[10];
	((Class501_Sub1) this).anInt10131 = 0;
	((Class501_Sub1) this).anInt10128 = -355976837;
	((Class501_Sub1) this).aLong10130
	    = System.nanoTime() * 7976074369795559621L;
	((Class501_Sub1) this).aLong10127
	    = System.nanoTime() * 2003896411674997699L;
    }
    
    void method6104(byte i) {
	((Class501_Sub1) this).aLong10129 = 0L;
	if (((Class501_Sub1) this).aLong10127 * 6288484492035921131L
	    > ((Class501_Sub1) this).aLong10130 * -3513528133748920819L)
	    ((Class501_Sub1) this).aLong10130
		+= (4490064174302644439L * ((Class501_Sub1) this).aLong10127
		    - 1L * ((Class501_Sub1) this).aLong10130);
    }
    
    int method6096(long l) {
	if (6288484492035921131L * ((Class501_Sub1) this).aLong10127
	    > ((Class501_Sub1) this).aLong10130 * -3513528133748920819L) {
	    ((Class501_Sub1) this).aLong10129
		+= (((Class501_Sub1) this).aLong10127 * -1855674500483889091L
		    - 286443916104315147L * ((Class501_Sub1) this).aLong10130);
	    ((Class501_Sub1) this).aLong10130
		+= (4490064174302644439L * ((Class501_Sub1) this).aLong10127
		    - 1L * ((Class501_Sub1) this).aLong10130);
	    ((Class501_Sub1) this).aLong10127 += 2003896411674997699L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class501_Sub1) this).aLong10127 += 2003896411674997699L * l;
	} while (i < 10
		 && (((Class501_Sub1) this).aLong10127 * 6288484492035921131L
		     < (-3513528133748920819L
			* ((Class501_Sub1) this).aLong10130)));
	if (6288484492035921131L * ((Class501_Sub1) this).aLong10127
	    < ((Class501_Sub1) this).aLong10130 * -3513528133748920819L)
	    ((Class501_Sub1) this).aLong10127
		= 3646650439868951271L * ((Class501_Sub1) this).aLong10130;
	return i;
    }
    
    long method9161() {
	long l = System.nanoTime();
	long l_0_
	    = l - ((Class501_Sub1) this).aLong10129 * 137890096379952199L;
	((Class501_Sub1) this).aLong10129 = l * 1141124432386813303L;
	if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
	    ((Class501_Sub1) this).aLongArray10132
		[83430895 * ((Class501_Sub1) this).anInt10131]
		= l_0_;
	    ((Class501_Sub1) this).anInt10131
		= (1401536783
		   * ((1 + 83430895 * ((Class501_Sub1) this).anInt10131)
		      % 10));
	    if (((Class501_Sub1) this).anInt10128 * -844055117 < 1)
		((Class501_Sub1) this).anInt10128 += -355976837;
	}
	long l_1_ = 0L;
	for (int i = 1; i <= -844055117 * ((Class501_Sub1) this).anInt10128;
	     i++)
	    l_1_ += (((Class501_Sub1) this).aLongArray10132
		     [(10 + (83430895 * ((Class501_Sub1) this).anInt10131
			     - i)) % 10]);
	return l_1_ / (long) (-844055117 * ((Class501_Sub1) this).anInt10128);
    }
    
    long method6100(int i) {
	return ((Class501_Sub1) this).aLong10130 * -3513528133748920819L;
    }
    
    long method9162(byte i) {
	long l = System.nanoTime();
	long l_2_
	    = l - ((Class501_Sub1) this).aLong10129 * 137890096379952199L;
	((Class501_Sub1) this).aLong10129 = l * 1141124432386813303L;
	if (l_2_ > -5000000000L && l_2_ < 5000000000L) {
	    ((Class501_Sub1) this).aLongArray10132
		[83430895 * ((Class501_Sub1) this).anInt10131]
		= l_2_;
	    ((Class501_Sub1) this).anInt10131
		= (1401536783
		   * ((1 + 83430895 * ((Class501_Sub1) this).anInt10131)
		      % 10));
	    if (((Class501_Sub1) this).anInt10128 * -844055117 < 1)
		((Class501_Sub1) this).anInt10128 += -355976837;
	}
	long l_3_ = 0L;
	for (int i_4_ = 1;
	     i_4_ <= -844055117 * ((Class501_Sub1) this).anInt10128; i_4_++)
	    l_3_ += (((Class501_Sub1) this).aLongArray10132
		     [(10 + (83430895 * ((Class501_Sub1) this).anInt10131
			     - i_4_)) % 10]);
	return l_3_ / (long) (-844055117 * ((Class501_Sub1) this).anInt10128);
    }
    
    void method6099() {
	((Class501_Sub1) this).aLong10129 = 0L;
	if (((Class501_Sub1) this).aLong10127 * 6288484492035921131L
	    > ((Class501_Sub1) this).aLong10130 * -3513528133748920819L)
	    ((Class501_Sub1) this).aLong10130
		+= (4490064174302644439L * ((Class501_Sub1) this).aLong10127
		    - 1L * ((Class501_Sub1) this).aLong10130);
    }
    
    long method6109(int i) {
	((Class501_Sub1) this).aLong10130
	    += method9162((byte) -4) * 7976074369795559621L;
	if (6288484492035921131L * ((Class501_Sub1) this).aLong10127
	    > ((Class501_Sub1) this).aLong10130 * -3513528133748920819L)
	    return ((((Class501_Sub1) this).aLong10127 * 6288484492035921131L
		     - (((Class501_Sub1) this).aLong10130
			* -3513528133748920819L))
		    / 1000000L);
	return 0L;
    }
    
    void method6101() {
	((Class501_Sub1) this).aLong10129 = 0L;
	if (((Class501_Sub1) this).aLong10127 * 6288484492035921131L
	    > ((Class501_Sub1) this).aLong10130 * -3513528133748920819L)
	    ((Class501_Sub1) this).aLong10130
		+= (4490064174302644439L * ((Class501_Sub1) this).aLong10127
		    - 1L * ((Class501_Sub1) this).aLong10130);
    }
    
    long method6102() {
	((Class501_Sub1) this).aLong10130
	    += method9162((byte) -5) * 7976074369795559621L;
	if (6288484492035921131L * ((Class501_Sub1) this).aLong10127
	    > ((Class501_Sub1) this).aLong10130 * -3513528133748920819L)
	    return ((((Class501_Sub1) this).aLong10127 * 6288484492035921131L
		     - (((Class501_Sub1) this).aLong10130
			* -3513528133748920819L))
		    / 1000000L);
	return 0L;
    }
    
    int method6103(long l) {
	if (6288484492035921131L * ((Class501_Sub1) this).aLong10127
	    > ((Class501_Sub1) this).aLong10130 * -3513528133748920819L) {
	    ((Class501_Sub1) this).aLong10129
		+= (((Class501_Sub1) this).aLong10127 * -1855674500483889091L
		    - 286443916104315147L * ((Class501_Sub1) this).aLong10130);
	    ((Class501_Sub1) this).aLong10130
		+= (4490064174302644439L * ((Class501_Sub1) this).aLong10127
		    - 1L * ((Class501_Sub1) this).aLong10130);
	    ((Class501_Sub1) this).aLong10127 += 2003896411674997699L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class501_Sub1) this).aLong10127 += 2003896411674997699L * l;
	} while (i < 10
		 && (((Class501_Sub1) this).aLong10127 * 6288484492035921131L
		     < (-3513528133748920819L
			* ((Class501_Sub1) this).aLong10130)));
	if (6288484492035921131L * ((Class501_Sub1) this).aLong10127
	    < ((Class501_Sub1) this).aLong10130 * -3513528133748920819L)
	    ((Class501_Sub1) this).aLong10127
		= 3646650439868951271L * ((Class501_Sub1) this).aLong10130;
	return i;
    }
    
    int method6106(long l) {
	if (6288484492035921131L * ((Class501_Sub1) this).aLong10127
	    > ((Class501_Sub1) this).aLong10130 * -3513528133748920819L) {
	    ((Class501_Sub1) this).aLong10129
		+= (((Class501_Sub1) this).aLong10127 * -1855674500483889091L
		    - 286443916104315147L * ((Class501_Sub1) this).aLong10130);
	    ((Class501_Sub1) this).aLong10130
		+= (4490064174302644439L * ((Class501_Sub1) this).aLong10127
		    - 1L * ((Class501_Sub1) this).aLong10130);
	    ((Class501_Sub1) this).aLong10127 += 2003896411674997699L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class501_Sub1) this).aLong10127 += 2003896411674997699L * l;
	} while (i < 10
		 && (((Class501_Sub1) this).aLong10127 * 6288484492035921131L
		     < (-3513528133748920819L
			* ((Class501_Sub1) this).aLong10130)));
	if (6288484492035921131L * ((Class501_Sub1) this).aLong10127
	    < ((Class501_Sub1) this).aLong10130 * -3513528133748920819L)
	    ((Class501_Sub1) this).aLong10127
		= 3646650439868951271L * ((Class501_Sub1) this).aLong10130;
	return i;
    }
    
    int method6105(long l) {
	if (6288484492035921131L * ((Class501_Sub1) this).aLong10127
	    > ((Class501_Sub1) this).aLong10130 * -3513528133748920819L) {
	    ((Class501_Sub1) this).aLong10129
		+= (((Class501_Sub1) this).aLong10127 * -1855674500483889091L
		    - 286443916104315147L * ((Class501_Sub1) this).aLong10130);
	    ((Class501_Sub1) this).aLong10130
		+= (4490064174302644439L * ((Class501_Sub1) this).aLong10127
		    - 1L * ((Class501_Sub1) this).aLong10130);
	    ((Class501_Sub1) this).aLong10127 += 2003896411674997699L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class501_Sub1) this).aLong10127 += 2003896411674997699L * l;
	} while (i < 10
		 && (((Class501_Sub1) this).aLong10127 * 6288484492035921131L
		     < (-3513528133748920819L
			* ((Class501_Sub1) this).aLong10130)));
	if (6288484492035921131L * ((Class501_Sub1) this).aLong10127
	    < ((Class501_Sub1) this).aLong10130 * -3513528133748920819L)
	    ((Class501_Sub1) this).aLong10127
		= 3646650439868951271L * ((Class501_Sub1) this).aLong10130;
	return i;
    }
    
    void method6097() {
	((Class501_Sub1) this).aLong10129 = 0L;
	if (((Class501_Sub1) this).aLong10127 * 6288484492035921131L
	    > ((Class501_Sub1) this).aLong10130 * -3513528133748920819L)
	    ((Class501_Sub1) this).aLong10130
		+= (4490064174302644439L * ((Class501_Sub1) this).aLong10127
		    - 1L * ((Class501_Sub1) this).aLong10130);
    }
    
    long method6098() {
	return ((Class501_Sub1) this).aLong10130 * -3513528133748920819L;
    }
    
    static void method9163(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class185.method2720((byte) 46);
    }
}
