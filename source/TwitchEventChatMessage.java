/* TwitchEventChatMessage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */


public class TwitchEventChatMessage extends TwitchEvent
{
    public String name;
    public String message;
    public int nameColourARGB;
    public int modes;
    public int subscriptions;
    public boolean isAction;
    
    public TwitchEventChatMessage(int i, String string, String string_0_,
				  int i_1_, int i_2_, int i_3_, boolean bool) {
	super(i);
	name = string;
	message = string_0_;
	nameColourARGB = i_1_;
	modes = i_2_;
	subscriptions = i_3_;
	isAction = bool;
    }
    
    @Override
	public void method4836(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
    
    @Override
	public Class571 method4837() {
	return Class571.aClass571_7561;
    }
    
    @Override
	public Class571 method4838() {
	return Class571.aClass571_7561;
    }
    
    @Override
	public void method4839(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
    
    @Override
	public void method4840(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
    
    @Override
	public void method4841(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
}
