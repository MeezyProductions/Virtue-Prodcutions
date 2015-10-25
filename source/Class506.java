/* Class506 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class506
{
    Robot aRobot6894;
    
    public Class506() throws Exception {
	((Class506) this).aRobot6894 = new Robot();
    }
    
    public void movemouse(int i, int i_0_) {
	((Class506) this).aRobot6894.mouseMove(i, i_0_);
    }
    
    public void setcustomcursor(Component component, int[] is, int i, int i_1_,
				Point point) {
	if (null != is) {
	    BufferedImage bufferedimage = new BufferedImage(i, i_1_, 2);
	    bufferedimage.setRGB(0, 0, i, i_1_, is, 0, i);
	    component.setCursor
		(component.getToolkit().createCustomCursor(bufferedimage,
							   point, null));
	} else
	    component.setCursor(null);
    }
}
