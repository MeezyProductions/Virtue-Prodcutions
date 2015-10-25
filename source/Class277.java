/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

public class Class277
{
    static Class679 aClass679_3043;
    static Class692 aClass692_3044;
    static int anInt3045;
    static Map aMap3046 = new HashMap();
    
    public static int method3713(int i) {
	Class528_Sub21_Sub13 class528_sub21_sub13
	    = (Class528_Sub21_Sub13) aClass692_3044.method8137((long) i);
	if (class528_sub21_sub13 == null)
	    return -1;
	if (aClass679_3043.aClass528_Sub21_8561
	    == class528_sub21_sub13.aClass528_Sub21_10406)
	    return -1;
	return (1394353867
		* ((Class528_Sub21_Sub13)
		   class528_sub21_sub13.aClass528_Sub21_10406).anInt11616);
    }
    
    static int method3714() {
	return (anInt3045 += -872855875) * 1374184597 - 1;
    }
    
    public static int method3715(int i) {
	Class265 class265 = (Class265) aMap3046.get(Integer.valueOf(i));
	if (null == class265)
	    return 0;
	return class265.method3663((byte) 99);
    }
    
    static int method3716() {
	return (anInt3045 += -872855875) * 1374184597 - 1;
    }
    
    static int method3717() {
	return (anInt3045 += -872855875) * 1374184597 - 1;
    }
    
    static int method3718() {
	return (anInt3045 += -872855875) * 1374184597 - 1;
    }
    
    public static int method3719(int i) {
	Class528_Sub21_Sub13 class528_sub21_sub13
	    = (Class528_Sub21_Sub13) aClass692_3044.method8137((long) i);
	if (class528_sub21_sub13 == null)
	    return -1;
	if (aClass679_3043.aClass528_Sub21_8561
	    == class528_sub21_sub13.aClass528_Sub21_10408)
	    return -1;
	return (1394353867
		* ((Class528_Sub21_Sub13)
		   class528_sub21_sub13.aClass528_Sub21_10408).anInt11616);
    }
    
    Class277() throws Throwable {
	throw new Error();
    }
    
    public static void method3720() {
	aMap3046.clear();
	aClass692_3044.method8141(2042815139);
	aClass679_3043.method7961(-1761970420);
	anInt3045 = 0;
    }
    
    public static void method3721() {
	aMap3046.clear();
	aClass692_3044.method8141(2143708386);
	aClass679_3043.method7961(-1960717061);
	anInt3045 = 0;
    }
    
    static {
	aClass692_3044 = new Class692(1024);
	aClass679_3043 = new Class679();
	anInt3045 = 0;
    }
    
    static void method3722(byte i) {
	if (Class587.aClass173_7714.method2168()) {
	    Class587.aClass173_7714.method2176(Class64.aCanvas754, 1571984386);
	    Class552.method6717(-1194820048);
	    Dimension dimension = Class64.aCanvas754.getSize();
	    Class587.aClass173_7714.method2174(Class64.aCanvas754,
					       dimension.width,
					       dimension.height, 1797194617);
	    Class587.aClass173_7714.method2177(Class64.aCanvas754,
					       (short) 168);
	} else
	    Class186.method2754(Class514.aClass528_Sub38_6967
				    .aClass691_Sub24_10594
				    .method10014(-1824619963),
				false, 1308747755);
	PlayerModel.method7298(-1325611786);
    }
}
