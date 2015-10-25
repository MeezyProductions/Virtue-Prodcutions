/* Class702 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class702
{
    DisplayMode aDisplayMode8742;
    GraphicsDevice aGraphicsDevice8743;
    
    void method8221() {
	if (this.aDisplayMode8742 != null) {
	    DisplayMode[] displaymodes
		= this.aGraphicsDevice8743.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_0_ = displaymodes;
	    for (int i = 0; i < displaymodes_0_.length; i++) {
		DisplayMode displaymode = displaymodes_0_[i];
		if (displaymode.equals(this.aDisplayMode8742)) {
		    this.aGraphicsDevice8743
			.setDisplayMode(this.aDisplayMode8742);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(this.aGraphicsDevice8743, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    this.aDisplayMode8742 = null;
	}
	method8226(null, (byte) -89);
    }
    
    int[] method8222(int i) {
	DisplayMode[] displaymodes
	    = this.aGraphicsDevice8743.getDisplayModes();
	int[] is = new int[displaymodes.length << 2];
	for (int i_1_ = 0; i_1_ < displaymodes.length; i_1_++) {
	    is[i_1_ << 2] = displaymodes[i_1_].getWidth();
	    is[1 + (i_1_ << 2)] = displaymodes[i_1_].getHeight();
	    is[2 + (i_1_ << 2)] = displaymodes[i_1_].getBitDepth();
	    is[3 + (i_1_ << 2)] = displaymodes[i_1_].getRefreshRate();
	}
	return is;
    }
    
    void method8223(Frame frame, int i, int i_2_, int i_3_, int i_4_,
		    int i_5_) {
	this.aDisplayMode8742
	    = this.aGraphicsDevice8743.getDisplayMode();
	if (null == this.aDisplayMode8742)
	    throw new NullPointerException();
	frame.setUndecorated(true);
	frame.enableInputMethods(false);
	method8226(frame, (byte) 24);
	if (i_4_ == 0) {
	    int i_6_ = this.aDisplayMode8742.getRefreshRate();
	    DisplayMode[] displaymodes
		= this.aGraphicsDevice8743.getDisplayModes();
	    boolean bool = false;
	    for (int i_7_ = 0; i_7_ < displaymodes.length; i_7_++) {
		if (displaymodes[i_7_].getWidth() == i
		    && displaymodes[i_7_].getHeight() == i_2_
		    && displaymodes[i_7_].getBitDepth() == i_3_) {
		    int i_8_ = displaymodes[i_7_].getRefreshRate();
		    if (!bool
			|| Math.abs(i_8_ - i_6_) < Math.abs(i_4_ - i_6_)) {
			i_4_ = i_8_;
			bool = true;
		    }
		}
	    }
	    if (!bool)
		i_4_ = i_6_;
	}
	this.aGraphicsDevice8743
	    .setDisplayMode(new DisplayMode(i, i_2_, i_3_, i_4_));
    }
    
    public Class702() throws Exception {
	GraphicsEnvironment graphicsenvironment
	    = GraphicsEnvironment.getLocalGraphicsEnvironment();
	this.aGraphicsDevice8743
	    = graphicsenvironment.getDefaultScreenDevice();
	if (!this.aGraphicsDevice8743.isFullScreenSupported()) {
	    GraphicsDevice[] graphicsdevices
		= graphicsenvironment.getScreenDevices();
	    GraphicsDevice[] graphicsdevices_9_ = graphicsdevices;
	    for (int i = 0; i < graphicsdevices_9_.length; i++) {
		GraphicsDevice graphicsdevice = graphicsdevices_9_[i];
		if (graphicsdevice != null
		    && graphicsdevice.isFullScreenSupported()) {
		    this.aGraphicsDevice8743 = graphicsdevice;
		    return;
		}
	    }
	    throw new Exception();
	}
    }
    
    void method8224(int i) {
	if (this.aDisplayMode8742 != null) {
	    DisplayMode[] displaymodes
		= this.aGraphicsDevice8743.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_10_ = displaymodes;
	    for (int i_11_ = 0; i_11_ < displaymodes_10_.length; i_11_++) {
		DisplayMode displaymode = displaymodes_10_[i_11_];
		if (displaymode.equals(this.aDisplayMode8742)) {
		    this.aGraphicsDevice8743
			.setDisplayMode(this.aDisplayMode8742);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(this.aGraphicsDevice8743, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    this.aDisplayMode8742 = null;
	}
	method8226(null, (byte) 18);
    }
    
    void method8225() {
	if (this.aDisplayMode8742 != null) {
	    DisplayMode[] displaymodes
		= this.aGraphicsDevice8743.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_12_ = displaymodes;
	    for (int i = 0; i < displaymodes_12_.length; i++) {
		DisplayMode displaymode = displaymodes_12_[i];
		if (displaymode.equals(this.aDisplayMode8742)) {
		    this.aGraphicsDevice8743
			.setDisplayMode(this.aDisplayMode8742);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(this.aGraphicsDevice8743, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    this.aDisplayMode8742 = null;
	}
	method8226(null, (byte) -27);
    }
    
    void method8226(Frame frame, byte i) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_13_
		= ((Boolean) field.get(this.aGraphicsDevice8743))
		      .booleanValue();
	    if (bool_13_) {
		field.set(this.aGraphicsDevice8743,
			  Boolean.FALSE);
		bool = true;
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    this.aGraphicsDevice8743.setFullScreenWindow(frame);
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(this.aGraphicsDevice8743,
			      Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
		} catch (Exception object) {
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(this.aGraphicsDevice8743,
			      Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    throw object;
	}
    }
}
