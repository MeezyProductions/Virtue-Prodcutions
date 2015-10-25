/* Class141_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;
import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Class141_Sub1 extends Class141
{
    public long aLong8791;
    Set aSet8792;
    Class456[] aClass456Array8793;
    boolean aBool8794;
    public boolean aBool8795 = false;
    long aLong8796;
    Class411[] aClass411Array8797;
    int anInt8798;
    static final int anInt8799 = 1;
    public static Class528_Sub37 aClass528_Sub37_8800;
    public static Clipboard aClipboard8801;
    
    @Override
	public void method111(Class142 class142, Object object) {
	if (Class456.aClass456_5005
	    == (this.aClass456Array8793
		[-1285823079 * class142.anInt1637]))
	    aBool8795 = true;
	else if ((this.aClass456Array8793
		  [class142.anInt1637 * -1285823079])
		 == Class456.aClass456_5006) {
	    if (object instanceof String) {
		String string = (String) object;
		if (string.length() > 80)
		    object = string.substring(0, 80);
	    }
	    Object object_0_ = method109(class142, 1411745558);
	    if (object != null && null != object_0_
		&& !object.equals(object_0_)) {
		this.aBool8794 = true;
		this.aSet8792
		    .add(Integer.valueOf(class142.anInt1637 * -1285823079));
	    } else if ((object == null) != (object_0_ == null)) {
		this.aBool8794 = true;
		this.aSet8792
		    .add(Integer.valueOf(-1285823079 * class142.anInt1637));
	    }
	}
	super.method113(class142, object, -1939007169);
    }
    
    public void method8270(byte i) {
	this.anInt8798 = 0;
    }
    
    @Override
	public void method113(Class142 class142, Object object, int i) {
	if (Class456.aClass456_5005
	    == (this.aClass456Array8793
		[-1285823079 * class142.anInt1637]))
	    aBool8795 = true;
	else if ((this.aClass456Array8793
		  [class142.anInt1637 * -1285823079])
		 == Class456.aClass456_5006) {
	    if (object instanceof String) {
		String string = (String) object;
		if (string.length() > 80)
		    object = string.substring(0, 80);
	    }
	    Object object_1_ = method109(class142, 1918987986);
	    if (object != null && null != object_1_
		&& !object.equals(object_1_)) {
		this.aBool8794 = true;
		this.aSet8792
		    .add(Integer.valueOf(class142.anInt1637 * -1285823079));
	    } else if ((object == null) != (object_1_ == null)) {
		this.aBool8794 = true;
		this.aSet8792
		    .add(Integer.valueOf(-1285823079 * class142.anInt1637));
	    }
	}
	super.method113(class142, object, -1939007169);
    }
    
    public void method8271(byte i) {
	for (int i_2_ = 0;
	     i_2_ < this.aClass456Array8793.length; i_2_++) {
	    if ((this.aClass456Array8793[i_2_]
		 == Class456.aClass456_5004)
		|| (Class456.aClass456_5006
		    == this.aClass456Array8793[i_2_]))
		anInterface2_1635.method17(i_2_, 835176933);
	}
	this.aSet8792.clear();
	this.aBool8794 = false;
	this.aClass411Array8797 = null;
	this.aLong8796 = -5828789005743495957L;
    }
    
    @Override
	public void method92(Class142 class142, int i, int i_3_) {
	if (Class456.aClass456_5005
	    == (this.aClass456Array8793
		[-1285823079 * class142.anInt1637]))
	    aBool8795 = true;
	else if (((this.aClass456Array8793
		   [class142.anInt1637 * -1285823079])
		  == Class456.aClass456_5006)
		 && method114(class142, (byte) 1) != i) {
	    this.aBool8794 = true;
	    this.aSet8792
		.add(Integer.valueOf(class142.anInt1637 * -1285823079));
	}
	super.method92(class142, i, -1292689067);
    }
    
    public void method8272() {
	if (Class249.method3417(2123812744)
	    >= this.aLong8796 * -5183281828275725251L) {
	    if (this.aClass411Array8797 == null) {
		if (!this.aBool8794)
		    return;
		this.aClass411Array8797
		    = new Class411[this.aSet8792.size()];
		int i = 0;
		Iterator iterator = this.aSet8792.iterator();
		while (iterator.hasNext()) {
		    int i_4_ = ((Integer) iterator.next()).intValue();
		    this.aClass411Array8797[i++]
			= new Class411(i_4_,
				       anInterface2_1635.method14(i_4_,
								  (byte) 28));
		}
		this.anInt8798 = 0;
		this.aBool8794 = false;
		this.aSet8792.clear();
	    }
	    if (null != this.aClass411Array8797
		&& (835279043 * this.anInt8798
		    < this.aClass411Array8797.length)) {
		Class109 class109 = Class591.method7078((byte) 66);
		if (class109.anInt1377 * 204132229 <= 1200) {
		    Class528_Sub34 class528_sub34
			= Class656.method7845(OutgoingOpcode.aClass403_4505,
					      class109.aClass10_1379,
					      -2078083352);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.method9717(0, (byte) -19);
		    int i
			= (class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			   * -185904669);
		    class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			+= 2015001547;
		    for (/**/;
			 (this.anInt8798 * 835279043
			  < this.aClass411Array8797.length);
			 this.anInt8798 += 1390811115) {
			Class411 class411
			    = (this.aClass411Array8797
			       [this.anInt8798 * 835279043]);
			if ((204132229 * class109.anInt1377
			     + (class528_sub34.aClass528_Sub42_Sub2_10481
				.pointer) * -185904669
			     + Class527.aClass95_Sub1_Sub1_7104
				   .method8253(class411, 789512357))
			    > 1500)
			    break;
			Class527.aClass95_Sub1_Sub1_7104.method8254
			    (class528_sub34.aClass528_Sub42_Sub2_10481,
			     class411, 838131432);
		    }
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9620
			((-185904669 * (class528_sub34
					.aClass528_Sub42_Sub2_10481.pointer)
			  - i),
			 -1932303861);
		    if (this.anInt8798 * 835279043
			>= this.aClass411Array8797.length)
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .payload[i]
			    = (byte) 1;
		    else
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .payload[i]
			    = (byte) 0;
		    class109.method1380(class528_sub34, 2094458941);
		    this.aLong8796
			= ((Class249.method3417(1907680580) + 1000L)
			   * 5828789005743495957L);
		}
	    }
	}
    }
    
    public void method8273(Class23 class23, int i) {
	do {
	    try {
		try {
		    int i_5_ = 3;
		    int i_6_ = 0;
		    Iterator iterator = anInterface2_1635.iterator();
		    while (iterator.hasNext()) {
			Class411 class411 = (Class411) iterator.next();
			if ((this.aClass456Array8793
			     [1862601893 * class411.anInt4711])
			    == Class456.aClass456_5005) {
			    i_5_ += Class527.aClass95_Sub1_Sub1_7104
					.method8253(class411, 1804188142);
			    i_6_++;
			}
		    }
		    ByteBuffer class528_sub42 = new ByteBuffer(i_5_);
		    class528_sub42.writeByte(1, (byte) -120);
		    class528_sub42.method9717(i_6_, (byte) 24);
		    Iterator iterator_7_ = anInterface2_1635.iterator();
		    while (iterator_7_.hasNext()) {
			Class411 class411 = (Class411) iterator_7_.next();
			if ((this.aClass456Array8793
			     [1862601893 * class411.anInt4711])
			    == Class456.aClass456_5005)
			    Class527.aClass95_Sub1_Sub1_7104.method8254
				(class528_sub42, class411, 838131432);
		    }
		    class23.method689(class528_sub42.payload, 0,
				      class528_sub42.pointer * -185904669,
				      705591572);
		} catch (Exception exception) {
		    try {
			class23.method683((byte) 85);
		    } catch (Exception exception_8_) {
			exception = exception_8_;
		    }
		    break;
		}
		try {
		    class23.method683((byte) 20);
		} catch (Exception exception) {
		    /* empty */
		}
			} catch (Exception object) {
		try {
		    class23.method683((byte) 55);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
	aLong8791 = Class249.method3417(2120827789) * 6953023136523251951L;
	aBool8795 = false;
    }
    
    public void method8274(byte i) {
	if (Class249.method3417(1910830028)
	    >= this.aLong8796 * -5183281828275725251L) {
	    if (this.aClass411Array8797 == null) {
		if (!this.aBool8794)
		    return;
		this.aClass411Array8797
		    = new Class411[this.aSet8792.size()];
		int i_9_ = 0;
		Iterator iterator = this.aSet8792.iterator();
		while (iterator.hasNext()) {
		    int i_10_ = ((Integer) iterator.next()).intValue();
		    this.aClass411Array8797[i_9_++]
			= new Class411(i_10_,
				       anInterface2_1635.method14(i_10_,
								  (byte) 110));
		}
		this.anInt8798 = 0;
		this.aBool8794 = false;
		this.aSet8792.clear();
	    }
	    if (null != this.aClass411Array8797
		&& (835279043 * this.anInt8798
		    < this.aClass411Array8797.length)) {
		Class109 class109 = Class591.method7078((byte) 75);
		if (class109.anInt1377 * 204132229 <= 1200) {
		    Class528_Sub34 class528_sub34
			= Class656.method7845(OutgoingOpcode.aClass403_4505,
					      class109.aClass10_1379,
					      -2101933522);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.method9717(0, (byte) 106);
		    int i_11_
			= (class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			   * -185904669);
		    class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			+= 2015001547;
		    for (/**/;
			 (this.anInt8798 * 835279043
			  < this.aClass411Array8797.length);
			 this.anInt8798 += 1390811115) {
			Class411 class411
			    = (this.aClass411Array8797
			       [this.anInt8798 * 835279043]);
			if ((204132229 * class109.anInt1377
			     + (class528_sub34.aClass528_Sub42_Sub2_10481
				.pointer) * -185904669
			     + Class527.aClass95_Sub1_Sub1_7104
				   .method8253(class411, 927475872))
			    > 1500)
			    break;
			Class527.aClass95_Sub1_Sub1_7104.method8254
			    (class528_sub34.aClass528_Sub42_Sub2_10481,
			     class411, 838131432);
		    }
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9620
			((-185904669 * (class528_sub34
					.aClass528_Sub42_Sub2_10481.pointer)
			  - i_11_),
			 1727805990);
		    if (this.anInt8798 * 835279043
			>= this.aClass411Array8797.length)
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .payload[i_11_]
			    = (byte) 1;
		    else
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .payload[i_11_]
			    = (byte) 0;
		    class109.method1380(class528_sub34, 2065659687);
		    this.aLong8796
			= ((Class249.method3417(1932307165) + 1000L)
			   * 5828789005743495957L);
		}
	    }
	}
    }
    
    public void method8275(int i) {
	if (this.aClass411Array8797 != null
	    && (this.anInt8798 * 835279043
		>= this.aClass411Array8797.length)) {
	    this.aClass411Array8797 = null;
	    this.anInt8798 = 0;
	}
    }
    
    @Override
	public void method99(Class142 class142, int i) {
	if (Class456.aClass456_5005
	    == (this.aClass456Array8793
		[-1285823079 * class142.anInt1637]))
	    aBool8795 = true;
	else if (((this.aClass456Array8793
		   [class142.anInt1637 * -1285823079])
		  == Class456.aClass456_5006)
		 && method114(class142, (byte) -6) != i) {
	    this.aBool8794 = true;
	    this.aSet8792
		.add(Integer.valueOf(class142.anInt1637 * -1285823079));
	}
	super.method92(class142, i, -1987069267);
    }
    
    @Override
	public void method106(Class142 class142, long l) {
	if ((this.aClass456Array8793
	     [class142.anInt1637 * -1285823079])
	    == Class456.aClass456_5005)
	    aBool8795 = true;
	else if ((Class456.aClass456_5006
		  == (this.aClass456Array8793
		      [class142.anInt1637 * -1285823079]))
		 && method93(class142, -1834932948) != l) {
	    this.aBool8794 = true;
	    this.aSet8792
		.add(Integer.valueOf(-1285823079 * class142.anInt1637));
	}
	super.method107(class142, l);
    }
    
    public void method8276(Class23 class23, int i) {
	do {
	    try {
		try {
		    byte[] is = new byte[(int) class23.method680(-1948026529)];
		    int i_12_;
		    for (int i_13_ = 0; i_13_ < is.length; i_13_ += i_12_) {
			i_12_ = class23.method692(is, i_13_, is.length - i_13_,
						  2058624851);
			if (-1 == i_12_)
			    throw new EOFException();
		    }
		    ByteBuffer class528_sub42 = new ByteBuffer(is);
		    if ((class528_sub42.payload.length
			 - class528_sub42.pointer * -185904669)
			< 1) {
			try {
			    class23.method683((byte) 77);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_14_ = class528_sub42.readUnsignedByte((byte) 23);
		    if (i_14_ < 0 || i_14_ > 1) {
			try {
			    class23.method683((byte) 30);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class528_sub42.payload.length
			 - class528_sub42.pointer * -185904669)
			< 2) {
			try {
			    class23.method683((byte) 117);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_15_ = class528_sub42.readUnsignedShort(188471521);
		    if ((class528_sub42.payload.length
			 - class528_sub42.pointer * -185904669)
			< 6 * i_15_) {
			try {
			    class23.method683((byte) 125);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
			Class411 class411
			    = Class527.aClass95_Sub1_Sub1_7104
				  .method8255(class528_sub42, 1178452487);
			if (((this.aClass456Array8793
			      [class411.anInt4711 * 1862601893])
			     == Class456.aClass456_5005)
			    && (((Class142)
				 (Class527.aClass95_Sub1_Sub1_7104.method63
				  (class411.anInt4711 * 1862601893,
				   -125579143)))
				    .aClass459_1638.method5564
				    (-1090038235).aClass5479.isAssignableFrom
				(class411.anObject4712.getClass())))
			    anInterface2_1635.method15((1862601893
							* class411.anInt4711),
						       class411.anObject4712,
						       -910460415);
		    }
		} catch (Exception exception) {
		    try {
			class23.method683((byte) 52);
		    } catch (Exception exception_17_) {
			exception = exception_17_;
		    }
		    break;
		}
		try {
		    class23.method683((byte) 45);
		} catch (Exception exception) {
		    /* empty */
		}
			} catch (Exception object) {
		try {
		    class23.method683((byte) 121);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void method8277() {
	for (int i = 0; i < this.aClass456Array8793.length;
	     i++) {
	    if ((this.aClass456Array8793[i]
		 == Class456.aClass456_5004)
		|| (Class456.aClass456_5006
		    == this.aClass456Array8793[i]))
		anInterface2_1635.method17(i, 899638355);
	}
	this.aSet8792.clear();
	this.aBool8794 = false;
	this.aClass411Array8797 = null;
	this.aLong8796 = -5828789005743495957L;
    }
    
    public void method8278() {
	for (int i = 0; i < this.aClass456Array8793.length;
	     i++) {
	    if ((this.aClass456Array8793[i]
		 == Class456.aClass456_5004)
		|| (Class456.aClass456_5006
		    == this.aClass456Array8793[i]))
		anInterface2_1635.method17(i, 2104244748);
	}
	this.aSet8792.clear();
	this.aBool8794 = false;
	this.aClass411Array8797 = null;
	this.aLong8796 = -5828789005743495957L;
    }
    
    public void method8279() {
	for (int i = 0; i < this.aClass456Array8793.length;
	     i++) {
	    if ((this.aClass456Array8793[i]
		 == Class456.aClass456_5004)
		|| (Class456.aClass456_5006
		    == this.aClass456Array8793[i]))
		anInterface2_1635.method17(i, 1823832372);
	}
	this.aSet8792.clear();
	this.aBool8794 = false;
	this.aClass411Array8797 = null;
	this.aLong8796 = -5828789005743495957L;
    }
    
    public void method8280() {
	for (int i = 0; i < this.aClass456Array8793.length;
	     i++) {
	    if ((this.aClass456Array8793[i]
		 == Class456.aClass456_5004)
		|| (Class456.aClass456_5006
		    == this.aClass456Array8793[i]))
		anInterface2_1635.method17(i, 2033414976);
	}
	this.aSet8792.clear();
	this.aBool8794 = false;
	this.aClass411Array8797 = null;
	this.aLong8796 = -5828789005743495957L;
    }
    
    public void method8281() {
	this.anInt8798 = 0;
    }
    
    public void method8282() {
	this.anInt8798 = 0;
    }
    
    @Override
	public void method107(Class142 class142, long l) {
	if ((this.aClass456Array8793
	     [class142.anInt1637 * -1285823079])
	    == Class456.aClass456_5005)
	    aBool8795 = true;
	else if ((Class456.aClass456_5006
		  == (this.aClass456Array8793
		      [class142.anInt1637 * -1285823079]))
		 && method93(class142, -2120249244) != l) {
	    this.aBool8794 = true;
	    this.aSet8792
		.add(Integer.valueOf(-1285823079 * class142.anInt1637));
	}
	super.method107(class142, l);
    }
    
    public Class141_Sub1(Class95_Sub1 class95_sub1) {
	super(class95_sub1);
	aLong8791 = -6953023136523251951L;
	this.aBool8794 = false;
	this.aLong8796 = -5828789005743495957L;
	this.anInt8798 = 0;
	this.aClass456Array8793
	    = new Class456[class95_sub1.method62((short) 3553)];
	for (int i = 0; i < class95_sub1.method62((short) 3553); i++)
	    this.aClass456Array8793[i]
		= (((Class142) class95_sub1.method63(i, -277944064))
		   .aClass456_1636);
	this.aSet8792
	    = new HashSet(class95_sub1.method62((short) 3553));
    }
    
    @Override
	public void method96(Class142 class142, Object object) {
	if (Class456.aClass456_5005
	    == (this.aClass456Array8793
		[-1285823079 * class142.anInt1637]))
	    aBool8795 = true;
	else if ((this.aClass456Array8793
		  [class142.anInt1637 * -1285823079])
		 == Class456.aClass456_5006) {
	    if (object instanceof String) {
		String string = (String) object;
		if (string.length() > 80)
		    object = string.substring(0, 80);
	    }
	    Object object_18_ = method109(class142, 1050933780);
	    if (object != null && null != object_18_
		&& !object.equals(object_18_)) {
		this.aBool8794 = true;
		this.aSet8792
		    .add(Integer.valueOf(class142.anInt1637 * -1285823079));
	    } else if ((object == null) != (object_18_ == null)) {
		this.aBool8794 = true;
		this.aSet8792
		    .add(Integer.valueOf(-1285823079 * class142.anInt1637));
	    }
	}
	super.method113(class142, object, -1939007169);
    }
    
    public void method8283() {
	if (this.aClass411Array8797 != null
	    && (this.anInt8798 * 835279043
		>= this.aClass411Array8797.length)) {
	    this.aClass411Array8797 = null;
	    this.anInt8798 = 0;
	}
    }
    
    public void method8284() {
	if (this.aClass411Array8797 != null
	    && (this.anInt8798 * 835279043
		>= this.aClass411Array8797.length)) {
	    this.aClass411Array8797 = null;
	    this.anInt8798 = 0;
	}
    }
    
    public void method8285() {
	if (this.aClass411Array8797 != null
	    && (this.anInt8798 * 835279043
		>= this.aClass411Array8797.length)) {
	    this.aClass411Array8797 = null;
	    this.anInt8798 = 0;
	}
    }
    
    public void method8286() {
	if (this.aClass411Array8797 != null
	    && (this.anInt8798 * 835279043
		>= this.aClass411Array8797.length)) {
	    this.aClass411Array8797 = null;
	    this.anInt8798 = 0;
	}
    }
    
    public static void method8287(int i, byte i_19_) {
	Class645_Sub1_Sub3_Sub1.anInt11880 = -1014589837 * i;
	Class229.aClass186_2372.method2731(-1169578009);
    }
    
    static final void method8288(Class648 class648, int i) {
	Class528_Sub25 class528_sub25 = Class271.method3687((byte) 35);
	if (class528_sub25 == null) {
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	} else {
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -123895777 * class528_sub25.anInt10420;
	    int i_20_ = (-2053073269 * class528_sub25.anInt10421 << 28
			 | (Class518.anInt6972
			    + class528_sub25.anInt10424 * -1196920295) << 14
			 | (Class518.anInt6995
			    + 1481938899 * class528_sub25.anInt10423));
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= i_20_;
	}
    }
    
    static final void method8289(Class648 class648, byte i) {
	int i_21_
	    = (class648.anIntArray8394
	       [(class648.anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_21_, (byte) -15);
	Class226 class226 = Class380.aClass226Array3970[i_21_ >> 16];
	Class194.method2806(class229, class226, class648, -1625944704);
    }
}
