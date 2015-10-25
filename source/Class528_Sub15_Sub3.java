/* Class528_Sub15_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub15_Sub3 extends Class528_Sub15
{
    int anInt11580;
    Class347 this$0;
    byte aByte11581;
    String aString11582;
    
    void method9401(Class528_Sub36 class528_sub36) {
	Class305 class305 = new Class305();
	class305.aString3350 = ((Class528_Sub15_Sub3) this).aString11582;
	class305.anInt3348
	    = 571446281 * ((Class528_Sub15_Sub3) this).anInt11580;
	class305.aByte3349 = ((Class528_Sub15_Sub3) this).aByte11581;
	class528_sub36.method9521(class305, (byte) 121);
    }
    
    void method9400(Class528_Sub36 class528_sub36) {
	Class305 class305 = new Class305();
	class305.aString3350 = ((Class528_Sub15_Sub3) this).aString11582;
	class305.anInt3348
	    = 571446281 * ((Class528_Sub15_Sub3) this).anInt11580;
	class305.aByte3349 = ((Class528_Sub15_Sub3) this).aByte11581;
	class528_sub36.method9521(class305, (byte) 58);
    }
    
    void method9395(Class528_Sub36 class528_sub36, int i) {
	Class305 class305 = new Class305();
	class305.aString3350 = ((Class528_Sub15_Sub3) this).aString11582;
	class305.anInt3348
	    = 571446281 * ((Class528_Sub15_Sub3) this).anInt11580;
	class305.aByte3349 = ((Class528_Sub15_Sub3) this).aByte11581;
	class528_sub36.method9521(class305, (byte) 38);
    }
    
    void method9397(ByteBuffer class528_sub42) {
	if (class528_sub42.readUnsignedByte((byte) 12) != 255) {
	    class528_sub42.pointer -= 2015001547;
	    class528_sub42.method9633(771973092);
	}
	((Class528_Sub15_Sub3) this).aString11582
	    = class528_sub42.method9684((byte) -5);
	((Class528_Sub15_Sub3) this).anInt11580
	    = class528_sub42.readUnsignedShort(-1654542946) * 1683305819;
	((Class528_Sub15_Sub3) this).aByte11581
	    = class528_sub42.method9627(-2001569066);
	class528_sub42.method9633(771973092);
    }
    
    void method9396(ByteBuffer class528_sub42, byte i) {
	if (class528_sub42.readUnsignedByte((byte) 4) != 255) {
	    class528_sub42.pointer -= 2015001547;
	    class528_sub42.method9633(771973092);
	}
	((Class528_Sub15_Sub3) this).aString11582
	    = class528_sub42.method9684((byte) 4);
	((Class528_Sub15_Sub3) this).anInt11580
	    = class528_sub42.readUnsignedShort(-1665371067) * 1683305819;
	((Class528_Sub15_Sub3) this).aByte11581
	    = class528_sub42.method9627(-1108734273);
	class528_sub42.method9633(771973092);
    }
    
    void method9399(Class528_Sub36 class528_sub36) {
	Class305 class305 = new Class305();
	class305.aString3350 = ((Class528_Sub15_Sub3) this).aString11582;
	class305.anInt3348
	    = 571446281 * ((Class528_Sub15_Sub3) this).anInt11580;
	class305.aByte3349 = ((Class528_Sub15_Sub3) this).aByte11581;
	class528_sub36.method9521(class305, (byte) 102);
    }
    
    Class528_Sub15_Sub3(Class347 class347) {
	((Class528_Sub15_Sub3) this).this$0 = class347;
	((Class528_Sub15_Sub3) this).aString11582 = null;
    }
    
    void method9398(ByteBuffer class528_sub42) {
	if (class528_sub42.readUnsignedByte((byte) 107) != 255) {
	    class528_sub42.pointer -= 2015001547;
	    class528_sub42.method9633(771973092);
	}
	((Class528_Sub15_Sub3) this).aString11582
	    = class528_sub42.method9684((byte) 10);
	((Class528_Sub15_Sub3) this).anInt11580
	    = class528_sub42.readUnsignedShort(-629670131) * 1683305819;
	((Class528_Sub15_Sub3) this).aByte11581
	    = class528_sub42.method9627(-1915490747);
	class528_sub42.method9633(771973092);
    }
    
    static final void method10553(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class643.method7660(class229, class226, class648, (byte) -87);
    }
}
