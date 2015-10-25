/* Class300_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class Class300_Sub1_Sub1 extends Class300_Sub1
{
    Class290 this$0;
    float aFloat11341;
    float aFloat11342;
    
    void method4017(Graphics graphics) {
	((Class300_Sub1_Sub1) this).aFloat11342
	    += ((Class300_Sub1_Sub1) this).aFloat11341;
	if (((Class300_Sub1_Sub1) this).aFloat11342 < 0.0F)
	    ((Class300_Sub1_Sub1) this).aFloat11342 += 360.0F;
	((Class300_Sub1_Sub1) this).aFloat11342 %= 360.0F;
	double d
	    = Math.toRadians((double) ((Class300_Sub1_Sub1) this).aFloat11342);
	int i = ((Class300_Sub1_Sub1) this).anImage9901.getWidth(null);
	int i_0_ = ((Class300_Sub1_Sub1) this).anImage9901.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate(d,
			  (double) (((Class300_Sub1_Sub1) this).this$0
					.method3878(i, (byte) 124)
				    + i / 2
				    + 1099303881 * (((Class300_Sub1_Sub1) this)
						    .anInt3338)),
			  (double) (((Class300_Sub1_Sub1) this).this$0
					.method3879(i_0_, 591335660)
				    + i_0_ / 2
				    + (((Class300_Sub1_Sub1) this).anInt3339
				       * 1841303539)));
	graphics2d.translate
	    ((((Class300_Sub1_Sub1) this).this$0.method3878(i, (byte) 84)
	      + ((Class300_Sub1_Sub1) this).anInt3338 * 1099303881),
	     (((Class300_Sub1_Sub1) this).this$0.method3879(i_0_, 591335660)
	      + ((Class300_Sub1_Sub1) this).anInt3339 * 1841303539));
	graphics2d.drawImage(((Class300_Sub1_Sub1) this).anImage9901, null,
			     null);
	graphics2d.setTransform(((Class290) ((Class300_Sub1_Sub1) this).this$0)
				.anAffineTransform3192);
    }
    
    void method4020(Graphics graphics, byte i) {
	((Class300_Sub1_Sub1) this).aFloat11342
	    += ((Class300_Sub1_Sub1) this).aFloat11341;
	if (((Class300_Sub1_Sub1) this).aFloat11342 < 0.0F)
	    ((Class300_Sub1_Sub1) this).aFloat11342 += 360.0F;
	((Class300_Sub1_Sub1) this).aFloat11342 %= 360.0F;
	double d
	    = Math.toRadians((double) ((Class300_Sub1_Sub1) this).aFloat11342);
	int i_1_ = ((Class300_Sub1_Sub1) this).anImage9901.getWidth(null);
	int i_2_ = ((Class300_Sub1_Sub1) this).anImage9901.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate
	    (d,
	     (double) (((Class300_Sub1_Sub1) this).this$0.method3878(i_1_,
								     (byte) 94)
		       + i_1_ / 2
		       + 1099303881 * ((Class300_Sub1_Sub1) this).anInt3338),
	     (double) (((Class300_Sub1_Sub1) this).this$0.method3879(i_2_,
								     591335660)
		       + i_2_ / 2
		       + ((Class300_Sub1_Sub1) this).anInt3339 * 1841303539));
	graphics2d.translate
	    ((((Class300_Sub1_Sub1) this).this$0.method3878(i_1_, (byte) 34)
	      + ((Class300_Sub1_Sub1) this).anInt3338 * 1099303881),
	     (((Class300_Sub1_Sub1) this).this$0.method3879(i_2_, 591335660)
	      + ((Class300_Sub1_Sub1) this).anInt3339 * 1841303539));
	graphics2d.drawImage(((Class300_Sub1_Sub1) this).anImage9901, null,
			     null);
	graphics2d.setTransform(((Class290) ((Class300_Sub1_Sub1) this).this$0)
				.anAffineTransform3192);
    }
    
    Class300_Sub1_Sub1(Class290 class290, Image image, int i, int i_3_,
		       float f) {
	super(class290, image, i, i_3_);
	((Class300_Sub1_Sub1) this).this$0 = class290;
	((Class300_Sub1_Sub1) this).aFloat11341 = f;
	((Class300_Sub1_Sub1) this).aFloat11342
	    = -((Class300_Sub1_Sub1) this).aFloat11341;
    }
    
    void method4019(Graphics graphics) {
	((Class300_Sub1_Sub1) this).aFloat11342
	    += ((Class300_Sub1_Sub1) this).aFloat11341;
	if (((Class300_Sub1_Sub1) this).aFloat11342 < 0.0F)
	    ((Class300_Sub1_Sub1) this).aFloat11342 += 360.0F;
	((Class300_Sub1_Sub1) this).aFloat11342 %= 360.0F;
	double d
	    = Math.toRadians((double) ((Class300_Sub1_Sub1) this).aFloat11342);
	int i = ((Class300_Sub1_Sub1) this).anImage9901.getWidth(null);
	int i_4_ = ((Class300_Sub1_Sub1) this).anImage9901.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate
	    (d,
	     (double) (((Class300_Sub1_Sub1) this).this$0.method3878(i,
								     (byte) 92)
		       + i / 2
		       + 1099303881 * ((Class300_Sub1_Sub1) this).anInt3338),
	     (double) (((Class300_Sub1_Sub1) this).this$0.method3879(i_4_,
								     591335660)
		       + i_4_ / 2
		       + ((Class300_Sub1_Sub1) this).anInt3339 * 1841303539));
	graphics2d.translate
	    ((((Class300_Sub1_Sub1) this).this$0.method3878(i, (byte) 48)
	      + ((Class300_Sub1_Sub1) this).anInt3338 * 1099303881),
	     (((Class300_Sub1_Sub1) this).this$0.method3879(i_4_, 591335660)
	      + ((Class300_Sub1_Sub1) this).anInt3339 * 1841303539));
	graphics2d.drawImage(((Class300_Sub1_Sub1) this).anImage9901, null,
			     null);
	graphics2d.setTransform(((Class290) ((Class300_Sub1_Sub1) this).this$0)
				.anAffineTransform3192);
    }
    
    void method4018(Graphics graphics) {
	((Class300_Sub1_Sub1) this).aFloat11342
	    += ((Class300_Sub1_Sub1) this).aFloat11341;
	if (((Class300_Sub1_Sub1) this).aFloat11342 < 0.0F)
	    ((Class300_Sub1_Sub1) this).aFloat11342 += 360.0F;
	((Class300_Sub1_Sub1) this).aFloat11342 %= 360.0F;
	double d
	    = Math.toRadians((double) ((Class300_Sub1_Sub1) this).aFloat11342);
	int i = ((Class300_Sub1_Sub1) this).anImage9901.getWidth(null);
	int i_5_ = ((Class300_Sub1_Sub1) this).anImage9901.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate
	    (d,
	     (double) (((Class300_Sub1_Sub1) this).this$0.method3878(i,
								     (byte) 90)
		       + i / 2
		       + 1099303881 * ((Class300_Sub1_Sub1) this).anInt3338),
	     (double) (((Class300_Sub1_Sub1) this).this$0.method3879(i_5_,
								     591335660)
		       + i_5_ / 2
		       + ((Class300_Sub1_Sub1) this).anInt3339 * 1841303539));
	graphics2d.translate
	    ((((Class300_Sub1_Sub1) this).this$0.method3878(i, (byte) 45)
	      + ((Class300_Sub1_Sub1) this).anInt3338 * 1099303881),
	     (((Class300_Sub1_Sub1) this).this$0.method3879(i_5_, 591335660)
	      + ((Class300_Sub1_Sub1) this).anInt3339 * 1841303539));
	graphics2d.drawImage(((Class300_Sub1_Sub1) this).anImage9901, null,
			     null);
	graphics2d.setTransform(((Class290) ((Class300_Sub1_Sub1) this).this$0)
				.anAffineTransform3192);
    }
}
