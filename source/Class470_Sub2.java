/* Class470_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class470_Sub2 extends Class470 implements Interface39
{
    static final int anInt10063 = 34069;
    
    public void method302(Class340 class340) {
	super.method303(class340);
    }
    
    public void method308() {
	super.method308();
    }
    
    Class470_Sub2(Class173_Sub1_Sub1 class173_sub1_sub1, int i, boolean bool,
		  int[][] is) {
	super(class173_sub1_sub1, 34067, Class149.aClass149_1676,
	      Class169.aClass169_1935, i * i * 6, bool);
	for (int i_0_ = 0; i_0_ < 6; i_0_++) {
	    for (int i_1_ = 0; i_1_ < is[i_0_].length; i_1_++) {
		int i_2_ = is[i_0_][i_1_];
		is[i_0_][i_1_] = (~0xff00ff & i_2_ | (i_2_ & 0xff) << 16
				  | i_2_ >> 16 & 0xff);
	    }
	}
	((Class470_Sub2) this).aClass173_Sub1_Sub1_5389.method8526(this);
	if (bool) {
	    for (int i_3_ = 0; i_3_ < 6; i_3_++)
		method5802(34069 + i_3_, i, i, is[i_3_]);
	} else {
	    for (int i_4_ = 0; i_4_ < 6; i_4_++)
		OpenGL.glTexImage2Di
		    (34069 + i_4_, 0,
		     Class173_Sub1_Sub1.method10357((((Class470_Sub2) this)
						     .aClass149_5398),
						    (((Class470_Sub2) this)
						     .aClass169_5397)),
		     i, i, 0,
		     Class173_Sub1_Sub1
			 .method10356(((Class470_Sub2) this).aClass149_5398),
		     (((Class173_Sub1_Sub1)
		       ((Class470_Sub2) this).aClass173_Sub1_Sub1_5389)
		      .anInt11294),
		     is[i_4_], 0);
	}
    }
    
    public void method115() {
	super.method115();
    }
    
    public void method116() {
	super.method115();
    }
    
    public void method304(Class340 class340) {
	super.method303(class340);
    }
    
    public void method306() {
	super.method308();
    }
    
    public void method303(Class340 class340) {
	super.method303(class340);
    }
    
    public void method307(Class340 class340) {
	super.method303(class340);
    }
    
    public void method305() {
	super.method308();
    }
}
