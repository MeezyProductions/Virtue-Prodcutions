/* Class300_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.awt.Image;

public class Class300_Sub1 extends Class300
{
    Class290 this$0;
    Image anImage9901;
    public static int anInt9902;
    
    void method4019(Graphics graphics) {
	int i
	    = (((Class300_Sub1) this).this$0.method3878(((Class300_Sub1) this)
							    .anImage9901
							    .getWidth(null),
							(byte) 21)
	       + ((Class300_Sub1) this).anInt3338 * 1099303881);
	int i_0_
	    = (((Class300_Sub1) this).this$0.method3879(((Class300_Sub1) this)
							    .anImage9901
							    .getHeight(null),
							591335660)
	       + 1841303539 * ((Class300_Sub1) this).anInt3339);
	graphics.drawImage(((Class300_Sub1) this).anImage9901, i, i_0_, null);
    }
    
    Class300_Sub1(Class290 class290, Image image, int i, int i_1_) {
	super(class290, i, i_1_);
	((Class300_Sub1) this).this$0 = class290;
	((Class300_Sub1) this).anImage9901 = image;
    }
    
    void method4018(Graphics graphics) {
	int i
	    = (((Class300_Sub1) this).this$0.method3878(((Class300_Sub1) this)
							    .anImage9901
							    .getWidth(null),
							(byte) 87)
	       + ((Class300_Sub1) this).anInt3338 * 1099303881);
	int i_2_
	    = (((Class300_Sub1) this).this$0.method3879(((Class300_Sub1) this)
							    .anImage9901
							    .getHeight(null),
							591335660)
	       + 1841303539 * ((Class300_Sub1) this).anInt3339);
	graphics.drawImage(((Class300_Sub1) this).anImage9901, i, i_2_, null);
    }
    
    void method4020(Graphics graphics, byte i) {
	int i_3_
	    = (((Class300_Sub1) this).this$0.method3878(((Class300_Sub1) this)
							    .anImage9901
							    .getWidth(null),
							(byte) 104)
	       + ((Class300_Sub1) this).anInt3338 * 1099303881);
	int i_4_
	    = (((Class300_Sub1) this).this$0.method3879(((Class300_Sub1) this)
							    .anImage9901
							    .getHeight(null),
							591335660)
	       + 1841303539 * ((Class300_Sub1) this).anInt3339);
	graphics.drawImage(((Class300_Sub1) this).anImage9901, i_3_, i_4_,
			   null);
    }
    
    void method4017(Graphics graphics) {
	int i
	    = (((Class300_Sub1) this).this$0.method3878(((Class300_Sub1) this)
							    .anImage9901
							    .getWidth(null),
							(byte) 54)
	       + ((Class300_Sub1) this).anInt3338 * 1099303881);
	int i_5_
	    = (((Class300_Sub1) this).this$0.method3879(((Class300_Sub1) this)
							    .anImage9901
							    .getHeight(null),
							591335660)
	       + 1841303539 * ((Class300_Sub1) this).anInt3339);
	graphics.drawImage(((Class300_Sub1) this).anImage9901, i, i_5_, null);
    }
    
    static final void method9007(Class648 class648, int i) {
	NPC class645_sub1_sub5_sub1_sub1
	    = ((NPC)
	       ((Class648) class648).aClass645_Sub1_Sub5_Sub1_8389);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -807024423 * class645_sub1_sub5_sub1_sub1.anInt12038;
    }
}
