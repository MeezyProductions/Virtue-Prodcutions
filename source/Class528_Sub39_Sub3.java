/* Class528_Sub39_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub39_Sub3 extends Class528_Sub39
{
    int anInt11695;
    
    public Class528_Sub39_Sub3(int i, int i_0_, int i_1_) {
	super(i, i_0_);
	((Class528_Sub39_Sub3) this).anInt11695 = -472702467 * i_1_;
    }
    
    public boolean method9579(int i) {
	Player class645_sub1_sub5_sub1_sub2
	    = (client.localPlayers
	       [((Class528_Sub39_Sub3) this).anInt11695 * -1364540587]);
	if (null != class645_sub1_sub5_sub1_sub2) {
	    Class420.method5038(Cs2Context.aClass561_7528,
				anInt10625 * 905908359, -1,
				class645_sub1_sub5_sub1_sub2,
				(-1364540587
				 * ((Class528_Sub39_Sub3) this).anInt11695),
				(byte) 125);
	    return true;
	}
	return false;
    }
    
    public boolean method9578() {
	Player class645_sub1_sub5_sub1_sub2
	    = (client.localPlayers
	       [((Class528_Sub39_Sub3) this).anInt11695 * -1364540587]);
	if (null != class645_sub1_sub5_sub1_sub2) {
	    Class420.method5038(Cs2Context.aClass561_7528,
				anInt10625 * 905908359, -1,
				class645_sub1_sub5_sub1_sub2,
				(-1364540587
				 * ((Class528_Sub39_Sub3) this).anInt11695),
				(byte) 121);
	    return true;
	}
	return false;
    }
}
