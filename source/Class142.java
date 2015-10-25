/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class142 implements Interface11
{
    public Class456 aClass456_1636 = Class456.aClass456_5004;
    public int anInt1637;
    public Class459 aClass459_1638;
    public VarDomainType aClass445_1639;
    public boolean aBool1640 = true;
    
    Class142(VarDomainType varDomainType, int i) {
	aClass445_1639 = varDomainType;
	anInt1637 = i * -1471570263;
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 25);
	    if (0 == i_0_)
		break;
	    Class147 class147
		= ((Class147)
		   Class443.method5321(Class527.method6434(-1416044721), i_0_,
				       1624443925));
	    if (class147 != null) {
		switch (((Class147) class147).anInt1664 * 656505727) {
		case 4: {
		    int i_1_ = class528_sub42.readUnsignedByte((byte) 79);
		    aClass459_1638
			= ((Class459)
			   Class443.method5321(Class459.method5563(648615580),
					       i_1_, 1530250453));
		    if (null == aClass459_1638)
			throw new IllegalStateException("");
		    break;
		}
		case 6:
		    break;
		case 3:
		    class528_sub42.method9637((byte) 5);
		    break;
		case 5:
		    Class443.method5321(Class421.method5049(569330799),
					class528_sub42.readUnsignedByte((byte) 56),
					1537941694);
		    break;
		default:
		    throw new IllegalStateException("");
		case 2:
		    aBool1640 = false;
		    break;
		case 1:
		    aClass456_1636
			= ((Class456)
			   Class443.method5321(Class661
						   .method7871(-1052580136),
					       class528_sub42
						   .readUnsignedByte((byte) 39),
					       1050263147));
		}
	    } else
		method1709(class528_sub42, i_0_, 518724623);
	}
    }
    
    boolean method1703() {
	if (null == aClass445_1639 || null == aClass459_1638)
	    return false;
	return true;
    }
    
    boolean method1704(int i) {
	if (null == aClass445_1639 || null == aClass459_1638)
	    return false;
	return true;
    }
    
    public Object method1705(byte i) {
	return aClass445_1639.method5331(this, -1002007543);
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 23);
	    if (0 == i)
		break;
	    Class147 class147
		= ((Class147)
		   Class443.method5321(Class527.method6434(-1416044721), i,
				       1598167243));
	    if (class147 != null) {
		switch (((Class147) class147).anInt1664 * 656505727) {
		case 4: {
		    int i_2_ = class528_sub42.readUnsignedByte((byte) 122);
		    aClass459_1638
			= ((Class459)
			   Class443.method5321(Class459.method5563(1186567554),
					       i_2_, 1320526149));
		    if (null == aClass459_1638)
			throw new IllegalStateException("");
		    break;
		}
		case 6:
		    break;
		case 3:
		    class528_sub42.method9637((byte) -127);
		    break;
		case 5:
		    Class443.method5321(Class421.method5049(-1693325129),
					class528_sub42.readUnsignedByte((byte) 83),
					1571161697);
		    break;
		default:
		    throw new IllegalStateException("");
		case 2:
		    aBool1640 = false;
		    break;
		case 1:
		    aClass456_1636
			= ((Class456)
			   Class443.method5321(Class661
						   .method7871(-2067673856),
					       class528_sub42
						   .readUnsignedByte((byte) 27),
					       724159582));
		}
	    } else
		method1709(class528_sub42, i, 1727509954);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 27);
	    if (0 == i)
		break;
	    Class147 class147
		= ((Class147)
		   Class443.method5321(Class527.method6434(-1416044721), i,
				       1156922396));
	    if (class147 != null) {
		switch (((Class147) class147).anInt1664 * 656505727) {
		case 4: {
		    int i_3_ = class528_sub42.readUnsignedByte((byte) 98);
		    aClass459_1638
			= ((Class459)
			   Class443.method5321(Class459.method5563(756205144),
					       i_3_, 1187988781));
		    if (null == aClass459_1638)
			throw new IllegalStateException("");
		    break;
		}
		case 6:
		    break;
		case 3:
		    class528_sub42.method9637((byte) -122);
		    break;
		case 5:
		    Class443.method5321(Class421.method5049(-486007025),
					class528_sub42.readUnsignedByte((byte) 102),
					1740118400);
		    break;
		default:
		    throw new IllegalStateException("");
		case 2:
		    aBool1640 = false;
		    break;
		case 1:
		    aClass456_1636
			= ((Class456)
			   Class443.method5321(Class661
						   .method7871(-1573870291),
					       class528_sub42
						   .readUnsignedByte((byte) 119),
					       2107933988));
		}
	    } else
		method1709(class528_sub42, i, 295106950);
	}
    }
    
    abstract void method1706(ByteBuffer class528_sub42, int i);
    
    abstract void method1707(ByteBuffer class528_sub42, int i);
    
    boolean method1708() {
	if (null == aClass445_1639 || null == aClass459_1638)
	    return false;
	return true;
    }
    
    abstract void method1709(ByteBuffer class528_sub42, int i, int i_4_);
    
    static final void method1710(Class648 class648, int i) {
	Class689 class689 = Class483.method5866((byte) 112);
	String string = Class286.method3857((byte) 0);
	if (null == string)
	    string = "";
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class689.method68();
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = string;
    }
}
