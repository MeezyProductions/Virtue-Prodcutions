/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas
{
    static TwitchTV aTwitchTV11693;
    Component aComponent11694;
    
    public final void method10627(Graphics graphics) {
	this.aComponent11694.paint(graphics);
    }
    
    @Override
	public final void paint(Graphics graphics) {
	this.aComponent11694.paint(graphics);
    }
    
    Canvas_Sub1(Component component) {
	this.aComponent11694 = component;
    }
    
    @Override
	public final void update(Graphics graphics) {
	this.aComponent11694.update(graphics);
    }
    
    public final void method10628(Graphics graphics) {
	this.aComponent11694.paint(graphics);
    }
}
