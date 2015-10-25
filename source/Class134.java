/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

class Class134 implements Runnable
{
    Class364_Sub2 this$0;
    
    public void run() {
	try {
	    while (!((Class364_Sub2) ((Class134) this).this$0).aBool10193) {
		HashMap hashmap
		    = ((Class134) this).this$0.method9231((byte) -102);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class480 class480 = (Class480) iterator.next();
		    if (!class480.aBool5452) {
			Class468[] class468s
			    = (Class468[]) hashmap.get(class480);
			for (int i = 0; i < class468s.length; i++)
			    class468s[i].method5677(-1987090886);
		    }
		}
		Class511_Sub1.method9241(50L);
	    }
	} catch (Exception exception) {
	    VarDomainType.method5340(null, exception, 1851761466);
	}
    }
    
    public void method1637() {
	try {
	    while (!((Class364_Sub2) ((Class134) this).this$0).aBool10193) {
		HashMap hashmap
		    = ((Class134) this).this$0.method9231((byte) -115);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class480 class480 = (Class480) iterator.next();
		    if (!class480.aBool5452) {
			Class468[] class468s
			    = (Class468[]) hashmap.get(class480);
			for (int i = 0; i < class468s.length; i++)
			    class468s[i].method5677(1651998845);
		    }
		}
		Class511_Sub1.method9241(50L);
	    }
	} catch (Exception exception) {
	    VarDomainType.method5340(null, exception, 2145907655);
	}
    }
    
    Class134(Class364_Sub2 class364_sub2) {
	((Class134) this).this$0 = class364_sub2;
    }
    
    static byte[] method1638(File file, int i, int i_0_) {
	byte[] is;
	try {
	    byte[] is_1_ = new byte[i];
	    Class254.method3445(file, is_1_, i, 1969613252);
	    is = is_1_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is;
    }
    
    static void method1639(int i, int i_2_, int i_3_, int i_4_, boolean bool,
			   int i_5_) {
	if (Class700.aBool8733 && null != Class207.aFrame2236
	    && (3 != i_2_ || i_3_ != -1427801851 * Class5_Sub6.anInt10837
		|| Class453.anInt4977 * 1779729855 != i_4_)) {
	    Class452.method5449(Class181.aClass702_2093, Class207.aFrame2236,
				-1106611553);
	    Class207.aFrame2236 = null;
	}
	if (Class700.aBool8733 && i_2_ == 3 && null == Class207.aFrame2236) {
	    Class207.aFrame2236
		= Class289.method3874(Class181.aClass702_2093, i_3_, i_4_, 0,
				      0, (byte) 12);
	    if (null != Class207.aFrame2236) {
		Class5_Sub6.anInt10837 = 911567821 * i_3_;
		Class453.anInt4977 = 1928227391 * i_4_;
		Class243.method3387(2145954640);
	    }
	}
	if (3 == i_2_ && (!Class700.aBool8733 || Class207.aFrame2236 == null))
	    method1639(i, Class514.aClass528_Sub38_6967
			      .aClass691_Sub3_10593
			      .method9844((byte) 76), -1, -1, true, 376852142);
	else {
	    Container container = Class465.method5625(312287159);
	    if (null != Class207.aFrame2236) {
		client.anInt6929 = 758082103 * i_3_;
		Class106.anInt1314 = -1402965723 * i_4_;
	    } else if (null != Class196.aFrame2197) {
		Insets insets = Class196.aFrame2197.getInsets();
		client.anInt6929
		    = (Class196.aFrame2197.getSize().width
		       - (insets.right + insets.left)) * 758082103;
		Class106.anInt1314
		    = (Class196.aFrame2197.getSize().height
		       - (insets.bottom + insets.top)) * -1402965723;
	    } else {
		client.anInt6929 = container.getSize().width * 758082103;
		Class106.anInt1314 = container.getSize().height * -1402965723;
	    }
	    if (client.anInt6929 * 624323463 <= 0)
		client.anInt6929 = 758082103;
	    if (1116226221 * Class106.anInt1314 <= 0)
		Class106.anInt1314 = -1402965723;
	    if (1 != i_2_)
		Class181_Sub22.method8996((byte) 32);
	    else {
		Class411.anInt4713 = client.anInt11124 * 1227861909;
		client.anInt6931
		    = -79148317 * ((624323463 * client.anInt6929
				    - 473615593 * client.anInt11124)
				   / 2);
		client.anInt6933 = client.anInt11022 * -1420585039;
		client.anInt6943 = 0;
	    }
	    if (Class646.aClass665_8386 != ModeWhere.LIVE
		&& Class411.anInt4713 * -1117838587 < 1024
		&& client.anInt6933 * -2142152407 >= 768) {
		/* empty */
	    }
	    if (!bool) {
		Class64.aCanvas754.setSize(Class411.anInt4713 * -1117838587,
					   client.anInt6933 * -2142152407);
		Class587.aClass173_7714.method2178
		    (Class64.aCanvas754, -1117838587 * Class411.anInt4713,
		     -2142152407 * client.anInt6933, (byte) 64);
		if (Class196.aFrame2197 == container) {
		    Insets insets = Class196.aFrame2197.getInsets();
		    Class64.aCanvas754.setLocation
			(1401768651 * client.anInt6931 + insets.left,
			 insets.top + client.anInt6943 * -952966111);
		} else
		    Class64.aCanvas754.setLocation((1401768651
						    * client.anInt6931),
						   (-952966111
						    * client.anInt6943));
	    } else
		Class277.method3722((byte) 1);
	    if (i_2_ >= 2)
		client.aBool10929 = true;
	    else
		client.aBool10929 = false;
	    Class5_Sub19.method10187(1982905236);
	    if (2088127151 * client.anInt10978 != -1)
		Class285.method3853(true, 1831733819);
	    if (Class591.method7078((byte) 49).method1384((byte) 2) != null
		&& (Class622.method7419(client.anInt10876 * 175711435,
					(byte) -69)
		    || Class309.method4127(client.anInt10876 * 175711435,
					   2130436643)))
		Class388.method4769(Class591.method7078((byte) 42),
				    (byte) -50);
	    for (int i_6_ = 0; i_6_ < 102; i_6_++)
		client.aBoolArray10855[i_6_] = true;
	    client.aBool6934 = true;
	}
    }
}
