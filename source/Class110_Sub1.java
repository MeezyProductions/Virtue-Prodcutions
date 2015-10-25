/* Class110_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class110_Sub1 extends Class110
{
    Class111 aClass111_8778;
    static final char aChar8779 = '\0';
    int anInt8780;
    static final char aChar8781 = '\001';
    static final String aString8782
	= "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
    float[] aFloatArray8783;
    float aFloat8784;
    Class128 aClass128_8785;
    Class115 aClass115_8786;
    static float[] aFloatArray8787 = new float[4];
    
    @Override
	void method1419(boolean bool) {
	if (this.aClass111_8778 != null) {
	    this.aClass111_8778.method1428('\0');
	    this.aClass173_Sub2_1397.method8774(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((this.aClass173_Sub2_1397
				  .aClass418_9486.aFloatArray4768),
				 0);
	    OpenGL.glMatrixMode(5888);
	    this.aClass173_Sub2_1397.method8774(0);
	    if (this.anInt8780
		!= this.aClass173_Sub2_1397.anInt9474) {
		int i = (this.aClass173_Sub2_1397.anInt9474
			 % 5000 * 128 / 5000);
		for (int i_3_ = 0; i_3_ < 64; i_3_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_3_,
							 (this
							  .aFloatArray8783),
							 i);
		    i += 2;
		}
		if (this.aClass115_8786
		    .aBool1421)
		    this.aFloat8784
			= ((this
						      .aClass173_Sub2_1397)
				    .anInt9474)
				   % 4000 / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		this.anInt8780
		    = this.aClass173_Sub2_1397.anInt9474;
	    }
	}
    }

    @Override
	void method1409() {
	if (this.aClass111_8778 != null) {
	    this.aClass111_8778.method1428('\001');
	    this.aClass173_Sub2_1397.method8774(1);
	    this.aClass173_Sub2_1397.method8775(null);
	    this.aClass173_Sub2_1397.method8774(0);
	}
    }
    
    @Override
	void method1410(int i, int i_5_) {
	if (this.aClass111_8778 != null) {
	    this.aClass173_Sub2_1397.method8774(1);
	    if ((i & 0x80) == 0) {
		if ((i_5_ & 0x1) == 1) {
		    if (!this.aClass115_8786
			 .aBool1421) {
			int i_6_ = (((this
						       .aClass173_Sub2_1397)
				     .anInt9474)
				    % 4000 * 16 / 4000);
			this.aClass173_Sub2_1397.method8775
			    (this.aClass115_8786
			     .aClass120_Sub4Array1413[i_6_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			this.aClass173_Sub2_1397.method8775
			    (this.aClass115_8786
			     .aClass120_Sub2_1417);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    this.aFloat8784,
							    0.0F, 0.0F, 1.0F);
		    }
		} else {
		    if (this.aClass115_8786
			.aBool1421)
			this.aClass173_Sub2_1397.method8775
			    (this.aClass115_8786
			     .aClass120_Sub2_1417);
		    else
			this.aClass173_Sub2_1397.method8775
			    (this.aClass115_8786
			     .aClass120_Sub4Array1413[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		this.aClass173_Sub2_1397.method8775(null);
	    this.aClass173_Sub2_1397.method8774(0);
	    if ((i & 0x40) == 0) {
		aFloatArray8787[0]
		    = (this.aClass173_Sub2_1397.aFloat9527
		       * (this
					   .aClass173_Sub2_1397).aFloat9436);
		aFloatArray8787[1]
		    = (this.aClass173_Sub2_1397.aFloat9527
		       * (this
					   .aClass173_Sub2_1397).aFloat9525);
		aFloatArray8787[2]
		    = (this.aClass173_Sub2_1397.aFloat9527
		       * (this
					   .aClass173_Sub2_1397).aFloat9458);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray8787, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_7_ = i & 0x3;
	    if (i_7_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_7_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    Class110_Sub1(Class173_Sub2 class173_sub2, Class115 class115) {
	super(class173_sub2);
	this.aClass115_8786 = class115;
	if ((this.aClass173_Sub2_1397
	     .aBool9479)
	    && (this.aClass173_Sub2_1397
		.anInt9563) >= 2) {
	    this.aClass128_8785
		= (Class128.method1621
		   (this.aClass173_Sub2_1397, 34336,
		    "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
	    if (this.aClass128_8785 != null) {
		int[][] is = Class237.method3293(64, 256, 0, 4, 4, 3, 0.4F,
						 false, 1324780379);
		int[][] is_8_ = Class237.method3293(64, 256, 8, 4, 4, 3, 0.4F,
						    false, 1324780379);
		int i = 0;
		this.aFloatArray8783 = new float[32768];
		for (int i_9_ = 0; i_9_ < 256; i_9_++) {
		    int[] is_10_ = is[i_9_];
		    int[] is_11_ = is_8_[i_9_];
		    for (int i_12_ = 0; i_12_ < 64; i_12_++) {
			this.aFloatArray8783[i++]
			    = is_10_[i_12_] / 4096.0F;
			this.aFloatArray8783[i++]
			    = is_11_[i_12_] / 4096.0F;
		    }
		}
		method8266();
	    }
	}
    }
    
    @Override
	void method1414(Class120 class120, int i) {
	this.aClass173_Sub2_1397.method8775(class120);
	this.aClass173_Sub2_1397.method8776(i);
    }
    
    @Override
	void method1405(boolean bool) {
	/* empty */
    }
    
    boolean method1417() {
	return true;
    }
    
    boolean method1407() {
	return true;
    }
    
    void method8265() {
	this.aClass111_8778
	    = new Class111(this.aClass173_Sub2_1397, 2);
	this.aClass111_8778.method1426(0);
	this.aClass173_Sub2_1397.method8774(1);
	this.aClass173_Sub2_1397.method8804(-16777216);
	this.aClass173_Sub2_1397.method8754(260, 7681);
	this.aClass173_Sub2_1397.method8808(0, 34166, 770);
	this.aClass173_Sub2_1397.method8774(0);
	OpenGL.glBindProgramARB(34336,
				(this
					     .aClass128_8785).anInt1586);
	OpenGL.glEnable(34336);
	this.aClass111_8778.method1425();
	this.aClass111_8778.method1426(1);
	this.aClass173_Sub2_1397.method8774(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	this.aClass173_Sub2_1397.method8776(0);
	this.aClass173_Sub2_1397.method8808(0, 5890, 770);
	this.aClass173_Sub2_1397.method8774(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	this.aClass111_8778.method1425();
    }
    
    void method1418(boolean bool) {
	if (this.aClass111_8778 != null) {
	    this.aClass111_8778.method1428('\0');
	    this.aClass173_Sub2_1397.method8774(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((this.aClass173_Sub2_1397
				  .aClass418_9486.aFloatArray4768),
				 0);
	    OpenGL.glMatrixMode(5888);
	    this.aClass173_Sub2_1397.method8774(0);
	    if (this.anInt8780
		!= this.aClass173_Sub2_1397.anInt9474) {
		int i = (this.aClass173_Sub2_1397.anInt9474
			 % 5000 * 128 / 5000);
		for (int i_13_ = 0; i_13_ < 64; i_13_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_13_,
							 (this
							  .aFloatArray8783),
							 i);
		    i += 2;
		}
		if (this.aClass115_8786
		    .aBool1421)
		    this.aFloat8784
			= ((this
						      .aClass173_Sub2_1397)
				    .anInt9474)
				   % 4000 / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		this.anInt8780
		    = this.aClass173_Sub2_1397.anInt9474;
	    }
	}
    }
    
    void method1408(boolean bool) {
	if (this.aClass111_8778 != null) {
	    this.aClass111_8778.method1428('\0');
	    this.aClass173_Sub2_1397.method8774(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((this.aClass173_Sub2_1397
				  .aClass418_9486.aFloatArray4768),
				 0);
	    OpenGL.glMatrixMode(5888);
	    this.aClass173_Sub2_1397.method8774(0);
	    if (this.anInt8780
		!= this.aClass173_Sub2_1397.anInt9474) {
		int i = (this.aClass173_Sub2_1397.anInt9474
			 % 5000 * 128 / 5000);
		for (int i_14_ = 0; i_14_ < 64; i_14_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_14_,
							 (this
							  .aFloatArray8783),
							 i);
		    i += 2;
		}
		if (this.aClass115_8786
		    .aBool1421)
		    this.aFloat8784
			= ((this
						      .aClass173_Sub2_1397)
				    .anInt9474)
				   % 4000 / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		this.anInt8780
		    = this.aClass173_Sub2_1397.anInt9474;
	    }
	}
    }
    
    boolean method1413() {
	return true;
    }
    
    @Override
	boolean method1415() {
	return true;
    }
    
    void method1420() {
	if (this.aClass111_8778 != null) {
	    this.aClass111_8778.method1428('\001');
	    this.aClass173_Sub2_1397.method8774(1);
	    this.aClass173_Sub2_1397.method8775(null);
	    this.aClass173_Sub2_1397.method8774(0);
	}
    }
    
    void method1424() {
	if (this.aClass111_8778 != null) {
	    this.aClass111_8778.method1428('\001');
	    this.aClass173_Sub2_1397.method8774(1);
	    this.aClass173_Sub2_1397.method8775(null);
	    this.aClass173_Sub2_1397.method8774(0);
	}
    }
    
    void method1421(int i, int i_15_) {
	if (this.aClass111_8778 != null) {
	    this.aClass173_Sub2_1397.method8774(1);
	    if ((i & 0x80) == 0) {
		if ((i_15_ & 0x1) == 1) {
		    if (!this.aClass115_8786
			 .aBool1421) {
			int i_16_ = (((this
							.aClass173_Sub2_1397)
				      .anInt9474)
				     % 4000 * 16 / 4000);
			this.aClass173_Sub2_1397.method8775
			    (this.aClass115_8786
			     .aClass120_Sub4Array1413[i_16_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			this.aClass173_Sub2_1397.method8775
			    (this.aClass115_8786
			     .aClass120_Sub2_1417);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    this.aFloat8784,
							    0.0F, 0.0F, 1.0F);
		    }
		} else {
		    if (this.aClass115_8786
			.aBool1421)
			this.aClass173_Sub2_1397.method8775
			    (this.aClass115_8786
			     .aClass120_Sub2_1417);
		    else
			this.aClass173_Sub2_1397.method8775
			    (this.aClass115_8786
			     .aClass120_Sub4Array1413[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		this.aClass173_Sub2_1397.method8775(null);
	    this.aClass173_Sub2_1397.method8774(0);
	    if ((i & 0x40) == 0) {
		aFloatArray8787[0]
		    = (this.aClass173_Sub2_1397.aFloat9527
		       * (this
					   .aClass173_Sub2_1397).aFloat9436);
		aFloatArray8787[1]
		    = (this.aClass173_Sub2_1397.aFloat9527
		       * (this
					   .aClass173_Sub2_1397).aFloat9525);
		aFloatArray8787[2]
		    = (this.aClass173_Sub2_1397.aFloat9527
		       * (this
					   .aClass173_Sub2_1397).aFloat9458);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray8787, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_17_ = i & 0x3;
	    if (i_17_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_17_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    void method8266() {
	this.aClass111_8778
	    = new Class111(this.aClass173_Sub2_1397, 2);
	this.aClass111_8778.method1426(0);
	this.aClass173_Sub2_1397.method8774(1);
	this.aClass173_Sub2_1397.method8804(-16777216);
	this.aClass173_Sub2_1397.method8754(260, 7681);
	this.aClass173_Sub2_1397.method8808(0, 34166, 770);
	this.aClass173_Sub2_1397.method8774(0);
	OpenGL.glBindProgramARB(34336,
				(this
					     .aClass128_8785).anInt1586);
	OpenGL.glEnable(34336);
	this.aClass111_8778.method1425();
	this.aClass111_8778.method1426(1);
	this.aClass173_Sub2_1397.method8774(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	this.aClass173_Sub2_1397.method8776(0);
	this.aClass173_Sub2_1397.method8808(0, 5890, 770);
	this.aClass173_Sub2_1397.method8774(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	this.aClass111_8778.method1425();
    }
    
    void method1423(Class120 class120, int i) {
	this.aClass173_Sub2_1397.method8775(class120);
	this.aClass173_Sub2_1397.method8776(i);
    }
    
    boolean method1412() {
	return true;
    }
}
