/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class290 implements Interface28
{
    boolean aBool3185;
    String aString3186;
    List aList3187 = new ArrayList();
    boolean aBool3188;
    boolean aBool3189;
    String aString3190;
    boolean aBool3191;
    AffineTransform anAffineTransform3192 = new AffineTransform();
    
    final int method3878(int i, byte i_0_) {
	if (this.aBool3188)
	    return (-1117838587 * Class411.anInt4713 - i) / 2;
	return 0;
    }
    
    final int method3879(int i, int i_1_) {
	if (this.aBool3189)
	    return (-2142152407 * Class509.anInt6933 - i) / 2;
	return 0;
    }
    
    void method3880() {
	Class449.method5427
	    (Class293.aClass292_3215.method3922(279325335),
	     Class293.aClass292_3215.method3911((byte) -84),
	     client.aColorArray10919[client.anInt10863 * 1181441341],
	     client.aColorArray10909[client.anInt10863 * 1181441341],
	     client.aColorArray10910[1181441341 * client.anInt10863],
	     -1210445788);
    }
    
    Image method3881(String string, byte i) throws IOException {
	InputStream inputstream = null;
	try {
	    Image image;
	    try {
		inputstream = Class196.anApplet2198.getClass().getClassLoader
				  ().getResourceAsStream(string);
		byte[] is = new byte[12000];
		int i_2_ = 0;
		int i_3_;
		while ((i_3_ = inputstream.read()) != -1)
		    is[i_2_++] = (byte) i_3_;
		Image image_4_ = Toolkit.getDefaultToolkit().createImage(is);
		inputstream.close();
		image = image_4_;
	    } catch (Exception exception) {
		throw new IOException();
	    }
	    if (inputstream != null)
		inputstream.close();
	    return image;
		} catch (Exception object) {
	    if (inputstream != null)
		inputstream.close();
	    throw object;
	}
    }
    
    void method3882(short i) {
	Class449.method5427
	    (Class293.aClass292_3215.method3922(114022713),
	     Class293.aClass292_3215.method3911((byte) -62),
	     client.aColorArray10919[client.anInt10863 * 1181441341],
	     client.aColorArray10909[client.anInt10863 * 1181441341],
	     client.aColorArray10910[1181441341 * client.anInt10863],
	     -1210445788);
    }
    
    @Override
	public void method154(int i) {
	OutgoingOpcode.method4858((byte) -44);
    }
    
    @Override
	public int method155() {
	return 0;
    }
    
    @Override
	public int method162(int i) {
	return 100;
    }
    
    final int method3883(int i) {
	if (this.aBool3189)
	    return (-2142152407 * Class509.anInt6933 - i) / 2;
	return 0;
    }
    
    @Override
	public int method160(int i) {
	return 0;
    }
    
    final int method3884(int i) {
	if (this.aBool3188)
	    return (-1117838587 * Class411.anInt4713 - i) / 2;
	return 0;
    }
    
    final int method3885(int i) {
	if (this.aBool3189)
	    return (-2142152407 * Class509.anInt6933 - i) / 2;
	return 0;
    }
    
    @Override
	public void method159() {
	OutgoingOpcode.method4858((byte) -51);
    }
    
    final int method3886(int i) {
	if (this.aBool3189)
	    return (-2142152407 * Class509.anInt6933 - i) / 2;
	return 0;
    }
    
    @Override
	public void method152(boolean bool) {
	if (!this.aBool3185 && !this.aBool3191) {
	    this.aBool3191 = true;
	    try {
		String[] strings
		    = Class520.method6348(client.aString10867, '|', (byte) 55);
		if (strings.length < 3)
		    this.aBool3185 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class64.aCanvas754);
		    int i = 0;
		    for (int i_5_ = 0; i_5_ < strings.length; i_5_++) {
			String[] strings_6_
			    = Class520.method6348(strings[i_5_].trim(), '=',
						  (byte) 59);
			if (strings_6_[0].equals("halign"))
			    this.aBool3188
				= Boolean.parseBoolean(strings_6_[1]);
			else if (strings_6_[0].equals("valign"))
			    this.aBool3189
				= Boolean.parseBoolean(strings_6_[1]);
			else if (strings_6_[0].equals("image")) {
			    String[] strings_7_
				= Class520.method6348(strings_6_[1], ',',
						      (byte) -5);
			    Image image;
			    try {
				image = method3881(strings_7_[0], (byte) -116);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (image != null) {
				mediatracker.addImage(image, i++);
				this.aList3187.add
				    (new Class300_Sub1
				     (this, image,
				      Class454.method5495(strings_7_[1],
							  717927929),
				      Class454.method5495(strings_7_[2],
							  717927929)));
			    }
			} else if (strings_6_[0].equals("rotatingimage")) {
			    String[] strings_8_
				= Class520.method6348(strings_6_[1], ',',
						      (byte) 84);
			    Image image;
			    try {
				image = method3881(strings_8_[0], (byte) -123);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				this.aList3187.add
				    (new Class300_Sub1_Sub1
				     (this, image,
				      Class454.method5495(strings_8_[1],
							  717927929),
				      Class454.method5495(strings_8_[2],
							  717927929),
				      Float.parseFloat(strings_8_[3])));
			    }
			} else if (strings_6_[0].equals("progress")) {
			    String[] strings_9_
				= Class520.method6348(strings_6_[1], ',',
						      (byte) 10);
			    this.aList3187.add
				(new Class300_Sub2
				 (this, Boolean.parseBoolean(strings_9_[0]),
				  strings_9_[1],
				  Class454.method5495(strings_9_[2],
						      717927929),
				  Integer.decode(strings_9_[3]).intValue(),
				  Class454.method5495(strings_9_[4],
						      717927929),
				  Class454.method5495(strings_9_[5],
						      717927929)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		this.aBool3185 = true;
	    }
	}
	if (this.aBool3185)
	    method3882((short) -18354);
	else {
	    Graphics graphics = Class64.aCanvas754.getGraphics();
	    if (null != graphics) {
		try {
		    this.aString3190
			= new StringBuilder().append("").append
			      (Class293.aClass292_3215.method3922(-381194673))
			      .append
			      ("%").toString();
		    this.aString3186
			= Class293.aClass292_3215.method3911((byte) -76);
		    if (null == Class193.anImage2172)
			Class193.anImage2172
			    = (Class64.aCanvas754.createImage
			       (-1117838587 * Class411.anInt4713,
				Class509.anInt6933 * -2142152407));
		    Graphics graphics_10_ = Class193.anImage2172.getGraphics();
		    graphics_10_.setColor(Color.BLACK);
		    graphics_10_.fillRect(0, 0,
					  Class411.anInt4713 * -1117838587,
					  -2142152407 * Class509.anInt6933);
		    Iterator iterator = this.aList3187.iterator();
		    while (iterator.hasNext()) {
			Class300 class300 = (Class300) iterator.next();
			class300.method4020(graphics_10_, (byte) -76);
		    }
		    graphics.drawImage(Class193.anImage2172, 0, 0, null);
		} catch (Exception exception) {
		    this.aBool3185 = true;
		}
	    } else
		Class64.aCanvas754.repaint();
	}
    }
    
    @Override
	public void method153(boolean bool) {
	if (!this.aBool3185 && !this.aBool3191) {
	    this.aBool3191 = true;
	    try {
		String[] strings = Class520.method6348(client.aString10867,
						       '|', (byte) -91);
		if (strings.length < 3)
		    this.aBool3185 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class64.aCanvas754);
		    int i = 0;
		    for (int i_11_ = 0; i_11_ < strings.length; i_11_++) {
			String[] strings_12_
			    = Class520.method6348(strings[i_11_].trim(), '=',
						  (byte) 62);
			if (strings_12_[0].equals("halign"))
			    this.aBool3188
				= Boolean.parseBoolean(strings_12_[1]);
			else if (strings_12_[0].equals("valign"))
			    this.aBool3189
				= Boolean.parseBoolean(strings_12_[1]);
			else if (strings_12_[0].equals("image")) {
			    String[] strings_13_
				= Class520.method6348(strings_12_[1], ',',
						      (byte) 30);
			    Image image;
			    try {
				image = method3881(strings_13_[0], (byte) -35);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (image != null) {
				mediatracker.addImage(image, i++);
				this.aList3187.add
				    (new Class300_Sub1
				     (this, image,
				      Class454.method5495(strings_13_[1],
							  717927929),
				      Class454.method5495(strings_13_[2],
							  717927929)));
			    }
			} else if (strings_12_[0].equals("rotatingimage")) {
			    String[] strings_14_
				= Class520.method6348(strings_12_[1], ',',
						      (byte) 15);
			    Image image;
			    try {
				image = method3881(strings_14_[0], (byte) -99);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				this.aList3187.add
				    (new Class300_Sub1_Sub1
				     (this, image,
				      Class454.method5495(strings_14_[1],
							  717927929),
				      Class454.method5495(strings_14_[2],
							  717927929),
				      Float.parseFloat(strings_14_[3])));
			    }
			} else if (strings_12_[0].equals("progress")) {
			    String[] strings_15_
				= Class520.method6348(strings_12_[1], ',',
						      (byte) -29);
			    this.aList3187.add
				(new Class300_Sub2
				 (this, Boolean.parseBoolean(strings_15_[0]),
				  strings_15_[1],
				  Class454.method5495(strings_15_[2],
						      717927929),
				  Integer.decode(strings_15_[3]).intValue(),
				  Class454.method5495(strings_15_[4],
						      717927929),
				  Class454.method5495(strings_15_[5],
						      717927929)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		this.aBool3185 = true;
	    }
	}
	if (this.aBool3185)
	    method3882((short) -13686);
	else {
	    Graphics graphics = Class64.aCanvas754.getGraphics();
	    if (null != graphics) {
		try {
		    this.aString3190
			= new StringBuilder().append("").append
			      (Class293.aClass292_3215.method3922(-1212093953))
			      .append
			      ("%").toString();
		    this.aString3186
			= Class293.aClass292_3215.method3911((byte) -48);
		    if (null == Class193.anImage2172)
			Class193.anImage2172
			    = (Class64.aCanvas754.createImage
			       (-1117838587 * Class411.anInt4713,
				Class509.anInt6933 * -2142152407));
		    Graphics graphics_16_ = Class193.anImage2172.getGraphics();
		    graphics_16_.setColor(Color.BLACK);
		    graphics_16_.fillRect(0, 0,
					  Class411.anInt4713 * -1117838587,
					  -2142152407 * Class509.anInt6933);
		    Iterator iterator = this.aList3187.iterator();
		    while (iterator.hasNext()) {
			Class300 class300 = (Class300) iterator.next();
			class300.method4020(graphics_16_, (byte) -47);
		    }
		    graphics.drawImage(Class193.anImage2172, 0, 0, null);
		} catch (Exception exception) {
		    this.aBool3185 = true;
		}
	    } else
		Class64.aCanvas754.repaint();
	}
    }
    
    void method3887() {
	Class449.method5427
	    (Class293.aClass292_3215.method3922(-1161534336),
	     Class293.aClass292_3215.method3911((byte) -31),
	     client.aColorArray10919[client.anInt10863 * 1181441341],
	     client.aColorArray10909[client.anInt10863 * 1181441341],
	     client.aColorArray10910[1181441341 * client.anInt10863],
	     -1210445788);
    }
    
    @Override
	public void method146(boolean bool, int i) {
	if (!this.aBool3185 && !this.aBool3191) {
	    this.aBool3191 = true;
	    try {
		String[] strings = Class520.method6348(client.aString10867,
						       '|', (byte) -23);
		if (strings.length < 3)
		    this.aBool3185 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class64.aCanvas754);
		    int i_17_ = 0;
		    for (int i_18_ = 0; i_18_ < strings.length; i_18_++) {
			String[] strings_19_
			    = Class520.method6348(strings[i_18_].trim(), '=',
						  (byte) 49);
			if (strings_19_[0].equals("halign"))
			    this.aBool3188
				= Boolean.parseBoolean(strings_19_[1]);
			else if (strings_19_[0].equals("valign"))
			    this.aBool3189
				= Boolean.parseBoolean(strings_19_[1]);
			else if (strings_19_[0].equals("image")) {
			    String[] strings_20_
				= Class520.method6348(strings_19_[1], ',',
						      (byte) -45);
			    Image image;
			    try {
				image = method3881(strings_20_[0], (byte) -10);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (image != null) {
				mediatracker.addImage(image, i_17_++);
				this.aList3187.add
				    (new Class300_Sub1
				     (this, image,
				      Class454.method5495(strings_20_[1],
							  717927929),
				      Class454.method5495(strings_20_[2],
							  717927929)));
			    }
			} else if (strings_19_[0].equals("rotatingimage")) {
			    String[] strings_21_
				= Class520.method6348(strings_19_[1], ',',
						      (byte) -81);
			    Image image;
			    try {
				image
				    = method3881(strings_21_[0], (byte) -104);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i_17_++);
				this.aList3187.add
				    (new Class300_Sub1_Sub1
				     (this, image,
				      Class454.method5495(strings_21_[1],
							  717927929),
				      Class454.method5495(strings_21_[2],
							  717927929),
				      Float.parseFloat(strings_21_[3])));
			    }
			} else if (strings_19_[0].equals("progress")) {
			    String[] strings_22_
				= Class520.method6348(strings_19_[1], ',',
						      (byte) 8);
			    this.aList3187.add
				(new Class300_Sub2
				 (this, Boolean.parseBoolean(strings_22_[0]),
				  strings_22_[1],
				  Class454.method5495(strings_22_[2],
						      717927929),
				  Integer.decode(strings_22_[3]).intValue(),
				  Class454.method5495(strings_22_[4],
						      717927929),
				  Class454.method5495(strings_22_[5],
						      717927929)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		this.aBool3185 = true;
	    }
	}
	if (this.aBool3185)
	    method3882((short) -14562);
	else {
	    Graphics graphics = Class64.aCanvas754.getGraphics();
	    if (null != graphics) {
		try {
		    this.aString3190
			= new StringBuilder().append("").append
			      (Class293.aClass292_3215.method3922(-2132050207))
			      .append
			      ("%").toString();
		    this.aString3186
			= Class293.aClass292_3215.method3911((byte) -95);
		    if (null == Class193.anImage2172)
			Class193.anImage2172
			    = (Class64.aCanvas754.createImage
			       (-1117838587 * Class411.anInt4713,
				Class509.anInt6933 * -2142152407));
		    Graphics graphics_23_ = Class193.anImage2172.getGraphics();
		    graphics_23_.setColor(Color.BLACK);
		    graphics_23_.fillRect(0, 0,
					  Class411.anInt4713 * -1117838587,
					  -2142152407 * Class509.anInt6933);
		    Iterator iterator = this.aList3187.iterator();
		    while (iterator.hasNext()) {
			Class300 class300 = (Class300) iterator.next();
			class300.method4020(graphics_23_, (byte) -124);
		    }
		    graphics.drawImage(Class193.anImage2172, 0, 0, null);
		} catch (Exception exception) {
		    this.aBool3185 = true;
		}
	    } else
		Class64.aCanvas754.repaint();
	}
    }
    
    Class290() {
	/* empty */
    }
    
    void method3888() {
	Class449.method5427
	    (Class293.aClass292_3215.method3922(-1968003821),
	     Class293.aClass292_3215.method3911((byte) -6),
	     client.aColorArray10919[client.anInt10863 * 1181441341],
	     client.aColorArray10909[client.anInt10863 * 1181441341],
	     client.aColorArray10910[1181441341 * client.anInt10863],
	     -1210445788);
    }
    
    @Override
	public void method156() {
	OutgoingOpcode.method4858((byte) -114);
    }
    
    @Override
	public void method149() {
	/* empty */
    }
    
    @Override
	public boolean method150(long l) {
	return true;
    }
    
    @Override
	public int method148() {
	return 100;
    }
    
    @Override
	public boolean method157(long l) {
	return true;
    }
    
    @Override
	public boolean method158(long l) {
	return true;
    }
    
    @Override
	public void method147(int i) {
	/* empty */
    }
    
    @Override
	public int method151() {
	return 0;
    }
    
    @Override
	public int method161() {
	return 0;
    }
    
    void method3889() {
	Class449.method5427
	    (Class293.aClass292_3215.method3922(1758659247),
	     Class293.aClass292_3215.method3911((byte) -86),
	     client.aColorArray10919[client.anInt10863 * 1181441341],
	     client.aColorArray10909[client.anInt10863 * 1181441341],
	     client.aColorArray10910[1181441341 * client.anInt10863],
	     -1210445788);
    }
    
    @Override
	public void method163() {
	/* empty */
    }
    
    static final void method3890(Class648 class648, int i) {
	class648.anInt8395 -= -1816921966;
	int i_24_ = (class648.anIntArray8394
		     [class648.anInt8395 * 717927929]);
	int i_25_ = (class648.anIntArray8394
		     [1 + 717927929 * class648.anInt8395]);
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = Class560_Sub1.method9841(i_24_, i_25_, false, -1918527719);
    }
    
    public static final void method3891(int i) {
	for (Class528_Sub9 class528_sub9
		 = ((Class528_Sub9)
		    Class528_Sub9.aClass688_10287.method8034(1888895369));
	     class528_sub9 != null;
	     class528_sub9 = (Class528_Sub9) Class528_Sub9.aClass688_10287
						 .method8037(472091920)) {
	    if (!class528_sub9.aBool10277) {
		class528_sub9.aBool10285 = true;
		if (class528_sub9.anInt10276 * -419484275 >= 0
		    && 1250348405 * class528_sub9.anInt10288 >= 0
		    && (class528_sub9.anInt10276 * -419484275
			< client.gameScene.method6029((short) 13457))
		    && (1250348405 * class528_sub9.anInt10288
			< client.gameScene.method5967(1565491255)))
		    Class181_Sub5.method8958(class528_sub9, 1768748686);
	    } else
		class528_sub9.method6443(271996302);
	}
	for (Class528_Sub9 class528_sub9
		 = ((Class528_Sub9)
		    Class528_Sub9.aClass688_10274.method8034(1529397714));
	     null != class528_sub9;
	     class528_sub9 = (Class528_Sub9) Class528_Sub9.aClass688_10274
						 .method8037(-928020326)) {
	    if (!class528_sub9.aBool10277)
		class528_sub9.aBool10285 = true;
	    else
		class528_sub9.method6443(579990623);
	}
    }
    
    static final void method3892(Class648 class648, short i) {
	int i_26_
	    = (class648.anIntArray8394
	       [(class648.anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_26_, (byte) -1);
	Class619.method7386(class229, class648, (byte) 27);
    }
    
    static final void method3893(Class648 class648, byte i) {
	if (Class700.aBool8733 && Class207.aFrame2236 != null)
	    Class289.method3875(Class514.aClass528_Sub38_6967
				    .aClass691_Sub3_10593
				    .method9844((byte) 59),
				-1, -1, false, 2130003981);
	if (Class643.method7662((short) -10225) == Class502.aClass502_6870) {
	    Class647.method7712((short) 728);
	    System.exit(0);
	} else
	    Class181_Sub11.method8963(262750126);
    }
    
    static final void method3894(Class648 class648, int i) {
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = Class632.method7552(-792553642);
    }
}
