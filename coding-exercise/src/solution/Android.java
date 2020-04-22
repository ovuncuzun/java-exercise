package solution;

public class Android implements Switchable{
	
	@Override
    public void powerOn() {
        System.out.println("Android: power on...");
    }
    @Override
    public void powerOff() {
        System.out.println("Android: power off...");
    }

}
