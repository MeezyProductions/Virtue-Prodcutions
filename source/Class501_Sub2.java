/* Class501_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.nanotime.QueryPerformanceCounter;

public class Class501_Sub2 extends Class501
{
    long aLong10225 = 0L;
    long[] aLongArray10226;
    long aLong10227;
    int anInt10228;
    long aLong10229 = 0L;
    int anInt10230;
    
    long method6100(int i) {
	return 2635642096513005259L * ((Class501_Sub2) this).aLong10225;
    }
    
    void method6104(byte i) {
	((Class501_Sub2) this).aLong10227 = 0L;
	if (((Class501_Sub2) this).aLong10229 * -2947746732362660689L
	    > ((Class501_Sub2) this).aLong10225 * 2635642096513005259L)
	    ((Class501_Sub2) this).aLong10225
		+= (((Class501_Sub2) this).aLong10229 * 2978630479501216045L
		    - ((Class501_Sub2) this).aLong10225 * 1L);
    }
    
    Class501_Sub2() {
	((Class501_Sub2) this).aLong10227 = 0L;
	((Class501_Sub2) this).aLongArray10226 = new long[10];
	((Class501_Sub2) this).anInt10228 = 0;
	((Class501_Sub2) this).anInt10230 = -1837794927;
	((Class501_Sub2) this).aLong10229
	    = ((((Class501_Sub2) this).aLong10225
		= QueryPerformanceCounter.nanoTime() * 1475081505084931811L)
	       * -5875245142204748123L);
	if (2635642096513005259L * ((Class501_Sub2) this).aLong10225 == 0L)
	    throw new RuntimeException();
    }
    
    long method9256(byte i) {
	long l = QueryPerformanceCounter.nanoTime();
	long l_0_
	    = l - -8436788456152908905L * ((Class501_Sub2) this).aLong10227;
	((Class501_Sub2) this).aLong10227 = -2796923864932518873L * l;
	if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
	    ((Class501_Sub2) this).aLongArray10226
		[((Class501_Sub2) this).anInt10228 * 913687793]
		= l_0_;
	    ((Class501_Sub2) this).anInt10228
		= ((1 + ((Class501_Sub2) this).anInt10228 * 913687793) % 10
		   * 798796817);
	    if (-193173647 * ((Class501_Sub2) this).anInt10230 < 1)
		((Class501_Sub2) this).anInt10230 += -1837794927;
	}
	long l_1_ = 0L;
	for (int i_2_ = 1;
	     i_2_ <= ((Class501_Sub2) this).anInt10230 * -193173647; i_2_++)
	    l_1_ += (((Class501_Sub2) this).aLongArray10226
		     [(10 + (((Class501_Sub2) this).anInt10228 * 913687793
			     - i_2_)) % 10]);
	return l_1_ / (long) (((Class501_Sub2) this).anInt10230 * -193173647);
    }
    
    void method6097() {
	((Class501_Sub2) this).aLong10227 = 0L;
	if (((Class501_Sub2) this).aLong10229 * -2947746732362660689L
	    > ((Class501_Sub2) this).aLong10225 * 2635642096513005259L)
	    ((Class501_Sub2) this).aLong10225
		+= (((Class501_Sub2) this).aLong10229 * 2978630479501216045L
		    - ((Class501_Sub2) this).aLong10225 * 1L);
    }
    
    long method6098() {
	return 2635642096513005259L * ((Class501_Sub2) this).aLong10225;
    }
    
    void method6099() {
	((Class501_Sub2) this).aLong10227 = 0L;
	if (((Class501_Sub2) this).aLong10229 * -2947746732362660689L
	    > ((Class501_Sub2) this).aLong10225 * 2635642096513005259L)
	    ((Class501_Sub2) this).aLong10225
		+= (((Class501_Sub2) this).aLong10229 * 2978630479501216045L
		    - ((Class501_Sub2) this).aLong10225 * 1L);
    }
    
    long method6109(int i) {
	((Class501_Sub2) this).aLong10225
	    += method9256((byte) -23) * 1475081505084931811L;
	if (((Class501_Sub2) this).aLong10229 * -2947746732362660689L
	    > ((Class501_Sub2) this).aLong10225 * 2635642096513005259L)
	    return ((-2947746732362660689L * ((Class501_Sub2) this).aLong10229
		     - (2635642096513005259L
			* ((Class501_Sub2) this).aLong10225))
		    / 1000000L);
	return 0L;
    }
    
    void method6101() {
	((Class501_Sub2) this).aLong10227 = 0L;
	if (((Class501_Sub2) this).aLong10229 * -2947746732362660689L
	    > ((Class501_Sub2) this).aLong10225 * 2635642096513005259L)
	    ((Class501_Sub2) this).aLong10225
		+= (((Class501_Sub2) this).aLong10229 * 2978630479501216045L
		    - ((Class501_Sub2) this).aLong10225 * 1L);
    }
    
    long method6102() {
	((Class501_Sub2) this).aLong10225
	    += method9256((byte) -69) * 1475081505084931811L;
	if (((Class501_Sub2) this).aLong10229 * -2947746732362660689L
	    > ((Class501_Sub2) this).aLong10225 * 2635642096513005259L)
	    return ((-2947746732362660689L * ((Class501_Sub2) this).aLong10229
		     - (2635642096513005259L
			* ((Class501_Sub2) this).aLong10225))
		    / 1000000L);
	return 0L;
    }
    
    int method6103(long l) {
	if (((Class501_Sub2) this).aLong10229 * -2947746732362660689L
	    > 2635642096513005259L * ((Class501_Sub2) this).aLong10225) {
	    ((Class501_Sub2) this).aLong10227
		+= (((Class501_Sub2) this).aLong10229 * 5698535510631088809L
		    - (((Class501_Sub2) this).aLong10225
		       * 4912253631987799277L));
	    ((Class501_Sub2) this).aLong10225
		+= (((Class501_Sub2) this).aLong10229 * 2978630479501216045L
		    - ((Class501_Sub2) this).aLong10225 * 1L);
	    ((Class501_Sub2) this).aLong10229 += l * 7007187606075429455L;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class501_Sub2) this).aLong10229 += 7007187606075429455L * l;
	} while (i < 10
		 && (-2947746732362660689L * ((Class501_Sub2) this).aLong10229
		     < (2635642096513005259L
			* ((Class501_Sub2) this).aLong10225)));
	if (-2947746732362660689L * ((Class501_Sub2) this).aLong10229
	    < ((Class501_Sub2) this).aLong10225 * 2635642096513005259L)
	    ((Class501_Sub2) this).aLong10229
		= -5875245142204748123L * ((Class501_Sub2) this).aLong10225;
	return i;
    }
    
    int method6106(long l) {
	if (((Class501_Sub2) this).aLong10229 * -2947746732362660689L
	    > 2635642096513005259L * ((Class501_Sub2) this).aLong10225) {
	    ((Class501_Sub2) this).aLong10227
		+= (((Class501_Sub2) this).aLong10229 * 5698535510631088809L
		    - (((Class501_Sub2) this).aLong10225
		       * 4912253631987799277L));
	    ((Class501_Sub2) this).aLong10225
		+= (((Class501_Sub2) this).aLong10229 * 2978630479501216045L
		    - ((Class501_Sub2) this).aLong10225 * 1L);
	    ((Class501_Sub2) this).aLong10229 += l * 7007187606075429455L;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class501_Sub2) this).aLong10229 += 7007187606075429455L * l;
	} while (i < 10
		 && (-2947746732362660689L * ((Class501_Sub2) this).aLong10229
		     < (2635642096513005259L
			* ((Class501_Sub2) this).aLong10225)));
	if (-2947746732362660689L * ((Class501_Sub2) this).aLong10229
	    < ((Class501_Sub2) this).aLong10225 * 2635642096513005259L)
	    ((Class501_Sub2) this).aLong10229
		= -5875245142204748123L * ((Class501_Sub2) this).aLong10225;
	return i;
    }
    
    int method6105(long l) {
	if (((Class501_Sub2) this).aLong10229 * -2947746732362660689L
	    > 2635642096513005259L * ((Class501_Sub2) this).aLong10225) {
	    ((Class501_Sub2) this).aLong10227
		+= (((Class501_Sub2) this).aLong10229 * 5698535510631088809L
		    - (((Class501_Sub2) this).aLong10225
		       * 4912253631987799277L));
	    ((Class501_Sub2) this).aLong10225
		+= (((Class501_Sub2) this).aLong10229 * 2978630479501216045L
		    - ((Class501_Sub2) this).aLong10225 * 1L);
	    ((Class501_Sub2) this).aLong10229 += l * 7007187606075429455L;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class501_Sub2) this).aLong10229 += 7007187606075429455L * l;
	} while (i < 10
		 && (-2947746732362660689L * ((Class501_Sub2) this).aLong10229
		     < (2635642096513005259L
			* ((Class501_Sub2) this).aLong10225)));
	if (-2947746732362660689L * ((Class501_Sub2) this).aLong10229
	    < ((Class501_Sub2) this).aLong10225 * 2635642096513005259L)
	    ((Class501_Sub2) this).aLong10229
		= -5875245142204748123L * ((Class501_Sub2) this).aLong10225;
	return i;
    }
    
    int method6096(long l) {
	if (((Class501_Sub2) this).aLong10229 * -2947746732362660689L
	    > 2635642096513005259L * ((Class501_Sub2) this).aLong10225) {
	    ((Class501_Sub2) this).aLong10227
		+= (((Class501_Sub2) this).aLong10229 * 5698535510631088809L
		    - (((Class501_Sub2) this).aLong10225
		       * 4912253631987799277L));
	    ((Class501_Sub2) this).aLong10225
		+= (((Class501_Sub2) this).aLong10229 * 2978630479501216045L
		    - ((Class501_Sub2) this).aLong10225 * 1L);
	    ((Class501_Sub2) this).aLong10229 += l * 7007187606075429455L;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    ((Class501_Sub2) this).aLong10229 += 7007187606075429455L * l;
	} while (i < 10
		 && (-2947746732362660689L * ((Class501_Sub2) this).aLong10229
		     < (2635642096513005259L
			* ((Class501_Sub2) this).aLong10225)));
	if (-2947746732362660689L * ((Class501_Sub2) this).aLong10229
	    < ((Class501_Sub2) this).aLong10225 * 2635642096513005259L)
	    ((Class501_Sub2) this).aLong10229
		= -5875245142204748123L * ((Class501_Sub2) this).aLong10225;
	return i;
    }
    
    long method9257() {
	long l = QueryPerformanceCounter.nanoTime();
	long l_3_
	    = l - -8436788456152908905L * ((Class501_Sub2) this).aLong10227;
	((Class501_Sub2) this).aLong10227 = -2796923864932518873L * l;
	if (l_3_ > -5000000000L && l_3_ < 5000000000L) {
	    ((Class501_Sub2) this).aLongArray10226
		[((Class501_Sub2) this).anInt10228 * 913687793]
		= l_3_;
	    ((Class501_Sub2) this).anInt10228
		= ((1 + ((Class501_Sub2) this).anInt10228 * 913687793) % 10
		   * 798796817);
	    if (-193173647 * ((Class501_Sub2) this).anInt10230 < 1)
		((Class501_Sub2) this).anInt10230 += -1837794927;
	}
	long l_4_ = 0L;
	for (int i = 1; i <= ((Class501_Sub2) this).anInt10230 * -193173647;
	     i++)
	    l_4_ += (((Class501_Sub2) this).aLongArray10226
		     [(10 + (((Class501_Sub2) this).anInt10228 * 913687793
			     - i)) % 10]);
	return l_4_ / (long) (((Class501_Sub2) this).anInt10230 * -193173647);
    }
}
