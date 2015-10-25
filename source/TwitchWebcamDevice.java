/* TwitchWebcamDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.LinkedList;

public class TwitchWebcamDevice
{
    public String aString1095;
    public String aString1096;
    public int anInt1097;
    public int anInt1098;
    private LinkedList aLinkedList1099 = new LinkedList();
    
    public TwitchWebcamDevice(int i, int i_0_, String string,
			      String string_1_) {
	anInt1097 = i * -1792423447;
	anInt1098 = 1178851489 * i_0_;
	aString1095 = string;
	aString1096 = string_1_;
    }
    
    public void AddCapability(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
	aLinkedList1099.add(new TwitchWebcamDeviceCapability(i, i_2_, i_3_,
							     i_4_, i_5_));
    }
    
    public TwitchWebcamDeviceCapability method1178(int i) {
	if (i < 0 || i >= aLinkedList1099.size())
	    return null;
	return (TwitchWebcamDeviceCapability) aLinkedList1099.get(i);
    }
    
    public TwitchWebcamDeviceCapability method1179(int i) {
	for (int i_6_ = 0; i_6_ < aLinkedList1099.size(); i_6_++) {
	    if ((((TwitchWebcamDeviceCapability) aLinkedList1099.get(i_6_))
		 .anInt1107) * -847254329
		== i)
		return ((TwitchWebcamDeviceCapability)
			aLinkedList1099.get(i_6_));
	}
	return null;
    }
    
    public int method1180() {
	return aLinkedList1099.size();
    }
    
    public int method1181() {
	return aLinkedList1099.size();
    }
    
    public int method1182() {
	return aLinkedList1099.size();
    }
}
