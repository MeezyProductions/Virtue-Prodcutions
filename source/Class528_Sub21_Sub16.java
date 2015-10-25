/* Class528_Sub21_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub21_Sub16 extends Class528_Sub21
{
    int anInt11633;
    byte[][] aByteArrayArray11634;
    Class161[] aClass161Array11635;
    
    public boolean method10572(int i, byte i_0_) {
	return (((Class161)
		 ((Class528_Sub21_Sub16) this).aClass161Array11635[i])
		.aBool1807);
    }
    
    public boolean method10573(int i, byte i_1_) {
	return (((Class161)
		 ((Class528_Sub21_Sub16) this).aClass161Array11635[i])
		.aBool1812);
    }
    
    public boolean method10574(int i) {
	return (((Class161)
		 ((Class528_Sub21_Sub16) this).aClass161Array11635[i])
		.aBool1822);
    }
    
    public boolean method10575(int i, int i_2_) {
	return (((Class161)
		 ((Class528_Sub21_Sub16) this).aClass161Array11635[i])
		.aBool1822);
    }
    
    public Class528_Sub21_Sub16(int i) {
	((Class528_Sub21_Sub16) this).anInt11633 = i * -1247528507;
    }
    
    public boolean method10576(int i) {
	return (((Class161)
		 ((Class528_Sub21_Sub16) this).aClass161Array11635[i])
		.aBool1822);
    }
    
    public boolean method10577() {
	if (null != ((Class528_Sub21_Sub16) this).aClass161Array11635)
	    return true;
	if (((Class528_Sub21_Sub16) this).aByteArrayArray11634 == null) {
	    synchronized (Class53.aClass446_623) {
		if (!Class53.aClass446_623.method5352((((Class528_Sub21_Sub16)
							this).anInt11633
						       * 1816321293),
						      -1444726382)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is
		    = (Class53.aClass446_623.method5361
		       (1816321293 * ((Class528_Sub21_Sub16) this).anInt11633,
			(byte) 64));
		((Class528_Sub21_Sub16) this).aByteArrayArray11634
		    = new byte[is.length][];
		for (int i = 0; i < is.length; i++)
		    ((Class528_Sub21_Sub16) this).aByteArrayArray11634[i]
			= (Class53.aClass446_623.method5348
			   ((((Class528_Sub21_Sub16) this).anInt11633
			     * 1816321293),
			    is[i], -831915772));
	    }
	}
	boolean bool = true;
	for (int i = 0;
	     i < ((Class528_Sub21_Sub16) this).aByteArrayArray11634.length;
	     i++) {
	    byte[] is = ((Class528_Sub21_Sub16) this).aByteArrayArray11634[i];
	    ByteBuffer class528_sub42 = new ByteBuffer(is);
	    class528_sub42.pointer = 2015001547;
	    int i_3_ = class528_sub42.readUnsignedShort(189496284);
	    synchronized (Class376.aClass446_3941) {
		bool
		    &= Class376.aClass446_3941.method5357(i_3_, (short) -4529);
	    }
	}
	if (!bool)
	    return false;
	Class688 class688 = new Class688();
	int[] is;
	synchronized (Class53.aClass446_623) {
	    int i = Class53.aClass446_623.method5345((1816321293
						      * ((Class528_Sub21_Sub16)
							 this).anInt11633),
						     2052365111);
	    ((Class528_Sub21_Sub16) this).aClass161Array11635
		= new Class161[i];
	    is = Class53.aClass446_623.method5361((1816321293
						   * ((Class528_Sub21_Sub16)
						      this).anInt11633),
						  (byte) 11);
	}
	for (int i = 0; i < is.length; i++) {
	    byte[] is_4_
		= ((Class528_Sub21_Sub16) this).aByteArrayArray11634[i];
	    ByteBuffer class528_sub42 = new ByteBuffer(is_4_);
	    class528_sub42.pointer = 2015001547;
	    int i_5_ = class528_sub42.readUnsignedShort(123322128);
	    Class528_Sub16 class528_sub16 = null;
	    for (Class528_Sub16 class528_sub16_6_
		     = (Class528_Sub16) class688.method8034(1074047477);
		 class528_sub16_6_ != null;
		 class528_sub16_6_
		     = (Class528_Sub16) class688.method8037(-244673156)) {
		if ((((Class528_Sub16) class528_sub16_6_).anInt10375
		     * 1788016103)
		    == i_5_) {
		    class528_sub16 = class528_sub16_6_;
		    break;
		}
	    }
	    if (null == class528_sub16) {
		synchronized (Class376.aClass446_3941) {
		    class528_sub16
			= new Class528_Sub16(i_5_, (Class376.aClass446_3941
							.method5395
						    (i_5_, -1211860996)));
		}
		class688.method8031(class528_sub16, (byte) 26);
	    }
	    ((Class528_Sub21_Sub16) this).aClass161Array11635[is[i]]
		= new Class161(is_4_, class528_sub16);
	}
	((Class528_Sub21_Sub16) this).aByteArrayArray11634 = null;
	return true;
    }
    
    public boolean method10578() {
	if (null != ((Class528_Sub21_Sub16) this).aClass161Array11635)
	    return true;
	if (((Class528_Sub21_Sub16) this).aByteArrayArray11634 == null) {
	    synchronized (Class53.aClass446_623) {
		if (!Class53.aClass446_623.method5352((((Class528_Sub21_Sub16)
							this).anInt11633
						       * 1816321293),
						      -1658788607)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is
		    = (Class53.aClass446_623.method5361
		       (1816321293 * ((Class528_Sub21_Sub16) this).anInt11633,
			(byte) -16));
		((Class528_Sub21_Sub16) this).aByteArrayArray11634
		    = new byte[is.length][];
		for (int i = 0; i < is.length; i++)
		    ((Class528_Sub21_Sub16) this).aByteArrayArray11634[i]
			= (Class53.aClass446_623.method5348
			   ((((Class528_Sub21_Sub16) this).anInt11633
			     * 1816321293),
			    is[i], -1614437107));
	    }
	}
	boolean bool = true;
	for (int i = 0;
	     i < ((Class528_Sub21_Sub16) this).aByteArrayArray11634.length;
	     i++) {
	    byte[] is = ((Class528_Sub21_Sub16) this).aByteArrayArray11634[i];
	    ByteBuffer class528_sub42 = new ByteBuffer(is);
	    class528_sub42.pointer = 2015001547;
	    int i_7_ = class528_sub42.readUnsignedShort(-1682502878);
	    synchronized (Class376.aClass446_3941) {
		bool
		    &= Class376.aClass446_3941.method5357(i_7_, (short) -2806);
	    }
	}
	if (!bool)
	    return false;
	Class688 class688 = new Class688();
	int[] is;
	synchronized (Class53.aClass446_623) {
	    int i = Class53.aClass446_623.method5345((1816321293
						      * ((Class528_Sub21_Sub16)
							 this).anInt11633),
						     2052365111);
	    ((Class528_Sub21_Sub16) this).aClass161Array11635
		= new Class161[i];
	    is = Class53.aClass446_623.method5361((1816321293
						   * ((Class528_Sub21_Sub16)
						      this).anInt11633),
						  (byte) -97);
	}
	for (int i = 0; i < is.length; i++) {
	    byte[] is_8_
		= ((Class528_Sub21_Sub16) this).aByteArrayArray11634[i];
	    ByteBuffer class528_sub42 = new ByteBuffer(is_8_);
	    class528_sub42.pointer = 2015001547;
	    int i_9_ = class528_sub42.readUnsignedShort(-2038133839);
	    Class528_Sub16 class528_sub16 = null;
	    for (Class528_Sub16 class528_sub16_10_
		     = (Class528_Sub16) class688.method8034(1704446363);
		 class528_sub16_10_ != null;
		 class528_sub16_10_
		     = (Class528_Sub16) class688.method8037(-78615516)) {
		if ((((Class528_Sub16) class528_sub16_10_).anInt10375
		     * 1788016103)
		    == i_9_) {
		    class528_sub16 = class528_sub16_10_;
		    break;
		}
	    }
	    if (null == class528_sub16) {
		synchronized (Class376.aClass446_3941) {
		    class528_sub16
			= new Class528_Sub16(i_9_, (Class376.aClass446_3941
							.method5395
						    (i_9_, -217077308)));
		}
		class688.method8031(class528_sub16, (byte) 47);
	    }
	    ((Class528_Sub21_Sub16) this).aClass161Array11635[is[i]]
		= new Class161(is_8_, class528_sub16);
	}
	((Class528_Sub21_Sub16) this).aByteArrayArray11634 = null;
	return true;
    }
    
    public boolean method10579(int i) {
	if (null != ((Class528_Sub21_Sub16) this).aClass161Array11635)
	    return true;
	if (((Class528_Sub21_Sub16) this).aByteArrayArray11634 == null) {
	    synchronized (Class53.aClass446_623) {
		if (!Class53.aClass446_623.method5352((((Class528_Sub21_Sub16)
							this).anInt11633
						       * 1816321293),
						      -1440614853)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is
		    = (Class53.aClass446_623.method5361
		       (1816321293 * ((Class528_Sub21_Sub16) this).anInt11633,
			(byte) -8));
		((Class528_Sub21_Sub16) this).aByteArrayArray11634
		    = new byte[is.length][];
		for (int i_11_ = 0; i_11_ < is.length; i_11_++)
		    ((Class528_Sub21_Sub16) this).aByteArrayArray11634[i_11_]
			= (Class53.aClass446_623.method5348
			   ((((Class528_Sub21_Sub16) this).anInt11633
			     * 1816321293),
			    is[i_11_], -1343382185));
	    }
	}
	boolean bool = true;
	for (int i_12_ = 0;
	     i_12_ < ((Class528_Sub21_Sub16) this).aByteArrayArray11634.length;
	     i_12_++) {
	    byte[] is
		= ((Class528_Sub21_Sub16) this).aByteArrayArray11634[i_12_];
	    ByteBuffer class528_sub42 = new ByteBuffer(is);
	    class528_sub42.pointer = 2015001547;
	    int i_13_ = class528_sub42.readUnsignedShort(-1393102913);
	    synchronized (Class376.aClass446_3941) {
		bool
		    &= Class376.aClass446_3941.method5357(i_13_, (short) 9501);
	    }
	}
	if (!bool)
	    return false;
	Class688 class688 = new Class688();
	int[] is;
	synchronized (Class53.aClass446_623) {
	    int i_14_
		= Class53.aClass446_623.method5345((1816321293
						    * ((Class528_Sub21_Sub16)
						       this).anInt11633),
						   2052365111);
	    ((Class528_Sub21_Sub16) this).aClass161Array11635
		= new Class161[i_14_];
	    is = Class53.aClass446_623.method5361((1816321293
						   * ((Class528_Sub21_Sub16)
						      this).anInt11633),
						  (byte) 11);
	}
	for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
	    byte[] is_16_
		= ((Class528_Sub21_Sub16) this).aByteArrayArray11634[i_15_];
	    ByteBuffer class528_sub42 = new ByteBuffer(is_16_);
	    class528_sub42.pointer = 2015001547;
	    int i_17_ = class528_sub42.readUnsignedShort(-23506981);
	    Class528_Sub16 class528_sub16 = null;
	    for (Class528_Sub16 class528_sub16_18_
		     = (Class528_Sub16) class688.method8034(1324907827);
		 class528_sub16_18_ != null;
		 class528_sub16_18_
		     = (Class528_Sub16) class688.method8037(1874124365)) {
		if ((((Class528_Sub16) class528_sub16_18_).anInt10375
		     * 1788016103)
		    == i_17_) {
		    class528_sub16 = class528_sub16_18_;
		    break;
		}
	    }
	    if (null == class528_sub16) {
		synchronized (Class376.aClass446_3941) {
		    class528_sub16
			= new Class528_Sub16(i_17_, (Class376
							 .aClass446_3941
							 .method5395
						     (i_17_, -381282959)));
		}
		class688.method8031(class528_sub16, (byte) -26);
	    }
	    ((Class528_Sub21_Sub16) this).aClass161Array11635[is[i_15_]]
		= new Class161(is_16_, class528_sub16);
	}
	((Class528_Sub21_Sub16) this).aByteArrayArray11634 = null;
	return true;
    }
    
    public boolean method10580(int i) {
	return (((Class161)
		 ((Class528_Sub21_Sub16) this).aClass161Array11635[i])
		.aBool1812);
    }
    
    public boolean method10581(int i) {
	return (((Class161)
		 ((Class528_Sub21_Sub16) this).aClass161Array11635[i])
		.aBool1822);
    }
    
    public boolean method10582(int i) {
	return (((Class161)
		 ((Class528_Sub21_Sub16) this).aClass161Array11635[i])
		.aBool1822);
    }
}
