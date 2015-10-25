/* Class470_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class470_Sub1 extends Class470 implements Interface32
{
    int anInt10054;
    int anInt10055;
    int anInt10056;
    
    public void method305() {
	super.method308();
    }
    
    public void method308() {
	super.method308();
    }
    
    public void method306() {
	super.method308();
    }
    
    Class470_Sub1(Class173_Sub1_Sub1 class173_sub1_sub1, Class149 class149,
		  int i, int i_0_, int i_1_, boolean bool, byte[] is) {
	super(class173_sub1_sub1, 32879, class149, Class169.aClass169_1935,
	      i * i_0_ * i_1_, bool);
	((Class470_Sub1) this).anInt10055 = i;
	((Class470_Sub1) this).anInt10054 = i_0_;
	((Class470_Sub1) this).anInt10056 = i_1_;
	((Class470_Sub1) this).aClass173_Sub1_Sub1_5389.method8526(this);
	OpenGL.glPixelStorei(3317, 1);
	OpenGL.glTexImage3Dub(((Class470_Sub1) this).anInt5395, 0,
			      (Class173_Sub1_Sub1.method10357
			       (((Class470_Sub1) this).aClass149_5398,
				((Class470_Sub1) this).aClass169_5397)),
			      ((Class470_Sub1) this).anInt10055,
			      ((Class470_Sub1) this).anInt10054,
			      ((Class470_Sub1) this).anInt10056, 0,
			      Class173_Sub1_Sub1.method10356(((Class470_Sub1)
							      this)
							     .aClass149_5398),
			      5121, is, 0);
	OpenGL.glPixelStorei(3317, 4);
	if (bool)
	    method218();
    }
    
    public void method116() {
	super.method115();
    }
    
    public void method115() {
	super.method115();
    }
    
    public void method303(Class340 class340) {
	super.method303(class340);
    }
    
    public void method302(Class340 class340) {
	super.method303(class340);
    }
    
    public void method307(Class340 class340) {
	super.method303(class340);
    }
    
    public void method304(Class340 class340) {
	super.method303(class340);
    }
}
