/* Class163_Sub2_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class163_Sub2_Sub3_Sub1 extends Class163_Sub2_Sub3
{
    Image anImage11929;
    
    void method10380() {
	super.method10375((byte) 86);
	DataBufferInt databufferint
	    = new DataBufferInt((((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338),
				(((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338).length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       ((directcolormodel.createCompatibleSampleModel
		 (-1671219539 * ((Class163_Sub2_Sub3_Sub1) this).anInt11335,
		  1816002233 * ((Class163_Sub2_Sub3_Sub1) this).anInt11337)),
		databufferint, null));
	((Class163_Sub2_Sub3_Sub1) this).anImage11929
	    = new BufferedImage(directcolormodel, writableraster, false,
				new Hashtable());
    }
    
    void method10379() {
	super.method10375((byte) 32);
	DataBufferInt databufferint
	    = new DataBufferInt((((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338),
				(((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338).length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       ((directcolormodel.createCompatibleSampleModel
		 (-1671219539 * ((Class163_Sub2_Sub3_Sub1) this).anInt11335,
		  1816002233 * ((Class163_Sub2_Sub3_Sub1) this).anInt11337)),
		databufferint, null));
	((Class163_Sub2_Sub3_Sub1) this).anImage11929
	    = new BufferedImage(directcolormodel, writableraster, false,
				new Hashtable());
    }
    
    void method10376() {
	super.method10375((byte) 69);
	DataBufferInt databufferint
	    = new DataBufferInt((((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338),
				(((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338).length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       ((directcolormodel.createCompatibleSampleModel
		 (-1671219539 * ((Class163_Sub2_Sub3_Sub1) this).anInt11335,
		  1816002233 * ((Class163_Sub2_Sub3_Sub1) this).anInt11337)),
		databufferint, null));
	((Class163_Sub2_Sub3_Sub1) this).anImage11929
	    = new BufferedImage(directcolormodel, writableraster, false,
				new Hashtable());
    }
    
    public final int method8924(int i, int i_0_) {
	Graphics graphics
	    = ((Class163_Sub2_Sub3_Sub1) this).aCanvas11340.getGraphics();
	if (null == graphics)
	    return 0;
	graphics.drawImage(((Class163_Sub2_Sub3_Sub1) this).anImage11929, i,
			   i_0_,
			   ((Class163_Sub2_Sub3_Sub1) this).aCanvas11340);
	return 0;
    }
    
    public void method115() {
	/* empty */
    }
    
    public void method204() {
	/* empty */
    }
    
    public void method198() {
	/* empty */
    }
    
    public void method337() {
	/* empty */
    }
    
    void method10377() {
	super.method10375((byte) 39);
	DataBufferInt databufferint
	    = new DataBufferInt((((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338),
				(((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338).length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       ((directcolormodel.createCompatibleSampleModel
		 (-1671219539 * ((Class163_Sub2_Sub3_Sub1) this).anInt11335,
		  1816002233 * ((Class163_Sub2_Sub3_Sub1) this).anInt11337)),
		databufferint, null));
	((Class163_Sub2_Sub3_Sub1) this).anImage11929
	    = new BufferedImage(directcolormodel, writableraster, false,
				new Hashtable());
    }
    
    void method10378() {
	super.method10375((byte) 21);
	DataBufferInt databufferint
	    = new DataBufferInt((((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338),
				(((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338).length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       ((directcolormodel.createCompatibleSampleModel
		 (-1671219539 * ((Class163_Sub2_Sub3_Sub1) this).anInt11335,
		  1816002233 * ((Class163_Sub2_Sub3_Sub1) this).anInt11337)),
		databufferint, null));
	((Class163_Sub2_Sub3_Sub1) this).anImage11929
	    = new BufferedImage(directcolormodel, writableraster, false,
				new Hashtable());
    }
    
    public int method8917() {
	return method8924(0, 0);
    }
    
    Class163_Sub2_Sub3_Sub1(Class173_Sub3 class173_sub3, Canvas canvas, int i,
			    int i_1_) {
	super(class173_sub3, canvas, i, i_1_);
	new Rectangle();
	method10375((byte) 77);
    }
    
    void method10375(byte i) {
	super.method10375((byte) 46);
	DataBufferInt databufferint
	    = new DataBufferInt((((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338),
				(((Class163_Sub2_Sub3_Sub1) this)
				 .anIntArray11338).length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = (Raster.createWritableRaster
	       ((directcolormodel.createCompatibleSampleModel
		 (-1671219539 * ((Class163_Sub2_Sub3_Sub1) this).anInt11335,
		  1816002233 * ((Class163_Sub2_Sub3_Sub1) this).anInt11337)),
		databufferint, null));
	((Class163_Sub2_Sub3_Sub1) this).anImage11929
	    = new BufferedImage(directcolormodel, writableraster, false,
				new Hashtable());
    }
    
    public int method8916() {
	return method8924(0, 0);
    }
    
    public final int method8922(int i, int i_2_) {
	Graphics graphics
	    = ((Class163_Sub2_Sub3_Sub1) this).aCanvas11340.getGraphics();
	if (null == graphics)
	    return 0;
	graphics.drawImage(((Class163_Sub2_Sub3_Sub1) this).anImage11929, i,
			   i_2_,
			   ((Class163_Sub2_Sub3_Sub1) this).aCanvas11340);
	return 0;
    }
    
    public final int method8923(int i, int i_3_) {
	Graphics graphics
	    = ((Class163_Sub2_Sub3_Sub1) this).aCanvas11340.getGraphics();
	if (null == graphics)
	    return 0;
	graphics.drawImage(((Class163_Sub2_Sub3_Sub1) this).anImage11929, i,
			   i_3_,
			   ((Class163_Sub2_Sub3_Sub1) this).aCanvas11340);
	return 0;
    }
    
    public final int method8918(int i, int i_4_) {
	Graphics graphics
	    = ((Class163_Sub2_Sub3_Sub1) this).aCanvas11340.getGraphics();
	if (null == graphics)
	    return 0;
	graphics.drawImage(((Class163_Sub2_Sub3_Sub1) this).anImage11929, i,
			   i_4_,
			   ((Class163_Sub2_Sub3_Sub1) this).aCanvas11340);
	return 0;
    }
}
