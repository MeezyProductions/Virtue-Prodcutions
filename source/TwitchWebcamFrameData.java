/* TwitchWebcamFrameData - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TwitchWebcamFrameData
{
    public int width = 0;
    public int height = 0;
    public int[] buffer = null;
    
    public void SetData(int i, int i_0_, int[] is) {
	width = i;
	height = i_0_;
	buffer = is;
    }
    
    public void method8243() {
	for (int i = height - 1; i >= 0; i--) {
	    int i_1_ = width * i;
	    for (int i_2_ = (i + 1) * width; i_1_ < i_2_; i_1_++) {
		i_2_--;
		int i_3_ = buffer[i_1_];
		buffer[i_1_] = buffer[i_2_];
		buffer[i_2_] = i_3_;
	    }
	}
    }
    
    public void method8244() {
	for (int i = (height >> 1) - 1; i >= 0; i--) {
	    int i_4_ = width * i;
	    int i_5_ = width * (height - i - 1);
	    for (int i_6_ = -width; i_6_ < 0; i_6_++) {
		int i_7_ = buffer[i_4_];
		buffer[i_4_] = buffer[i_5_];
		buffer[i_5_] = i_7_;
		i_4_++;
		i_5_++;
	    }
	}
    }
    
    public void method8245() {
	for (int i = height - 1; i >= 0; i--) {
	    int i_8_ = width * i;
	    for (int i_9_ = (i + 1) * width; i_8_ < i_9_; i_8_++) {
		i_9_--;
		int i_10_ = buffer[i_8_];
		buffer[i_8_] = buffer[i_9_];
		buffer[i_9_] = i_10_;
	    }
	}
    }
    
    public void method8246() {
	for (int i = height - 1; i >= 0; i--) {
	    int i_11_ = width * i;
	    for (int i_12_ = (i + 1) * width; i_11_ < i_12_; i_11_++) {
		i_12_--;
		int i_13_ = buffer[i_11_];
		buffer[i_11_] = buffer[i_12_];
		buffer[i_12_] = i_13_;
	    }
	}
    }
    
    public void method8247() {
	for (int i = (height >> 1) - 1; i >= 0; i--) {
	    int i_14_ = width * i;
	    int i_15_ = width * (height - i - 1);
	    for (int i_16_ = -width; i_16_ < 0; i_16_++) {
		int i_17_ = buffer[i_14_];
		buffer[i_14_] = buffer[i_15_];
		buffer[i_15_] = i_17_;
		i_14_++;
		i_15_++;
	    }
	}
    }
    
    public void method8248() {
	for (int i = (height >> 1) - 1; i >= 0; i--) {
	    int i_18_ = width * i;
	    int i_19_ = width * (height - i - 1);
	    for (int i_20_ = -width; i_20_ < 0; i_20_++) {
		int i_21_ = buffer[i_18_];
		buffer[i_18_] = buffer[i_19_];
		buffer[i_19_] = i_21_;
		i_18_++;
		i_19_++;
	    }
	}
    }
    
    public void method8249() {
	for (int i = (height >> 1) - 1; i >= 0; i--) {
	    int i_22_ = width * i;
	    int i_23_ = width * (height - i - 1);
	    for (int i_24_ = -width; i_24_ < 0; i_24_++) {
		int i_25_ = buffer[i_22_];
		buffer[i_22_] = buffer[i_23_];
		buffer[i_23_] = i_25_;
		i_22_++;
		i_23_++;
	    }
	}
    }
}
