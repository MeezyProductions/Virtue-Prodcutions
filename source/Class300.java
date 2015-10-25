/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public abstract class Class300
{
    int anInt3338;
    int anInt3339;
    Class290 this$0;
    public static int anInt3340;
    
    Class300(Class290 class290, int i, int i_0_) {
	((Class300) this).this$0 = class290;
	((Class300) this).anInt3338 = -606339463 * i;
	((Class300) this).anInt3339 = i_0_ * 1545216315;
    }
    
    abstract void method4017(Graphics graphics);
    
    abstract void method4018(Graphics graphics);
    
    abstract void method4019(Graphics graphics);
    
    abstract void method4020(Graphics graphics, byte i);
    
    public static Class387 method4021(ByteBuffer class528_sub42, int i) {
	Class387 class387 = new Class387();
	class387.anInt4071 = class528_sub42.readUnsignedShort(108582832) * 2108924067;
	class387.aClass528_Sub21_Sub4_4070
	    = Class33.aClass46_314.method861(-1007414517 * class387.anInt4071,
					     (byte) -48);
	return class387;
    }
}
