/* Class468 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class468
{
    boolean aBool5319;
    int anInt5320;
    long aLong5321;
    int anInt5322;
    float[] aFloatArray5323;
    boolean aBool5324;
    boolean aBool5325;
    float aFloat5326;
    Interface56 anInterface56_5327;
    int anInt5328;
    byte[] aByteArray5329;
    int anInt5330;
    int anInt5331;
    Class471[] aClass471Array5332;
    int anInt5333;
    Object anObject5334;
    int anInt5335;
    int anInt5336;
    boolean aBool5337;
    boolean aBool5338;
    int anInt5339;
    int[] anIntArray5340;
    int[] anIntArray5341;
    int[] anIntArray5342;
    int anInt5343;
    boolean aBool5344;
    int anInt5345;
    Class472 aClass472_5346;
    Class364 aClass364_5347;
    boolean aBool5348;
    int anInt5349;
    Object anObject5350;
    int anInt5351 = 0;
    int anInt5352 = 0;
    float aFloat5353;
    float aFloat5354;
    int anInt5355;
    int anInt5356;
    int anInt5357;
    int anInt5358;
    float aFloat5359;
    int anInt5360 = 0;
    float aFloat5361;
    float aFloat5362;
    long aLong5363;
    Interface55 anInterface55_5364;
    int anInt5365;
    Interface37 anInterface37_5366;
    boolean aBool5367;
    int anInt5368;
    boolean aBool5369;
    
    public float method5651(byte i) {
	return ((Class468) this).aFloat5359;
    }
    
    float method5652() {
	return ((Class468) this).aFloat5353;
    }
    
    boolean method5653(int i) {
	return Class472.aClass472_5412 == ((Class468) this).aClass472_5346;
    }
    
    boolean method5654(byte i) {
	return ((Class468) this).aClass472_5346 == Class472.aClass472_5413;
    }
    
    public void method5655() {
	if (((Class472) method5722(-1369325982)).anInt5406 * -133908617
	    >= -133908617 * ((Class472) Class472.aClass472_5410).anInt5406)
	    throw new RuntimeException("");
	method5729(Class472.aClass472_5410, (byte) 25);
    }
    
    public void method5656(int i) {
	if (((Class472) method5722(-1369325982)).anInt5406 * -133908617
	    < -133908617 * ((Class472) Class472.aClass472_5410).anInt5406)
	    throw new RuntimeException("");
	((Class468) this).anObject5350 = null;
	method5729(Class472.aClass472_5414, (byte) 86);
    }
    
    void method5657(float f, int i, int i_0_) {
	if (i <= 0) {
	    ((Class468) this).aFloat5353 = f;
	    ((Class468) this).aFloat5361 = ((Class468) this).aFloat5353;
	    ((Class468) this).aLong5363 = 0L;
	    ((Class468) this).aLong5321 = 0L;
	} else {
	    ((Class468) this).aFloat5362 = ((Class468) this).aFloat5353;
	    ((Class468) this).aFloat5361 = f;
	    ((Class468) this).aLong5363
		= Class249.method3417(2012853582) * -7358038685054429341L;
	    ((Class468) this).aLong5321
		= (((Class468) this).aLong5363 * 691128228639056459L
		   + (long) i) * -7636262627762271227L;
	}
    }
    
    boolean method5658(byte[] is, Interface56 interface56, int i, float f,
		       boolean bool, boolean bool_1_, int i_2_, float f_3_,
		       Object object, byte i_4_) {
	synchronized (this) {
	    if (interface56 != null) {
		((Class468) this).aByteArray5329 = null;
		((Class468) this).anInterface56_5327 = interface56;
	    } else
		((Class468) this).aByteArray5329 = is;
	    ((Class468) this).anObject5350 = object;
	    ((Class468) this).anInt5320 = 1970495303 * i;
	    ((Class468) this).aFloat5353 = f;
	    ((Class468) this).aBool5324 = bool_1_;
	    ((Class468) this).anInt5328 = 1953609329 * i_2_;
	    ((Class468) this).aFloat5326 = f_3_;
	    byte[] is_5_ = null;
	    if (((Class468) this).aByteArray5329 != null)
		is_5_ = ((Class468) this).aByteArray5329;
	    else if (null != ((Class468) this).anInterface56_5327) {
		((Class468) this).anInt5331 = 0;
		is_5_ = (((Class468) this).anInterface56_5327.method352
			 (((Class468) this).anInt5331 * -760025735,
			  -1955362488));
	    }
	    if (is_5_ != null) {
		ByteBuffer class528_sub42 = new ByteBuffer(is_5_);
		if (class528_sub42.readUnsignedByte((byte) 113) != 74
		    || class528_sub42.readUnsignedByte((byte) 76) != 65
		    || class528_sub42.readUnsignedByte((byte) 46) != 71
		    || class528_sub42.readUnsignedByte((byte) 111) != 65)
		    throw new RuntimeException("");
		((Class468) this).anInt5357
		    = class528_sub42.readInt(-719437339) * -1156213233;
		((Class468) this).anInt5336
		    = class528_sub42.readInt(-298682623) * 1767128843;
		((Class468) this).anInt5356
		    = class528_sub42.readInt(-1335301217) * -1290870777;
		((Class468) this).anInt5335
		    = class528_sub42.readInt(676210848) * -1550175063;
		((Class468) this).anInt5339
		    = class528_sub42.readInt(74279147) * 842588251;
		if (null == ((Class468) this).anObject5334) {
		    ((Class468) this).anObject5334
			= (((Class468) this).aClass364_5347.method4605
			   (((Class468) this).anInt5335 * -1753239655,
			    -1497985609 * ((Class468) this).anInt5356,
			    ((Class468) this).anInterface37_5366.method264(),
			    ((Class468) this).anInterface37_5366.method265(),
			    ((Class468) this).anInt5345 * 1195965995,
			    ((Class468) this).aFloat5326, (byte) -81));
		    if (((Class468) this).anObject5334 == null) {
			method5729(Class472.aClass472_5413, (byte) 88);
			boolean bool_6_ = false;
			return bool_6_;
		    }
		}
		((Class468) this).anIntArray5340
		    = new int[2132365267 * ((Class468) this).anInt5339];
		((Class468) this).anIntArray5341
		    = new int[2132365267 * ((Class468) this).anInt5339];
		((Class468) this).anIntArray5342
		    = new int[((Class468) this).anInt5339 * 2132365267];
		int i_7_ = (class528_sub42.pointer * -185904669
			    + ((Class468) this).anInt5339 * -120947048);
		for (int i_8_ = 0;
		     i_8_ < ((Class468) this).anInt5339 * 2132365267; i_8_++) {
		    ((Class468) this).anIntArray5340[i_8_] = i_7_;
		    ((Class468) this).anIntArray5341[i_8_]
			= class528_sub42.readInt(-1818127686);
		    ((Class468) this).anIntArray5342[i_8_]
			= class528_sub42.readInt(515863119);
		    i_7_ += ((Class468) this).anIntArray5341[i_8_];
		}
		((Class468) this).anInt5343
		    = 1252450273 * class528_sub42.pointer;
		((Class468) this).aClass471Array5332
		    = new Class471[-1392597147 * ((Class468) this).anInt5322];
		((Class468) this).aFloatArray5323 = new float[2];
		for (int i_9_ = 0;
		     i_9_ < ((Class468) this).aFloatArray5323.length; i_9_++)
		    ((Class468) this).aFloatArray5323[i_9_] = 1.0F;
		if (((Class468) this).anObject5350 instanceof Class469) {
		    Interface67 interface67
			= ((Class469) ((Class468) this).anObject5350)
			      .method5752(-2112847180);
		    ((Class468) this).aBool5325
			= interface67.method418((byte) 103);
		    ((Class468) this).aBool5367 = !((Class468) this).aBool5325;
		}
		((Class468) this).anInterface37_5366.method292
		    (((Class468) this).aBool5367,
		     (((Class468) this).aBool5324
		      ? ((Class468) this).anInt5328 * -1240773999 : 0),
		     -566191889 * ((Class468) this).anInt5357,
		     1085084835 * ((Class468) this).anInt5336);
		if (null != ((Class468) this).anInterface56_5327) {
		    int i_10_ = (class528_sub42.payload.length
				 - ((Class468) this).anInt5343 * -1673659837);
		    byte[] is_11_
			= Class663.method7883(i_10_, true, 1239022665);
		    System.arraycopy(class528_sub42.payload,
				     -1673659837 * ((Class468) this).anInt5343,
				     is_11_, 0, i_10_);
		    class528_sub42.payload = is_11_;
		    class528_sub42.pointer = i_10_ * 2015001547;
		    ((Class468) this).anInterface37_5366
			.method51(class528_sub42);
		    ((Class468) this).anInt5331 += -1520898871;
		} else
		    ((Class468) this).aBool5348 = true;
		boolean bool_12_ = true;
		return bool_12_;
	    }
	    boolean bool_13_ = is_5_ != null;
	    return bool_13_;
	}
    }
    
    void method5659(int i) {
	synchronized (this) {
	    method5670(-864131006);
	}
    }
    
    void method5660(float f, int i) {
	synchronized (this) {
	    ((Class468) this).aFloat5359 = f;
	}
    }
    
    boolean method5661(int i) {
	if (null == ((Class468) this).aFloatArray5323)
	    return false;
	float f = 0.0F;
	float f_14_ = 0.0F;
	for (int i_15_ = 0; i_15_ < ((Class468) this).aFloatArray5323.length;
	     i_15_++) {
	    float f_16_ = ((Class468) this).aFloatArray5323[i_15_];
	    if (f_16_ * ((Class468) this).aFloat5353 > f)
		f = f_16_;
	    if (f_16_ > f_14_)
		f_14_ = f_16_;
	}
	if (f < 1.0E-5F) {
	    if (f_14_ >= 1.0E-5F && ((Class468) this).aFloat5361 >= 1.0E-5F)
		return true;
	    return false;
	}
	return true;
    }
    
    void method5662(int i) {
	Class351 class351
	    = (((Class468) this).aClass364_5347.method4609((byte) 127)
		   .method4582
	       (1921161847 * ((Class468) this).anInt5320, (byte) 30));
	((Class468) this).aFloat5354
	    = class351 != null ? class351.method4553(-483168984) : 1.0F;
	float f = class351 != null ? class351.method4552(-183481062) : 0.1F;
	f *= ((Class468) this).aFloat5353;
	float f_17_
	    = ((Class468) this).aFloatArray5323.length > 0 ? 0.0F : 1.0F;
	for (int i_18_ = 0; i_18_ < ((Class468) this).aFloatArray5323.length;
	     i_18_++) {
	    if (((Class468) this).aFloatArray5323[i_18_] > f_17_)
		f_17_ = ((Class468) this).aFloatArray5323[i_18_];
	}
	f *= f_17_;
	if (!method5661(-2022708506))
	    f = -1.0F;
	if (method5651((byte) -82) != f) {
	    method5660(f, -1427993859);
	    ((Class468) this).aBool5344 = true;
	}
    }
    
    public void method5663() {
	if ((((Class472) method5722(-1369325982)).anInt5406 * -133908617
	     >= -133908617 * ((Class472) Class472.aClass472_5409).anInt5406)
	    && (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		< ((Class472) Class472.aClass472_5412).anInt5406 * -133908617)
	    && method5661(-2022708506)) {
	    synchronized (this) {
		((Class468) this).anInterface37_5366.method191();
		method5700(1881606414);
	    }
	    Thread.yield();
	}
    }
    
    public void method5664() {
	if (((Class472) method5722(-1369325982)).anInt5406 * -133908617
	    < -133908617 * ((Class472) Class472.aClass472_5410).anInt5406)
	    throw new RuntimeException("");
	((Class468) this).anObject5350 = null;
	method5729(Class472.aClass472_5414, (byte) 57);
    }
    
    public boolean method5665(byte i) {
	return ((Class468) this).aBool5344;
    }
    
    public void method5666(int i) {
	synchronized (this) {
	    method5667((byte) 106);
	}
    }
    
    void method5667(byte i) {
	if (((Class472) method5722(-1369325982)).anInt5406 * -133908617
	    >= ((Class472) Class472.aClass472_5409).anInt5406 * -133908617) {
	    if (method5722(-1369325982) == Class472.aClass472_5414)
		method5669(62966459);
	    else {
		method5668((byte) 7);
		if (((Class468) this).aFloat5361
		    != ((Class468) this).aFloat5353) {
		    long l = Class249.method3417(1955084593);
		    if (l
			> ((Class468) this).aLong5321 * -7043113260683665203L)
			((Class468) this).aFloat5353
			    = ((Class468) this).aFloat5361;
		    else {
			float f = (((Class468) this).aFloat5361
				   - ((Class468) this).aFloat5362);
			long l_19_ = ((((Class468) this).aLong5321
				       * -7043113260683665203L)
				      - (691128228639056459L
					 * ((Class468) this).aLong5363));
			float f_20_ = f / (float) l_19_;
			((Class468) this).aFloat5353
			    = (((Class468) this).aFloat5362
			       + ((float) (l - (((Class468) this).aLong5363
						* 691128228639056459L))
				  * f_20_));
			((Class468) this).aFloat5353
			    = Math.max(0.0F,
				       Math.min(1.0F,
						((Class468) this).aFloat5353));
		    }
		}
		method5662(886737091);
		if (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		    < (((Class472) Class472.aClass472_5412).anInt5406
		       * -133908617))
		    method5671(-592019708);
	    }
	}
    }
    
    void method5668(byte i) {
	synchronized (this) {
	    int i_21_ = method5712(2105650329);
	    if (((Class468) this).aBool5325
		&& i_21_ > -208343481 * ((Class468) this).anInt5365
		&& ((Class468) this).anInterface37_5366.method271()) {
		/* empty */
	    } else {
		Class369 class369
		    = ((Class468) this).anInterface37_5366.method261();
		if (((Class468) this).aBool5348
		    && class369 != Class369.aClass369_3865) {
		    if (null != ((Class468) this).aByteArray5329) {
			if (1860803713 * ((Class468) this).anInt5355
			    >= 2132365267 * ((Class468) this).anInt5339) {
			    ((Class468) this).anInterface37_5366
				.method51(null);
			    ((Class468) this).anInt5355 = 0;
			} else {
			    if (1564762317 * ((Class468) this).anInt5330
				< ((Class468) this).anInt5343 * -1673659837)
				((Class468) this).anInt5330
				    = -109541553 * ((Class468) this).anInt5343;
			    ((Class468) this).anInt5330
				= (((Class468) this).anInt5358 * -930660819
				   + (((Class468) this).anIntArray5340
				      [(((Class468) this).anInt5355
					* 1860803713)])) * -1549628411;
			    int i_22_
				= (((Class468) this).anIntArray5341
				   [1860803713 * ((Class468) this).anInt5355]);
			    int i_23_ = i_22_;
			    int i_24_
				= ((-930660819 * ((Class468) this).anInt5358
				    + i_23_) > i_22_
				   ? i_22_ + (((Class468) this).anIntArray5340
					      [1860803713 * (((Class468) this)
							     .anInt5355)])
				   : (((Class468) this).anInt5330 * 1564762317
				      + i_23_));
			    Class468 class468_25_ = this;
			    ((Class468) class468_25_).anInt5358
				= (((Class468) class468_25_).anInt5358
				   + (((((Class468) this).anInt5330
					* 1564762317) + i_23_
				       > (((Class468) this)
					  .aByteArray5329).length)
				      ? ((((Class468) this)
					  .aByteArray5329).length
					 - (((Class468) this).anInt5330
					    * 1564762317))
				      : i_23_) * -2065055323);
			    ByteBuffer class528_sub42
				= new ByteBuffer(i_24_ - (((Class468)
							       this).anInt5330
							      * 1564762317),
						     true);
			    if (((Class468) this).aByteArray5329 == null)
				throw new RuntimeException("");
			    if (class528_sub42.payload == null)
				throw new RuntimeException("");
			    class528_sub42.method9618
				(((Class468) this).aByteArray5329,
				 ((Class468) this).anInt5330 * 1564762317,
				 (i_24_
				  - 1564762317 * ((Class468) this).anInt5330),
				 837848160);
			    ((Class468) this).anInterface37_5366
				.method51(class528_sub42);
			    method5676(false, 1835803215);
			    if (-930660819 * ((Class468) this).anInt5358
				>= i_22_) {
				((Class468) this).anInt5355 += 1419944833;
				((Class468) this).anInt5358 = 0;
			    }
			}
		    } else if (null != ((Class468) this).anInterface56_5327) {
			if (-760025735 * ((Class468) this).anInt5331
			    >= ((Class468) this).anInt5339 * 2132365267) {
			    ((Class468) this).anInt5331 = 0;
			    ((Class468) this).anInterface37_5366
				.method51(null);
			} else {
			    byte[] is = (((Class468) this)
					     .anInterface56_5327.method352
					 ((((Class468) this).anIntArray5342
					   [(-760025735
					     * ((Class468) this).anInt5331)]),
					  -2003529126));
			    if (null != is) {
				ByteBuffer class528_sub42
				    = new ByteBuffer(is);
				class528_sub42.pointer
				    = is.length * 2015001547;
				((Class468) this).anInterface37_5366
				    .method51(class528_sub42);
				method5676(false, 1835803215);
				((Class468) this).anInt5331 += -1520898871;
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method5669(int i) {
	synchronized (this) {
	    if (((Class468) this).anInterface37_5366.method261()
		== Class369.aClass369_3864) {
		if (null != ((Class468) this).anObject5334) {
		    int i_26_
			= (((Class468) this).aClass364_5347.method4613
			   (((Class468) this).anObject5334, -1264997347));
		    if (i_26_ >= 1195965995 * ((Class468) this).anInt5345) {
			((Class468) this).aClass364_5347.method4604
			    (((Class468) this).anObject5334, -897393914);
			((Class468) this).anObject5334 = null;
			method5729(Class472.aClass472_5407, (byte) 52);
		    }
		} else
		    method5729(Class472.aClass472_5407, (byte) 82);
	    }
	}
	method5726(1239022665);
    }
    
    void method5670(int i) {
	if (method5722(-1369325982) != Class472.aClass472_5412
	    && (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		< (-133908617
		   * ((Class472) Class472.aClass472_5409).anInt5406))) {
	    method5729(Class472.aClass472_5409, (byte) 12);
	    ((Class468) this).aBool5319 = true;
	    method5671(100221397);
	    method5662(886737091);
	}
    }
    
    void method5671(int i) {
	if (((Class468) this).aBool5319 == true
	    && (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		>= -133908617 * ((Class472) Class472.aClass472_5409).anInt5406)
	    && (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		< ((Class472) Class472.aClass472_5413).anInt5406 * -133908617)
	    && null != ((Class468) this).anInterface55_5364
	    && ((Class468) this).aFloat5353 == ((Class468) this).aFloat5361)
	    ((Class468) this).anInterface55_5364.method351((((Class468) this)
							    .anObject5350),
							   (((Class468) this)
							    .aFloatArray5323),
							   null, 629728698);
    }
    
    void method5672(short i) {
	((Class468) this).aBool5369 = true;
    }
    
    boolean method5673() {
	synchronized (this) {
	    if (null != ((Class468) this).anObject5350
		&& ((Class468) this).anObject5350 instanceof Class469) {
		Class469 class469 = (Class469) ((Class468) this).anObject5350;
		Interface67 interface67 = class469.method5752(-426762508);
		if (null != interface67) {
		    boolean bool = interface67.method449(-1657322578);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    public void method5674(byte i) {
	if ((((Class472) method5722(-1369325982)).anInt5406 * -133908617
	     >= -133908617 * ((Class472) Class472.aClass472_5409).anInt5406)
	    && (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		< ((Class472) Class472.aClass472_5412).anInt5406 * -133908617)
	    && method5661(-2022708506)) {
	    synchronized (this) {
		((Class468) this).anInterface37_5366.method191();
		method5700(793482627);
	    }
	    Thread.yield();
	}
    }
    
    float method5675(int i) {
	return ((Class468) this).aFloat5353;
    }
    
    void method5676(boolean bool, int i) {
	((Class468) this).aBool5348 = bool;
    }
    
    public void method5677(int i) {
	synchronized (this) {
	    if (((Class468) this).aBool5369) {
		/* empty */
	    } else if (null == ((Class468) this).anObject5334) {
		/* empty */
	    } else {
		int i_27_ = (((Class468) this).aClass364_5347.method4613
			     (((Class468) this).anObject5334, -1264997347));
		if (i_27_ <= 0) {
		    /* empty */
		} else if (((Class468) this).aClass471Array5332 != null
			   && ((((Class468) this).aClass471Array5332
				[((Class468) this).anInt5333 * 1406114527])
			       != null)
			   && ((Class468) this).aBool5338) {
		    int i_28_
			= ((1630842675 * ((Class468) this).anInt5351 + i_27_
			    > (((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .aClass528_Sub42_5404.pointer) * -185904669)
			   ? ((((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .aClass528_Sub42_5404.pointer) * -185904669
			      - 1630842675 * ((Class468) this).anInt5351)
			   : i_27_);
		    if ((1630842675 * ((Class468) this).anInt5351
			 < (((Class471) (((Class468) this).aClass471Array5332
					 [(((Class468) this).anInt5333
					   * 1406114527)])).anInt5403
			    * 306325099))
			&& (i_28_ + ((Class468) this).anInt5351 * 1630842675
			    > (306325099
			       * (((Class471) (((Class468) this)
					       .aClass471Array5332
					       [1406114527 * (((Class468) this)
							      .anInt5333)]))
				  .anInt5403)))
			&& (((Class471)
			     (((Class468) this).aClass471Array5332
			      [1406114527 * ((Class468) this).anInt5333]))
			    .anInt5403) * 306325099 >= 0) {
			((Class468) this).anInt5351
			    += ((18516969
				 * ((Class471) (((Class468) this)
						.aClass471Array5332
						[(((Class468) this).anInt5333
						  * 1406114527)])).anInt5403)
				- ((Class468) this).anInt5351 * 1);
			i_28_ = (((((Class468) this).anInt5351 * 1630842675
				   + i_27_)
				  > (((Class471) (((Class468) this)
						  .aClass471Array5332
						  [(((Class468) this).anInt5333
						    * 1406114527)]))
				     .aClass528_Sub42_5404
				     .pointer) * -185904669)
				 ? ((-185904669
				     * (((Class471)
					 (((Class468) this).aClass471Array5332
					  [(((Class468) this).anInt5333
					    * 1406114527)]))
					.aClass528_Sub42_5404.pointer))
				    - ((Class468) this).anInt5351 * 1630842675)
				 : i_27_);
		    }
		    if ((((Class468) this).anInt5351 * 1630842675 + i_28_
			 > (1085328827
			    * (((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .anInt5402)))
			&& (((Class471)
			     (((Class468) this).aClass471Array5332
			      [1406114527 * ((Class468) this).anInt5333]))
			    .anInt5402) * 1085328827 >= 0)
			i_28_ = ((1085328827
				  * ((Class471) (((Class468) this)
						 .aClass471Array5332
						 [(((Class468) this).anInt5333
						   * 1406114527)])).anInt5402)
				 - ((Class468) this).anInt5351 * 1630842675);
		    method5678((((Class471)
				 (((Class468) this).aClass471Array5332
				  [1406114527 * ((Class468) this).anInt5333]))
				.aClass528_Sub42_5404.payload),
			       1630842675 * ((Class468) this).anInt5351,
			       (1630842675 * ((Class468) this).anInt5351
				+ i_28_),
			       (byte) -58);
		    ((Class468) this).aClass364_5347.method4626
			(((Class468) this).anObject5334,
			 (((Class471)
			   (((Class468) this).aClass471Array5332
			    [((Class468) this).anInt5333 * 1406114527]))
			  .aClass528_Sub42_5404.payload),
			 ((Class468) this).anInt5351 * 1630842675, i_28_,
			 (byte) 11);
		    ((Class468) this).anInt5351 += 1443554299 * i_28_;
		    i_27_ -= i_28_;
		    if ((1630842675 * ((Class468) this).anInt5351
			 >= (((Class471)
			      (((Class468) this).aClass471Array5332
			       [1406114527 * ((Class468) this).anInt5333]))
			     .aClass528_Sub42_5404.pointer) * -185904669)
			|| ((1630842675 * ((Class468) this).anInt5351
			     >= (((Class471)
				  (((Class468) this).aClass471Array5332
				   [1406114527 * ((Class468) this).anInt5333]))
				 .anInt5402) * 1085328827)
			    && 1085328827 * (((Class471)
					      (((Class468) this)
					       .aClass471Array5332
					       [1406114527 * (((Class468) this)
							      .anInt5333)]))
					     .anInt5402) >= 0)) {
			((Class468) this).aClass471Array5332
			    [1406114527 * ((Class468) this).anInt5333]
			    .method5809((byte) 55);
			((Class468) this).aClass471Array5332
			    [1406114527 * ((Class468) this).anInt5333]
			    = null;
			((Class468) this).anInt5333 += 457875743;
			((Class468) this).anInt5333
			    = (((Class468) this).anInt5333 * 1406114527
			       % ((Class468) this).aClass471Array5332.length
			       * 457875743);
			((Class468) this).anInt5351 = 0;
		    }
		}
	    }
	}
    }
    
    void method5678(byte[] is, int i, int i_29_, byte i_30_) {
	int i_31_ = i;
	int i_32_ = 0;
	int i_33_ = (((Class468) this).anInterface37_5366.method264().anInt3842
		     * 1968729145);
	while (i_31_ < is.length && i_31_ < i_29_) {
	    float f = (((Class468) this).aFloatArray5323[i_32_]
		       * (((Class468) this).aFloat5354
			  * ((Class468) this).aFloat5353));
	    if (16 == i_33_) {
		int i_34_ = (is[i_31_] & 0xff) + (is[i_31_ + 1] << 8);
		i_34_ *= f * f;
		is[i_31_++] = (byte) i_34_;
		is[i_31_++] = (byte) (i_34_ >> 8);
	    } else if (8 == i_33_) {
		byte i_35_ = is[i_31_];
		i_35_ *= f;
		is[i_31_++] = i_35_;
	    } else
		throw new RuntimeException("");
	    i_32_ = ++i_32_ % ((Class468) this).aFloatArray5323.length;
	}
    }
    
    ByteBuffer method5679(int i, byte i_36_) {
	return ((Class468) this).anInterface37_5366.method269(i);
    }
    
    void method5680(ByteBuffer class528_sub42, byte i) {
	if (((Class468) this).anObject5350 != null
	    && ((Class468) this).anObject5350 instanceof Class469) {
	    Class469 class469 = (Class469) ((Class468) this).anObject5350;
	    Interface67 interface67 = class469.method5752(-1857277796);
	    byte[] is = new byte[class528_sub42.pointer * -185904669];
	    System.arraycopy(class528_sub42.payload, 0, is, 0,
			     -185904669 * class528_sub42.pointer);
	    ByteBuffer class528_sub42_37_ = new ByteBuffer(is);
	    class528_sub42_37_.pointer = class528_sub42.pointer * 1;
	    interface67.method423(class528_sub42_37_, 1447446799);
	}
    }
    
    ByteBuffer method5681(int i, byte i_38_) {
	if (null != ((Class468) this).anObject5350
	    && ((Class468) this).anObject5350 instanceof Class469) {
	    Class469 class469 = (Class469) ((Class468) this).anObject5350;
	    Interface67 interface67 = class469.method5752(-1665036080);
	    ByteBuffer class528_sub42
		= interface67.method417(i, (byte) -44);
	    ByteBuffer class528_sub42_39_
		= new ByteBuffer(class528_sub42.pointer * -185904669,
				     true);
	    class528_sub42_39_.method9619(class528_sub42, (byte) 16);
	    return class528_sub42_39_;
	}
	return null;
    }
    
    boolean method5682(int i, int i_40_) {
	if (((Class468) this).anObject5350 != null
	    && ((Class468) this).anObject5350 instanceof Class469) {
	    Class469 class469 = (Class469) ((Class468) this).anObject5350;
	    Interface67 interface67 = class469.method5752(-2002981648);
	    return interface67.method419(i, 1795908721);
	}
	return false;
    }
    
    public void method5683() {
	if (((Class472) method5722(-1369325982)).anInt5406 * -133908617
	    >= -133908617 * ((Class472) Class472.aClass472_5410).anInt5406)
	    throw new RuntimeException("");
	method5729(Class472.aClass472_5410, (byte) 127);
    }
    
    boolean method5684(int i) {
	synchronized (this) {
	    if (null != ((Class468) this).anObject5350
		&& ((Class468) this).anObject5350 instanceof Class469) {
		Class469 class469 = (Class469) ((Class468) this).anObject5350;
		Interface67 interface67 = class469.method5752(-979500495);
		if (null != interface67) {
		    boolean bool = interface67.method449(-1300160945);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    void method5685(int i) {
	synchronized (this) {
	    if (((Class468) this).anObject5350 != null
		&& ((Class468) this).anObject5350 instanceof Class469) {
		Class469 class469 = (Class469) ((Class468) this).anObject5350;
		Interface67 interface67 = class469.method5752(-1637076974);
		if (null != interface67)
		    interface67.method421(true, -1319385571);
	    }
	}
    }
    
    void method5686() {
	synchronized (this) {
	    method5670(-864131006);
	}
    }
    
    void method5687(Interface55 interface55, int i) {
	((Class468) this).anInterface55_5364 = interface55;
	if (((Class468) this).anInterface55_5364 != null)
	    ((Class468) this).anInterface55_5364.method351((((Class468) this)
							    .anObject5350),
							   (((Class468) this)
							    .aFloatArray5323),
							   null, 655888265);
    }
    
    void method5688(int i) {
	((Class468) this).aBool5369 = false;
    }
    
    boolean method5689() {
	return Class472.aClass472_5412 == ((Class468) this).aClass472_5346;
    }
    
    boolean method5690() {
	return ((Class468) this).aClass472_5346 == Class472.aClass472_5413;
    }
    
    boolean method5691() {
	return ((Class468) this).aClass472_5346 == Class472.aClass472_5413;
    }
    
    boolean method5692() {
	return ((Class468) this).aClass472_5346 == Class472.aClass472_5413;
    }
    
    public void method5693(byte i) {
	if (((Class472) method5722(-1369325982)).anInt5406 * -133908617
	    >= -133908617 * ((Class472) Class472.aClass472_5410).anInt5406)
	    throw new RuntimeException("");
	method5729(Class472.aClass472_5410, (byte) 48);
    }
    
    public void method5694() {
	if (((Class472) method5722(-1369325982)).anInt5406 * -133908617
	    >= -133908617 * ((Class472) Class472.aClass472_5410).anInt5406)
	    throw new RuntimeException("");
	method5729(Class472.aClass472_5410, (byte) 125);
    }
    
    public void method5695() {
	if (((Class472) method5722(-1369325982)).anInt5406 * -133908617
	    < -133908617 * ((Class472) Class472.aClass472_5410).anInt5406)
	    throw new RuntimeException("");
	((Class468) this).anObject5350 = null;
	method5729(Class472.aClass472_5414, (byte) 7);
    }
    
    public void method5696(int i) {
	synchronized (this) {
	    if (method5722(-1369325982) == Class472.aClass472_5412
		|| (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		    < (((Class472) Class472.aClass472_5410).anInt5406
		       * -133908617))) {
		/* empty */
	    } else
		method5729(Class472.aClass472_5412, (byte) 112);
	}
    }
    
    boolean method5697() {
	synchronized (this) {
	    if (null != ((Class468) this).anObject5350
		&& ((Class468) this).anObject5350 instanceof Class469) {
		Class469 class469 = (Class469) ((Class468) this).anObject5350;
		Interface67 interface67 = class469.method5752(-1742011056);
		if (null != interface67) {
		    boolean bool = interface67.method449(357046095);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    float method5698() {
	return ((Class468) this).aFloat5353;
    }
    
    void method5699() {
	synchronized (this) {
	    if (((Class468) this).anInterface37_5366.method261()
		== Class369.aClass369_3864) {
		if (null != ((Class468) this).anObject5334) {
		    int i = (((Class468) this).aClass364_5347.method4613
			     (((Class468) this).anObject5334, -1264997347));
		    if (i >= 1195965995 * ((Class468) this).anInt5345) {
			((Class468) this).aClass364_5347.method4604
			    (((Class468) this).anObject5334, -897393914);
			((Class468) this).anObject5334 = null;
			method5729(Class472.aClass472_5407, (byte) 27);
		    }
		} else
		    method5729(Class472.aClass472_5407, (byte) 125);
	    }
	}
	method5726(1239022665);
    }
    
    void method5700(int i) {
	if (null != ((Class468) this).aClass471Array5332) {
	    boolean bool = true;
	    Class369 class369
		= ((Class468) this).anInterface37_5366.method261();
	    if (((Class468) this).anInterface37_5366.method271()) {
		if (((Class468) this).aBool5325
		    && method5682(((Class468) this).anInt5365 * -208343481,
				  -758746306)) {
		    if (null == (((Class468) this).aClass471Array5332
				 [((Class468) this).anInt5349 * 1226818013])) {
			ByteBuffer class528_sub42
			    = method5681((-208343481
					  * ((Class468) this).anInt5365),
					 (byte) 86);
			if (null != class528_sub42) {
			    ((Class468) this).aClass471Array5332
				[1226818013 * ((Class468) this).anInt5349]
				= new Class471(this, class528_sub42, false);
			    int i_41_ = ((Class468) this)
					    .anInterface37_5366.method215();
			    int i_42_
				= (((Class468) this).anInterface37_5366
				       .method160
				   ((((Class471)
				      (((Class468) this).aClass471Array5332
				       [(1226818013
					 * ((Class468) this).anInt5349)]))
				     .aClass528_Sub42_5404.pointer)
				    * -185904669 / i_41_));
			    ((Class468) this).anInt5352 += -1224405593 * i_42_;
			    if (false == ((Class468) this).aBool5367
				&& ((Class468) this).aBool5324
				&& (((Class468) this).anInt5368 * 1869362513
				    > 0)) {
				if (((Class468) this).anInt5352 * 1422576151
				    < ((Class468) this).anInt5357 * -566191889)
				    ((Class468) this).aClass471Array5332
					[(((Class468) this).anInt5349
					  * 1226818013)]
					= null;
				else if (((1422576151
					   * ((Class468) this).anInt5352)
					  >= (((Class468) this).anInt5357
					      * -566191889))
					 && (1422576151 * (((Class468) this)
							   .anInt5352) - i_42_
					     < -566191889 * (((Class468) this)
							     .anInt5357)))
				    ((Class471) (((Class468) this)
						 .aClass471Array5332
						 [(((Class468) this).anInt5349
						   * 1226818013)])).anInt5403
					= ((((Class468) this)
						.anInterface37_5366.method270
					    (((((Class468) this).anInt5352
					       * 1422576151)
					      - (((Class468) this).anInt5357
						 * -566191889)) * i_41_))
					   * 559437379);
			    }
			    ((Class468) this).anInt5365 += 1902009207;
			    if (!((Class468) this).aBool5367
				&& ((Class468) this).aBool5324
				&& (((Class468) this).anInt5352 * 1422576151
				    >= (((Class468) this).anInt5336
					* 1085084835))
				&& ((((Class468) this).anInt5368 * 1869362513
				     < (((Class468) this).anInt5328
					* -1240773999))
				    || (((Class468) this).anInt5328
					* -1240773999) < 0)) {
				int i_43_
				    = (1422576151 * ((Class468) this).anInt5352
				       - (((Class468) this).anInt5336
					  * 1085084835));
				int i_44_ = i_42_ - i_43_;
				((Class471)
				 (((Class468) this).aClass471Array5332
				  [1226818013 * ((Class468) this).anInt5349]))
				    .anInt5402
				    = (((Class468) this).anInterface37_5366
					   .method270(i_41_ * i_44_)
				       * 946270067);
				((Class468) this).anInt5365 = 0;
				((Class468) this).anInt5352 = 0;
				((Class468) this).anInt5368 += 1250964401;
			    }
			    if (null != (((Class468) this).aClass471Array5332
					 [(1226818013
					   * ((Class468) this).anInt5349)])) {
				((Class468) this).anInt5349 += -1211195787;
				((Class468) this).anInt5349
				    = (((Class468) this).anInt5349 * 1226818013
				       % (((Class468) this)
					  .aClass471Array5332).length
				       * -1211195787);
			    }
			}
		    }
		} else if (!method5684(2074122280)
			   || !((Class468) this).aBool5325) {
		    int i_45_
			= ((Class468) this).anInterface37_5366.method73();
		    int i_46_ = (((Class468) this).anInterface37_5366.method160
				 (1195965995 * ((Class468) this).anInt5345));
		    if (false == ((Class468) this).aBool5337
			&& (null
			    == (((Class468) this).aClass471Array5332
				[((Class468) this).anInt5349 * 1226818013]))) {
			if (Class369.aClass369_3866 != class369 && i_45_ > 0) {
			    ByteBuffer class528_sub42
				= method5679(i_46_, (byte) 9);
			    ((Class468) this).aClass471Array5332
				[1226818013 * ((Class468) this).anInt5349]
				= (null != class528_sub42
				   ? new Class471(this, class528_sub42, false)
				   : null);
			    int i_47_
				= ((((Class468) this).aClass471Array5332
				    [(1226818013
				      * ((Class468) this).anInt5349)]) != null
				   ? ((((Class471)
					(((Class468) this).aClass471Array5332
					 [(((Class468) this).anInt5349
					   * 1226818013)]))
				       .aClass528_Sub42_5404.pointer)
				      * -185904669)
				   : 0);
			    int i_48_ = ((Class468) this)
					    .anInterface37_5366.method215();
			    int i_49_ = ((Class468) this)
					    .anInterface37_5366
					    .method160(i_47_ / i_48_);
			    ((Class468) this).anInt5360 += 749508559 * i_49_;
			    if (((Class468) this).anInt5360 * 2040860463
				> ((Class468) this).anInt5352 * 1422576151) {
				((Class468) this).anInt5352
				    += i_49_ * -1224405593;
				i_45_ -= i_49_;
				if (false == ((Class468) this).aBool5367
				    && ((Class468) this).aBool5324
				    && (((Class468) this).anInt5368
					* 1869362513) > 0) {
				    if ((((Class468) this).anInt5352
					 * 1422576151)
					< (-566191889
					   * ((Class468) this).anInt5357))
					((Class468) this)
					    .aClass471Array5332
					    [(1226818013
					      * ((Class468) this).anInt5349)]
					    = null;
				    else if (((((Class468) this).anInt5352
					       * 1422576151)
					      >= (((Class468) this).anInt5357
						  * -566191889))
					     && ((((Class468) this).anInt5352
						  * 1422576151) - i_49_
						 < (((Class468) this).anInt5357
						    * -566191889)))
					((Class471)
					 (((Class468) this).aClass471Array5332
					  [(((Class468) this).anInt5349
					    * 1226818013)])).anInt5403
					    = (((Class468) this)
						   .anInterface37_5366
						   .method270
					       (((((Class468) this).anInt5352
						  * 1422576151)
						 - (((Class468) this).anInt5357
						    * -566191889))
						* i_48_)) * 559437379;
				}
				if (null
				    != (((Class468) this).aClass471Array5332
					[(((Class468) this).anInt5349
					  * 1226818013)])) {
				    if (((Class468) this).aBool5325
					&& !method5682((-208343481
							* (((Class468) this)
							   .anInt5365)),
						       -1613343953))
					method5680((((Class471)
						     (((Class468) this)
						      .aClass471Array5332
						      [(1226818013
							* (((Class468) this)
							   .anInt5349))]))
						    .aClass528_Sub42_5404),
						   (byte) 33);
				    if (false == ((Class468) this).aBool5367
					&& ((Class468) this).aBool5324
					&& ((1422576151
					     * ((Class468) this).anInt5352)
					    >= (((Class468) this).anInt5336
						* 1085084835))
					&& (((1869362513
					      * ((Class468) this).anInt5368)
					     <= -1240773999 * ((Class468)
							       this).anInt5328)
					    || (((Class468) this).anInt5328
						* -1240773999) < 0)) {
					int i_50_
					    = ((((Class468) this).anInt5352
						* 1422576151)
					       - (((Class468) this).anInt5336
						  * 1085084835));
					int i_51_ = i_49_ - i_50_;
					((Class471)
					 (((Class468) this).aClass471Array5332
					  [(1226818013
					    * ((Class468) this).anInt5349)]))
					    .anInt5402
					    = (((Class468) this)
						   .anInterface37_5366
						   .method270(i_51_ * i_48_)
					       * 946270067);
					((Class468) this).anInt5365 = 0;
					((Class468) this).anInt5368
					    += 1250964401;
					((Class468) this).anInt5352 = 0;
				    } else
					((Class468) this).anInt5365
					    += 1902009207;
				    ((Class468) this).anInt5349 += -1211195787;
				    ((Class468) this).anInt5349
					= (1226818013
					   * ((Class468) this).anInt5349
					   % (((Class468) this)
					      .aClass471Array5332).length
					   * -1211195787);
				}
			    } else
				((Class468) this).aClass471Array5332
				    [1226818013 * ((Class468) this).anInt5349]
				    = null;
			} else if (Class369.aClass369_3866 == class369
				   && ((Class468) this).aBool5324
				   && false == ((Class468) this).aBool5367
				   && (((1869362513
					 * ((Class468) this).anInt5368)
					< (-1240773999
					   * ((Class468) this).anInt5328))
				       || (((Class468) this).anInt5328
					   * -1240773999) < 0))
			    ((Class468) this).anInterface37_5366
				.method294(true);
		    }
		}
	    }
	    int i_52_ = 0;
	    for (int i_53_ = 0;
		 i_53_ < ((Class468) this).aClass471Array5332.length;
		 i_53_++) {
		if (null != ((Class468) this).aClass471Array5332[i_53_]) {
		    i_52_++;
		    bool = false;
		}
	    }
	    if (!((Class468) this).aBool5338 && method5651((byte) -121) >= 0.0F
		&& (i_52_ >= ((Class468) this).anInt5322 * -1392597147
		    || Class369.aClass369_3866 == class369
		    || class369 == Class369.aClass369_3865)) {
		((Class468) this).aBool5338 = true;
		method5729(Class472.aClass472_5411, (byte) 38);
	    }
	    if (((Class468) this).anInterface37_5366.method271() && bool
		&& (method5684(1711484317) || ((Class468) this).aBool5337
		    || Class369.aClass369_3866 == class369)
		&& (!((Class468) this).aBool5324
		    || (false == ((Class468) this).aBool5367
			&& (1869362513 * ((Class468) this).anInt5368
			    >= ((Class468) this).anInt5328 * -1240773999)
			&& ((Class468) this).anInt5328 * -1240773999 >= 0))) {
		method5729(Class472.aClass472_5413, (byte) 111);
		((Class468) this).aBool5319 = false;
		if (((Class468) this).aBool5325)
		    method5685(-633964088);
	    }
	}
    }
    
    void method5701() {
	synchronized (this) {
	    method5670(-864131006);
	}
    }
    
    boolean method5702() {
	if (null == ((Class468) this).aFloatArray5323)
	    return false;
	float f = 0.0F;
	float f_54_ = 0.0F;
	for (int i = 0; i < ((Class468) this).aFloatArray5323.length; i++) {
	    float f_55_ = ((Class468) this).aFloatArray5323[i];
	    if (f_55_ * ((Class468) this).aFloat5353 > f)
		f = f_55_;
	    if (f_55_ > f_54_)
		f_54_ = f_55_;
	}
	if (f < 1.0E-5F) {
	    if (f_54_ >= 1.0E-5F && ((Class468) this).aFloat5361 >= 1.0E-5F)
		return true;
	    return false;
	}
	return true;
    }
    
    boolean method5703() {
	if (null == ((Class468) this).aFloatArray5323)
	    return false;
	float f = 0.0F;
	float f_56_ = 0.0F;
	for (int i = 0; i < ((Class468) this).aFloatArray5323.length; i++) {
	    float f_57_ = ((Class468) this).aFloatArray5323[i];
	    if (f_57_ * ((Class468) this).aFloat5353 > f)
		f = f_57_;
	    if (f_57_ > f_56_)
		f_56_ = f_57_;
	}
	if (f < 1.0E-5F) {
	    if (f_56_ >= 1.0E-5F && ((Class468) this).aFloat5361 >= 1.0E-5F)
		return true;
	    return false;
	}
	return true;
    }
    
    public boolean method5704() {
	return ((Class468) this).aBool5344;
    }
    
    boolean method5705() {
	return Class472.aClass472_5412 == ((Class468) this).aClass472_5346;
    }
    
    void method5706() {
	if (method5722(-1369325982) != Class472.aClass472_5412
	    && (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		< (-133908617
		   * ((Class472) Class472.aClass472_5409).anInt5406))) {
	    method5729(Class472.aClass472_5409, (byte) 44);
	    ((Class468) this).aBool5319 = true;
	    method5671(-46349192);
	    method5662(886737091);
	}
    }
    
    void method5707() {
	synchronized (this) {
	    if (((Class468) this).anObject5350 != null
		&& ((Class468) this).anObject5350 instanceof Class469) {
		Class469 class469 = (Class469) ((Class468) this).anObject5350;
		Interface67 interface67 = class469.method5752(-2123629886);
		if (null != interface67)
		    interface67.method421(true, -1319385571);
	    }
	}
    }
    
    Object method5708(int i) {
	return ((Class468) this).anObject5350;
    }
    
    void method5709() {
	if (((Class472) method5722(-1369325982)).anInt5406 * -133908617
	    >= ((Class472) Class472.aClass472_5409).anInt5406 * -133908617) {
	    if (method5722(-1369325982) == Class472.aClass472_5414)
		method5669(-1528254796);
	    else {
		method5668((byte) 52);
		if (((Class468) this).aFloat5361
		    != ((Class468) this).aFloat5353) {
		    long l = Class249.method3417(1973831381);
		    if (l
			> ((Class468) this).aLong5321 * -7043113260683665203L)
			((Class468) this).aFloat5353
			    = ((Class468) this).aFloat5361;
		    else {
			float f = (((Class468) this).aFloat5361
				   - ((Class468) this).aFloat5362);
			long l_58_ = ((((Class468) this).aLong5321
				       * -7043113260683665203L)
				      - (691128228639056459L
					 * ((Class468) this).aLong5363));
			float f_59_ = f / (float) l_58_;
			((Class468) this).aFloat5353
			    = (((Class468) this).aFloat5362
			       + ((float) (l - (((Class468) this).aLong5363
						* 691128228639056459L))
				  * f_59_));
			((Class468) this).aFloat5353
			    = Math.max(0.0F,
				       Math.min(1.0F,
						((Class468) this).aFloat5353));
		    }
		}
		method5662(886737091);
		if (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		    < (((Class472) Class472.aClass472_5412).anInt5406
		       * -133908617))
		    method5671(-249428843);
	    }
	}
    }
    
    void method5710() {
	((Class468) this).aBool5369 = false;
    }
    
    void method5711() {
	synchronized (this) {
	    int i = method5712(-1057779556);
	    if (((Class468) this).aBool5325
		&& i > -208343481 * ((Class468) this).anInt5365
		&& ((Class468) this).anInterface37_5366.method271()) {
		/* empty */
	    } else {
		Class369 class369
		    = ((Class468) this).anInterface37_5366.method261();
		if (((Class468) this).aBool5348
		    && class369 != Class369.aClass369_3865) {
		    if (null != ((Class468) this).aByteArray5329) {
			if (1860803713 * ((Class468) this).anInt5355
			    >= 2132365267 * ((Class468) this).anInt5339) {
			    ((Class468) this).anInterface37_5366
				.method51(null);
			    ((Class468) this).anInt5355 = 0;
			} else {
			    if (1564762317 * ((Class468) this).anInt5330
				< ((Class468) this).anInt5343 * -1673659837)
				((Class468) this).anInt5330
				    = -109541553 * ((Class468) this).anInt5343;
			    ((Class468) this).anInt5330
				= (((Class468) this).anInt5358 * -930660819
				   + (((Class468) this).anIntArray5340
				      [(((Class468) this).anInt5355
					* 1860803713)])) * -1549628411;
			    int i_60_
				= (((Class468) this).anIntArray5341
				   [1860803713 * ((Class468) this).anInt5355]);
			    int i_61_ = i_60_;
			    int i_62_
				= ((-930660819 * ((Class468) this).anInt5358
				    + i_61_) > i_60_
				   ? i_60_ + (((Class468) this).anIntArray5340
					      [1860803713 * (((Class468) this)
							     .anInt5355)])
				   : (((Class468) this).anInt5330 * 1564762317
				      + i_61_));
			    Class468 class468_63_ = this;
			    ((Class468) class468_63_).anInt5358
				= (((Class468) class468_63_).anInt5358
				   + (((((Class468) this).anInt5330
					* 1564762317) + i_61_
				       > (((Class468) this)
					  .aByteArray5329).length)
				      ? ((((Class468) this)
					  .aByteArray5329).length
					 - (((Class468) this).anInt5330
					    * 1564762317))
				      : i_61_) * -2065055323);
			    ByteBuffer class528_sub42
				= new ByteBuffer(i_62_ - (((Class468)
							       this).anInt5330
							      * 1564762317),
						     true);
			    if (((Class468) this).aByteArray5329 == null)
				throw new RuntimeException("");
			    if (class528_sub42.payload == null)
				throw new RuntimeException("");
			    class528_sub42.method9618
				(((Class468) this).aByteArray5329,
				 ((Class468) this).anInt5330 * 1564762317,
				 (i_62_
				  - 1564762317 * ((Class468) this).anInt5330),
				 -1751123007);
			    ((Class468) this).anInterface37_5366
				.method51(class528_sub42);
			    method5676(false, 1835803215);
			    if (-930660819 * ((Class468) this).anInt5358
				>= i_60_) {
				((Class468) this).anInt5355 += 1419944833;
				((Class468) this).anInt5358 = 0;
			    }
			}
		    } else if (null != ((Class468) this).anInterface56_5327) {
			if (-760025735 * ((Class468) this).anInt5331
			    >= ((Class468) this).anInt5339 * 2132365267) {
			    ((Class468) this).anInt5331 = 0;
			    ((Class468) this).anInterface37_5366
				.method51(null);
			} else {
			    byte[] is = (((Class468) this)
					     .anInterface56_5327.method352
					 ((((Class468) this).anIntArray5342
					   [(-760025735
					     * ((Class468) this).anInt5331)]),
					  -2107509467));
			    if (null != is) {
				ByteBuffer class528_sub42
				    = new ByteBuffer(is);
				class528_sub42.pointer
				    = is.length * 2015001547;
				((Class468) this).anInterface37_5366
				    .method51(class528_sub42);
				method5676(false, 1835803215);
				((Class468) this).anInt5331 += -1520898871;
			    }
			}
		    }
		}
	    }
	}
    }
    
    int method5712(int i) {
	if (null != ((Class468) this).anObject5350
	    && ((Class468) this).anObject5350 instanceof Class469) {
	    Class469 class469 = (Class469) ((Class468) this).anObject5350;
	    Interface67 interface67 = class469.method5752(-1910320909);
	    return interface67.method420(1469916777);
	}
	return 0;
    }
    
    void method5713() {
	synchronized (this) {
	    if (((Class468) this).anInterface37_5366.method261()
		== Class369.aClass369_3864) {
		if (null != ((Class468) this).anObject5334) {
		    int i = (((Class468) this).aClass364_5347.method4613
			     (((Class468) this).anObject5334, -1264997347));
		    if (i >= 1195965995 * ((Class468) this).anInt5345) {
			((Class468) this).aClass364_5347.method4604
			    (((Class468) this).anObject5334, -897393914);
			((Class468) this).anObject5334 = null;
			method5729(Class472.aClass472_5407, (byte) 60);
		    }
		} else
		    method5729(Class472.aClass472_5407, (byte) 76);
	    }
	}
	method5726(1239022665);
    }
    
    void method5714() {
	if (((Class468) this).aBool5319 == true
	    && (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		>= -133908617 * ((Class472) Class472.aClass472_5409).anInt5406)
	    && (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		< ((Class472) Class472.aClass472_5413).anInt5406 * -133908617)
	    && null != ((Class468) this).anInterface55_5364
	    && ((Class468) this).aFloat5353 == ((Class468) this).aFloat5361)
	    ((Class468) this).anInterface55_5364.method351((((Class468) this)
							    .anObject5350),
							   (((Class468) this)
							    .aFloatArray5323),
							   null, 2128497271);
    }
    
    void method5715() {
	if (((Class468) this).aBool5319 == true
	    && (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		>= -133908617 * ((Class472) Class472.aClass472_5409).anInt5406)
	    && (((Class472) method5722(-1369325982)).anInt5406 * -133908617
		< ((Class472) Class472.aClass472_5413).anInt5406 * -133908617)
	    && null != ((Class468) this).anInterface55_5364
	    && ((Class468) this).aFloat5353 == ((Class468) this).aFloat5361)
	    ((Class468) this).anInterface55_5364.method351((((Class468) this)
							    .anObject5350),
							   (((Class468) this)
							    .aFloatArray5323),
							   null, 1375909770);
    }
    
    void method5716() {
	((Class468) this).aBool5369 = true;
    }
    
    void method5717() {
	((Class468) this).aBool5369 = true;
    }
    
    void method5718() {
	synchronized (this) {
	    int i = method5712(1404534994);
	    if (((Class468) this).aBool5325
		&& i > -208343481 * ((Class468) this).anInt5365
		&& ((Class468) this).anInterface37_5366.method271()) {
		/* empty */
	    } else {
		Class369 class369
		    = ((Class468) this).anInterface37_5366.method261();
		if (((Class468) this).aBool5348
		    && class369 != Class369.aClass369_3865) {
		    if (null != ((Class468) this).aByteArray5329) {
			if (1860803713 * ((Class468) this).anInt5355
			    >= 2132365267 * ((Class468) this).anInt5339) {
			    ((Class468) this).anInterface37_5366
				.method51(null);
			    ((Class468) this).anInt5355 = 0;
			} else {
			    if (1564762317 * ((Class468) this).anInt5330
				< ((Class468) this).anInt5343 * -1673659837)
				((Class468) this).anInt5330
				    = -109541553 * ((Class468) this).anInt5343;
			    ((Class468) this).anInt5330
				= (((Class468) this).anInt5358 * -930660819
				   + (((Class468) this).anIntArray5340
				      [(((Class468) this).anInt5355
					* 1860803713)])) * -1549628411;
			    int i_64_
				= (((Class468) this).anIntArray5341
				   [1860803713 * ((Class468) this).anInt5355]);
			    int i_65_ = i_64_;
			    int i_66_
				= ((-930660819 * ((Class468) this).anInt5358
				    + i_65_) > i_64_
				   ? i_64_ + (((Class468) this).anIntArray5340
					      [1860803713 * (((Class468) this)
							     .anInt5355)])
				   : (((Class468) this).anInt5330 * 1564762317
				      + i_65_));
			    Class468 class468_67_ = this;
			    ((Class468) class468_67_).anInt5358
				= (((Class468) class468_67_).anInt5358
				   + (((((Class468) this).anInt5330
					* 1564762317) + i_65_
				       > (((Class468) this)
					  .aByteArray5329).length)
				      ? ((((Class468) this)
					  .aByteArray5329).length
					 - (((Class468) this).anInt5330
					    * 1564762317))
				      : i_65_) * -2065055323);
			    ByteBuffer class528_sub42
				= new ByteBuffer(i_66_ - (((Class468)
							       this).anInt5330
							      * 1564762317),
						     true);
			    if (((Class468) this).aByteArray5329 == null)
				throw new RuntimeException("");
			    if (class528_sub42.payload == null)
				throw new RuntimeException("");
			    class528_sub42.method9618
				(((Class468) this).aByteArray5329,
				 ((Class468) this).anInt5330 * 1564762317,
				 (i_66_
				  - 1564762317 * ((Class468) this).anInt5330),
				 1237930848);
			    ((Class468) this).anInterface37_5366
				.method51(class528_sub42);
			    method5676(false, 1835803215);
			    if (-930660819 * ((Class468) this).anInt5358
				>= i_64_) {
				((Class468) this).anInt5355 += 1419944833;
				((Class468) this).anInt5358 = 0;
			    }
			}
		    } else if (null != ((Class468) this).anInterface56_5327) {
			if (-760025735 * ((Class468) this).anInt5331
			    >= ((Class468) this).anInt5339 * 2132365267) {
			    ((Class468) this).anInt5331 = 0;
			    ((Class468) this).anInterface37_5366
				.method51(null);
			} else {
			    byte[] is = (((Class468) this)
					     .anInterface56_5327.method352
					 ((((Class468) this).anIntArray5342
					   [(-760025735
					     * ((Class468) this).anInt5331)]),
					  -1953266350));
			    if (null != is) {
				ByteBuffer class528_sub42
				    = new ByteBuffer(is);
				class528_sub42.pointer
				    = is.length * 2015001547;
				((Class468) this).anInterface37_5366
				    .method51(class528_sub42);
				method5676(false, 1835803215);
				((Class468) this).anInt5331 += -1520898871;
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method5719() {
	((Class468) this).aBool5369 = false;
    }
    
    void method5720() {
	if (null != ((Class468) this).aClass471Array5332) {
	    boolean bool = true;
	    Class369 class369
		= ((Class468) this).anInterface37_5366.method261();
	    if (((Class468) this).anInterface37_5366.method271()) {
		if (((Class468) this).aBool5325
		    && method5682(((Class468) this).anInt5365 * -208343481,
				  -1647008361)) {
		    if (null == (((Class468) this).aClass471Array5332
				 [((Class468) this).anInt5349 * 1226818013])) {
			ByteBuffer class528_sub42
			    = method5681((-208343481
					  * ((Class468) this).anInt5365),
					 (byte) 37);
			if (null != class528_sub42) {
			    ((Class468) this).aClass471Array5332
				[1226818013 * ((Class468) this).anInt5349]
				= new Class471(this, class528_sub42, false);
			    int i = ((Class468) this).anInterface37_5366
					.method215();
			    int i_68_
				= (((Class468) this).anInterface37_5366
				       .method160
				   ((((Class471)
				      (((Class468) this).aClass471Array5332
				       [(1226818013
					 * ((Class468) this).anInt5349)]))
				     .aClass528_Sub42_5404.pointer)
				    * -185904669 / i));
			    ((Class468) this).anInt5352 += -1224405593 * i_68_;
			    if (false == ((Class468) this).aBool5367
				&& ((Class468) this).aBool5324
				&& (((Class468) this).anInt5368 * 1869362513
				    > 0)) {
				if (((Class468) this).anInt5352 * 1422576151
				    < ((Class468) this).anInt5357 * -566191889)
				    ((Class468) this).aClass471Array5332
					[(((Class468) this).anInt5349
					  * 1226818013)]
					= null;
				else if (((1422576151
					   * ((Class468) this).anInt5352)
					  >= (((Class468) this).anInt5357
					      * -566191889))
					 && (1422576151 * (((Class468) this)
							   .anInt5352) - i_68_
					     < -566191889 * (((Class468) this)
							     .anInt5357)))
				    ((Class471) (((Class468) this)
						 .aClass471Array5332
						 [(((Class468) this).anInt5349
						   * 1226818013)])).anInt5403
					= ((((Class468) this)
						.anInterface37_5366.method270
					    (((((Class468) this).anInt5352
					       * 1422576151)
					      - (((Class468) this).anInt5357
						 * -566191889)) * i))
					   * 559437379);
			    }
			    ((Class468) this).anInt5365 += 1902009207;
			    if (!((Class468) this).aBool5367
				&& ((Class468) this).aBool5324
				&& (((Class468) this).anInt5352 * 1422576151
				    >= (((Class468) this).anInt5336
					* 1085084835))
				&& ((((Class468) this).anInt5368 * 1869362513
				     < (((Class468) this).anInt5328
					* -1240773999))
				    || (((Class468) this).anInt5328
					* -1240773999) < 0)) {
				int i_69_
				    = (1422576151 * ((Class468) this).anInt5352
				       - (((Class468) this).anInt5336
					  * 1085084835));
				int i_70_ = i_68_ - i_69_;
				((Class471)
				 (((Class468) this).aClass471Array5332
				  [1226818013 * ((Class468) this).anInt5349]))
				    .anInt5402
				    = ((Class468) this).anInterface37_5366
					  .method270(i * i_70_) * 946270067;
				((Class468) this).anInt5365 = 0;
				((Class468) this).anInt5352 = 0;
				((Class468) this).anInt5368 += 1250964401;
			    }
			    if (null != (((Class468) this).aClass471Array5332
					 [(1226818013
					   * ((Class468) this).anInt5349)])) {
				((Class468) this).anInt5349 += -1211195787;
				((Class468) this).anInt5349
				    = (((Class468) this).anInt5349 * 1226818013
				       % (((Class468) this)
					  .aClass471Array5332).length
				       * -1211195787);
			    }
			}
		    }
		} else if (!method5684(315543937)
			   || !((Class468) this).aBool5325) {
		    int i = ((Class468) this).anInterface37_5366.method73();
		    int i_71_ = (((Class468) this).anInterface37_5366.method160
				 (1195965995 * ((Class468) this).anInt5345));
		    if (false == ((Class468) this).aBool5337
			&& (null
			    == (((Class468) this).aClass471Array5332
				[((Class468) this).anInt5349 * 1226818013]))) {
			if (Class369.aClass369_3866 != class369 && i > 0) {
			    ByteBuffer class528_sub42
				= method5679(i_71_, (byte) 9);
			    ((Class468) this).aClass471Array5332
				[1226818013 * ((Class468) this).anInt5349]
				= (null != class528_sub42
				   ? new Class471(this, class528_sub42, false)
				   : null);
			    int i_72_
				= ((((Class468) this).aClass471Array5332
				    [(1226818013
				      * ((Class468) this).anInt5349)]) != null
				   ? ((((Class471)
					(((Class468) this).aClass471Array5332
					 [(((Class468) this).anInt5349
					   * 1226818013)]))
				       .aClass528_Sub42_5404.pointer)
				      * -185904669)
				   : 0);
			    int i_73_ = ((Class468) this)
					    .anInterface37_5366.method215();
			    int i_74_ = ((Class468) this)
					    .anInterface37_5366
					    .method160(i_72_ / i_73_);
			    ((Class468) this).anInt5360 += 749508559 * i_74_;
			    if (((Class468) this).anInt5360 * 2040860463
				> ((Class468) this).anInt5352 * 1422576151) {
				((Class468) this).anInt5352
				    += i_74_ * -1224405593;
				i -= i_74_;
				if (false == ((Class468) this).aBool5367
				    && ((Class468) this).aBool5324
				    && (((Class468) this).anInt5368
					* 1869362513) > 0) {
				    if ((((Class468) this).anInt5352
					 * 1422576151)
					< (-566191889
					   * ((Class468) this).anInt5357))
					((Class468) this)
					    .aClass471Array5332
					    [(1226818013
					      * ((Class468) this).anInt5349)]
					    = null;
				    else if (((((Class468) this).anInt5352
					       * 1422576151)
					      >= (((Class468) this).anInt5357
						  * -566191889))
					     && ((((Class468) this).anInt5352
						  * 1422576151) - i_74_
						 < (((Class468) this).anInt5357
						    * -566191889)))
					((Class471)
					 (((Class468) this).aClass471Array5332
					  [(((Class468) this).anInt5349
					    * 1226818013)])).anInt5403
					    = (((Class468) this)
						   .anInterface37_5366
						   .method270
					       (((((Class468) this).anInt5352
						  * 1422576151)
						 - (((Class468) this).anInt5357
						    * -566191889))
						* i_73_)) * 559437379;
				}
				if (null
				    != (((Class468) this).aClass471Array5332
					[(((Class468) this).anInt5349
					  * 1226818013)])) {
				    if (((Class468) this).aBool5325
					&& !method5682((-208343481
							* (((Class468) this)
							   .anInt5365)),
						       2064951921))
					method5680((((Class471)
						     (((Class468) this)
						      .aClass471Array5332
						      [(1226818013
							* (((Class468) this)
							   .anInt5349))]))
						    .aClass528_Sub42_5404),
						   (byte) 33);
				    if (false == ((Class468) this).aBool5367
					&& ((Class468) this).aBool5324
					&& ((1422576151
					     * ((Class468) this).anInt5352)
					    >= (((Class468) this).anInt5336
						* 1085084835))
					&& (((1869362513
					      * ((Class468) this).anInt5368)
					     <= -1240773999 * ((Class468)
							       this).anInt5328)
					    || (((Class468) this).anInt5328
						* -1240773999) < 0)) {
					int i_75_
					    = ((((Class468) this).anInt5352
						* 1422576151)
					       - (((Class468) this).anInt5336
						  * 1085084835));
					int i_76_ = i_74_ - i_75_;
					((Class471)
					 (((Class468) this).aClass471Array5332
					  [(1226818013
					    * ((Class468) this).anInt5349)]))
					    .anInt5402
					    = (((Class468) this)
						   .anInterface37_5366
						   .method270(i_76_ * i_73_)
					       * 946270067);
					((Class468) this).anInt5365 = 0;
					((Class468) this).anInt5368
					    += 1250964401;
					((Class468) this).anInt5352 = 0;
				    } else
					((Class468) this).anInt5365
					    += 1902009207;
				    ((Class468) this).anInt5349 += -1211195787;
				    ((Class468) this).anInt5349
					= (1226818013
					   * ((Class468) this).anInt5349
					   % (((Class468) this)
					      .aClass471Array5332).length
					   * -1211195787);
				}
			    } else
				((Class468) this).aClass471Array5332
				    [1226818013 * ((Class468) this).anInt5349]
				    = null;
			} else if (Class369.aClass369_3866 == class369
				   && ((Class468) this).aBool5324
				   && false == ((Class468) this).aBool5367
				   && (((1869362513
					 * ((Class468) this).anInt5368)
					< (-1240773999
					   * ((Class468) this).anInt5328))
				       || (((Class468) this).anInt5328
					   * -1240773999) < 0))
			    ((Class468) this).anInterface37_5366
				.method294(true);
		    }
		}
	    }
	    int i = 0;
	    for (int i_77_ = 0;
		 i_77_ < ((Class468) this).aClass471Array5332.length;
		 i_77_++) {
		if (null != ((Class468) this).aClass471Array5332[i_77_]) {
		    i++;
		    bool = false;
		}
	    }
	    if (!((Class468) this).aBool5338 && method5651((byte) -14) >= 0.0F
		&& (i >= ((Class468) this).anInt5322 * -1392597147
		    || Class369.aClass369_3866 == class369
		    || class369 == Class369.aClass369_3865)) {
		((Class468) this).aBool5338 = true;
		method5729(Class472.aClass472_5411, (byte) 35);
	    }
	    if (((Class468) this).anInterface37_5366.method271() && bool
		&& (method5684(660639741) || ((Class468) this).aBool5337
		    || Class369.aClass369_3866 == class369)
		&& (!((Class468) this).aBool5324
		    || (false == ((Class468) this).aBool5367
			&& (1869362513 * ((Class468) this).anInt5368
			    >= ((Class468) this).anInt5328 * -1240773999)
			&& ((Class468) this).anInt5328 * -1240773999 >= 0))) {
		method5729(Class472.aClass472_5413, (byte) 77);
		((Class468) this).aBool5319 = false;
		if (((Class468) this).aBool5325)
		    method5685(-1171820787);
	    }
	}
    }
    
    public void method5721() {
	synchronized (this) {
	    if (((Class468) this).aBool5369) {
		/* empty */
	    } else if (null == ((Class468) this).anObject5334) {
		/* empty */
	    } else {
		int i = (((Class468) this).aClass364_5347.method4613
			 (((Class468) this).anObject5334, -1264997347));
		if (i <= 0) {
		    /* empty */
		} else if (((Class468) this).aClass471Array5332 != null
			   && ((((Class468) this).aClass471Array5332
				[((Class468) this).anInt5333 * 1406114527])
			       != null)
			   && ((Class468) this).aBool5338) {
		    int i_78_
			= ((1630842675 * ((Class468) this).anInt5351 + i
			    > (((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .aClass528_Sub42_5404.pointer) * -185904669)
			   ? ((((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .aClass528_Sub42_5404.pointer) * -185904669
			      - 1630842675 * ((Class468) this).anInt5351)
			   : i);
		    if ((1630842675 * ((Class468) this).anInt5351
			 < (((Class471) (((Class468) this).aClass471Array5332
					 [(((Class468) this).anInt5333
					   * 1406114527)])).anInt5403
			    * 306325099))
			&& (i_78_ + ((Class468) this).anInt5351 * 1630842675
			    > (306325099
			       * (((Class471) (((Class468) this)
					       .aClass471Array5332
					       [1406114527 * (((Class468) this)
							      .anInt5333)]))
				  .anInt5403)))
			&& (((Class471)
			     (((Class468) this).aClass471Array5332
			      [1406114527 * ((Class468) this).anInt5333]))
			    .anInt5403) * 306325099 >= 0) {
			((Class468) this).anInt5351
			    += ((18516969
				 * ((Class471) (((Class468) this)
						.aClass471Array5332
						[(((Class468) this).anInt5333
						  * 1406114527)])).anInt5403)
				- ((Class468) this).anInt5351 * 1);
			i_78_ = ((((Class468) this).anInt5351 * 1630842675 + i
				  > (((Class471) (((Class468) this)
						  .aClass471Array5332
						  [(((Class468) this).anInt5333
						    * 1406114527)]))
				     .aClass528_Sub42_5404
				     .pointer) * -185904669)
				 ? ((-185904669
				     * (((Class471)
					 (((Class468) this).aClass471Array5332
					  [(((Class468) this).anInt5333
					    * 1406114527)]))
					.aClass528_Sub42_5404.pointer))
				    - ((Class468) this).anInt5351 * 1630842675)
				 : i);
		    }
		    if ((((Class468) this).anInt5351 * 1630842675 + i_78_
			 > (1085328827
			    * (((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .anInt5402)))
			&& (((Class471)
			     (((Class468) this).aClass471Array5332
			      [1406114527 * ((Class468) this).anInt5333]))
			    .anInt5402) * 1085328827 >= 0)
			i_78_ = ((1085328827
				  * ((Class471) (((Class468) this)
						 .aClass471Array5332
						 [(((Class468) this).anInt5333
						   * 1406114527)])).anInt5402)
				 - ((Class468) this).anInt5351 * 1630842675);
		    method5678((((Class471)
				 (((Class468) this).aClass471Array5332
				  [1406114527 * ((Class468) this).anInt5333]))
				.aClass528_Sub42_5404.payload),
			       1630842675 * ((Class468) this).anInt5351,
			       (1630842675 * ((Class468) this).anInt5351
				+ i_78_),
			       (byte) -69);
		    ((Class468) this).aClass364_5347.method4626
			(((Class468) this).anObject5334,
			 (((Class471)
			   (((Class468) this).aClass471Array5332
			    [((Class468) this).anInt5333 * 1406114527]))
			  .aClass528_Sub42_5404.payload),
			 ((Class468) this).anInt5351 * 1630842675, i_78_,
			 (byte) 11);
		    ((Class468) this).anInt5351 += 1443554299 * i_78_;
		    i -= i_78_;
		    if ((1630842675 * ((Class468) this).anInt5351
			 >= (((Class471)
			      (((Class468) this).aClass471Array5332
			       [1406114527 * ((Class468) this).anInt5333]))
			     .aClass528_Sub42_5404.pointer) * -185904669)
			|| ((1630842675 * ((Class468) this).anInt5351
			     >= (((Class471)
				  (((Class468) this).aClass471Array5332
				   [1406114527 * ((Class468) this).anInt5333]))
				 .anInt5402) * 1085328827)
			    && 1085328827 * (((Class471)
					      (((Class468) this)
					       .aClass471Array5332
					       [1406114527 * (((Class468) this)
							      .anInt5333)]))
					     .anInt5402) >= 0)) {
			((Class468) this).aClass471Array5332
			    [1406114527 * ((Class468) this).anInt5333]
			    .method5809((byte) -122);
			((Class468) this).aClass471Array5332
			    [1406114527 * ((Class468) this).anInt5333]
			    = null;
			((Class468) this).anInt5333 += 457875743;
			((Class468) this).anInt5333
			    = (((Class468) this).anInt5333 * 1406114527
			       % ((Class468) this).aClass471Array5332.length
			       * 457875743);
			((Class468) this).anInt5351 = 0;
		    }
		}
	    }
	}
    }
    
    public Class472 method5722(int i) {
	return ((Class468) this).aClass472_5346;
    }
    
    public void method5723() {
	synchronized (this) {
	    if (((Class468) this).aBool5369) {
		/* empty */
	    } else if (null == ((Class468) this).anObject5334) {
		/* empty */
	    } else {
		int i = (((Class468) this).aClass364_5347.method4613
			 (((Class468) this).anObject5334, -1264997347));
		if (i <= 0) {
		    /* empty */
		} else if (((Class468) this).aClass471Array5332 != null
			   && ((((Class468) this).aClass471Array5332
				[((Class468) this).anInt5333 * 1406114527])
			       != null)
			   && ((Class468) this).aBool5338) {
		    int i_79_
			= ((1630842675 * ((Class468) this).anInt5351 + i
			    > (((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .aClass528_Sub42_5404.pointer) * -185904669)
			   ? ((((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .aClass528_Sub42_5404.pointer) * -185904669
			      - 1630842675 * ((Class468) this).anInt5351)
			   : i);
		    if ((1630842675 * ((Class468) this).anInt5351
			 < (((Class471) (((Class468) this).aClass471Array5332
					 [(((Class468) this).anInt5333
					   * 1406114527)])).anInt5403
			    * 306325099))
			&& (i_79_ + ((Class468) this).anInt5351 * 1630842675
			    > (306325099
			       * (((Class471) (((Class468) this)
					       .aClass471Array5332
					       [1406114527 * (((Class468) this)
							      .anInt5333)]))
				  .anInt5403)))
			&& (((Class471)
			     (((Class468) this).aClass471Array5332
			      [1406114527 * ((Class468) this).anInt5333]))
			    .anInt5403) * 306325099 >= 0) {
			((Class468) this).anInt5351
			    += ((18516969
				 * ((Class471) (((Class468) this)
						.aClass471Array5332
						[(((Class468) this).anInt5333
						  * 1406114527)])).anInt5403)
				- ((Class468) this).anInt5351 * 1);
			i_79_ = ((((Class468) this).anInt5351 * 1630842675 + i
				  > (((Class471) (((Class468) this)
						  .aClass471Array5332
						  [(((Class468) this).anInt5333
						    * 1406114527)]))
				     .aClass528_Sub42_5404
				     .pointer) * -185904669)
				 ? ((-185904669
				     * (((Class471)
					 (((Class468) this).aClass471Array5332
					  [(((Class468) this).anInt5333
					    * 1406114527)]))
					.aClass528_Sub42_5404.pointer))
				    - ((Class468) this).anInt5351 * 1630842675)
				 : i);
		    }
		    if ((((Class468) this).anInt5351 * 1630842675 + i_79_
			 > (1085328827
			    * (((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .anInt5402)))
			&& (((Class471)
			     (((Class468) this).aClass471Array5332
			      [1406114527 * ((Class468) this).anInt5333]))
			    .anInt5402) * 1085328827 >= 0)
			i_79_ = ((1085328827
				  * ((Class471) (((Class468) this)
						 .aClass471Array5332
						 [(((Class468) this).anInt5333
						   * 1406114527)])).anInt5402)
				 - ((Class468) this).anInt5351 * 1630842675);
		    method5678((((Class471)
				 (((Class468) this).aClass471Array5332
				  [1406114527 * ((Class468) this).anInt5333]))
				.aClass528_Sub42_5404.payload),
			       1630842675 * ((Class468) this).anInt5351,
			       (1630842675 * ((Class468) this).anInt5351
				+ i_79_),
			       (byte) -76);
		    ((Class468) this).aClass364_5347.method4626
			(((Class468) this).anObject5334,
			 (((Class471)
			   (((Class468) this).aClass471Array5332
			    [((Class468) this).anInt5333 * 1406114527]))
			  .aClass528_Sub42_5404.payload),
			 ((Class468) this).anInt5351 * 1630842675, i_79_,
			 (byte) 11);
		    ((Class468) this).anInt5351 += 1443554299 * i_79_;
		    i -= i_79_;
		    if ((1630842675 * ((Class468) this).anInt5351
			 >= (((Class471)
			      (((Class468) this).aClass471Array5332
			       [1406114527 * ((Class468) this).anInt5333]))
			     .aClass528_Sub42_5404.pointer) * -185904669)
			|| ((1630842675 * ((Class468) this).anInt5351
			     >= (((Class471)
				  (((Class468) this).aClass471Array5332
				   [1406114527 * ((Class468) this).anInt5333]))
				 .anInt5402) * 1085328827)
			    && 1085328827 * (((Class471)
					      (((Class468) this)
					       .aClass471Array5332
					       [1406114527 * (((Class468) this)
							      .anInt5333)]))
					     .anInt5402) >= 0)) {
			((Class468) this).aClass471Array5332
			    [1406114527 * ((Class468) this).anInt5333]
			    .method5809((byte) 66);
			((Class468) this).aClass471Array5332
			    [1406114527 * ((Class468) this).anInt5333]
			    = null;
			((Class468) this).anInt5333 += 457875743;
			((Class468) this).anInt5333
			    = (((Class468) this).anInt5333 * 1406114527
			       % ((Class468) this).aClass471Array5332.length
			       * 457875743);
			((Class468) this).anInt5351 = 0;
		    }
		}
	    }
	}
    }
    
    void method5724() {
	if (null != ((Class468) this).aClass471Array5332) {
	    boolean bool = true;
	    Class369 class369
		= ((Class468) this).anInterface37_5366.method261();
	    if (((Class468) this).anInterface37_5366.method271()) {
		if (((Class468) this).aBool5325
		    && method5682(((Class468) this).anInt5365 * -208343481,
				  -1751831515)) {
		    if (null == (((Class468) this).aClass471Array5332
				 [((Class468) this).anInt5349 * 1226818013])) {
			ByteBuffer class528_sub42
			    = method5681((-208343481
					  * ((Class468) this).anInt5365),
					 (byte) 96);
			if (null != class528_sub42) {
			    ((Class468) this).aClass471Array5332
				[1226818013 * ((Class468) this).anInt5349]
				= new Class471(this, class528_sub42, false);
			    int i = ((Class468) this).anInterface37_5366
					.method215();
			    int i_80_
				= (((Class468) this).anInterface37_5366
				       .method160
				   ((((Class471)
				      (((Class468) this).aClass471Array5332
				       [(1226818013
					 * ((Class468) this).anInt5349)]))
				     .aClass528_Sub42_5404.pointer)
				    * -185904669 / i));
			    ((Class468) this).anInt5352 += -1224405593 * i_80_;
			    if (false == ((Class468) this).aBool5367
				&& ((Class468) this).aBool5324
				&& (((Class468) this).anInt5368 * 1869362513
				    > 0)) {
				if (((Class468) this).anInt5352 * 1422576151
				    < ((Class468) this).anInt5357 * -566191889)
				    ((Class468) this).aClass471Array5332
					[(((Class468) this).anInt5349
					  * 1226818013)]
					= null;
				else if (((1422576151
					   * ((Class468) this).anInt5352)
					  >= (((Class468) this).anInt5357
					      * -566191889))
					 && (1422576151 * (((Class468) this)
							   .anInt5352) - i_80_
					     < -566191889 * (((Class468) this)
							     .anInt5357)))
				    ((Class471) (((Class468) this)
						 .aClass471Array5332
						 [(((Class468) this).anInt5349
						   * 1226818013)])).anInt5403
					= ((((Class468) this)
						.anInterface37_5366.method270
					    (((((Class468) this).anInt5352
					       * 1422576151)
					      - (((Class468) this).anInt5357
						 * -566191889)) * i))
					   * 559437379);
			    }
			    ((Class468) this).anInt5365 += 1902009207;
			    if (!((Class468) this).aBool5367
				&& ((Class468) this).aBool5324
				&& (((Class468) this).anInt5352 * 1422576151
				    >= (((Class468) this).anInt5336
					* 1085084835))
				&& ((((Class468) this).anInt5368 * 1869362513
				     < (((Class468) this).anInt5328
					* -1240773999))
				    || (((Class468) this).anInt5328
					* -1240773999) < 0)) {
				int i_81_
				    = (1422576151 * ((Class468) this).anInt5352
				       - (((Class468) this).anInt5336
					  * 1085084835));
				int i_82_ = i_80_ - i_81_;
				((Class471)
				 (((Class468) this).aClass471Array5332
				  [1226818013 * ((Class468) this).anInt5349]))
				    .anInt5402
				    = ((Class468) this).anInterface37_5366
					  .method270(i * i_82_) * 946270067;
				((Class468) this).anInt5365 = 0;
				((Class468) this).anInt5352 = 0;
				((Class468) this).anInt5368 += 1250964401;
			    }
			    if (null != (((Class468) this).aClass471Array5332
					 [(1226818013
					   * ((Class468) this).anInt5349)])) {
				((Class468) this).anInt5349 += -1211195787;
				((Class468) this).anInt5349
				    = (((Class468) this).anInt5349 * 1226818013
				       % (((Class468) this)
					  .aClass471Array5332).length
				       * -1211195787);
			    }
			}
		    }
		} else if (!method5684(-632045160)
			   || !((Class468) this).aBool5325) {
		    int i = ((Class468) this).anInterface37_5366.method73();
		    int i_83_ = (((Class468) this).anInterface37_5366.method160
				 (1195965995 * ((Class468) this).anInt5345));
		    if (false == ((Class468) this).aBool5337
			&& (null
			    == (((Class468) this).aClass471Array5332
				[((Class468) this).anInt5349 * 1226818013]))) {
			if (Class369.aClass369_3866 != class369 && i > 0) {
			    ByteBuffer class528_sub42
				= method5679(i_83_, (byte) 9);
			    ((Class468) this).aClass471Array5332
				[1226818013 * ((Class468) this).anInt5349]
				= (null != class528_sub42
				   ? new Class471(this, class528_sub42, false)
				   : null);
			    int i_84_
				= ((((Class468) this).aClass471Array5332
				    [(1226818013
				      * ((Class468) this).anInt5349)]) != null
				   ? ((((Class471)
					(((Class468) this).aClass471Array5332
					 [(((Class468) this).anInt5349
					   * 1226818013)]))
				       .aClass528_Sub42_5404.pointer)
				      * -185904669)
				   : 0);
			    int i_85_ = ((Class468) this)
					    .anInterface37_5366.method215();
			    int i_86_ = ((Class468) this)
					    .anInterface37_5366
					    .method160(i_84_ / i_85_);
			    ((Class468) this).anInt5360 += 749508559 * i_86_;
			    if (((Class468) this).anInt5360 * 2040860463
				> ((Class468) this).anInt5352 * 1422576151) {
				((Class468) this).anInt5352
				    += i_86_ * -1224405593;
				i -= i_86_;
				if (false == ((Class468) this).aBool5367
				    && ((Class468) this).aBool5324
				    && (((Class468) this).anInt5368
					* 1869362513) > 0) {
				    if ((((Class468) this).anInt5352
					 * 1422576151)
					< (-566191889
					   * ((Class468) this).anInt5357))
					((Class468) this)
					    .aClass471Array5332
					    [(1226818013
					      * ((Class468) this).anInt5349)]
					    = null;
				    else if (((((Class468) this).anInt5352
					       * 1422576151)
					      >= (((Class468) this).anInt5357
						  * -566191889))
					     && ((((Class468) this).anInt5352
						  * 1422576151) - i_86_
						 < (((Class468) this).anInt5357
						    * -566191889)))
					((Class471)
					 (((Class468) this).aClass471Array5332
					  [(((Class468) this).anInt5349
					    * 1226818013)])).anInt5403
					    = (((Class468) this)
						   .anInterface37_5366
						   .method270
					       (((((Class468) this).anInt5352
						  * 1422576151)
						 - (((Class468) this).anInt5357
						    * -566191889))
						* i_85_)) * 559437379;
				}
				if (null
				    != (((Class468) this).aClass471Array5332
					[(((Class468) this).anInt5349
					  * 1226818013)])) {
				    if (((Class468) this).aBool5325
					&& !method5682((-208343481
							* (((Class468) this)
							   .anInt5365)),
						       604961088))
					method5680((((Class471)
						     (((Class468) this)
						      .aClass471Array5332
						      [(1226818013
							* (((Class468) this)
							   .anInt5349))]))
						    .aClass528_Sub42_5404),
						   (byte) 33);
				    if (false == ((Class468) this).aBool5367
					&& ((Class468) this).aBool5324
					&& ((1422576151
					     * ((Class468) this).anInt5352)
					    >= (((Class468) this).anInt5336
						* 1085084835))
					&& (((1869362513
					      * ((Class468) this).anInt5368)
					     <= -1240773999 * ((Class468)
							       this).anInt5328)
					    || (((Class468) this).anInt5328
						* -1240773999) < 0)) {
					int i_87_
					    = ((((Class468) this).anInt5352
						* 1422576151)
					       - (((Class468) this).anInt5336
						  * 1085084835));
					int i_88_ = i_86_ - i_87_;
					((Class471)
					 (((Class468) this).aClass471Array5332
					  [(1226818013
					    * ((Class468) this).anInt5349)]))
					    .anInt5402
					    = (((Class468) this)
						   .anInterface37_5366
						   .method270(i_88_ * i_85_)
					       * 946270067);
					((Class468) this).anInt5365 = 0;
					((Class468) this).anInt5368
					    += 1250964401;
					((Class468) this).anInt5352 = 0;
				    } else
					((Class468) this).anInt5365
					    += 1902009207;
				    ((Class468) this).anInt5349 += -1211195787;
				    ((Class468) this).anInt5349
					= (1226818013
					   * ((Class468) this).anInt5349
					   % (((Class468) this)
					      .aClass471Array5332).length
					   * -1211195787);
				}
			    } else
				((Class468) this).aClass471Array5332
				    [1226818013 * ((Class468) this).anInt5349]
				    = null;
			} else if (Class369.aClass369_3866 == class369
				   && ((Class468) this).aBool5324
				   && false == ((Class468) this).aBool5367
				   && (((1869362513
					 * ((Class468) this).anInt5368)
					< (-1240773999
					   * ((Class468) this).anInt5328))
				       || (((Class468) this).anInt5328
					   * -1240773999) < 0))
			    ((Class468) this).anInterface37_5366
				.method294(true);
		    }
		}
	    }
	    int i = 0;
	    for (int i_89_ = 0;
		 i_89_ < ((Class468) this).aClass471Array5332.length;
		 i_89_++) {
		if (null != ((Class468) this).aClass471Array5332[i_89_]) {
		    i++;
		    bool = false;
		}
	    }
	    if (!((Class468) this).aBool5338 && method5651((byte) -128) >= 0.0F
		&& (i >= ((Class468) this).anInt5322 * -1392597147
		    || Class369.aClass369_3866 == class369
		    || class369 == Class369.aClass369_3865)) {
		((Class468) this).aBool5338 = true;
		method5729(Class472.aClass472_5411, (byte) 19);
	    }
	    if (((Class468) this).anInterface37_5366.method271() && bool
		&& (method5684(1978839970) || ((Class468) this).aBool5337
		    || Class369.aClass369_3866 == class369)
		&& (!((Class468) this).aBool5324
		    || (false == ((Class468) this).aBool5367
			&& (1869362513 * ((Class468) this).anInt5368
			    >= ((Class468) this).anInt5328 * -1240773999)
			&& ((Class468) this).anInt5328 * -1240773999 >= 0))) {
		method5729(Class472.aClass472_5413, (byte) 123);
		((Class468) this).aBool5319 = false;
		if (((Class468) this).aBool5325)
		    method5685(235515868);
	    }
	}
    }
    
    public Class468(Class480 class480, int i, int i_90_,
		    Interface37 interface37, Class364 class364) {
	((Class468) this).anInt5355 = 0;
	((Class468) this).anInt5349 = 0;
	((Class468) this).anInt5358 = 0;
	((Class468) this).aFloat5361 = 0.0F;
	((Class468) this).aLong5321 = 0L;
	((Class468) this).aLong5363 = 0L;
	((Class468) this).aFloat5362 = 0.0F;
	((Class468) this).anInt5365 = 0;
	((Class468) this).anInt5368 = 0;
	((Class468) this).aClass364_5347 = class364;
	method5729(Class472.aClass472_5407, (byte) 112);
	((Class468) this).anInt5345 = -1494626173 * i;
	((Class468) this).anInt5322 = i_90_ * -473091475;
	((Class468) this).anInterface37_5366 = interface37;
	((Class468) this).anInt5333 = 0;
	((Class468) this).aBool5348 = false;
	((Class468) this).anInterface37_5366.method262(new Class474(this));
	method5726(1239022665);
    }
    
    void method5725() {
	Class351 class351
	    = (((Class468) this).aClass364_5347.method4609((byte) 68)
		   .method4582
	       (1921161847 * ((Class468) this).anInt5320, (byte) 96));
	((Class468) this).aFloat5354
	    = class351 != null ? class351.method4553(-483168984) : 1.0F;
	float f = class351 != null ? class351.method4552(-916034375) : 0.1F;
	f *= ((Class468) this).aFloat5353;
	float f_91_
	    = ((Class468) this).aFloatArray5323.length > 0 ? 0.0F : 1.0F;
	for (int i = 0; i < ((Class468) this).aFloatArray5323.length; i++) {
	    if (((Class468) this).aFloatArray5323[i] > f_91_)
		f_91_ = ((Class468) this).aFloatArray5323[i];
	}
	f *= f_91_;
	if (!method5661(-2022708506))
	    f = -1.0F;
	if (method5651((byte) -100) != f) {
	    method5660(f, -1427993859);
	    ((Class468) this).aBool5344 = true;
	}
    }
    
    void method5726(int i) {
	synchronized (this) {
	    ((Class468) this).aByteArray5329 = null;
	    ((Class468) this).anInt5320 = 0;
	    ((Class468) this).aFloat5353 = 0.0F;
	    ((Class468) this).aFloat5354 = 0.0F;
	    ((Class468) this).aBool5324 = false;
	    ((Class468) this).anInt5328 = 0;
	    ((Class468) this).aFloat5326 = 1.0F;
	    ((Class468) this).anInterface56_5327 = null;
	    ((Class468) this).anInt5331 = 0;
	    ((Class468) this).anInt5330 = 0;
	    if (null != ((Class468) this).aClass471Array5332) {
		for (int i_92_ = 0;
		     i_92_ < ((Class468) this).aClass471Array5332.length;
		     i_92_++) {
		    if (((Class468) this).aClass471Array5332[i_92_] != null)
			((Class468) this).aClass471Array5332[i_92_]
			    .method5809((byte) 19);
		}
	    }
	    ((Class468) this).aClass471Array5332 = null;
	    ((Class468) this).aBool5325 = false;
	    ((Class468) this).anInt5333 = 0;
	    ((Class468) this).anInt5357 = 0;
	    ((Class468) this).anInt5336 = 0;
	    ((Class468) this).anInt5335 = 0;
	    ((Class468) this).anInt5356 = 0;
	    ((Class468) this).anInt5339 = 0;
	    ((Class468) this).anIntArray5340 = null;
	    ((Class468) this).anIntArray5341 = null;
	    ((Class468) this).anIntArray5342 = null;
	    ((Class468) this).anInt5343 = 0;
	    ((Class468) this).aBool5319 = false;
	    ((Class468) this).anInterface37_5366.method263();
	    ((Class468) this).aBool5348 = false;
	    ((Class468) this).anInterface55_5364 = null;
	    ((Class468) this).anObject5350 = null;
	    ((Class468) this).anInt5351 = 0;
	    ((Class468) this).anInt5352 = 0;
	    ((Class468) this).anInt5360 = 0;
	    ((Class468) this).aBool5337 = false;
	    ((Class468) this).anInt5355 = 0;
	    ((Class468) this).anInt5349 = 0;
	    ((Class468) this).aBool5338 = false;
	    ((Class468) this).anInt5358 = 0;
	    method5660(-1.0F, -1427993859);
	    ((Class468) this).aBool5344 = false;
	    ((Class468) this).aFloat5361 = 0.0F;
	    ((Class468) this).aLong5321 = 0L;
	    ((Class468) this).aLong5363 = 0L;
	    ((Class468) this).aFloat5362 = 0.0F;
	    ((Class468) this).anInt5365 = 0;
	    ((Class468) this).anInt5368 = 0;
	}
    }
    
    int method5727() {
	if (null != ((Class468) this).anObject5350
	    && ((Class468) this).anObject5350 instanceof Class469) {
	    Class469 class469 = (Class469) ((Class468) this).anObject5350;
	    Interface67 interface67 = class469.method5752(-679005831);
	    return interface67.method420(-278138633);
	}
	return 0;
    }
    
    int method5728() {
	if (null != ((Class468) this).anObject5350
	    && ((Class468) this).anObject5350 instanceof Class469) {
	    Class469 class469 = (Class469) ((Class468) this).anObject5350;
	    Interface67 interface67 = class469.method5752(-330919814);
	    return interface67.method420(927265949);
	}
	return 0;
    }
    
    void method5729(Class472 class472, byte i) {
	((Class468) this).aClass472_5346 = class472;
    }
    
    boolean method5730() {
	synchronized (this) {
	    if (null != ((Class468) this).anObject5350
		&& ((Class468) this).anObject5350 instanceof Class469) {
		Class469 class469 = (Class469) ((Class468) this).anObject5350;
		Interface67 interface67 = class469.method5752(-271753079);
		if (null != interface67) {
		    boolean bool = interface67.method449(1574811408);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    public void method5731() {
	synchronized (this) {
	    if (((Class468) this).aBool5369) {
		/* empty */
	    } else if (null == ((Class468) this).anObject5334) {
		/* empty */
	    } else {
		int i = (((Class468) this).aClass364_5347.method4613
			 (((Class468) this).anObject5334, -1264997347));
		if (i <= 0) {
		    /* empty */
		} else if (((Class468) this).aClass471Array5332 != null
			   && ((((Class468) this).aClass471Array5332
				[((Class468) this).anInt5333 * 1406114527])
			       != null)
			   && ((Class468) this).aBool5338) {
		    int i_93_
			= ((1630842675 * ((Class468) this).anInt5351 + i
			    > (((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .aClass528_Sub42_5404.pointer) * -185904669)
			   ? ((((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .aClass528_Sub42_5404.pointer) * -185904669
			      - 1630842675 * ((Class468) this).anInt5351)
			   : i);
		    if ((1630842675 * ((Class468) this).anInt5351
			 < (((Class471) (((Class468) this).aClass471Array5332
					 [(((Class468) this).anInt5333
					   * 1406114527)])).anInt5403
			    * 306325099))
			&& (i_93_ + ((Class468) this).anInt5351 * 1630842675
			    > (306325099
			       * (((Class471) (((Class468) this)
					       .aClass471Array5332
					       [1406114527 * (((Class468) this)
							      .anInt5333)]))
				  .anInt5403)))
			&& (((Class471)
			     (((Class468) this).aClass471Array5332
			      [1406114527 * ((Class468) this).anInt5333]))
			    .anInt5403) * 306325099 >= 0) {
			((Class468) this).anInt5351
			    += ((18516969
				 * ((Class471) (((Class468) this)
						.aClass471Array5332
						[(((Class468) this).anInt5333
						  * 1406114527)])).anInt5403)
				- ((Class468) this).anInt5351 * 1);
			i_93_ = ((((Class468) this).anInt5351 * 1630842675 + i
				  > (((Class471) (((Class468) this)
						  .aClass471Array5332
						  [(((Class468) this).anInt5333
						    * 1406114527)]))
				     .aClass528_Sub42_5404
				     .pointer) * -185904669)
				 ? ((-185904669
				     * (((Class471)
					 (((Class468) this).aClass471Array5332
					  [(((Class468) this).anInt5333
					    * 1406114527)]))
					.aClass528_Sub42_5404.pointer))
				    - ((Class468) this).anInt5351 * 1630842675)
				 : i);
		    }
		    if ((((Class468) this).anInt5351 * 1630842675 + i_93_
			 > (1085328827
			    * (((Class471)
				(((Class468) this).aClass471Array5332
				 [1406114527 * ((Class468) this).anInt5333]))
			       .anInt5402)))
			&& (((Class471)
			     (((Class468) this).aClass471Array5332
			      [1406114527 * ((Class468) this).anInt5333]))
			    .anInt5402) * 1085328827 >= 0)
			i_93_ = ((1085328827
				  * ((Class471) (((Class468) this)
						 .aClass471Array5332
						 [(((Class468) this).anInt5333
						   * 1406114527)])).anInt5402)
				 - ((Class468) this).anInt5351 * 1630842675);
		    method5678((((Class471)
				 (((Class468) this).aClass471Array5332
				  [1406114527 * ((Class468) this).anInt5333]))
				.aClass528_Sub42_5404.payload),
			       1630842675 * ((Class468) this).anInt5351,
			       (1630842675 * ((Class468) this).anInt5351
				+ i_93_),
			       (byte) -22);
		    ((Class468) this).aClass364_5347.method4626
			(((Class468) this).anObject5334,
			 (((Class471)
			   (((Class468) this).aClass471Array5332
			    [((Class468) this).anInt5333 * 1406114527]))
			  .aClass528_Sub42_5404.payload),
			 ((Class468) this).anInt5351 * 1630842675, i_93_,
			 (byte) 11);
		    ((Class468) this).anInt5351 += 1443554299 * i_93_;
		    i -= i_93_;
		    if ((1630842675 * ((Class468) this).anInt5351
			 >= (((Class471)
			      (((Class468) this).aClass471Array5332
			       [1406114527 * ((Class468) this).anInt5333]))
			     .aClass528_Sub42_5404.pointer) * -185904669)
			|| ((1630842675 * ((Class468) this).anInt5351
			     >= (((Class471)
				  (((Class468) this).aClass471Array5332
				   [1406114527 * ((Class468) this).anInt5333]))
				 .anInt5402) * 1085328827)
			    && 1085328827 * (((Class471)
					      (((Class468) this)
					       .aClass471Array5332
					       [1406114527 * (((Class468) this)
							      .anInt5333)]))
					     .anInt5402) >= 0)) {
			((Class468) this).aClass471Array5332
			    [1406114527 * ((Class468) this).anInt5333]
			    .method5809((byte) -48);
			((Class468) this).aClass471Array5332
			    [1406114527 * ((Class468) this).anInt5333]
			    = null;
			((Class468) this).anInt5333 += 457875743;
			((Class468) this).anInt5333
			    = (((Class468) this).anInt5333 * 1406114527
			       % ((Class468) this).aClass471Array5332.length
			       * 457875743);
			((Class468) this).anInt5351 = 0;
		    }
		}
	    }
	}
    }
    
    void method5732() {
	synchronized (this) {
	    ((Class468) this).aByteArray5329 = null;
	    ((Class468) this).anInt5320 = 0;
	    ((Class468) this).aFloat5353 = 0.0F;
	    ((Class468) this).aFloat5354 = 0.0F;
	    ((Class468) this).aBool5324 = false;
	    ((Class468) this).anInt5328 = 0;
	    ((Class468) this).aFloat5326 = 1.0F;
	    ((Class468) this).anInterface56_5327 = null;
	    ((Class468) this).anInt5331 = 0;
	    ((Class468) this).anInt5330 = 0;
	    if (null != ((Class468) this).aClass471Array5332) {
		for (int i = 0;
		     i < ((Class468) this).aClass471Array5332.length; i++) {
		    if (((Class468) this).aClass471Array5332[i] != null)
			((Class468) this).aClass471Array5332[i]
			    .method5809((byte) -17);
		}
	    }
	    ((Class468) this).aClass471Array5332 = null;
	    ((Class468) this).aBool5325 = false;
	    ((Class468) this).anInt5333 = 0;
	    ((Class468) this).anInt5357 = 0;
	    ((Class468) this).anInt5336 = 0;
	    ((Class468) this).anInt5335 = 0;
	    ((Class468) this).anInt5356 = 0;
	    ((Class468) this).anInt5339 = 0;
	    ((Class468) this).anIntArray5340 = null;
	    ((Class468) this).anIntArray5341 = null;
	    ((Class468) this).anIntArray5342 = null;
	    ((Class468) this).anInt5343 = 0;
	    ((Class468) this).aBool5319 = false;
	    ((Class468) this).anInterface37_5366.method263();
	    ((Class468) this).aBool5348 = false;
	    ((Class468) this).anInterface55_5364 = null;
	    ((Class468) this).anObject5350 = null;
	    ((Class468) this).anInt5351 = 0;
	    ((Class468) this).anInt5352 = 0;
	    ((Class468) this).anInt5360 = 0;
	    ((Class468) this).aBool5337 = false;
	    ((Class468) this).anInt5355 = 0;
	    ((Class468) this).anInt5349 = 0;
	    ((Class468) this).aBool5338 = false;
	    ((Class468) this).anInt5358 = 0;
	    method5660(-1.0F, -1427993859);
	    ((Class468) this).aBool5344 = false;
	    ((Class468) this).aFloat5361 = 0.0F;
	    ((Class468) this).aLong5321 = 0L;
	    ((Class468) this).aLong5363 = 0L;
	    ((Class468) this).aFloat5362 = 0.0F;
	    ((Class468) this).anInt5365 = 0;
	    ((Class468) this).anInt5368 = 0;
	}
    }
    
    void method5733() {
	synchronized (this) {
	    ((Class468) this).aByteArray5329 = null;
	    ((Class468) this).anInt5320 = 0;
	    ((Class468) this).aFloat5353 = 0.0F;
	    ((Class468) this).aFloat5354 = 0.0F;
	    ((Class468) this).aBool5324 = false;
	    ((Class468) this).anInt5328 = 0;
	    ((Class468) this).aFloat5326 = 1.0F;
	    ((Class468) this).anInterface56_5327 = null;
	    ((Class468) this).anInt5331 = 0;
	    ((Class468) this).anInt5330 = 0;
	    if (null != ((Class468) this).aClass471Array5332) {
		for (int i = 0;
		     i < ((Class468) this).aClass471Array5332.length; i++) {
		    if (((Class468) this).aClass471Array5332[i] != null)
			((Class468) this).aClass471Array5332[i]
			    .method5809((byte) -46);
		}
	    }
	    ((Class468) this).aClass471Array5332 = null;
	    ((Class468) this).aBool5325 = false;
	    ((Class468) this).anInt5333 = 0;
	    ((Class468) this).anInt5357 = 0;
	    ((Class468) this).anInt5336 = 0;
	    ((Class468) this).anInt5335 = 0;
	    ((Class468) this).anInt5356 = 0;
	    ((Class468) this).anInt5339 = 0;
	    ((Class468) this).anIntArray5340 = null;
	    ((Class468) this).anIntArray5341 = null;
	    ((Class468) this).anIntArray5342 = null;
	    ((Class468) this).anInt5343 = 0;
	    ((Class468) this).aBool5319 = false;
	    ((Class468) this).anInterface37_5366.method263();
	    ((Class468) this).aBool5348 = false;
	    ((Class468) this).anInterface55_5364 = null;
	    ((Class468) this).anObject5350 = null;
	    ((Class468) this).anInt5351 = 0;
	    ((Class468) this).anInt5352 = 0;
	    ((Class468) this).anInt5360 = 0;
	    ((Class468) this).aBool5337 = false;
	    ((Class468) this).anInt5355 = 0;
	    ((Class468) this).anInt5349 = 0;
	    ((Class468) this).aBool5338 = false;
	    ((Class468) this).anInt5358 = 0;
	    method5660(-1.0F, -1427993859);
	    ((Class468) this).aBool5344 = false;
	    ((Class468) this).aFloat5361 = 0.0F;
	    ((Class468) this).aLong5321 = 0L;
	    ((Class468) this).aLong5363 = 0L;
	    ((Class468) this).aFloat5362 = 0.0F;
	    ((Class468) this).anInt5365 = 0;
	    ((Class468) this).anInt5368 = 0;
	}
    }
    
    static final void method5734(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = ((Class648) class648).aClass308_8391.aBool3378 ? 1 : 0;
    }
    
    static final void method5735(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
		  .method10014(-1824619963);
    }
    
    static final void method5736(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 4 == -1860881523 * Class390.anInt4111 ? 1 : 0;
    }
}
