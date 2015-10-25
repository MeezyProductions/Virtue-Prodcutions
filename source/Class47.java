/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class47
{
    static Class688 aClass688_541 = new Class688();
    
    public static boolean method866() {
	Class528_Sub40 class528_sub40
	    = (Class528_Sub40) aClass688_541.method8034(1289191266);
	if (null == class528_sub40)
	    return false;
	return true;
    }
    
    public static boolean method867() {
	Class528_Sub40 class528_sub40
	    = (Class528_Sub40) aClass688_541.method8034(2044180548);
	if (null == class528_sub40)
	    return false;
	return true;
    }
    
    public static boolean method868() {
	Class528_Sub40 class528_sub40
	    = (Class528_Sub40) aClass688_541.method8034(1404290139);
	if (null == class528_sub40)
	    return false;
	return true;
    }
    
    public static boolean method869() {
	Class528_Sub40 class528_sub40
	    = (Class528_Sub40) aClass688_541.method8034(608974657);
	if (null == class528_sub40)
	    return false;
	return true;
    }
    
    public static boolean method870() {
	Class528_Sub40 class528_sub40
	    = (Class528_Sub40) aClass688_541.method8034(1795754428);
	if (null == class528_sub40)
	    return false;
	return true;
    }
    
    Class47() throws Throwable {
	throw new Error();
    }
    
    public static void method871(ByteBuffer class528_sub42, int i) {
	Class528_Sub40 class528_sub40 = new Class528_Sub40();
	((Class528_Sub40) class528_sub40).anInt10634
	    = class528_sub42.readUnsignedByte((byte) 70) * 2003022121;
	((Class528_Sub40) class528_sub40).anInt10639
	    = class528_sub42.readInt(-221559618) * -1253255115;
	((Class528_Sub40) class528_sub40).anIntArray10635
	    = (new int
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).anIntArray10636
	    = (new int
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).aFieldArray10637
	    = (new Field
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).anIntArray10633
	    = (new int
	       [((Class528_Sub40) class528_sub40).anInt10634 * -744654055]);
	((Class528_Sub40) class528_sub40).aMethodArray10638
	    = (new Method
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).aByteArrayArrayArray10640
	    = (new byte
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634][]
	       []);
	for (int i_0_ = 0;
	     i_0_ < -744654055 * ((Class528_Sub40) class528_sub40).anInt10634;
	     i_0_++) {
	    try {
		int i_1_ = class528_sub42.readUnsignedByte((byte) 14);
		if (0 == i_1_ || 1 == i_1_ || i_1_ == 2) {
		    String string = class528_sub42.readString(301364690);
		    String string_2_ = class528_sub42.readString(91959337);
		    int i_3_ = 0;
		    if (1 == i_1_)
			i_3_ = class528_sub42.readInt(306093617);
		    ((Class528_Sub40) class528_sub40).anIntArray10635[i_0_]
			= i_1_;
		    ((Class528_Sub40) class528_sub40).anIntArray10633[i_0_]
			= i_3_;
		    if (Class285_Sub1.method8989(string, 1402433125)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    ((Class528_Sub40) class528_sub40).aFieldArray10637[i_0_]
			= Class285_Sub1.method8989(string, 474125973)
			      .getDeclaredField(string_2_);
		} else if (3 == i_1_ || i_1_ == 4) {
		    String string = class528_sub42.readString(1590568828);
		    String string_4_ = class528_sub42.readString(-43761232);
		    int i_5_ = class528_sub42.readUnsignedByte((byte) 101);
		    String[] strings = new String[i_5_];
		    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
			strings[i_6_] = class528_sub42.readString(2061415339);
		    String string_7_ = class528_sub42.readString(-17935634);
		    byte[][] is = new byte[i_5_][];
		    if (i_1_ == 3) {
			for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
			    int i_9_ = class528_sub42.readInt(1134793370);
			    is[i_8_] = new byte[i_9_];
			    class528_sub42.method9718(is[i_8_], 0, i_9_,
						      -1456124512);
			}
		    }
		    ((Class528_Sub40) class528_sub40).anIntArray10635[i_0_]
			= i_1_;
		    Class[] var_classes = new Class[i_5_];
		    for (int i_10_ = 0; i_10_ < i_5_; i_10_++)
			var_classes[i_10_]
			    = Class285_Sub1.method8989(strings[i_10_],
						       1245767022);
		    Class var_class
			= Class285_Sub1.method8989(string_7_, -691203954);
		    if (Class285_Sub1.method8989(string, -1077040477)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods
			= Class285_Sub1.method8989(string, 1361845698)
			      .getDeclaredMethods();
		    Method[] methods_11_ = methods;
		    for (int i_12_ = 0; i_12_ < methods_11_.length; i_12_++) {
			Method method = methods_11_[i_12_];
			if (method.getName().equals(string_4_)) {
			    Class[] var_classes_13_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_13_.length) {
				boolean bool = true;
				for (int i_14_ = 0; i_14_ < var_classes.length;
				     i_14_++) {
				    if (var_classes_13_[i_14_]
					!= var_classes[i_14_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    ((Class528_Sub40) class528_sub40)
					.aMethodArray10638[i_0_]
					= method;
			    }
			}
		    }
		    ((Class528_Sub40) class528_sub40)
			.aByteArrayArrayArray10640[i_0_]
			= is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_0_] = -1;
	    } catch (SecurityException securityexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_0_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_0_] = -3;
	    } catch (Exception exception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_0_] = -4;
	    } catch (Throwable throwable) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_0_] = -5;
	    }
	}
	aClass688_541.method8031(class528_sub40, (byte) -59);
    }
    
    public static void method872(ByteBuffer class528_sub42, int i) {
	Class528_Sub40 class528_sub40 = new Class528_Sub40();
	((Class528_Sub40) class528_sub40).anInt10634
	    = class528_sub42.readUnsignedByte((byte) 70) * 2003022121;
	((Class528_Sub40) class528_sub40).anInt10639
	    = class528_sub42.readInt(-685454445) * -1253255115;
	((Class528_Sub40) class528_sub40).anIntArray10635
	    = (new int
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).anIntArray10636
	    = (new int
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).aFieldArray10637
	    = (new Field
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).anIntArray10633
	    = (new int
	       [((Class528_Sub40) class528_sub40).anInt10634 * -744654055]);
	((Class528_Sub40) class528_sub40).aMethodArray10638
	    = (new Method
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).aByteArrayArrayArray10640
	    = (new byte
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634][]
	       []);
	for (int i_15_ = 0;
	     i_15_ < -744654055 * ((Class528_Sub40) class528_sub40).anInt10634;
	     i_15_++) {
	    try {
		int i_16_ = class528_sub42.readUnsignedByte((byte) 72);
		if (0 == i_16_ || 1 == i_16_ || i_16_ == 2) {
		    String string = class528_sub42.readString(237051132);
		    String string_17_ = class528_sub42.readString(1343790056);
		    int i_18_ = 0;
		    if (1 == i_16_)
			i_18_ = class528_sub42.readInt(-1111356917);
		    ((Class528_Sub40) class528_sub40).anIntArray10635[i_15_]
			= i_16_;
		    ((Class528_Sub40) class528_sub40).anIntArray10633[i_15_]
			= i_18_;
		    if (Class285_Sub1.method8989(string, -1055976084)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    ((Class528_Sub40) class528_sub40).aFieldArray10637[i_15_]
			= Class285_Sub1.method8989(string, 1347043684)
			      .getDeclaredField(string_17_);
		} else if (3 == i_16_ || i_16_ == 4) {
		    String string = class528_sub42.readString(1495024930);
		    String string_19_ = class528_sub42.readString(996159125);
		    int i_20_ = class528_sub42.readUnsignedByte((byte) 23);
		    String[] strings = new String[i_20_];
		    for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
			strings[i_21_] = class528_sub42.readString(14286892);
		    String string_22_ = class528_sub42.readString(1603282200);
		    byte[][] is = new byte[i_20_][];
		    if (i_16_ == 3) {
			for (int i_23_ = 0; i_23_ < i_20_; i_23_++) {
			    int i_24_ = class528_sub42.readInt(-1111991434);
			    is[i_23_] = new byte[i_24_];
			    class528_sub42.method9718(is[i_23_], 0, i_24_,
						      -1456124512);
			}
		    }
		    ((Class528_Sub40) class528_sub40).anIntArray10635[i_15_]
			= i_16_;
		    Class[] var_classes = new Class[i_20_];
		    for (int i_25_ = 0; i_25_ < i_20_; i_25_++)
			var_classes[i_25_]
			    = Class285_Sub1.method8989(strings[i_25_],
						       2055745932);
		    Class var_class
			= Class285_Sub1.method8989(string_22_, 961264642);
		    if (Class285_Sub1.method8989(string, -918405185)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods
			= Class285_Sub1.method8989(string, 2130544318)
			      .getDeclaredMethods();
		    Method[] methods_26_ = methods;
		    for (int i_27_ = 0; i_27_ < methods_26_.length; i_27_++) {
			Method method = methods_26_[i_27_];
			if (method.getName().equals(string_19_)) {
			    Class[] var_classes_28_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_28_.length) {
				boolean bool = true;
				for (int i_29_ = 0; i_29_ < var_classes.length;
				     i_29_++) {
				    if (var_classes_28_[i_29_]
					!= var_classes[i_29_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    ((Class528_Sub40) class528_sub40)
					.aMethodArray10638[i_15_]
					= method;
			    }
			}
		    }
		    ((Class528_Sub40) class528_sub40)
			.aByteArrayArrayArray10640[i_15_]
			= is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_15_] = -1;
	    } catch (SecurityException securityexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_15_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_15_] = -3;
	    } catch (Exception exception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_15_] = -4;
	    } catch (Throwable throwable) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_15_] = -5;
	    }
	}
	aClass688_541.method8031(class528_sub40, (byte) 51);
    }
    
    public static void method873(ByteBuffer class528_sub42, int i) {
	Class528_Sub40 class528_sub40 = new Class528_Sub40();
	((Class528_Sub40) class528_sub40).anInt10634
	    = class528_sub42.readUnsignedByte((byte) 103) * 2003022121;
	((Class528_Sub40) class528_sub40).anInt10639
	    = class528_sub42.readInt(-1657230119) * -1253255115;
	((Class528_Sub40) class528_sub40).anIntArray10635
	    = (new int
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).anIntArray10636
	    = (new int
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).aFieldArray10637
	    = (new Field
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).anIntArray10633
	    = (new int
	       [((Class528_Sub40) class528_sub40).anInt10634 * -744654055]);
	((Class528_Sub40) class528_sub40).aMethodArray10638
	    = (new Method
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).aByteArrayArrayArray10640
	    = (new byte
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634][]
	       []);
	for (int i_30_ = 0;
	     i_30_ < -744654055 * ((Class528_Sub40) class528_sub40).anInt10634;
	     i_30_++) {
	    try {
		int i_31_ = class528_sub42.readUnsignedByte((byte) 123);
		if (0 == i_31_ || 1 == i_31_ || i_31_ == 2) {
		    String string = class528_sub42.readString(1103043900);
		    String string_32_ = class528_sub42.readString(1576871226);
		    int i_33_ = 0;
		    if (1 == i_31_)
			i_33_ = class528_sub42.readInt(-1077033050);
		    ((Class528_Sub40) class528_sub40).anIntArray10635[i_30_]
			= i_31_;
		    ((Class528_Sub40) class528_sub40).anIntArray10633[i_30_]
			= i_33_;
		    if (Class285_Sub1.method8989(string, 1087096275)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    ((Class528_Sub40) class528_sub40).aFieldArray10637[i_30_]
			= Class285_Sub1.method8989(string, -1238232717)
			      .getDeclaredField(string_32_);
		} else if (3 == i_31_ || i_31_ == 4) {
		    String string = class528_sub42.readString(1133589062);
		    String string_34_ = class528_sub42.readString(827255716);
		    int i_35_ = class528_sub42.readUnsignedByte((byte) 40);
		    String[] strings = new String[i_35_];
		    for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
			strings[i_36_] = class528_sub42.readString(1297737766);
		    String string_37_ = class528_sub42.readString(1031248256);
		    byte[][] is = new byte[i_35_][];
		    if (i_31_ == 3) {
			for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
			    int i_39_ = class528_sub42.readInt(-127034412);
			    is[i_38_] = new byte[i_39_];
			    class528_sub42.method9718(is[i_38_], 0, i_39_,
						      -1456124512);
			}
		    }
		    ((Class528_Sub40) class528_sub40).anIntArray10635[i_30_]
			= i_31_;
		    Class[] var_classes = new Class[i_35_];
		    for (int i_40_ = 0; i_40_ < i_35_; i_40_++)
			var_classes[i_40_]
			    = Class285_Sub1.method8989(strings[i_40_],
						       925026824);
		    Class var_class
			= Class285_Sub1.method8989(string_37_, 1563157061);
		    if (Class285_Sub1.method8989(string, -602998939)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods
			= Class285_Sub1.method8989(string, 1531690265)
			      .getDeclaredMethods();
		    Method[] methods_41_ = methods;
		    for (int i_42_ = 0; i_42_ < methods_41_.length; i_42_++) {
			Method method = methods_41_[i_42_];
			if (method.getName().equals(string_34_)) {
			    Class[] var_classes_43_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_43_.length) {
				boolean bool = true;
				for (int i_44_ = 0; i_44_ < var_classes.length;
				     i_44_++) {
				    if (var_classes_43_[i_44_]
					!= var_classes[i_44_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    ((Class528_Sub40) class528_sub40)
					.aMethodArray10638[i_30_]
					= method;
			    }
			}
		    }
		    ((Class528_Sub40) class528_sub40)
			.aByteArrayArrayArray10640[i_30_]
			= is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_30_] = -1;
	    } catch (SecurityException securityexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_30_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_30_] = -3;
	    } catch (Exception exception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_30_] = -4;
	    } catch (Throwable throwable) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_30_] = -5;
	    }
	}
	aClass688_541.method8031(class528_sub40, (byte) 38);
    }
    
    public static void method874(ByteBuffer class528_sub42, int i) {
	Class528_Sub40 class528_sub40 = new Class528_Sub40();
	((Class528_Sub40) class528_sub40).anInt10634
	    = class528_sub42.readUnsignedByte((byte) 20) * 2003022121;
	((Class528_Sub40) class528_sub40).anInt10639
	    = class528_sub42.readInt(-1438444553) * -1253255115;
	((Class528_Sub40) class528_sub40).anIntArray10635
	    = (new int
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).anIntArray10636
	    = (new int
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).aFieldArray10637
	    = (new Field
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).anIntArray10633
	    = (new int
	       [((Class528_Sub40) class528_sub40).anInt10634 * -744654055]);
	((Class528_Sub40) class528_sub40).aMethodArray10638
	    = (new Method
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).aByteArrayArrayArray10640
	    = (new byte
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634][]
	       []);
	for (int i_45_ = 0;
	     i_45_ < -744654055 * ((Class528_Sub40) class528_sub40).anInt10634;
	     i_45_++) {
	    try {
		int i_46_ = class528_sub42.readUnsignedByte((byte) 80);
		if (0 == i_46_ || 1 == i_46_ || i_46_ == 2) {
		    String string = class528_sub42.readString(2049529561);
		    String string_47_ = class528_sub42.readString(1676543552);
		    int i_48_ = 0;
		    if (1 == i_46_)
			i_48_ = class528_sub42.readInt(954353130);
		    ((Class528_Sub40) class528_sub40).anIntArray10635[i_45_]
			= i_46_;
		    ((Class528_Sub40) class528_sub40).anIntArray10633[i_45_]
			= i_48_;
		    if (Class285_Sub1.method8989(string, -338724460)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    ((Class528_Sub40) class528_sub40).aFieldArray10637[i_45_]
			= Class285_Sub1.method8989(string, 525376708)
			      .getDeclaredField(string_47_);
		} else if (3 == i_46_ || i_46_ == 4) {
		    String string = class528_sub42.readString(81562057);
		    String string_49_ = class528_sub42.readString(1112583578);
		    int i_50_ = class528_sub42.readUnsignedByte((byte) 44);
		    String[] strings = new String[i_50_];
		    for (int i_51_ = 0; i_51_ < i_50_; i_51_++)
			strings[i_51_] = class528_sub42.readString(2042587213);
		    String string_52_ = class528_sub42.readString(1061080267);
		    byte[][] is = new byte[i_50_][];
		    if (i_46_ == 3) {
			for (int i_53_ = 0; i_53_ < i_50_; i_53_++) {
			    int i_54_ = class528_sub42.readInt(-2021561704);
			    is[i_53_] = new byte[i_54_];
			    class528_sub42.method9718(is[i_53_], 0, i_54_,
						      -1456124512);
			}
		    }
		    ((Class528_Sub40) class528_sub40).anIntArray10635[i_45_]
			= i_46_;
		    Class[] var_classes = new Class[i_50_];
		    for (int i_55_ = 0; i_55_ < i_50_; i_55_++)
			var_classes[i_55_]
			    = Class285_Sub1.method8989(strings[i_55_],
						       -791370120);
		    Class var_class
			= Class285_Sub1.method8989(string_52_, 1302298506);
		    if (Class285_Sub1.method8989(string, -878778177)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods
			= Class285_Sub1.method8989(string, -866632175)
			      .getDeclaredMethods();
		    Method[] methods_56_ = methods;
		    for (int i_57_ = 0; i_57_ < methods_56_.length; i_57_++) {
			Method method = methods_56_[i_57_];
			if (method.getName().equals(string_49_)) {
			    Class[] var_classes_58_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_58_.length) {
				boolean bool = true;
				for (int i_59_ = 0; i_59_ < var_classes.length;
				     i_59_++) {
				    if (var_classes_58_[i_59_]
					!= var_classes[i_59_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    ((Class528_Sub40) class528_sub40)
					.aMethodArray10638[i_45_]
					= method;
			    }
			}
		    }
		    ((Class528_Sub40) class528_sub40)
			.aByteArrayArrayArray10640[i_45_]
			= is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_45_] = -1;
	    } catch (SecurityException securityexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_45_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_45_] = -3;
	    } catch (Exception exception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_45_] = -4;
	    } catch (Throwable throwable) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_45_] = -5;
	    }
	}
	aClass688_541.method8031(class528_sub40, (byte) -19);
    }
    
    public static void method875(ByteBuffer class528_sub42, int i) {
	Class528_Sub40 class528_sub40 = new Class528_Sub40();
	((Class528_Sub40) class528_sub40).anInt10634
	    = class528_sub42.readUnsignedByte((byte) 27) * 2003022121;
	((Class528_Sub40) class528_sub40).anInt10639
	    = class528_sub42.readInt(-699122503) * -1253255115;
	((Class528_Sub40) class528_sub40).anIntArray10635
	    = (new int
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).anIntArray10636
	    = (new int
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).aFieldArray10637
	    = (new Field
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).anIntArray10633
	    = (new int
	       [((Class528_Sub40) class528_sub40).anInt10634 * -744654055]);
	((Class528_Sub40) class528_sub40).aMethodArray10638
	    = (new Method
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634]);
	((Class528_Sub40) class528_sub40).aByteArrayArrayArray10640
	    = (new byte
	       [-744654055 * ((Class528_Sub40) class528_sub40).anInt10634][]
	       []);
	for (int i_60_ = 0;
	     i_60_ < -744654055 * ((Class528_Sub40) class528_sub40).anInt10634;
	     i_60_++) {
	    try {
		int i_61_ = class528_sub42.readUnsignedByte((byte) 62);
		if (0 == i_61_ || 1 == i_61_ || i_61_ == 2) {
		    String string = class528_sub42.readString(1644563345);
		    String string_62_ = class528_sub42.readString(634071704);
		    int i_63_ = 0;
		    if (1 == i_61_)
			i_63_ = class528_sub42.readInt(521485520);
		    ((Class528_Sub40) class528_sub40).anIntArray10635[i_60_]
			= i_61_;
		    ((Class528_Sub40) class528_sub40).anIntArray10633[i_60_]
			= i_63_;
		    if (Class285_Sub1.method8989(string, -821451629)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    ((Class528_Sub40) class528_sub40).aFieldArray10637[i_60_]
			= Class285_Sub1.method8989(string, 1213438745)
			      .getDeclaredField(string_62_);
		} else if (3 == i_61_ || i_61_ == 4) {
		    String string = class528_sub42.readString(1287376640);
		    String string_64_ = class528_sub42.readString(1792876861);
		    int i_65_ = class528_sub42.readUnsignedByte((byte) 70);
		    String[] strings = new String[i_65_];
		    for (int i_66_ = 0; i_66_ < i_65_; i_66_++)
			strings[i_66_] = class528_sub42.readString(153636381);
		    String string_67_ = class528_sub42.readString(1152215681);
		    byte[][] is = new byte[i_65_][];
		    if (i_61_ == 3) {
			for (int i_68_ = 0; i_68_ < i_65_; i_68_++) {
			    int i_69_ = class528_sub42.readInt(805280944);
			    is[i_68_] = new byte[i_69_];
			    class528_sub42.method9718(is[i_68_], 0, i_69_,
						      -1456124512);
			}
		    }
		    ((Class528_Sub40) class528_sub40).anIntArray10635[i_60_]
			= i_61_;
		    Class[] var_classes = new Class[i_65_];
		    for (int i_70_ = 0; i_70_ < i_65_; i_70_++)
			var_classes[i_70_]
			    = Class285_Sub1.method8989(strings[i_70_],
						       587252502);
		    Class var_class
			= Class285_Sub1.method8989(string_67_, -584532497);
		    if (Class285_Sub1.method8989(string, -88202325)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods
			= Class285_Sub1.method8989(string, 252010214)
			      .getDeclaredMethods();
		    Method[] methods_71_ = methods;
		    for (int i_72_ = 0; i_72_ < methods_71_.length; i_72_++) {
			Method method = methods_71_[i_72_];
			if (method.getName().equals(string_64_)) {
			    Class[] var_classes_73_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_73_.length) {
				boolean bool = true;
				for (int i_74_ = 0; i_74_ < var_classes.length;
				     i_74_++) {
				    if (var_classes_73_[i_74_]
					!= var_classes[i_74_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    ((Class528_Sub40) class528_sub40)
					.aMethodArray10638[i_60_]
					= method;
			    }
			}
		    }
		    ((Class528_Sub40) class528_sub40)
			.aByteArrayArrayArray10640[i_60_]
			= is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_60_] = -1;
	    } catch (SecurityException securityexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_60_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_60_] = -3;
	    } catch (Exception exception) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_60_] = -4;
	    } catch (Throwable throwable) {
		((Class528_Sub40) class528_sub40).anIntArray10636[i_60_] = -5;
	    }
	}
	aClass688_541.method8031(class528_sub40, (byte) 16);
    }
    
    public static void method876(BitBuffer class528_sub42_sub2) {
	Class528_Sub40 class528_sub40
	    = (Class528_Sub40) aClass688_541.method8034(1043902076);
	if (null != class528_sub40) {
	    int i = class528_sub42_sub2.pointer * -185904669;
	    class528_sub42_sub2.writeInt(-989742563 * (((Class528_Sub40)
							  class528_sub40)
							 .anInt10639),
					   2136183793);
	    for (int i_75_ = 0;
		 (i_75_
		  < ((Class528_Sub40) class528_sub40).anInt10634 * -744654055);
		 i_75_++) {
		if (((Class528_Sub40) class528_sub40).anIntArray10636[i_75_]
		    != 0)
		    class528_sub42_sub2.writeByte((((Class528_Sub40)
						     class528_sub40)
						    .anIntArray10636[i_75_]),
						   (byte) 40);
		else {
		    try {
			int i_76_ = (((Class528_Sub40) class528_sub40)
				     .anIntArray10635[i_75_]);
			if (i_76_ == 0) {
			    Field field = (((Class528_Sub40) class528_sub40)
					   .aFieldArray10637[i_75_]);
			    int i_77_ = field.getInt(null);
			    class528_sub42_sub2.writeByte(0, (byte) -106);
			    class528_sub42_sub2.writeInt(i_77_, 2054866099);
			} else if (1 == i_76_) {
			    Field field = (((Class528_Sub40) class528_sub40)
					   .aFieldArray10637[i_75_]);
			    field.setInt(null,
					 (((Class528_Sub40) class528_sub40)
					  .anIntArray10633[i_75_]));
			    class528_sub42_sub2.writeByte(0, (byte) -44);
			} else if (2 == i_76_) {
			    Field field = (((Class528_Sub40) class528_sub40)
					   .aFieldArray10637[i_75_]);
			    int i_78_ = field.getModifiers();
			    class528_sub42_sub2.writeByte(0, (byte) -24);
			    class528_sub42_sub2.writeInt(i_78_, 2124258134);
			}
			if (i_76_ == 3) {
			    Method method = (((Class528_Sub40) class528_sub40)
					     .aMethodArray10638[i_75_]);
			    byte[][] is = (((Class528_Sub40) class528_sub40)
					   .aByteArrayArrayArray10640[i_75_]);
			    Object[] objects = new Object[is.length];
			    for (int i_79_ = 0; i_79_ < is.length; i_79_++) {
				ObjectInputStream objectinputstream
				    = (new ObjectInputStream
				       (new ByteArrayInputStream(is[i_79_])));
				objects[i_79_]
				    = objectinputstream.readObject();
			    }
			    Object object = method.invoke(null, objects);
			    if (null == object)
				class528_sub42_sub2.writeByte(0, (byte) -10);
			    else if (object instanceof Number) {
				class528_sub42_sub2.writeByte(1, (byte) 43);
				class528_sub42_sub2
				    .method9606(((Number) object).longValue());
			    } else if (object instanceof String) {
				class528_sub42_sub2.writeByte(2, (byte) 39);
				class528_sub42_sub2.writeString((String) object,
							       -1936289654);
			    } else
				class528_sub42_sub2.writeByte(4, (byte) -40);
			} else if (i_76_ == 4) {
			    Method method = (((Class528_Sub40) class528_sub40)
					     .aMethodArray10638[i_75_]);
			    int i_80_ = method.getModifiers();
			    class528_sub42_sub2.writeByte(0, (byte) 38);
			    class528_sub42_sub2.writeInt(i_80_, 2132426105);
			}
		    } catch (ClassNotFoundException classnotfoundexception) {
			class528_sub42_sub2.writeByte(-10, (byte) -3);
		    } catch (InvalidClassException invalidclassexception) {
			class528_sub42_sub2.writeByte(-11, (byte) 18);
		    } catch (StreamCorruptedException streamcorruptedexception) {
			class528_sub42_sub2.writeByte(-12, (byte) 25);
		    } catch (OptionalDataException optionaldataexception) {
			class528_sub42_sub2.writeByte(-13, (byte) -76);
		    } catch (IllegalAccessException illegalaccessexception) {
			class528_sub42_sub2.writeByte(-14, (byte) 27);
		    } catch (IllegalArgumentException illegalargumentexception) {
			class528_sub42_sub2.writeByte(-15, (byte) 10);
		    } catch (InvocationTargetException invocationtargetexception) {
			class528_sub42_sub2.writeByte(-16, (byte) 80);
		    } catch (SecurityException securityexception) {
			class528_sub42_sub2.writeByte(-17, (byte) -32);
		    } catch (IOException ioexception) {
			class528_sub42_sub2.writeByte(-18, (byte) 13);
		    } catch (NullPointerException nullpointerexception) {
			class528_sub42_sub2.writeByte(-19, (byte) 28);
		    } catch (Exception exception) {
			class528_sub42_sub2.writeByte(-20, (byte) 67);
		    } catch (Throwable throwable) {
			class528_sub42_sub2.writeByte(-21, (byte) 21);
		    }
		}
	    }
	    class528_sub42_sub2.addCRC(i, -1788838127);
	    class528_sub40.method6443(1412177600);
	}
    }
    
    static final void method877(Class648 class648, byte i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub11_10603,
	     ((((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	      == 1) ? 1 : 0,
	     1287581632);
	Class243.method3387(2144126903);
	client.aBool11161 = false;
    }
    
    static final void method878(Class173 class173, Class165 class165, int i) {
	if (Class518_Sub1.anInt10685 * -962898353 != 100
	    && Class518_Sub1.aClass528_Sub21_Sub17_7017 != null) {
	    Class249.method3417(2072294157);
	    Class249.method3417(1940258434);
	    if (-962898353 * Class518_Sub1.anInt10685 < 10) {
		for (int i_81_ = 0;
		     i_81_ < Class518_Sub1.aClass172ArrayArray10697.length;
		     i_81_++) {
		    for (int i_82_ = 0;
			 i_82_ < (Class518_Sub1.aClass172ArrayArray10697
				  [i_81_]).length;
			 i_82_++) {
			Class623_Sub1.aClass446_10671.method5357
			    ((Class518_Sub1.aClass615_6979.anIntArrayArray8030
			      [i_81_][i_82_]),
			     (short) 5876);
			Class637.aClass446_8250.method5357
			    ((Class518_Sub1.aClass615_6979.anIntArrayArray8030
			      [i_81_][i_82_]),
			     (short) 8464);
		    }
		}
		if (!Class518_Sub1.aClass446_7006.method5367
		     (Class518_Sub1.aClass528_Sub21_Sub17_7017.aString11639,
		      (byte) 91)) {
		    Class518_Sub1.anInt10685
			= (Class43.aClass446_530.method5388
			   ((Class518_Sub1.aClass528_Sub21_Sub17_7017
			     .aString11639),
			    -537562308)) / 10 * -483393361;
		    return;
		}
		Class518_Sub1.anInt10685 = -538966314;
	    }
	    if (10 == Class518_Sub1.anInt10685 * -962898353) {
		Class518_Sub1.anInt6972
		    = (Class518_Sub1.aClass528_Sub21_Sub17_7017.anInt11643
		       * -1138033051) >> 6 << 6;
		Class518_Sub1.anInt6995
		    = (Class518_Sub1.aClass528_Sub21_Sub17_7017.anInt11645
		       * 1798192673) >> 6 << 6;
		Class518_Sub1.anInt6982
		    = 64 + ((-1495150719 * (Class518_Sub1
					    .aClass528_Sub21_Sub17_7017
					    .anInt11646)
			     >> 6 << 6)
			    - Class518_Sub1.anInt6972);
		Class518_Sub1.anInt6997
		    = ((Class518_Sub1.aClass528_Sub21_Sub17_7017.anInt11636
			* 1067701203)
		       >> 6 << 6) - Class518_Sub1.anInt6995 + 64;
		int[] is = new int[3];
		int i_83_ = -1;
		int i_84_ = -1;
		Class422 class422
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868);
		Class578 class578
		    = client.aClass495_10935.method5966(1273279609);
		if (Class518_Sub1.aClass528_Sub21_Sub17_7017.method10589
		    (Class108.myPlayer.aByte10675,
		     (((int) class422.aFloat4780 >> 9)
		      + 961465569 * class578.anInt7607),
		     (-173815201 * class578.anInt7608
		      + ((int) class422.aFloat4777 >> 9)),
		     is, (byte) 50)) {
		    i_83_ = is[1] - Class518_Sub1.anInt6972;
		    i_84_ = is[2] - Class518_Sub1.anInt6995;
		}
		if (!Class518_Sub1.aBool10691 && i_83_ >= 0
		    && i_83_ < Class518_Sub1.anInt6982 && i_84_ >= 0
		    && i_84_ < Class518_Sub1.anInt6997) {
		    i_83_ += (int) (Math.random() * 10.0) - 5;
		    i_84_ += (int) (Math.random() * 10.0) - 5;
		    Class200_Sub1.anInt9820 = i_83_ * 7573341;
		    Class98.anInt1256 = i_84_ * -1406821639;
		} else if (Class518_Sub1.anInt10689 * 1002547247 != -1
			   && Class518_Sub1.anInt10690 * 2018642665 != -1) {
		    Class518_Sub1.aClass528_Sub21_Sub17_7017.method10586
			(Class518_Sub1.anInt10689 * 1002547247,
			 Class518_Sub1.anInt10690 * 2018642665, is, -95656336);
		    if (is != null) {
			Class200_Sub1.anInt9820
			    = 7573341 * (is[1] - Class518_Sub1.anInt6972);
			Class98.anInt1256
			    = -1406821639 * (is[2] - Class518_Sub1.anInt6995);
		    }
		    Class518_Sub1.anInt10690 = 686985895;
		    Class518_Sub1.anInt10689 = -505716431;
		    Class518_Sub1.aBool10691 = false;
		} else {
		    Class518_Sub1.aClass528_Sub21_Sub17_7017.method10586
			((Class518_Sub1.aClass528_Sub21_Sub17_7017.anInt11640
			  * 840850175) >> 14 & 0x3fff,
			 840850175 * (Class518_Sub1.aClass528_Sub21_Sub17_7017
				      .anInt11640) & 0x3fff,
			 is, -1866063906);
		    Class200_Sub1.anInt9820
			= (is[1] - Class518_Sub1.anInt6972) * 7573341;
		    Class98.anInt1256
			= -1406821639 * (is[2] - Class518_Sub1.anInt6995);
		}
		if (25 == (Class518_Sub1.aClass528_Sub21_Sub17_7017.anInt11642
			   * 537517007)) {
		    Class518_Sub1.aFloat7023 = 2.0F;
		    Class518_Sub1.aFloat6991 = 2.0F;
		} else if ((Class518_Sub1.aClass528_Sub21_Sub17_7017.anInt11642
			    * 537517007)
			   == 37) {
		    Class518_Sub1.aFloat7023 = 3.0F;
		    Class518_Sub1.aFloat6991 = 3.0F;
		} else if (537517007 * (Class518_Sub1
					.aClass528_Sub21_Sub17_7017.anInt11642)
			   == 50) {
		    Class518_Sub1.aFloat7023 = 4.0F;
		    Class518_Sub1.aFloat6991 = 4.0F;
		} else if (75 == 537517007 * (Class518_Sub1
					      .aClass528_Sub21_Sub17_7017
					      .anInt11642)) {
		    Class518_Sub1.aFloat7023 = 6.0F;
		    Class518_Sub1.aFloat6991 = 6.0F;
		} else if ((Class518_Sub1.aClass528_Sub21_Sub17_7017.anInt11642
			    * 537517007)
			   == 100) {
		    Class518_Sub1.aFloat7023 = 8.0F;
		    Class518_Sub1.aFloat6991 = 8.0F;
		} else if (200 == (Class518_Sub1.aClass528_Sub21_Sub17_7017
				   .anInt11642) * 537517007) {
		    Class518_Sub1.aFloat7023 = 16.0F;
		    Class518_Sub1.aFloat6991 = 16.0F;
		} else {
		    Class518_Sub1.aFloat7023 = 8.0F;
		    Class518_Sub1.aFloat6991 = 8.0F;
		}
		Class518_Sub1.anInt6987 = (int) Class518_Sub1.aFloat6991 >> 1;
		Class518_Sub1.aByteArrayArrayArray6998
		    = Class610_Sub1.method9733(Class518_Sub1.anInt6987,
					       (byte) 1);
		Class181_Sub5.method8959(-1339785011);
		Class518_Sub1.method6286();
		Class480.aClass688_5454 = new Class688();
		Class518_Sub1.anInt7004 += (int) (Math.random() * 5.0) - 2;
		if (Class518_Sub1.anInt7004 < -8)
		    Class518_Sub1.anInt7004 = -8;
		if (Class518_Sub1.anInt7004 > 8)
		    Class518_Sub1.anInt7004 = 8;
		Class518_Sub1.anInt6985 += (int) (Math.random() * 5.0) - 2;
		if (Class518_Sub1.anInt6985 < -16)
		    Class518_Sub1.anInt6985 = -16;
		if (Class518_Sub1.anInt6985 > 16)
		    Class518_Sub1.anInt6985 = 16;
		Class518_Sub1.method6331(class165,
					 Class518_Sub1.anInt7004 >> 2 << 10,
					 Class518_Sub1.anInt6985 >> 1);
		Class518_Sub1.aClass5_Sub6_6975.method10148(1024, 256,
							    -1026009067);
		Class518_Sub1.aClass5_Sub16_6976.method10184(256, 256,
							     -1510368744);
		Class518_Sub1.aClass5_Sub15_7032.method543(4096, (byte) 71);
		Class5_Sub7.aClass5_Sub5_10838.method543(256, (byte) 99);
		Class518_Sub1.anInt10685 = -1077932628;
	    } else if (Class518_Sub1.anInt10685 * -962898353 == 20) {
		if (Class518_Sub1.aBool7007) {
		    if (Class518_Sub1.method6312(class173,
						 Class518_Sub1.anInt7004,
						 Class518_Sub1.anInt6985,
						 Class518_Sub1.aBool7007))
			Class518_Sub1.anInt10685 = 1061169412;
		} else {
		    Class43.method854(true, -29556811);
		    Class518_Sub1.method6312(class173, Class518_Sub1.anInt7004,
					     Class518_Sub1.anInt6985,
					     Class518_Sub1.aBool7007);
		    Class518_Sub1.anInt10685 = 1061169412;
		    Class43.method854(true, -29556811);
		    Class450.method5430((byte) 58);
		}
	    } else if (-962898353 * Class518_Sub1.anInt10685 == 60) {
		if (Class518_Sub1.aClass446_7006.method5358
		    (Class518_Sub1.aClass528_Sub21_Sub17_7017.aString11639,
		     (byte) -21)) {
		    if (!Class518_Sub1.aClass446_7006.method5367
			 ((Class518_Sub1.aClass528_Sub21_Sub17_7017
			   .aString11639),
			  (byte) 118))
			return;
		    Class518_Sub1.aClass533_6992
			= Class230.method3240(Class518_Sub1.aClass446_7006,
					      (Class518_Sub1
					       .aClass528_Sub21_Sub17_7017
					       .aString11639),
					      client.aBool10966, -1727295830);
		} else
		    Class518_Sub1.aClass533_6992 = new Class533(0);
		Class518_Sub1.method6296();
		Class518_Sub1.anInt10685 = 522203098;
		Class43.method854(true, -29556811);
		Class450.method5430((byte) 10);
	    } else if (-962898353 * Class518_Sub1.anInt10685 >= 70) {
		for (int i_85_ = 0; i_85_ < 3; i_85_++) {
		    for (int i_86_ = 0; i_86_ < 5; i_86_++) {
			if (null == (Class518_Sub1.aClass172ArrayArray10697
				     [i_85_][i_86_])
			    || (Class518_Sub1.aClass1ArrayArray10693[i_85_]
				[i_86_]) == null) {
			    Class518_Sub1.aClass172ArrayArray10697[i_85_]
				[i_86_]
				= ((Class172)
				   (Class625.aClass414_8129.method4936
				    (client.anInterface50_10917,
				     (Class518_Sub1.aClass615_6979
				      .anIntArrayArray8030[i_85_][i_86_]),
				     true, true, (byte) -114)));
			    Class518_Sub1.aClass1ArrayArray10693[i_85_][i_86_]
				= (Class625.aClass414_8129.method4937
				   (client.anInterface50_10917,
				    (Class518_Sub1.aClass615_6979
				     .anIntArrayArray8030[i_85_][i_86_]),
				    294274139));
			    if ((Class518_Sub1.aClass172ArrayArray10697[i_85_]
				 [i_86_]) != null
				&& (Class518_Sub1.aClass1ArrayArray10693[i_85_]
				    [i_86_]) != null)
				Class518_Sub1.anInt10685 += -1450180083;
			    else
				return;
			}
		    }
		}
		Class518_Sub1.anInt10685 = -1094695844;
		System.gc();
	    }
	}
    }
}
