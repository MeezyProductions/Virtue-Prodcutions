/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public class Class22
{
    byte[] aByteArray215;
    Class23 aClass23_216;
    long aLong217;
    static final int anInt218 = 200000000;
    int anInt219;
    long aLong220 = 4576356155395542907L;
    long aLong221 = -5241376519603481053L;
    int anInt222 = 0;
    long aLong223;
    long aLong224;
    byte[] aByteArray225;
    long aLong226;
    
    void method661(int i) throws IOException {
	if (-1L != 1693891401730340469L * ((Class22) this).aLong221) {
	    if (1693891401730340469L * ((Class22) this).aLong221
		!= -8667163709387403079L * ((Class22) this).aLong226) {
		((Class22) this).aClass23_216.method681
		    (((Class22) this).aLong221 * 1693891401730340469L);
		((Class22) this).aLong226
		    = -7030826560259744355L * ((Class22) this).aLong221;
	    }
	    ((Class22) this).aClass23_216.method689
		(((Class22) this).aByteArray225, 0,
		 ((Class22) this).anInt222 * -1669903611, 875355918);
	    ((Class22) this).aLong226
		+= 8918906218004639405L * (long) ((Class22) this).anInt222;
	    if (((Class22) this).aLong226 * -8667163709387403079L
		> 5689919592647720849L * ((Class22) this).aLong224)
		((Class22) this).aLong224
		    = ((Class22) this).aLong226 * -1536051242137634135L;
	    long l = -1L;
	    long l_0_ = -1L;
	    if ((((Class22) this).aLong221 * 1693891401730340469L
		 >= ((Class22) this).aLong220 * 6934266472606500941L)
		&& (((Class22) this).aLong221 * 1693891401730340469L
		    < ((long) (((Class22) this).anInt219 * 404701839)
		       + 6934266472606500941L * ((Class22) this).aLong220)))
		l = 1693891401730340469L * ((Class22) this).aLong221;
	    else if ((((Class22) this).aLong220 * 6934266472606500941L
		      >= ((Class22) this).aLong221 * 1693891401730340469L)
		     && (6934266472606500941L * ((Class22) this).aLong220
			 < ((long) (((Class22) this).anInt222 * -1669903611)
			    + (1693891401730340469L
			       * ((Class22) this).aLong221))))
		l = 6934266472606500941L * ((Class22) this).aLong220;
	    if ((((long) (-1669903611 * ((Class22) this).anInt222)
		  + ((Class22) this).aLong221 * 1693891401730340469L)
		 > ((Class22) this).aLong220 * 6934266472606500941L)
		&& (((long) (-1669903611 * ((Class22) this).anInt222)
		     + ((Class22) this).aLong221 * 1693891401730340469L)
		    <= (6934266472606500941L * ((Class22) this).aLong220
			+ (long) (((Class22) this).anInt219 * 404701839))))
		l_0_ = ((long) (-1669903611 * ((Class22) this).anInt222)
			+ ((Class22) this).aLong221 * 1693891401730340469L);
	    else if (((6934266472606500941L * ((Class22) this).aLong220
		       + (long) (404701839 * ((Class22) this).anInt219))
		      > 1693891401730340469L * ((Class22) this).aLong221)
		     && (((long) (((Class22) this).anInt219 * 404701839)
			  + ((Class22) this).aLong220 * 6934266472606500941L)
			 <= (1693891401730340469L * ((Class22) this).aLong221
			     + (long) (((Class22) this).anInt222
				       * -1669903611))))
		l_0_ = ((long) (404701839 * ((Class22) this).anInt219)
			+ ((Class22) this).aLong220 * 6934266472606500941L);
	    if (l > -1L && l_0_ > l) {
		int i_1_ = (int) (l_0_ - l);
		System.arraycopy(((Class22) this).aByteArray225,
				 (int) (l - (1693891401730340469L
					     * ((Class22) this).aLong221)),
				 ((Class22) this).aByteArray215,
				 (int) (l - (6934266472606500941L
					     * ((Class22) this).aLong220)),
				 i_1_);
	    }
	    ((Class22) this).aLong221 = -5241376519603481053L;
	    ((Class22) this).anInt222 = 0;
	}
    }
    
    public void method662(int i) throws IOException {
	method661(-1695274450);
	((Class22) this).aClass23_216.method683((byte) 55);
    }
    
    public long method663() {
	return 4782545777471276451L * ((Class22) this).aLong217;
    }
    
    public long method664(int i) {
	return 4782545777471276451L * ((Class22) this).aLong217;
    }
    
    public void method665(byte[] is, byte i) throws IOException {
	method667(is, 0, is.length, 250090811);
    }
    
    public long method666() {
	return 4782545777471276451L * ((Class22) this).aLong217;
    }
    
    public void method667(byte[] is, int i, int i_2_, int i_3_)
	throws IOException {
	try {
	    if (i + i_2_ > is.length)
		throw new ArrayIndexOutOfBoundsException(i + i_2_ - is.length);
	    if (1693891401730340469L * ((Class22) this).aLong221 != -1L
		&& (5859493276465809283L * ((Class22) this).aLong223
		    >= 1693891401730340469L * ((Class22) this).aLong221)
		&& ((5859493276465809283L * ((Class22) this).aLong223
		     + (long) i_2_)
		    <= (((Class22) this).aLong221 * 1693891401730340469L
			+ (long) (((Class22) this).anInt222 * -1669903611)))) {
		System.arraycopy(((Class22) this).aByteArray225,
				 (int) ((((Class22) this).aLong223
					 * 5859493276465809283L)
					- (1693891401730340469L
					   * ((Class22) this).aLong221)),
				 is, i, i_2_);
		((Class22) this).aLong223
		    += (long) i_2_ * -1194520629989474517L;
		return;
	    }
	    long l = 5859493276465809283L * ((Class22) this).aLong223;
	    int i_4_ = i;
	    int i_5_ = i_2_;
	    if ((5859493276465809283L * ((Class22) this).aLong223
		 >= 6934266472606500941L * ((Class22) this).aLong220)
		&& (((Class22) this).aLong223 * 5859493276465809283L
		    < ((long) (((Class22) this).anInt219 * 404701839)
		       + 6934266472606500941L * ((Class22) this).aLong220))) {
		int i_6_
		    = (int) ((long) (404701839 * ((Class22) this).anInt219)
			     - ((5859493276465809283L
				 * ((Class22) this).aLong223)
				- (((Class22) this).aLong220
				   * 6934266472606500941L)));
		if (i_6_ > i_2_)
		    i_6_ = i_2_;
		System.arraycopy(((Class22) this).aByteArray215,
				 (int) ((((Class22) this).aLong223
					 * 5859493276465809283L)
					- (((Class22) this).aLong220
					   * 6934266472606500941L)),
				 is, i, i_6_);
		((Class22) this).aLong223
		    += -1194520629989474517L * (long) i_6_;
		i += i_6_;
		i_2_ -= i_6_;
	    }
	    if (i_2_ > ((Class22) this).aByteArray215.length) {
		((Class22) this).aClass23_216.method681
		    (((Class22) this).aLong223 * 5859493276465809283L);
		((Class22) this).aLong226
		    = -5264690997902597093L * ((Class22) this).aLong223;
		int i_7_;
		for (/**/; i_2_ > 0; i_2_ -= i_7_) {
		    i_7_ = ((Class22) this).aClass23_216.method692(is, i, i_2_,
								   1979277409);
		    if (i_7_ == -1)
			break;
		    ((Class22) this).aLong226
			+= 3648891282154091913L * (long) i_7_;
		    ((Class22) this).aLong223
			+= -1194520629989474517L * (long) i_7_;
		    i += i_7_;
		}
	    } else if (i_2_ > 0) {
		method675(717927929);
		int i_8_ = i_2_;
		if (i_8_ > 404701839 * ((Class22) this).anInt219)
		    i_8_ = ((Class22) this).anInt219 * 404701839;
		System.arraycopy(((Class22) this).aByteArray215, 0, is, i,
				 i_8_);
		i += i_8_;
		i_2_ -= i_8_;
		((Class22) this).aLong223
		    += -1194520629989474517L * (long) i_8_;
	    }
	    if (((Class22) this).aLong221 * 1693891401730340469L != -1L) {
		if ((((Class22) this).aLong221 * 1693891401730340469L
		     > ((Class22) this).aLong223 * 5859493276465809283L)
		    && i_2_ > 0) {
		    int i_9_ = i + (int) ((1693891401730340469L
					   * ((Class22) this).aLong221)
					  - (((Class22) this).aLong223
					     * 5859493276465809283L));
		    if (i_9_ > i_2_ + i)
			i_9_ = i + i_2_;
		    while (i < i_9_) {
			is[i++] = (byte) 0;
			i_2_--;
			((Class22) this).aLong223 += -1194520629989474517L;
		    }
		}
		long l_10_ = -1L;
		long l_11_ = -1L;
		if (((Class22) this).aLong221 * 1693891401730340469L >= l
		    && (((Class22) this).aLong221 * 1693891401730340469L
			< l + (long) i_5_))
		    l_10_ = ((Class22) this).aLong221 * 1693891401730340469L;
		else if (l >= 1693891401730340469L * ((Class22) this).aLong221
			 && l < ((1693891401730340469L
				  * ((Class22) this).aLong221)
				 + (long) (-1669903611
					   * ((Class22) this).anInt222)))
		    l_10_ = l;
		if (((long) (-1669903611 * ((Class22) this).anInt222)
		     + 1693891401730340469L * ((Class22) this).aLong221) > l
		    && (((long) (((Class22) this).anInt222 * -1669903611)
			 + ((Class22) this).aLong221 * 1693891401730340469L)
			<= l + (long) i_5_))
		    l_11_
			= (1693891401730340469L * ((Class22) this).aLong221
			   + (long) (((Class22) this).anInt222 * -1669903611));
		else if (((long) i_5_ + l
			  > ((Class22) this).aLong221 * 1693891401730340469L)
			 && (l + (long) i_5_
			     <= ((((Class22) this).aLong221
				  * 1693891401730340469L)
				 + (long) (((Class22) this).anInt222
					   * -1669903611))))
		    l_11_ = l + (long) i_5_;
		if (l_10_ > -1L && l_11_ > l_10_) {
		    int i_12_ = (int) (l_11_ - l_10_);
		    System.arraycopy(((Class22) this).aByteArray225,
				     (int) (l_10_ - (((Class22) this).aLong221
						     * 1693891401730340469L)),
				     is, (int) (l_10_ - l) + i_4_, i_12_);
		    if (l_11_
			> 5859493276465809283L * ((Class22) this).aLong223) {
			i_2_ -= l_11_ - (((Class22) this).aLong223
					 * 5859493276465809283L);
			((Class22) this).aLong223
			    = l_11_ * -1194520629989474517L;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    ((Class22) this).aLong226 = -3648891282154091913L;
	    throw ioexception;
	}
	if (i_2_ > 0)
	    throw new EOFException();
    }
    
    public void method668(byte[] is, int i, int i_13_, byte i_14_)
	throws IOException {
	do {
	    try {
		if ((((Class22) this).aLong223 * 5859493276465809283L
		     + (long) i_13_)
		    > 4782545777471276451L * ((Class22) this).aLong217)
		    ((Class22) this).aLong217
			= (457397217487164939L
			   * (((Class22) this).aLong223 * 5859493276465809283L
			      + (long) i_13_));
		if (-1L != 1693891401730340469L * ((Class22) this).aLong221
		    && ((5859493276465809283L * ((Class22) this).aLong223
			 < ((Class22) this).aLong221 * 1693891401730340469L)
			|| (5859493276465809283L * ((Class22) this).aLong223
			    > (1693891401730340469L * ((Class22) this).aLong221
			       + (long) (-1669903611
					 * ((Class22) this).anInt222)))))
		    method661(-1817816077);
		if (((Class22) this).aLong221 * 1693891401730340469L != -1L
		    && (((long) i_13_
			 + 5859493276465809283L * ((Class22) this).aLong223)
			> ((long) ((Class22) this).aByteArray225.length
			   + (1693891401730340469L
			      * ((Class22) this).aLong221)))) {
		    int i_15_
			= (int) ((long) ((Class22) this).aByteArray225.length
				 - ((5859493276465809283L
				     * ((Class22) this).aLong223)
				    - (((Class22) this).aLong221
				       * 1693891401730340469L)));
		    System.arraycopy(is, i, ((Class22) this).aByteArray225,
				     (int) ((5859493276465809283L
					     * ((Class22) this).aLong223)
					    - (1693891401730340469L
					       * ((Class22) this).aLong221)),
				     i_15_);
		    ((Class22) this).aLong223
			+= -1194520629989474517L * (long) i_15_;
		    i += i_15_;
		    i_13_ -= i_15_;
		    ((Class22) this).anInt222
			= ((Class22) this).aByteArray225.length * 418040269;
		    method661(-2024147517);
		}
		if (i_13_ > ((Class22) this).aByteArray225.length) {
		    if (-8667163709387403079L * ((Class22) this).aLong226
			!= 5859493276465809283L * ((Class22) this).aLong223) {
			((Class22) this).aClass23_216.method681
			    (5859493276465809283L * ((Class22) this).aLong223);
			((Class22) this).aLong226
			    = (-5264690997902597093L
			       * ((Class22) this).aLong223);
		    }
		    ((Class22) this).aClass23_216.method689(is, i, i_13_,
							    -803371020);
		    ((Class22) this).aLong226
			+= (long) i_13_ * 3648891282154091913L;
		    if (((Class22) this).aLong226 * -8667163709387403079L
			> ((Class22) this).aLong224 * 5689919592647720849L)
			((Class22) this).aLong224 = (((Class22) this).aLong226
						     * -1536051242137634135L);
		    long l = -1L;
		    long l_16_ = -1L;
		    if ((((Class22) this).aLong223 * 5859493276465809283L
			 >= ((Class22) this).aLong220 * 6934266472606500941L)
			&& (5859493276465809283L * ((Class22) this).aLong223
			    < (6934266472606500941L * ((Class22) this).aLong220
			       + (long) (404701839
					 * ((Class22) this).anInt219))))
			l = 5859493276465809283L * ((Class22) this).aLong223;
		    else if ((6934266472606500941L * ((Class22) this).aLong220
			      >= (((Class22) this).aLong223
				  * 5859493276465809283L))
			     && ((((Class22) this).aLong220
				  * 6934266472606500941L)
				 < (((Class22) this).aLong223
				    * 5859493276465809283L) + (long) i_13_))
			l = 6934266472606500941L * ((Class22) this).aLong220;
		    if (((5859493276465809283L * ((Class22) this).aLong223
			  + (long) i_13_)
			 > ((Class22) this).aLong220 * 6934266472606500941L)
			&& ((((Class22) this).aLong223 * 5859493276465809283L
			     + (long) i_13_)
			    <= ((long) (404701839 * ((Class22) this).anInt219)
				+ (6934266472606500941L
				   * ((Class22) this).aLong220))))
			l_16_
			    = (((Class22) this).aLong223 * 5859493276465809283L
			       + (long) i_13_);
		    else if (((((Class22) this).aLong220 * 6934266472606500941L
			       + (long) (404701839
					 * ((Class22) this).anInt219))
			      > (5859493276465809283L
				 * ((Class22) this).aLong223))
			     && (((long) (404701839
					  * ((Class22) this).anInt219)
				  + (6934266472606500941L
				     * ((Class22) this).aLong220))
				 <= ((long) i_13_
				     + (5859493276465809283L
					* ((Class22) this).aLong223))))
			l_16_
			    = (((Class22) this).aLong220 * 6934266472606500941L
			       + (long) (404701839
					 * ((Class22) this).anInt219));
		    if (l > -1L && l_16_ > l) {
			int i_17_ = (int) (l_16_ - l);
			System.arraycopy(is,
					 (int) ((long) i + l
						- (((Class22) this).aLong223
						   * 5859493276465809283L)),
					 ((Class22) this).aByteArray215,
					 (int) (l - (6934266472606500941L
						     * (((Class22) this)
							.aLong220))),
					 i_17_);
		    }
		    ((Class22) this).aLong223
			+= (long) i_13_ * -1194520629989474517L;
		} else {
		    if (i_13_ <= 0)
			break;
		    if (1693891401730340469L * ((Class22) this).aLong221
			== -1L)
			((Class22) this).aLong221
			    = -966277580275222761L * ((Class22) this).aLong223;
		    System.arraycopy(is, i, ((Class22) this).aByteArray225,
				     (int) ((5859493276465809283L
					     * ((Class22) this).aLong223)
					    - (((Class22) this).aLong221
					       * 1693891401730340469L)),
				     i_13_);
		    ((Class22) this).aLong223
			+= -1194520629989474517L * (long) i_13_;
		    if ((5859493276465809283L * ((Class22) this).aLong223
			 - ((Class22) this).aLong221 * 1693891401730340469L)
			> (long) (((Class22) this).anInt222 * -1669903611))
			((Class22) this).anInt222
			    = ((int) ((((Class22) this).aLong223
				       * 5859493276465809283L)
				      - (1693891401730340469L
					 * ((Class22) this).aLong221))
			       * 418040269);
		}
	    } catch (IOException ioexception) {
		((Class22) this).aLong226 = -3648891282154091913L;
		throw ioexception;
	    }
	    break;
	} while (false);
    }
    
    void method669() throws IOException {
	if (-1L != 1693891401730340469L * ((Class22) this).aLong221) {
	    if (1693891401730340469L * ((Class22) this).aLong221
		!= -8667163709387403079L * ((Class22) this).aLong226) {
		((Class22) this).aClass23_216.method681
		    (((Class22) this).aLong221 * 1693891401730340469L);
		((Class22) this).aLong226
		    = -7030826560259744355L * ((Class22) this).aLong221;
	    }
	    ((Class22) this).aClass23_216.method689
		(((Class22) this).aByteArray225, 0,
		 ((Class22) this).anInt222 * -1669903611, -927091514);
	    ((Class22) this).aLong226
		+= 8918906218004639405L * (long) ((Class22) this).anInt222;
	    if (((Class22) this).aLong226 * -8667163709387403079L
		> 5689919592647720849L * ((Class22) this).aLong224)
		((Class22) this).aLong224
		    = ((Class22) this).aLong226 * -1536051242137634135L;
	    long l = -1L;
	    long l_18_ = -1L;
	    if ((((Class22) this).aLong221 * 1693891401730340469L
		 >= ((Class22) this).aLong220 * 6934266472606500941L)
		&& (((Class22) this).aLong221 * 1693891401730340469L
		    < ((long) (((Class22) this).anInt219 * 404701839)
		       + 6934266472606500941L * ((Class22) this).aLong220)))
		l = 1693891401730340469L * ((Class22) this).aLong221;
	    else if ((((Class22) this).aLong220 * 6934266472606500941L
		      >= ((Class22) this).aLong221 * 1693891401730340469L)
		     && (6934266472606500941L * ((Class22) this).aLong220
			 < ((long) (((Class22) this).anInt222 * -1669903611)
			    + (1693891401730340469L
			       * ((Class22) this).aLong221))))
		l = 6934266472606500941L * ((Class22) this).aLong220;
	    if ((((long) (-1669903611 * ((Class22) this).anInt222)
		  + ((Class22) this).aLong221 * 1693891401730340469L)
		 > ((Class22) this).aLong220 * 6934266472606500941L)
		&& (((long) (-1669903611 * ((Class22) this).anInt222)
		     + ((Class22) this).aLong221 * 1693891401730340469L)
		    <= (6934266472606500941L * ((Class22) this).aLong220
			+ (long) (((Class22) this).anInt219 * 404701839))))
		l_18_ = ((long) (-1669903611 * ((Class22) this).anInt222)
			 + ((Class22) this).aLong221 * 1693891401730340469L);
	    else if (((6934266472606500941L * ((Class22) this).aLong220
		       + (long) (404701839 * ((Class22) this).anInt219))
		      > 1693891401730340469L * ((Class22) this).aLong221)
		     && (((long) (((Class22) this).anInt219 * 404701839)
			  + ((Class22) this).aLong220 * 6934266472606500941L)
			 <= (1693891401730340469L * ((Class22) this).aLong221
			     + (long) (((Class22) this).anInt222
				       * -1669903611))))
		l_18_ = ((long) (404701839 * ((Class22) this).anInt219)
			 + ((Class22) this).aLong220 * 6934266472606500941L);
	    if (l > -1L && l_18_ > l) {
		int i = (int) (l_18_ - l);
		System.arraycopy(((Class22) this).aByteArray225,
				 (int) (l - (1693891401730340469L
					     * ((Class22) this).aLong221)),
				 ((Class22) this).aByteArray215,
				 (int) (l - (6934266472606500941L
					     * ((Class22) this).aLong220)),
				 i);
	    }
	    ((Class22) this).aLong221 = -5241376519603481053L;
	    ((Class22) this).anInt222 = 0;
	}
    }
    
    public void method670() throws IOException {
	method661(-1955573638);
	((Class22) this).aClass23_216.method683((byte) 89);
    }
    
    public void method671() throws IOException {
	method661(-1864541206);
	((Class22) this).aClass23_216.method683((byte) 126);
    }
    
    public void method672() throws IOException {
	method661(-2016066206);
	((Class22) this).aClass23_216.method683((byte) 111);
    }
    
    public void method673(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	((Class22) this).aLong223 = l * -1194520629989474517L;
    }
    
    public long method674() {
	return 4782545777471276451L * ((Class22) this).aLong217;
    }
    
    void method675(int i) throws IOException {
	((Class22) this).anInt219 = 0;
	if (((Class22) this).aLong226 * -8667163709387403079L
	    != ((Class22) this).aLong223 * 5859493276465809283L) {
	    ((Class22) this).aClass23_216
		.method681(((Class22) this).aLong223 * 5859493276465809283L);
	    ((Class22) this).aLong226
		= -5264690997902597093L * ((Class22) this).aLong223;
	}
	((Class22) this).aLong220
	    = -4808751882534815985L * ((Class22) this).aLong223;
	int i_19_;
	for (/**/;
	     (404701839 * ((Class22) this).anInt219
	      < ((Class22) this).aByteArray215.length);
	     ((Class22) this).anInt219 += i_19_ * -378692497) {
	    int i_20_ = (((Class22) this).aByteArray215.length
			 - 404701839 * ((Class22) this).anInt219);
	    if (i_20_ > 200000000)
		i_20_ = 200000000;
	    i_19_ = ((Class22) this).aClass23_216.method692((((Class22) this)
							     .aByteArray215),
							    ((((Class22) this)
							      .anInt219)
							     * 404701839),
							    i_20_, 1888832746);
	    if (-1 == i_19_)
		break;
	    ((Class22) this).aLong226 += 3648891282154091913L * (long) i_19_;
	}
    }
    
    void method676() throws IOException {
	if (-1L != 1693891401730340469L * ((Class22) this).aLong221) {
	    if (1693891401730340469L * ((Class22) this).aLong221
		!= -8667163709387403079L * ((Class22) this).aLong226) {
		((Class22) this).aClass23_216.method681
		    (((Class22) this).aLong221 * 1693891401730340469L);
		((Class22) this).aLong226
		    = -7030826560259744355L * ((Class22) this).aLong221;
	    }
	    ((Class22) this).aClass23_216.method689
		(((Class22) this).aByteArray225, 0,
		 ((Class22) this).anInt222 * -1669903611, -1350986773);
	    ((Class22) this).aLong226
		+= 8918906218004639405L * (long) ((Class22) this).anInt222;
	    if (((Class22) this).aLong226 * -8667163709387403079L
		> 5689919592647720849L * ((Class22) this).aLong224)
		((Class22) this).aLong224
		    = ((Class22) this).aLong226 * -1536051242137634135L;
	    long l = -1L;
	    long l_21_ = -1L;
	    if ((((Class22) this).aLong221 * 1693891401730340469L
		 >= ((Class22) this).aLong220 * 6934266472606500941L)
		&& (((Class22) this).aLong221 * 1693891401730340469L
		    < ((long) (((Class22) this).anInt219 * 404701839)
		       + 6934266472606500941L * ((Class22) this).aLong220)))
		l = 1693891401730340469L * ((Class22) this).aLong221;
	    else if ((((Class22) this).aLong220 * 6934266472606500941L
		      >= ((Class22) this).aLong221 * 1693891401730340469L)
		     && (6934266472606500941L * ((Class22) this).aLong220
			 < ((long) (((Class22) this).anInt222 * -1669903611)
			    + (1693891401730340469L
			       * ((Class22) this).aLong221))))
		l = 6934266472606500941L * ((Class22) this).aLong220;
	    if ((((long) (-1669903611 * ((Class22) this).anInt222)
		  + ((Class22) this).aLong221 * 1693891401730340469L)
		 > ((Class22) this).aLong220 * 6934266472606500941L)
		&& (((long) (-1669903611 * ((Class22) this).anInt222)
		     + ((Class22) this).aLong221 * 1693891401730340469L)
		    <= (6934266472606500941L * ((Class22) this).aLong220
			+ (long) (((Class22) this).anInt219 * 404701839))))
		l_21_ = ((long) (-1669903611 * ((Class22) this).anInt222)
			 + ((Class22) this).aLong221 * 1693891401730340469L);
	    else if (((6934266472606500941L * ((Class22) this).aLong220
		       + (long) (404701839 * ((Class22) this).anInt219))
		      > 1693891401730340469L * ((Class22) this).aLong221)
		     && (((long) (((Class22) this).anInt219 * 404701839)
			  + ((Class22) this).aLong220 * 6934266472606500941L)
			 <= (1693891401730340469L * ((Class22) this).aLong221
			     + (long) (((Class22) this).anInt222
				       * -1669903611))))
		l_21_ = ((long) (404701839 * ((Class22) this).anInt219)
			 + ((Class22) this).aLong220 * 6934266472606500941L);
	    if (l > -1L && l_21_ > l) {
		int i = (int) (l_21_ - l);
		System.arraycopy(((Class22) this).aByteArray225,
				 (int) (l - (1693891401730340469L
					     * ((Class22) this).aLong221)),
				 ((Class22) this).aByteArray215,
				 (int) (l - (6934266472606500941L
					     * ((Class22) this).aLong220)),
				 i);
	    }
	    ((Class22) this).aLong221 = -5241376519603481053L;
	    ((Class22) this).anInt222 = 0;
	}
    }
    
    void method677() throws IOException {
	((Class22) this).anInt219 = 0;
	if (((Class22) this).aLong226 * -8667163709387403079L
	    != ((Class22) this).aLong223 * 5859493276465809283L) {
	    ((Class22) this).aClass23_216
		.method681(((Class22) this).aLong223 * 5859493276465809283L);
	    ((Class22) this).aLong226
		= -5264690997902597093L * ((Class22) this).aLong223;
	}
	((Class22) this).aLong220
	    = -4808751882534815985L * ((Class22) this).aLong223;
	int i;
	for (/**/;
	     (404701839 * ((Class22) this).anInt219
	      < ((Class22) this).aByteArray215.length);
	     ((Class22) this).anInt219 += i * -378692497) {
	    int i_22_ = (((Class22) this).aByteArray215.length
			 - 404701839 * ((Class22) this).anInt219);
	    if (i_22_ > 200000000)
		i_22_ = 200000000;
	    i = (((Class22) this).aClass23_216.method692
		 (((Class22) this).aByteArray215,
		  ((Class22) this).anInt219 * 404701839, i_22_, 2030505663));
	    if (-1 == i)
		break;
	    ((Class22) this).aLong226 += 3648891282154091913L * (long) i;
	}
    }
    
    public void method678(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	((Class22) this).aLong223 = l * -1194520629989474517L;
    }
    
    public Class22(Class23 class23, int i, int i_23_) throws IOException {
	((Class22) this).aClass23_216 = class23;
	((Class22) this).aLong217
	    = ((((Class22) this).aLong224
		= class23.method680(-1934765957) * -3630400072463081103L)
	       * -956000458910076613L);
	((Class22) this).aByteArray215 = new byte[i];
	((Class22) this).aByteArray225 = new byte[i_23_];
	((Class22) this).aLong223 = 0L;
    }
    
    public static int method679(byte[] is, int i, int i_24_) {
	return Class181_Sub16.method8969(is, 0, i, (byte) 40);
    }
}
