/* TwitchEventChatUserInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */


public class TwitchEventChatUserInfo extends TwitchEvent
{
    public String displayName;
    public int userState;
    public int nameColourARGB;
    public boolean ignore;
    public int modes;
    public int subscriptions;
    
    public TwitchEventChatUserInfo(int i, int i_0_, String string, int i_1_,
				   boolean bool, int i_2_, int i_3_) {
	super(i);
	userState = i_0_;
	displayName = string;
	nameColourARGB = i_1_;
	ignore = bool;
	modes = i_2_;
	subscriptions = i_3_;
    }
    
    @Override
	public Class571 method4837() {
	return null;
    }
    
    @Override
	public void method4836(int[] is, long[] ls, Object[] objects) {
	/* empty */
    }
    
    @Override
	public Class571 method4838() {
	return null;
    }
    
    @Override
	public void method4839(int[] is, long[] ls, Object[] objects) {
	/* empty */
    }
    
    @Override
	public void method4840(int[] is, long[] ls, Object[] objects) {
	/* empty */
    }
    
    @Override
	public void method4841(int[] is, long[] ls, Object[] objects) {
	/* empty */
    }
}
