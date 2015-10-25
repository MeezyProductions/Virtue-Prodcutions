/* TwitchEventReport - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */


public class TwitchEventReport extends TwitchEvent
{
    public String message;
    
    public TwitchEventReport(int i, String string) {
	super(i);
	message = string;
    }
    
    @Override
	public void method4836(int[] is, long[] ls, Object[] objects) {
	is[0] = eventType;
	objects[0] = message;
    }
    
    @Override
	public Class571 method4837() {
	return Class571.aClass571_7560;
    }
    
    @Override
	public Class571 method4838() {
	return Class571.aClass571_7560;
    }
    
    @Override
	public void method4839(int[] is, long[] ls, Object[] objects) {
	is[0] = eventType;
	objects[0] = message;
    }
    
    @Override
	public void method4840(int[] is, long[] ls, Object[] objects) {
	is[0] = eventType;
	objects[0] = message;
    }
    
    @Override
	public void method4841(int[] is, long[] ls, Object[] objects) {
	is[0] = eventType;
	objects[0] = message;
    }
}
