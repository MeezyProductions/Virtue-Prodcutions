/* Class148_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class148_Sub1 extends Class148
{
    int[] anIntArray8788;
    int[] anIntArray8789;
    static boolean[][] aBoolArrayArray8790;
    
    Class148_Sub1(int i, int i_0_, int[] is, int[] is_1_) {
	((Class148_Sub1) this).anIntArray8789 = is;
	((Class148_Sub1) this).anIntArray8788 = is_1_;
    }
    
    static void method8267(byte i) {
	Class96.aClass186_1215.method2731(-1575021965);
    }
    
    static final String[] method8268(String[] strings, int i) {
	String[] strings_2_ = new String[5];
	for (int i_3_ = 0; i_3_ < 5; i_3_++) {
	    strings_2_[i_3_]
		= new StringBuilder().append(i_3_).append(" ").toString();
	    if (null != strings && strings[i_3_] != null)
		strings_2_[i_3_]
		    = new StringBuilder().append(strings_2_[i_3_]).append
			  (strings[i_3_]).toString();
	}
	return strings_2_;
    }
    
    static Class598[] method8269(byte i) {
	return (new Class598[]
		{ Class598.aClass598_7856, Class598.aClass598_7854,
		  Class598.aClass598_7855 });
    }
}
