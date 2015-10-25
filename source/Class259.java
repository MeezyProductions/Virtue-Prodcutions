/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;

public class Class259
{
    boolean aBool2843 = false;
    static final int anInt2844 = 10;
    LinkedList aLinkedList2845 = new LinkedList();
    String aString2846;
    
    public final String method3547(String string, int i) {
	if (((Class259) this).aLinkedList2845.isEmpty())
	    return string;
	StringBuilder stringbuilder = new StringBuilder(string.length());
	int i_0_ = string.length();
	boolean bool = false;
	for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
	    boolean bool_2_ = false;
	    char c = string.charAt(i_1_);
	    if (bool) {
		if ('>' == c)
		    bool = false;
	    } else if ('<' == c)
		bool = true;
	    else if (((Class259) this).aString2846.indexOf(c) != -1) {
		for (int i_3_ = 0;
		     i_3_ < ((Class259) this).aLinkedList2845.size(); i_3_++) {
		    Class252 class252
			= ((Class252)
			   ((Class259) this).aLinkedList2845.get(i_3_));
		    int i_4_ = ((Class252) class252).aString2798.length();
		    if (i_1_ <= i_0_ - i_4_
			&& string.substring(i_1_, i_4_ + i_1_)
			       .equals(((Class252) class252).aString2798)) {
			String string_5_;
			if (((Class252) class252).anInt2800 * 2056330941 > 0)
			    string_5_
				= (String.format
				   ("<sprite=%d,%d>",
				    (new Object[]
				     { Integer.valueOf((((Class252) class252)
							.anInt2799)
						       * -143261973),
				       Integer.valueOf(2056330941
						       * (((Class252) class252)
							  .anInt2800)) })));
			else
			    string_5_
				= (String.format
				   ("<sprite=%d>",
				    (new Object[]
				     { Integer.valueOf((((Class252) class252)
							.anInt2799)
						       * -143261973) })));
			stringbuilder.append(string_5_);
			bool_2_ = true;
			i_1_ += i_4_ - 1;
			break;
		    }
		}
	    }
	    if (!bool_2_)
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
    
    public boolean method3548(int i) {
	return ((Class259) this).aBool2843;
    }
    
    public void method3549(boolean bool, int i) {
	((Class259) this).aBool2843 = bool;
    }
    
    public final void method3550() {
	((Class259) this).aLinkedList2845.clear();
	((Class259) this).aString2846 = "";
    }
    
    public final void method3551(String string, int i) {
	Iterator iterator = ((Class259) this).aLinkedList2845.iterator();
	while (iterator.hasNext()) {
	    Class252 class252 = (Class252) iterator.next();
	    if (((Class252) class252).aString2798.equals(string)) {
		iterator.remove();
		break;
	    }
	}
    }
    
    final Class252 method3552(String string, int i) {
	Iterator iterator = ((Class259) this).aLinkedList2845.iterator();
	while (iterator.hasNext()) {
	    Class252 class252 = (Class252) iterator.next();
	    if (((Class252) class252).aString2798.equals(string))
		return class252;
	}
	return null;
    }
    
    final void method3553(short i) {
	((Class259) this).aString2846 = "";
	for (int i_6_ = 0; i_6_ < ((Class259) this).aLinkedList2845.size();
	     i_6_++) {
	    Class252 class252
		= (Class252) ((Class259) this).aLinkedList2845.get(i_6_);
	    char c = ((Class252) class252).aString2798.charAt(0);
	    if (((Class259) this).aString2846.indexOf(c) < 0) {
		StringBuilder stringbuilder = new StringBuilder();
		Class259 class259_7_ = this;
		((Class259) class259_7_).aString2846
		    = stringbuilder.append
			  (((Class259) class259_7_).aString2846).append
			  (c).toString();
	    }
	}
    }
    
    public boolean method3554() {
	return ((Class259) this).aBool2843;
    }
    
    public final void method3555(int i) {
	((Class259) this).aLinkedList2845.clear();
	((Class259) this).aString2846 = "";
    }
    
    public boolean method3556() {
	return ((Class259) this).aBool2843;
    }
    
    public boolean method3557() {
	return ((Class259) this).aBool2843;
    }
    
    public boolean method3558() {
	return ((Class259) this).aBool2843;
    }
    
    public void method3559(boolean bool) {
	((Class259) this).aBool2843 = bool;
    }
    
    public void method3560(boolean bool) {
	((Class259) this).aBool2843 = bool;
    }
    
    public void method3561(boolean bool) {
	((Class259) this).aBool2843 = bool;
    }
    
    public void method3562(boolean bool) {
	((Class259) this).aBool2843 = bool;
    }
    
    public int method3563() {
	return ((Class259) this).aLinkedList2845.size();
    }
    
    public int method3564() {
	return ((Class259) this).aLinkedList2845.size();
    }
    
    public int method3565() {
	return ((Class259) this).aLinkedList2845.size();
    }
    
    public int method3566() {
	return ((Class259) this).aLinkedList2845.size();
    }
    
    public final void method3567() {
	((Class259) this).aLinkedList2845.clear();
	((Class259) this).aString2846 = "";
    }
    
    public final void method3568() {
	((Class259) this).aLinkedList2845.clear();
	((Class259) this).aString2846 = "";
    }
    
    public final void method3569() {
	((Class259) this).aLinkedList2845.clear();
	((Class259) this).aString2846 = "";
    }
    
    public int method3570(int i) {
	return ((Class259) this).aLinkedList2845.size();
    }
    
    public final void method3571() {
	((Class259) this).aLinkedList2845.clear();
	((Class259) this).aString2846 = "";
    }
    
    final void method3572() {
	((Class259) this).aString2846 = "";
	for (int i = 0; i < ((Class259) this).aLinkedList2845.size(); i++) {
	    Class252 class252
		= (Class252) ((Class259) this).aLinkedList2845.get(i);
	    char c = ((Class252) class252).aString2798.charAt(0);
	    if (((Class259) this).aString2846.indexOf(c) < 0) {
		StringBuilder stringbuilder = new StringBuilder();
		Class259 class259_8_ = this;
		((Class259) class259_8_).aString2846
		    = stringbuilder.append
			  (((Class259) class259_8_).aString2846).append
			  (c).toString();
	    }
	}
    }
    
    public final boolean method3573(String string, int i, int i_9_,
				    int i_10_) {
	if (!string.isEmpty() && string.length() <= 10
	    && Class649.method7733(string.charAt(0), (byte) 37)) {
	    Class252 class252 = method3552(string, -1324393507);
	    if (null != class252)
		((Class259) this).aLinkedList2845.remove(class252);
	    ((Class259) this).aLinkedList2845.add(new Class252(string, i,
							       i_9_));
	    method3553((short) 8249);
	    return true;
	}
	return false;
    }
    
    final void method3574() {
	((Class259) this).aString2846 = "";
	for (int i = 0; i < ((Class259) this).aLinkedList2845.size(); i++) {
	    Class252 class252
		= (Class252) ((Class259) this).aLinkedList2845.get(i);
	    char c = ((Class252) class252).aString2798.charAt(0);
	    if (((Class259) this).aString2846.indexOf(c) < 0) {
		StringBuilder stringbuilder = new StringBuilder();
		Class259 class259_11_ = this;
		((Class259) class259_11_).aString2846
		    = stringbuilder.append
			  (((Class259) class259_11_).aString2846).append
			  (c).toString();
	    }
	}
    }
    
    final void method3575() {
	((Class259) this).aString2846 = "";
	for (int i = 0; i < ((Class259) this).aLinkedList2845.size(); i++) {
	    Class252 class252
		= (Class252) ((Class259) this).aLinkedList2845.get(i);
	    char c = ((Class252) class252).aString2798.charAt(0);
	    if (((Class259) this).aString2846.indexOf(c) < 0) {
		StringBuilder stringbuilder = new StringBuilder();
		Class259 class259_12_ = this;
		((Class259) class259_12_).aString2846
		    = stringbuilder.append
			  (((Class259) class259_12_).aString2846).append
			  (c).toString();
	    }
	}
    }
    
    public static void method3576(BitBuffer class528_sub42_sub2,
				  byte i) {
	Class528_Sub40 class528_sub40
	    = (Class528_Sub40) Class47.aClass688_541.method8034(942088827);
	if (null != class528_sub40) {
	    int i_13_ = class528_sub42_sub2.pointer * -185904669;
	    class528_sub42_sub2.writeInt(-989742563 * (((Class528_Sub40)
							  class528_sub40)
							 .anInt10639),
					   2007770152);
	    for (int i_14_ = 0;
		 (i_14_
		  < ((Class528_Sub40) class528_sub40).anInt10634 * -744654055);
		 i_14_++) {
		if (((Class528_Sub40) class528_sub40).anIntArray10636[i_14_]
		    != 0)
		    class528_sub42_sub2.writeByte((((Class528_Sub40)
						     class528_sub40)
						    .anIntArray10636[i_14_]),
						   (byte) 50);
		else {
		    try {
			int i_15_ = (((Class528_Sub40) class528_sub40)
				     .anIntArray10635[i_14_]);
			if (i_15_ == 0) {
			    Field field = (((Class528_Sub40) class528_sub40)
					   .aFieldArray10637[i_14_]);
			    int i_16_ = field.getInt(null);
			    class528_sub42_sub2.writeByte(0, (byte) 33);
			    class528_sub42_sub2.writeInt(i_16_, 2074772837);
			} else if (1 == i_15_) {
			    Field field = (((Class528_Sub40) class528_sub40)
					   .aFieldArray10637[i_14_]);
			    field.setInt(null,
					 (((Class528_Sub40) class528_sub40)
					  .anIntArray10633[i_14_]));
			    class528_sub42_sub2.writeByte(0, (byte) 85);
			} else if (2 == i_15_) {
			    Field field = (((Class528_Sub40) class528_sub40)
					   .aFieldArray10637[i_14_]);
			    int i_17_ = field.getModifiers();
			    class528_sub42_sub2.writeByte(0, (byte) -8);
			    class528_sub42_sub2.writeInt(i_17_, 2094194106);
			}
			if (i_15_ == 3) {
			    Method method = (((Class528_Sub40) class528_sub40)
					     .aMethodArray10638[i_14_]);
			    byte[][] is = (((Class528_Sub40) class528_sub40)
					   .aByteArrayArrayArray10640[i_14_]);
			    Object[] objects = new Object[is.length];
			    for (int i_18_ = 0; i_18_ < is.length; i_18_++) {
				ObjectInputStream objectinputstream
				    = (new ObjectInputStream
				       (new ByteArrayInputStream(is[i_18_])));
				objects[i_18_]
				    = objectinputstream.readObject();
			    }
			    Object object = method.invoke(null, objects);
			    if (null == object)
				class528_sub42_sub2.writeByte(0, (byte) 33);
			    else if (object instanceof Number) {
				class528_sub42_sub2.writeByte(1, (byte) -20);
				class528_sub42_sub2
				    .method9606(((Number) object).longValue());
			    } else if (object instanceof String) {
				class528_sub42_sub2.writeByte(2, (byte) -18);
				class528_sub42_sub2.writeString((String) object,
							       -1936289654);
			    } else
				class528_sub42_sub2.writeByte(4, (byte) -99);
			} else if (i_15_ == 4) {
			    Method method = (((Class528_Sub40) class528_sub40)
					     .aMethodArray10638[i_14_]);
			    int i_19_ = method.getModifiers();
			    class528_sub42_sub2.writeByte(0, (byte) -21);
			    class528_sub42_sub2.writeInt(i_19_, 2102841459);
			}
		    } catch (ClassNotFoundException classnotfoundexception) {
			class528_sub42_sub2.writeByte(-10, (byte) -28);
		    } catch (InvalidClassException invalidclassexception) {
			class528_sub42_sub2.writeByte(-11, (byte) -71);
		    } catch (StreamCorruptedException streamcorruptedexception) {
			class528_sub42_sub2.writeByte(-12, (byte) 78);
		    } catch (OptionalDataException optionaldataexception) {
			class528_sub42_sub2.writeByte(-13, (byte) -72);
		    } catch (IllegalAccessException illegalaccessexception) {
			class528_sub42_sub2.writeByte(-14, (byte) 58);
		    } catch (IllegalArgumentException illegalargumentexception) {
			class528_sub42_sub2.writeByte(-15, (byte) -45);
		    } catch (InvocationTargetException invocationtargetexception) {
			class528_sub42_sub2.writeByte(-16, (byte) 40);
		    } catch (SecurityException securityexception) {
			class528_sub42_sub2.writeByte(-17, (byte) -10);
		    } catch (IOException ioexception) {
			class528_sub42_sub2.writeByte(-18, (byte) -84);
		    } catch (NullPointerException nullpointerexception) {
			class528_sub42_sub2.writeByte(-19, (byte) -68);
		    } catch (Exception exception) {
			class528_sub42_sub2.writeByte(-20, (byte) 10);
		    } catch (Throwable throwable) {
			class528_sub42_sub2.writeByte(-21, (byte) 6);
		    }
		}
	    }
	    class528_sub42_sub2.addCRC(i_13_, -89539506);
	    class528_sub40.method6443(314271427);
	}
    }
    
    static final void method3577(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class377.method4708(class229, class226, class648, -1743028038);
    }
    
    static final void method3578(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub24_10577
		  .method10014(-1824619963);
    }
    
    public static Class537 method3579(Component component, boolean bool,
				      int i) {
	return new Class537_Sub1(component, bool);
    }
}
