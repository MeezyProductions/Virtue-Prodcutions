/* Class110_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class110_Sub2 extends Class110
{
    static final String aString8838
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
    static float[] aFloatArray8839 = { 0.0F, -1.0F, 0.0F, 0.0F };
    static final String aString8840
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
    static final String aString8841
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
    boolean aBool8842;
    Class128 aClass128_8843;
    boolean aBool8844;
    boolean aBool8845 = false;
    Class120_Sub4 aClass120_Sub4_8846;
    Class128 aClass128_8847;
    static final String aString8848
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
    boolean aBool8849;
    Class128 aClass128_8850;
    Class128 aClass128_8851;
    
    void method1406(boolean bool) {
	/* empty */
    }
    
    void method8300() {
	Class418 class418
	    = (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
	       .aClass418_9485);
	if (((Class110_Sub2) this).aBool8844)
	    OpenGL.glBindProgramARB(34336,
				    ((((Class173_Sub2) (((Class110_Sub2) this)
							.aClass173_Sub2_1397))
				      .anInt9545) == 2147483647
				     ? ((Class128) (((Class110_Sub2) this)
						    .aClass128_8851)).anInt1586
				     : (((Class128)
					 ((Class110_Sub2) this).aClass128_8847)
					.anInt1586)));
	else
	    OpenGL.glBindProgramARB(34336,
				    ((((Class173_Sub2) (((Class110_Sub2) this)
							.aClass173_Sub2_1397))
				      .anInt9545) == 2147483647
				     ? ((Class128) (((Class110_Sub2) this)
						    .aClass128_8850)).anInt1586
				     : (((Class128)
					 ((Class110_Sub2) this).aClass128_8843)
					.anInt1586)));
	float f = (float) ((Class173_Sub2) (((Class110_Sub2) this)
					    .aClass173_Sub2_1397)).anInt9545;
	float f_0_
	    = class418.aFloatArray4768[4] * f + class418.aFloatArray4768[12];
	float f_1_
	    = class418.aFloatArray4768[5] * f + class418.aFloatArray4768[13];
	float f_2_
	    = class418.aFloatArray4768[6] * f + class418.aFloatArray4768[14];
	aFloatArray8839[0] = -class418.aFloatArray4768[4];
	aFloatArray8839[1] = -class418.aFloatArray4768[5];
	aFloatArray8839[2] = -class418.aFloatArray4768[6];
	aFloatArray8839[3]
	    = -(aFloatArray8839[0] * f_0_ + aFloatArray8839[1] * f_1_
		+ aFloatArray8839[2] * f_2_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8839[0],
					    aFloatArray8839[1],
					    aFloatArray8839[2],
					    aFloatArray8839[3]);
	OpenGL.glEnable(34336);
	((Class110_Sub2) this).aBool8849 = true;
	method8302();
    }
    
    void method1419(boolean bool) {
	((Class110_Sub2) this).aBool8844 = bool;
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub2) this).aClass173_Sub2_1397
	    .method8775(((Class110_Sub2) this).aClass120_Sub4_8846);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8754(34165, 7681);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 34166, 768);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(2, 5890, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 34168, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(0);
	method8300();
    }
    
    boolean method1415() {
	return ((Class110_Sub2) this).aBool8842;
    }
    
    Class110_Sub2(Class173_Sub2 class173_sub2) {
	super(class173_sub2);
	if (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
	    .aBool9479) {
	    ((Class110_Sub2) this).aClass128_8850
		= (Class128.method1621
		   (((Class110_Sub2) this).aClass173_Sub2_1397, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
	    ((Class110_Sub2) this).aClass128_8851
		= (Class128.method1621
		   (((Class110_Sub2) this).aClass173_Sub2_1397, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
	    ((Class110_Sub2) this).aClass128_8843
		= (Class128.method1621
		   (((Class110_Sub2) this).aClass173_Sub2_1397, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
	    ((Class110_Sub2) this).aClass128_8847
		= (Class128.method1621
		   (((Class110_Sub2) this).aClass173_Sub2_1397, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
	    if (((Class110_Sub2) this).aClass128_8850 != null
		& ((Class110_Sub2) this).aClass128_8851 != null
		& ((Class110_Sub2) this).aClass128_8843 != null
		& ((Class110_Sub2) this).aClass128_8847 != null) {
		((Class110_Sub2) this).aClass120_Sub4_8846
		    = new Class120_Sub4(class173_sub2, 3553,
					Class149.aClass149_1677,
					Class169.aClass169_1935, 2, 1, false,
					new byte[] { 0, -1 },
					Class149.aClass149_1677, false);
		((Class110_Sub2) this).aClass120_Sub4_8846.method8259(false,
								      false);
		((Class110_Sub2) this).aBool8842 = true;
	    } else
		((Class110_Sub2) this).aBool8842 = false;
	} else
	    ((Class110_Sub2) this).aBool8842 = false;
    }
    
    void method8301() {
	if (((Class110_Sub2) this).aBool8849) {
	    float f
		= (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		   .aFloat9499);
	    float f_3_
		= (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		   .aFloat9498);
	    float f_4_ = f - (f - f_3_) * 0.125F;
	    float f_5_ = f - (f - f_3_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_5_, f_4_,
		 256.0F / (float) ((((Class173_Sub2) (((Class110_Sub2) this)
						      .aClass173_Sub2_1397))
				    .aClass164_9546.anInt1828)
				   * -386339441),
		 (float) ((((Class173_Sub2)
			    ((Class110_Sub2) this).aClass173_Sub2_1397)
			   .aClass164_9546.anInt1829)
			  * 1802884547) / 255.0F);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8804
		((((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		  .aClass164_9546.anInt1827) * -222719641);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8774(0);
	}
    }
    
    void method8302() {
	if (((Class110_Sub2) this).aBool8849) {
	    float f
		= (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		   .aFloat9499);
	    float f_6_
		= (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		   .aFloat9498);
	    float f_7_ = f - (f - f_6_) * 0.125F;
	    float f_8_ = f - (f - f_6_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_8_, f_7_,
		 256.0F / (float) ((((Class173_Sub2) (((Class110_Sub2) this)
						      .aClass173_Sub2_1397))
				    .aClass164_9546.anInt1828)
				   * -386339441),
		 (float) ((((Class173_Sub2)
			    ((Class110_Sub2) this).aClass173_Sub2_1397)
			   .aClass164_9546.anInt1829)
			  * 1802884547) / 255.0F);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8804
		((((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		  .aClass164_9546.anInt1827) * -222719641);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8774(0);
	}
    }
    
    void method1414(Class120 class120, int i) {
	if (class120 == null) {
	    if (!((Class110_Sub2) this).aBool8845) {
		((Class110_Sub2) this).aClass173_Sub2_1397.method8775
		    (((Class173_Sub2)
		      ((Class110_Sub2) this).aClass173_Sub2_1397)
		     .aClass120_Sub4_9555);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8776(1);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 34168,
								      768);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 34168,
								      770);
		((Class110_Sub2) this).aBool8845 = true;
	    }
	} else {
	    if (((Class110_Sub2) this).aBool8845) {
		((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 5890,
								      768);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 5890,
								      770);
		((Class110_Sub2) this).aBool8845 = false;
	    }
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8775(class120);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8776(i);
	}
    }
    
    void method1405(boolean bool) {
	/* empty */
    }
    
    boolean method1412() {
	return ((Class110_Sub2) this).aBool8842;
    }
    
    boolean method1413() {
	return ((Class110_Sub2) this).aBool8842;
    }
    
    boolean method1417() {
	return ((Class110_Sub2) this).aBool8842;
    }
    
    boolean method1407() {
	return ((Class110_Sub2) this).aBool8842;
    }
    
    void method1416(boolean bool) {
	((Class110_Sub2) this).aBool8844 = bool;
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub2) this).aClass173_Sub2_1397
	    .method8775(((Class110_Sub2) this).aClass120_Sub4_8846);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8754(34165, 7681);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 34166, 768);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(2, 5890, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 34168, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(0);
	method8300();
    }
    
    void method1408(boolean bool) {
	((Class110_Sub2) this).aBool8844 = bool;
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub2) this).aClass173_Sub2_1397
	    .method8775(((Class110_Sub2) this).aClass120_Sub4_8846);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8754(34165, 7681);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 34166, 768);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(2, 5890, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 34168, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(0);
	method8300();
    }
    
    void method1422(int i, int i_9_) {
	/* empty */
    }
    
    void method1418(boolean bool) {
	((Class110_Sub2) this).aBool8844 = bool;
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub2) this).aClass173_Sub2_1397
	    .method8775(((Class110_Sub2) this).aClass120_Sub4_8846);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8754(34165, 7681);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 34166, 768);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(2, 5890, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 34168, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(0);
	method8300();
    }
    
    void method1410(int i, int i_10_) {
	/* empty */
    }
    
    void method8303() {
	Class418 class418
	    = (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
	       .aClass418_9485);
	if (((Class110_Sub2) this).aBool8844)
	    OpenGL.glBindProgramARB(34336,
				    ((((Class173_Sub2) (((Class110_Sub2) this)
							.aClass173_Sub2_1397))
				      .anInt9545) == 2147483647
				     ? ((Class128) (((Class110_Sub2) this)
						    .aClass128_8851)).anInt1586
				     : (((Class128)
					 ((Class110_Sub2) this).aClass128_8847)
					.anInt1586)));
	else
	    OpenGL.glBindProgramARB(34336,
				    ((((Class173_Sub2) (((Class110_Sub2) this)
							.aClass173_Sub2_1397))
				      .anInt9545) == 2147483647
				     ? ((Class128) (((Class110_Sub2) this)
						    .aClass128_8850)).anInt1586
				     : (((Class128)
					 ((Class110_Sub2) this).aClass128_8843)
					.anInt1586)));
	float f = (float) ((Class173_Sub2) (((Class110_Sub2) this)
					    .aClass173_Sub2_1397)).anInt9545;
	float f_11_
	    = class418.aFloatArray4768[4] * f + class418.aFloatArray4768[12];
	float f_12_
	    = class418.aFloatArray4768[5] * f + class418.aFloatArray4768[13];
	float f_13_
	    = class418.aFloatArray4768[6] * f + class418.aFloatArray4768[14];
	aFloatArray8839[0] = -class418.aFloatArray4768[4];
	aFloatArray8839[1] = -class418.aFloatArray4768[5];
	aFloatArray8839[2] = -class418.aFloatArray4768[6];
	aFloatArray8839[3]
	    = -(aFloatArray8839[0] * f_11_ + aFloatArray8839[1] * f_12_
		+ aFloatArray8839[2] * f_13_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8839[0],
					    aFloatArray8839[1],
					    aFloatArray8839[2],
					    aFloatArray8839[3]);
	OpenGL.glEnable(34336);
	((Class110_Sub2) this).aBool8849 = true;
	method8302();
    }
    
    void method1421(int i, int i_14_) {
	/* empty */
    }
    
    void method1424() {
	if (((Class110_Sub2) this).aBool8849) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    ((Class110_Sub2) this).aBool8849 = false;
	}
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8775(null);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8754(8448, 8448);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 5890, 768);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(2, 34166, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 5890, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(0);
	if (((Class110_Sub2) this).aBool8845) {
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 5890,
								  768);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 5890,
								  770);
	    ((Class110_Sub2) this).aBool8845 = false;
	}
    }
    
    void method1423(Class120 class120, int i) {
	if (class120 == null) {
	    if (!((Class110_Sub2) this).aBool8845) {
		((Class110_Sub2) this).aClass173_Sub2_1397.method8775
		    (((Class173_Sub2)
		      ((Class110_Sub2) this).aClass173_Sub2_1397)
		     .aClass120_Sub4_9555);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8776(1);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 34168,
								      768);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 34168,
								      770);
		((Class110_Sub2) this).aBool8845 = true;
	    }
	} else {
	    if (((Class110_Sub2) this).aBool8845) {
		((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 5890,
								      768);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 5890,
								      770);
		((Class110_Sub2) this).aBool8845 = false;
	    }
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8775(class120);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8776(i);
	}
    }
    
    void method1411(Class120 class120, int i) {
	if (class120 == null) {
	    if (!((Class110_Sub2) this).aBool8845) {
		((Class110_Sub2) this).aClass173_Sub2_1397.method8775
		    (((Class173_Sub2)
		      ((Class110_Sub2) this).aClass173_Sub2_1397)
		     .aClass120_Sub4_9555);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8776(1);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 34168,
								      768);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 34168,
								      770);
		((Class110_Sub2) this).aBool8845 = true;
	    }
	} else {
	    if (((Class110_Sub2) this).aBool8845) {
		((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 5890,
								      768);
		((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 5890,
								      770);
		((Class110_Sub2) this).aBool8845 = false;
	    }
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8775(class120);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8776(i);
	}
    }
    
    void method1409() {
	if (((Class110_Sub2) this).aBool8849) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    ((Class110_Sub2) this).aBool8849 = false;
	}
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8775(null);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8754(8448, 8448);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 5890, 768);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(2, 34166, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 5890, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(0);
	if (((Class110_Sub2) this).aBool8845) {
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 5890,
								  768);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 5890,
								  770);
	    ((Class110_Sub2) this).aBool8845 = false;
	}
    }
    
    void method8304() {
	Class418 class418
	    = (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
	       .aClass418_9485);
	if (((Class110_Sub2) this).aBool8844)
	    OpenGL.glBindProgramARB(34336,
				    ((((Class173_Sub2) (((Class110_Sub2) this)
							.aClass173_Sub2_1397))
				      .anInt9545) == 2147483647
				     ? ((Class128) (((Class110_Sub2) this)
						    .aClass128_8851)).anInt1586
				     : (((Class128)
					 ((Class110_Sub2) this).aClass128_8847)
					.anInt1586)));
	else
	    OpenGL.glBindProgramARB(34336,
				    ((((Class173_Sub2) (((Class110_Sub2) this)
							.aClass173_Sub2_1397))
				      .anInt9545) == 2147483647
				     ? ((Class128) (((Class110_Sub2) this)
						    .aClass128_8850)).anInt1586
				     : (((Class128)
					 ((Class110_Sub2) this).aClass128_8843)
					.anInt1586)));
	float f = (float) ((Class173_Sub2) (((Class110_Sub2) this)
					    .aClass173_Sub2_1397)).anInt9545;
	float f_15_
	    = class418.aFloatArray4768[4] * f + class418.aFloatArray4768[12];
	float f_16_
	    = class418.aFloatArray4768[5] * f + class418.aFloatArray4768[13];
	float f_17_
	    = class418.aFloatArray4768[6] * f + class418.aFloatArray4768[14];
	aFloatArray8839[0] = -class418.aFloatArray4768[4];
	aFloatArray8839[1] = -class418.aFloatArray4768[5];
	aFloatArray8839[2] = -class418.aFloatArray4768[6];
	aFloatArray8839[3]
	    = -(aFloatArray8839[0] * f_15_ + aFloatArray8839[1] * f_16_
		+ aFloatArray8839[2] * f_17_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8839[0],
					    aFloatArray8839[1],
					    aFloatArray8839[2],
					    aFloatArray8839[3]);
	OpenGL.glEnable(34336);
	((Class110_Sub2) this).aBool8849 = true;
	method8302();
    }
    
    void method8305() {
	Class418 class418
	    = (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
	       .aClass418_9485);
	if (((Class110_Sub2) this).aBool8844)
	    OpenGL.glBindProgramARB(34336,
				    ((((Class173_Sub2) (((Class110_Sub2) this)
							.aClass173_Sub2_1397))
				      .anInt9545) == 2147483647
				     ? ((Class128) (((Class110_Sub2) this)
						    .aClass128_8851)).anInt1586
				     : (((Class128)
					 ((Class110_Sub2) this).aClass128_8847)
					.anInt1586)));
	else
	    OpenGL.glBindProgramARB(34336,
				    ((((Class173_Sub2) (((Class110_Sub2) this)
							.aClass173_Sub2_1397))
				      .anInt9545) == 2147483647
				     ? ((Class128) (((Class110_Sub2) this)
						    .aClass128_8850)).anInt1586
				     : (((Class128)
					 ((Class110_Sub2) this).aClass128_8843)
					.anInt1586)));
	float f = (float) ((Class173_Sub2) (((Class110_Sub2) this)
					    .aClass173_Sub2_1397)).anInt9545;
	float f_18_
	    = class418.aFloatArray4768[4] * f + class418.aFloatArray4768[12];
	float f_19_
	    = class418.aFloatArray4768[5] * f + class418.aFloatArray4768[13];
	float f_20_
	    = class418.aFloatArray4768[6] * f + class418.aFloatArray4768[14];
	aFloatArray8839[0] = -class418.aFloatArray4768[4];
	aFloatArray8839[1] = -class418.aFloatArray4768[5];
	aFloatArray8839[2] = -class418.aFloatArray4768[6];
	aFloatArray8839[3]
	    = -(aFloatArray8839[0] * f_18_ + aFloatArray8839[1] * f_19_
		+ aFloatArray8839[2] * f_20_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8839[0],
					    aFloatArray8839[1],
					    aFloatArray8839[2],
					    aFloatArray8839[3]);
	OpenGL.glEnable(34336);
	((Class110_Sub2) this).aBool8849 = true;
	method8302();
    }
    
    void method8306() {
	Class418 class418
	    = (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
	       .aClass418_9485);
	if (((Class110_Sub2) this).aBool8844)
	    OpenGL.glBindProgramARB(34336,
				    ((((Class173_Sub2) (((Class110_Sub2) this)
							.aClass173_Sub2_1397))
				      .anInt9545) == 2147483647
				     ? ((Class128) (((Class110_Sub2) this)
						    .aClass128_8851)).anInt1586
				     : (((Class128)
					 ((Class110_Sub2) this).aClass128_8847)
					.anInt1586)));
	else
	    OpenGL.glBindProgramARB(34336,
				    ((((Class173_Sub2) (((Class110_Sub2) this)
							.aClass173_Sub2_1397))
				      .anInt9545) == 2147483647
				     ? ((Class128) (((Class110_Sub2) this)
						    .aClass128_8850)).anInt1586
				     : (((Class128)
					 ((Class110_Sub2) this).aClass128_8843)
					.anInt1586)));
	float f = (float) ((Class173_Sub2) (((Class110_Sub2) this)
					    .aClass173_Sub2_1397)).anInt9545;
	float f_21_
	    = class418.aFloatArray4768[4] * f + class418.aFloatArray4768[12];
	float f_22_
	    = class418.aFloatArray4768[5] * f + class418.aFloatArray4768[13];
	float f_23_
	    = class418.aFloatArray4768[6] * f + class418.aFloatArray4768[14];
	aFloatArray8839[0] = -class418.aFloatArray4768[4];
	aFloatArray8839[1] = -class418.aFloatArray4768[5];
	aFloatArray8839[2] = -class418.aFloatArray4768[6];
	aFloatArray8839[3]
	    = -(aFloatArray8839[0] * f_21_ + aFloatArray8839[1] * f_22_
		+ aFloatArray8839[2] * f_23_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8839[0],
					    aFloatArray8839[1],
					    aFloatArray8839[2],
					    aFloatArray8839[3]);
	OpenGL.glEnable(34336);
	((Class110_Sub2) this).aBool8849 = true;
	method8302();
    }
    
    void method1420() {
	if (((Class110_Sub2) this).aBool8849) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    ((Class110_Sub2) this).aBool8849 = false;
	}
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(1);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8775(null);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8754(8448, 8448);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 5890, 768);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8778(2, 34166, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 5890, 770);
	((Class110_Sub2) this).aClass173_Sub2_1397.method8774(0);
	if (((Class110_Sub2) this).aBool8845) {
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8778(0, 5890,
								  768);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8808(0, 5890,
								  770);
	    ((Class110_Sub2) this).aBool8845 = false;
	}
    }
    
    void method8307() {
	if (((Class110_Sub2) this).aBool8849) {
	    float f
		= (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		   .aFloat9499);
	    float f_24_
		= (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		   .aFloat9498);
	    float f_25_ = f - (f - f_24_) * 0.125F;
	    float f_26_ = f - (f - f_24_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_26_, f_25_,
		 256.0F / (float) ((((Class173_Sub2) (((Class110_Sub2) this)
						      .aClass173_Sub2_1397))
				    .aClass164_9546.anInt1828)
				   * -386339441),
		 (float) ((((Class173_Sub2)
			    ((Class110_Sub2) this).aClass173_Sub2_1397)
			   .aClass164_9546.anInt1829)
			  * 1802884547) / 255.0F);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8804
		((((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		  .aClass164_9546.anInt1827) * -222719641);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8774(0);
	}
    }
    
    void method8308() {
	if (((Class110_Sub2) this).aBool8849) {
	    float f
		= (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		   .aFloat9499);
	    float f_27_
		= (((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		   .aFloat9498);
	    float f_28_ = f - (f - f_27_) * 0.125F;
	    float f_29_ = f - (f - f_27_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_29_, f_28_,
		 256.0F / (float) ((((Class173_Sub2) (((Class110_Sub2) this)
						      .aClass173_Sub2_1397))
				    .aClass164_9546.anInt1828)
				   * -386339441),
		 (float) ((((Class173_Sub2)
			    ((Class110_Sub2) this).aClass173_Sub2_1397)
			   .aClass164_9546.anInt1829)
			  * 1802884547) / 255.0F);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8804
		((((Class173_Sub2) ((Class110_Sub2) this).aClass173_Sub2_1397)
		  .aClass164_9546.anInt1827) * -222719641);
	    ((Class110_Sub2) this).aClass173_Sub2_1397.method8774(0);
	}
    }
}
