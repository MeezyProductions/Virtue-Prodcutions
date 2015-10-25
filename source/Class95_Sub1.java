/* Class95_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class95_Sub1 extends Class95 implements Interface52
{
    protected VarDomainType aClass445_8775;
    
    Class95_Sub1(Class673 class673, VarDomainType varDomainType, Class668 class668,
		 int i) {
	super(class673, class668, i);
	aClass445_8775 = varDomainType;
    }
    
    public int method62(short i) {
	return anInt1211 * -628202237;
    }
    
    public Object method344(int i, int i_0_) {
	Class142 class142 = (Class142) method63(i, -2055778491);
	if (null == class142 || !class142.method1704(1445847933))
	    return null;
	return class142.method1705((byte) -94);
    }
    
    public int method8253(Class411 class411, int i) {
	int i_1_ = 2;
	if (class411.anObject4712 instanceof Integer)
	    i_1_ += 4;
	else if (class411.anObject4712 instanceof Long)
	    i_1_ += 8;
	else if (class411.anObject4712 instanceof String)
	    i_1_ += Class528_Sub25.method9444((String) class411.anObject4712,
					      521256243);
	else if (class411.anObject4712 instanceof Interface6)
	    i_1_ += ((Interface6) class411.anObject4712).method48(1507732734);
	else
	    throw new IllegalStateException();
	return i_1_;
    }
    
    public void method8254(ByteBuffer class528_sub42, Class411 class411,
			   int i) {
	class528_sub42.method9717(class411.anInt4711 * 1862601893, (byte) 5);
	if (class411.anObject4712 instanceof Integer)
	    class528_sub42.writeInt(((Integer) class411.anObject4712)
					  .intValue(),
				      2047964585);
	else if (class411.anObject4712 instanceof Long)
	    class528_sub42
		.method9606(((Long) class411.anObject4712).longValue());
	else if (class411.anObject4712 instanceof String)
	    class528_sub42.method9616((String) class411.anObject4712,
				      -581697669);
	else if (class411.anObject4712 instanceof Interface6)
	    ((Interface6) class411.anObject4712).method47(class528_sub42,
							  1935727284);
	else
	    throw new IllegalStateException();
    }
    
    public Class411 method8255(ByteBuffer class528_sub42, int i) {
	int i_2_ = class528_sub42.readUnsignedShort(688931040);
	Class142 class142 = (Class142) method63(i_2_, -764024744);
	if (!class142.method1704(-715241032))
	    throw new IllegalStateException("");
	Class411 class411 = new Class411(i_2_);
	Class var_class
	    = class142.aClass459_1638.method5564(1677379079).aClass5479;
	if (var_class == java.lang.Integer.class)
	    class411.anObject4712
		= Integer.valueOf(class528_sub42.readInt(-826114504));
	else if (var_class == java.lang.Long.class)
	    class411.anObject4712
		= Long.valueOf(class528_sub42.method9633(771973092));
	else if (java.lang.String.class == var_class)
	    class411.anObject4712 = class528_sub42.method9637((byte) -122);
	else if (Interface6.class.isAssignableFrom(var_class)) {
	    try {
		Interface6 interface6 = (Interface6) var_class.newInstance();
		interface6.method52(class528_sub42, (short) 30022);
		class411.anObject4712 = interface6;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	return class411;
    }
    
    public Class411 method8256(ByteBuffer class528_sub42,
			       Class483 class483, int i) {
	int i_3_ = class528_sub42.readUnsignedShort(-168640644);
	Class411 class411 = new Class411(i_3_);
	Class var_class = class483.aClass5479;
	if (java.lang.Integer.class == var_class)
	    class411.anObject4712
		= Integer.valueOf(class528_sub42.readInt(-1367708388));
	else if (var_class == java.lang.Long.class)
	    class411.anObject4712
		= Long.valueOf(class528_sub42.method9633(771973092));
	else if (java.lang.String.class == var_class)
	    class411.anObject4712 = class528_sub42.method9637((byte) -14);
	else if (Interface6.class.isAssignableFrom(var_class)) {
	    try {
		Interface6 interface6 = (Interface6) var_class.newInstance();
		interface6.method52(class528_sub42, (short) 10430);
		class411.anObject4712 = interface6;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	Class142 class142 = (Class142) method63(i_3_, 1508768955);
	if (!class142.method1704(593878338)
	    || class142.aClass459_1638.method5564(-592763897) != class483)
	    return null;
	return class411;
    }
    
    public abstract Definition method64(int i);
    
    public abstract Definition method65(int i);
    
    public int method5() {
	return anInt1211 * -628202237;
    }
    
    public Object method345(int i) {
	Class142 class142 = (Class142) method63(i, -802080243);
	if (null == class142 || !class142.method1704(1163361819))
	    return null;
	return class142.method1705((byte) -40);
    }
    
    public abstract Definition method63(int i, int i_4_);
    
    public static String method8257(int i, boolean bool, int i_5_) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class364.method4632(i, 10, bool, 1239022665);
    }
}
