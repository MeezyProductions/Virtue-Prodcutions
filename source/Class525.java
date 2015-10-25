/* Class525 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Class525 implements Interface57
{
    Class446 aClass446_7071;
    String aString7072;
    Hashtable aHashtable7073 = new Hashtable();
    Hashtable aHashtable7074 = new Hashtable();
    public static Class5_Sub20 aClass5_Sub20_7075;
    static int anInt7076;
    
    public void method362(String string, byte i) throws Exception_Sub1 {
	method6386(string, Class535.class, -882054858);
    }
    
    public int method6384(String string, int i) throws Exception_Sub7 {
	if (((Class525) this).aHashtable7073.containsKey(string))
	    return 100;
	String string_0_ = Class267.method3674(string, -58188728);
	if (null == string_0_)
	    throw new Exception_Sub7(1, string);
	String string_1_ = null;
	if (string_1_ == null) {
	    string_1_ = new StringBuilder().append
			    (((Class525) this).aString7072).append
			    (string_0_).toString();
	    if (null == ((Class525) this).aClass446_7071
		|| !((Class525) this).aClass446_7071.method5364(string_1_, "",
								(short) 128))
		throw new Exception_Sub7(2, string);
	}
	if (!((Class525) this).aClass446_7071.method5367(string_1_, (byte) 43))
	    return ((Class525) this).aClass446_7071.method5388(string_1_,
							       2115923208);
	byte[] is = ((Class525) this).aClass446_7071.method5365(string_1_, "",
								-1072371880);
	if (is == null)
	    throw new Exception_Sub7(3, string);
	Object object = null;
	File file;
	try {
	    file = Class182.method2695(string_0_, -210983875);
	} catch (RuntimeException runtimeexception) {
	    throw new Exception_Sub7(4, string, runtimeexception);
	}
	if (null == file)
	    throw new Exception_Sub7(5, string);
	boolean bool = true;
	byte[] is_2_ = Class543.method6641(file, (byte) 31);
	if (is_2_ != null && is.length == is_2_.length) {
	    for (int i_3_ = 0; i_3_ < is_2_.length; i_3_++) {
		if (is[i_3_] != is_2_[i_3_]) {
		    bool = false;
		    break;
		}
	    }
	} else
	    bool = false;
	if (!bool) {
	    try {
		FileOutputStream fileoutputstream = new FileOutputStream(file);
		fileoutputstream.write(is, 0, is.length);
		fileoutputstream.close();
	    } catch (Throwable throwable) {
		throw new Exception_Sub7(6, string, throwable);
	    }
	}
	method6385(string, file, 899714940);
	return 100;
    }
    
    void method6385(String string, File file, int i) {
	((Class525) this).aHashtable7073.put(string, file);
    }
    
    public boolean method355(String string, int i) {
	return ((Class525) this).aHashtable7073.containsKey(string);
    }
    
    public boolean method358() {
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration = ((Class525) this).aHashtable7074.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string,
			  ((Class525) this).aHashtable7074.get(string));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_4_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_4_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = ((Class525) this).aHashtable7074.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file
			    = ((File)
			       ((Class525) this).aHashtable7073.get(string));
			Class var_class_5_
			    = ((Class)
			       ((Class525) this).aHashtable7074.get(string));
			Vector vector
			    = ((Vector)
			       field.get(var_class_5_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_6_ = object.getClass()
						     .getDeclaredField("name");
				method.invoke(field_6_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_7_
					= (String) field_6_.get(object);
				    if (null != string_7_
					&& (string_7_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_8_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_9_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_8_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_9_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_9_.invoke(object,
							     new Object[0]);
					    field_8_.set(object,
							 new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_9_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_8_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_6_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	((Class525) this).aHashtable7074 = hashtable;
	return ((Class525) this).aHashtable7074.isEmpty();
    }
    
    void method6386(String string, Class var_class, int i)
	throws Exception_Sub1 {
	Class var_class_10_
	    = (Class) ((Class525) this).aHashtable7074.get(string);
	if (null != var_class_10_
	    && var_class_10_.getClassLoader() != var_class.getClassLoader())
	    throw new Exception_Sub1(1, string);
	File file = null;
	if (null == file)
	    file = (File) ((Class525) this).aHashtable7073.get(string);
	if (null != file) {
	    try {
		file = new File(file.getCanonicalPath());
		Class var_class_11_ = Class.forName("java.lang.Runtime");
		Class var_class_12_
		    = Class.forName("java.lang.reflect.AccessibleObject");
		Method method
		    = var_class_12_.getDeclaredMethod("setAccessible",
						      (new Class[]
						       { Boolean.TYPE }));
		Method method_13_
		    = (var_class_11_.getDeclaredMethod
		       ("load0",
			new Class[] { Class.forName("java.lang.Class"),
				      Class.forName("java.lang.String") }));
		method.invoke(method_13_, new Object[] { Boolean.TRUE });
		method_13_.invoke(Runtime.getRuntime(),
				  new Object[] { var_class, file.getPath() });
		method.invoke(method_13_, new Object[] { Boolean.FALSE });
		((Class525) this).aHashtable7074.put(string, var_class);
	    } catch (NoSuchMethodException nosuchmethodexception) {
		System.load(file.getPath());
		((Class525) this).aHashtable7074.put(string, Class535.class);
	    } catch (Throwable throwable) {
		throw new Exception_Sub1(3, string, throwable);
	    }
	} else
	    throw new Exception_Sub1(4, string);
    }
    
    public Class525(Class446 class446) {
	((Class525) this).aClass446_7071 = class446;
	String string = "";
	if (Class493.aString5525.startsWith("win")
	    || Class493.aString5525.startsWith("windows 7"))
	    string = new StringBuilder().append(string).append("windows/")
			 .toString();
	else if (Class493.aString5525.startsWith("linux"))
	    string = new StringBuilder().append(string).append("linux/")
			 .toString();
	else if (Class493.aString5525.startsWith("mac"))
	    string = new StringBuilder().append(string).append("macos/")
			 .toString();
	if (Class493.aString5527.startsWith("amd64")
	    || Class493.aString5527.startsWith("x86_64"))
	    string = new StringBuilder().append(string).append("x86_64/")
			 .toString();
	else if (Class493.aString5527.startsWith("i386")
		 || Class493.aString5527.startsWith("i486")
		 || Class493.aString5527.startsWith("i586")
		 || Class493.aString5527.startsWith("x86"))
	    string
		= new StringBuilder().append(string).append("x86/").toString();
	else if (Class493.aString5527.startsWith("ppc"))
	    string
		= new StringBuilder().append(string).append("ppc/").toString();
	else
	    string = new StringBuilder().append(string).append
			 ("universal/").toString();
	((Class525) this).aString7072 = string;
    }
    
    public void method356(String string) throws Exception_Sub1 {
	method6386(string, Class535.class, -882054858);
    }
    
    public boolean method360(String string) {
	return ((Class525) this).aHashtable7073.containsKey(string);
    }
    
    public boolean method361(String string) {
	return ((Class525) this).aHashtable7073.containsKey(string);
    }
    
    public void method359(String string) throws Exception_Sub1 {
	method6386(string, Class535.class, -882054858);
    }
    
    public boolean method363() {
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration = ((Class525) this).aHashtable7074.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string,
			  ((Class525) this).aHashtable7074.get(string));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_14_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_14_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = ((Class525) this).aHashtable7074.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file
			    = ((File)
			       ((Class525) this).aHashtable7073.get(string));
			Class var_class_15_
			    = ((Class)
			       ((Class525) this).aHashtable7074.get(string));
			Vector vector
			    = ((Vector)
			       field.get(var_class_15_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_16_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_16_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_17_
					= (String) field_16_.get(object);
				    if (null != string_17_
					&& (string_17_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_18_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_19_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_18_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_19_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_19_.invoke(object,
							      new Object[0]);
					    field_18_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_19_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_18_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_16_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	((Class525) this).aHashtable7074 = hashtable;
	return ((Class525) this).aHashtable7074.isEmpty();
    }
    
    public boolean method357(byte i) {
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration = ((Class525) this).aHashtable7074.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string,
			  ((Class525) this).aHashtable7074.get(string));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_20_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_20_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = ((Class525) this).aHashtable7074.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file
			    = ((File)
			       ((Class525) this).aHashtable7073.get(string));
			Class var_class_21_
			    = ((Class)
			       ((Class525) this).aHashtable7074.get(string));
			Vector vector
			    = ((Vector)
			       field.get(var_class_21_.getClassLoader()));
			for (int i_22_ = 0; i_22_ < vector.size(); i_22_++) {
			    try {
				Object object = vector.elementAt(i_22_);
				Field field_23_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_23_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_24_
					= (String) field_23_.get(object);
				    if (null != string_24_
					&& (string_24_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_25_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_26_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_25_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_26_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_26_.invoke(object,
							      new Object[0]);
					    field_25_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_26_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_25_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_23_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	((Class525) this).aHashtable7074 = hashtable;
	return ((Class525) this).aHashtable7074.isEmpty();
    }
    
    static final void method6387(Class648 class648, short i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class324.method4227(class229, class226, class648, -1068793656);
    }
    
    static final void method6388(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int[] is = Class494.method5957(string, class648, (short) 520);
	if (null != is)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2502
	    = Class181_Sub23.method8999(string, class648, (byte) 56);
	class229.anIntArray2503 = is;
	class229.aBool2483 = true;
    }
    
    public static Class378 method6389(ByteBuffer class528_sub42, byte i) {
	Class378 class378 = SharedConfigsType.method7674(class528_sub42, 1667416816);
	int i_27_ = class528_sub42.method9645((short) -788);
	int i_28_ = class528_sub42.method9645((short) 53);
	int i_29_ = class528_sub42.method9645((short) 4196);
	int i_30_ = class528_sub42.method9645((short) -1720);
	int i_31_ = class528_sub42.method9645((short) -4614);
	int i_32_ = class528_sub42.method9645((short) -12009);
	return new Class378_Sub1(class378.aClass381_3950,
				 class378.aClass377_3946,
				 -1658519425 * class378.anInt3947,
				 class378.anInt3948 * -1924139657,
				 732946715 * class378.anInt3953,
				 -973094999 * class378.anInt3952,
				 class378.anInt3951 * 2021621295,
				 201912255 * class378.anInt3945,
				 -1503629071 * class378.anInt3949, i_27_,
				 i_28_, i_29_, i_30_, i_31_, i_32_);
    }
    
    static final void method6390(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_33_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_34_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 1]);
	Class79 class79
	    = (Class79) Class208.aClass5_Sub10_2239.method63(i_33_, 476920707);
	if (1875093329 * class79.anInt809 != i_34_)
	    class229.method3200(i_33_, i_34_, -217752350);
	else
	    class229.method3223(i_33_, -711774313);
    }
    
    static final void method6391(Class648 class648, int i) {
	int i_35_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_35_, (byte) -37);
	Class181_Sub17.method8976(class229, class648, (byte) 24);
    }
    
    static final void method6392(Class648 class648, int i)
	throws Exception_Sub4 {
	((Class648) class648).anInt8395 -= -577899301;
	int i_36_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929]);
	int i_37_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 1]);
	int i_38_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395 + 2]);
	float f = (float) (2.0 * Math.atan((double) ((float) i_36_ / 2.0F
						     / (float) i_38_)));
	float f_39_ = (float) (2.0 * Math.atan((double) ((float) i_37_ / 2.0F
							 / (float) i_38_)));
	Class495.aClass283_Sub1_5578.method3776(f, f_39_, 200548057);
    }
}
