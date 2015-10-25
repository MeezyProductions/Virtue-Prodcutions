/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class460
{
    abstract Class438 method5570();
    
    abstract Class438 method5571(int i);
    
    abstract byte[] method5572(int i, byte i_0_);
    
    abstract void method5573(int i, byte i_1_);
    
    abstract byte[] method5574(int i);
    
    abstract Class438 method5575();
    
    abstract Class438 method5576();
    
    abstract byte[] method5577(int i);
    
    abstract int method5578(int i, int i_2_);
    
    abstract void method5579(int i);
    
    abstract void method5580(int i);
    
    abstract int method5581(int i);
    
    abstract int method5582(int i);
    
    abstract Class438 method5583();
    
    Class460() {
	/* empty */
    }
    
    static final void method5584(Class648 class648, byte i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	ItemType itemType
	    = (ItemType) Class18.aClass5_Sub13_206.method63(i_3_, -940199210);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = itemType.anInt43 * -2057416305 == 2 ? 1 : 0;
    }
    
    static void method5585(boolean bool, int i) {
	if (bool) {
	    if (-1 != client.anInt10978 * 2088127151)
		Class210.method2957(client.anInt10978 * 2088127151,
				    -757283107);
	    for (Class528_Sub39 class528_sub39
		     = ((Class528_Sub39)
			client.aClass692_11097.method8146(-1942855841));
		 class528_sub39 != null;
		 class528_sub39
		     = ((Class528_Sub39)
			client.aClass692_11097.method8138(1725770028))) {
		if (!class528_sub39.method6441(-219181626)) {
		    class528_sub39
			= ((Class528_Sub39)
			   client.aClass692_11097.method8146(-1942855841));
		    if (class528_sub39 == null)
			break;
		}
		Class279.method3735(class528_sub39, true, false, -1162943144);
	    }
	    client.anInt10978 = -345853007;
	    client.aClass692_11097 = new Class692(8);
	    Class220.method3150(1781514752);
	    client.anInt10978 = Class184.aClass622_2103.anInt8107 * 339396073;
	    if (client.anInt10978 * 2088127151 != -1) {
		Class285.method3853(false, 1831733819);
		PlayerModel.method7298(-2030176238);
		Class576.method6894(2088127151 * client.anInt10978, null,
				    -1798336088);
	    }
	}
	Class54.aBool675 = true;
    }
}
