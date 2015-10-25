/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

public class Class508
{
    int anInt6916;
    byte[] aByteArray6917;
    int anInt6918 = 0;
    int anInt6919;
    OutputStream anOutputStream6920;
    
    public void method6154(boolean bool) {
	if (!bool) {
	    ((Class508) this).anInt6919 = 0;
	    ((Class508) this).anInt6916 = 0;
	}
    }
    
    public void method6155(OutputStream outputstream, int i)
	throws IOException {
	method6156((byte) 75);
	((Class508) this).anOutputStream6920 = outputstream;
    }
    
    public void method6156(byte i) throws IOException {
	method6158(821757843);
	((Class508) this).anOutputStream6920 = null;
    }
    
    public void method6157(boolean bool, int i) {
	if (!bool) {
	    ((Class508) this).anInt6919 = 0;
	    ((Class508) this).anInt6916 = 0;
	}
    }
    
    public void method6158(int i) throws IOException {
	int i_0_ = (1335342007 * ((Class508) this).anInt6916
		    - ((Class508) this).anInt6919 * 547654723);
	if (0 != i_0_) {
	    ((Class508) this).anOutputStream6920.write
		(((Class508) this).aByteArray6917,
		 547654723 * ((Class508) this).anInt6919, i_0_);
	    if (((Class508) this).anInt6916 * 1335342007
		>= ((Class508) this).anInt6918 * 1507455347)
		((Class508) this).anInt6916 = 0;
	    ((Class508) this).anInt6919
		= ((Class508) this).anInt6916 * -1555300995;
	}
    }
    
    public void method6159(int i, int i_1_) {
	if (null == ((Class508) this).aByteArray6917
	    || 1507455347 * ((Class508) this).anInt6918 != i)
	    ((Class508) this).aByteArray6917 = new byte[i];
	((Class508) this).anInt6918 = i * -571171909;
	((Class508) this).anInt6916 = 0;
	((Class508) this).anInt6919 = 0;
    }
    
    public void method6160(byte i, byte i_2_) throws IOException {
	((Class508) this).aByteArray6917
	    [(((Class508) this).anInt6916 += 1093835271) * 1335342007 - 1]
	    = i;
	if (((Class508) this).anInt6916 * 1335342007
	    >= ((Class508) this).anInt6918 * 1507455347)
	    method6158(821757843);
    }
    
    public byte method6161(int i, int i_3_) {
	int i_4_ = ((Class508) this).anInt6916 * 1335342007 - i - 1;
	if (i_4_ < 0)
	    i_4_ += 1507455347 * ((Class508) this).anInt6918;
	return ((Class508) this).aByteArray6917[i_4_];
    }
    
    public void method6162(int i, int i_5_) throws IOException {
	int i_6_ = 1335342007 * ((Class508) this).anInt6916 - i - 1;
	if (i_6_ < 0)
	    i_6_ += 1507455347 * ((Class508) this).anInt6918;
	for (/**/; i_5_ != 0; i_5_--) {
	    if (i_6_ >= 1507455347 * ((Class508) this).anInt6918)
		i_6_ = 0;
	    ((Class508) this).aByteArray6917
		[(((Class508) this).anInt6916 += 1093835271) * 1335342007 - 1]
		= ((Class508) this).aByteArray6917[i_6_++];
	    if (1335342007 * ((Class508) this).anInt6916
		>= 1507455347 * ((Class508) this).anInt6918)
		method6158(821757843);
	}
    }
    
    public void method6163() throws IOException {
	method6158(821757843);
	((Class508) this).anOutputStream6920 = null;
    }
    
    public void method6164() throws IOException {
	method6158(821757843);
	((Class508) this).anOutputStream6920 = null;
    }
    
    public void method6165(int i) {
	if (null == ((Class508) this).aByteArray6917
	    || 1507455347 * ((Class508) this).anInt6918 != i)
	    ((Class508) this).aByteArray6917 = new byte[i];
	((Class508) this).anInt6918 = i * -571171909;
	((Class508) this).anInt6916 = 0;
	((Class508) this).anInt6919 = 0;
    }
    
    public void method6166(boolean bool) {
	if (!bool) {
	    ((Class508) this).anInt6919 = 0;
	    ((Class508) this).anInt6916 = 0;
	}
    }
    
    public void method6167(int i, int i_7_, int i_8_) throws IOException {
	int i_9_ = 1335342007 * ((Class508) this).anInt6916 - i - 1;
	if (i_9_ < 0)
	    i_9_ += 1507455347 * ((Class508) this).anInt6918;
	for (/**/; i_7_ != 0; i_7_--) {
	    if (i_9_ >= 1507455347 * ((Class508) this).anInt6918)
		i_9_ = 0;
	    ((Class508) this).aByteArray6917
		[(((Class508) this).anInt6916 += 1093835271) * 1335342007 - 1]
		= ((Class508) this).aByteArray6917[i_9_++];
	    if (1335342007 * ((Class508) this).anInt6916
		>= 1507455347 * ((Class508) this).anInt6918)
		method6158(821757843);
	}
    }
    
    public void method6168(int i, int i_10_) throws IOException {
	int i_11_ = 1335342007 * ((Class508) this).anInt6916 - i - 1;
	if (i_11_ < 0)
	    i_11_ += 1507455347 * ((Class508) this).anInt6918;
	for (/**/; i_10_ != 0; i_10_--) {
	    if (i_11_ >= 1507455347 * ((Class508) this).anInt6918)
		i_11_ = 0;
	    ((Class508) this).aByteArray6917
		[(((Class508) this).anInt6916 += 1093835271) * 1335342007 - 1]
		= ((Class508) this).aByteArray6917[i_11_++];
	    if (1335342007 * ((Class508) this).anInt6916
		>= 1507455347 * ((Class508) this).anInt6918)
		method6158(821757843);
	}
    }
    
    public void method6169(int i, int i_12_) throws IOException {
	int i_13_ = 1335342007 * ((Class508) this).anInt6916 - i - 1;
	if (i_13_ < 0)
	    i_13_ += 1507455347 * ((Class508) this).anInt6918;
	for (/**/; i_12_ != 0; i_12_--) {
	    if (i_13_ >= 1507455347 * ((Class508) this).anInt6918)
		i_13_ = 0;
	    ((Class508) this).aByteArray6917
		[(((Class508) this).anInt6916 += 1093835271) * 1335342007 - 1]
		= ((Class508) this).aByteArray6917[i_13_++];
	    if (1335342007 * ((Class508) this).anInt6916
		>= 1507455347 * ((Class508) this).anInt6918)
		method6158(821757843);
	}
    }
    
    public void method6170() throws IOException {
	int i = (1335342007 * ((Class508) this).anInt6916
		 - ((Class508) this).anInt6919 * 547654723);
	if (0 != i) {
	    ((Class508) this).anOutputStream6920.write
		(((Class508) this).aByteArray6917,
		 547654723 * ((Class508) this).anInt6919, i);
	    if (((Class508) this).anInt6916 * 1335342007
		>= ((Class508) this).anInt6918 * 1507455347)
		((Class508) this).anInt6916 = 0;
	    ((Class508) this).anInt6919
		= ((Class508) this).anInt6916 * -1555300995;
	}
    }
    
    static final void method6171(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class416.method4968(class229, class226, class648, (byte) 31);
    }
    
    static final void method6172(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub10_10572,
	     (((Class648) class648).anIntArray8394
	      [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]),
	     1842471236);
	Class243.method3387(2136307698);
	client.aBool11161 = false;
    }
}
