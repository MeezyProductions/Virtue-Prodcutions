/* Class300_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Class300_Sub2 extends Class300
{
    Font aFont9990;
    Color aColor9991;
    FontMetrics aFontMetrics9992;
    boolean aBool9993;
    Class290 this$0;
    
    void method4018(Graphics graphics) {
	String string;
	if (((Class300_Sub2) this).aBool9993)
	    string = ((Class290) ((Class300_Sub2) this).this$0).aString3190;
	else
	    string
		= new StringBuilder().append
		      (((Class290) ((Class300_Sub2) this).this$0).aString3186)
		      .append
		      (" ").append
		      (((Class290) ((Class300_Sub2) this).this$0).aString3190)
		      .toString();
	graphics.setFont(((Class300_Sub2) this).aFont9990);
	graphics.setColor(((Class300_Sub2) this).aColor9991);
	graphics.drawString(string,
			    ((((Class300_Sub2) this).this$0.method3878
			      (((Class300_Sub2) this).aFontMetrics9992
				   .stringWidth(string),
			       (byte) 44))
			     + 1099303881 * ((Class300_Sub2) this).anInt3338),
			    (((Class300_Sub2) this).this$0
				 .method3879(0, 591335660)
			     + 1841303539 * ((Class300_Sub2) this).anInt3339));
    }
    
    void method4020(Graphics graphics, byte i) {
	String string;
	if (((Class300_Sub2) this).aBool9993)
	    string = ((Class290) ((Class300_Sub2) this).this$0).aString3190;
	else
	    string
		= new StringBuilder().append
		      (((Class290) ((Class300_Sub2) this).this$0).aString3186)
		      .append
		      (" ").append
		      (((Class290) ((Class300_Sub2) this).this$0).aString3190)
		      .toString();
	graphics.setFont(((Class300_Sub2) this).aFont9990);
	graphics.setColor(((Class300_Sub2) this).aColor9991);
	graphics.drawString(string,
			    ((((Class300_Sub2) this).this$0.method3878
			      (((Class300_Sub2) this).aFontMetrics9992
				   .stringWidth(string),
			       (byte) 39))
			     + 1099303881 * ((Class300_Sub2) this).anInt3338),
			    (((Class300_Sub2) this).this$0
				 .method3879(0, 591335660)
			     + 1841303539 * ((Class300_Sub2) this).anInt3339));
    }
    
    Class300_Sub2(Class290 class290, boolean bool, String string, int i,
		  int i_0_, int i_1_, int i_2_) {
	super(class290, i_1_, i_2_);
	((Class300_Sub2) this).this$0 = class290;
	((Class300_Sub2) this).aBool9993 = bool;
	((Class300_Sub2) this).aFont9990 = new Font(string, 0, i);
	((Class300_Sub2) this).aFontMetrics9992
	    = Class64.aCanvas754
		  .getFontMetrics(((Class300_Sub2) this).aFont9990);
	((Class300_Sub2) this).aColor9991 = new Color(i_0_);
    }
    
    void method4019(Graphics graphics) {
	String string;
	if (((Class300_Sub2) this).aBool9993)
	    string = ((Class290) ((Class300_Sub2) this).this$0).aString3190;
	else
	    string
		= new StringBuilder().append
		      (((Class290) ((Class300_Sub2) this).this$0).aString3186)
		      .append
		      (" ").append
		      (((Class290) ((Class300_Sub2) this).this$0).aString3190)
		      .toString();
	graphics.setFont(((Class300_Sub2) this).aFont9990);
	graphics.setColor(((Class300_Sub2) this).aColor9991);
	graphics.drawString(string,
			    ((((Class300_Sub2) this).this$0.method3878
			      (((Class300_Sub2) this).aFontMetrics9992
				   .stringWidth(string),
			       (byte) 28))
			     + 1099303881 * ((Class300_Sub2) this).anInt3338),
			    (((Class300_Sub2) this).this$0
				 .method3879(0, 591335660)
			     + 1841303539 * ((Class300_Sub2) this).anInt3339));
    }
    
    void method4017(Graphics graphics) {
	String string;
	if (((Class300_Sub2) this).aBool9993)
	    string = ((Class290) ((Class300_Sub2) this).this$0).aString3190;
	else
	    string
		= new StringBuilder().append
		      (((Class290) ((Class300_Sub2) this).this$0).aString3186)
		      .append
		      (" ").append
		      (((Class290) ((Class300_Sub2) this).this$0).aString3190)
		      .toString();
	graphics.setFont(((Class300_Sub2) this).aFont9990);
	graphics.setColor(((Class300_Sub2) this).aColor9991);
	graphics.drawString(string,
			    ((((Class300_Sub2) this).this$0.method3878
			      (((Class300_Sub2) this).aFontMetrics9992
				   .stringWidth(string),
			       (byte) 114))
			     + 1099303881 * ((Class300_Sub2) this).anInt3338),
			    (((Class300_Sub2) this).this$0
				 .method3879(0, 591335660)
			     + 1841303539 * ((Class300_Sub2) this).anInt3339));
    }
}
