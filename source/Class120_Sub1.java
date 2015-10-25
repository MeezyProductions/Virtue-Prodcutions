/* Class120_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class120_Sub1 extends Class120
{
    static final int anInt8764 = 34073;
    static final int anInt8765 = 34070;
    static final int anInt8766 = 34069;
    static final int anInt8767 = 34072;
    static final int anInt8768 = 34071;
    static final int anInt8769 = 34074;
    int anInt8770;
    
    Interface19 method8250(int i, int i_0_) {
	return new Class114(this, i, i_0_);
    }
    
    Class120_Sub1(Class173_Sub2 class173_sub2, Class149 class149,
		  Class169 class169, int i, boolean bool, byte[][] is,
		  Class149 class149_1_) {
	super(class173_sub2, 34067, class149, class169, i * i * 6, bool);
	((Class120_Sub1) this).anInt8770 = i;
	((Class120_Sub1) this).aClass173_Sub2_1491.method8775(this);
	for (int i_2_ = 0; i_2_ < 6; i_2_++)
	    OpenGL.glTexImage2Dub(34069 + i_2_, 0,
				  (Class173_Sub2.method8798
				   (((Class120_Sub1) this).aClass149_1486,
				    ((Class120_Sub1) this).aClass169_1495)),
				  i, i, 0,
				  Class173_Sub2.method8797(class149_1_), 5121,
				  is[i_2_], 0);
	method1545(true);
    }
    
    Class120_Sub1(Class173_Sub2 class173_sub2, Class149 class149,
		  Class169 class169, int i) {
	super(class173_sub2, 34067, class149, class169, i * i * 6, false);
	((Class120_Sub1) this).anInt8770 = i;
	((Class120_Sub1) this).aClass173_Sub2_1491.method8775(this);
	for (int i_3_ = 0; i_3_ < 6; i_3_++)
	    OpenGL.glTexImage2Dub(34069 + i_3_, 0,
				  (Class173_Sub2.method8798
				   (((Class120_Sub1) this).aClass149_1486,
				    ((Class120_Sub1) this).aClass169_1495)),
				  i, i, 0,
				  Class173_Sub2.method8797(((Class120_Sub1)
							    this)
							   .aClass149_1486),
				  5121, null, 0);
	method1545(true);
    }
    
    Class120_Sub1(Class173_Sub2 class173_sub2, Class149 class149,
		  Class169 class169, int i, boolean bool, int[][] is) {
	super(class173_sub2, 34067, class149, class169, i * i * 6, bool);
	((Class120_Sub1) this).anInt8770 = i;
	((Class120_Sub1) this).aClass173_Sub2_1491.method8775(this);
	if (bool) {
	    for (int i_4_ = 0; i_4_ < 6; i_4_++)
		method1552(34069 + i_4_,
			   Class173_Sub2.method8798((((Class120_Sub1) this)
						     .aClass149_1486),
						    (((Class120_Sub1) this)
						     .aClass169_1495)),
			   i, i, 32993,
			   ((Class173_Sub2) (((Class120_Sub1) this)
					     .aClass173_Sub2_1491)).anInt9586,
			   is[i_4_]);
	} else {
	    for (int i_5_ = 0; i_5_ < 6; i_5_++)
		OpenGL.glTexImage2Di(34069 + i_5_, 0,
				     (Class173_Sub2.method8798
				      (((Class120_Sub1) this).aClass149_1486,
				       ((Class120_Sub1) this).aClass169_1495)),
				     i, i, 0, 32993,
				     (((Class173_Sub2) (((Class120_Sub1) this)
							.aClass173_Sub2_1491))
				      .anInt9586),
				     is[i_5_], 0);
	}
	method1545(true);
    }
}
