package solution;

public class Iphone  implements Switchable{

	@Override
	public void powerOn() {
		System.out.println("iPhone: power on...");
	}
	@Override
	public void powerOff() {
		System.out.println("iPhone: power off...");
	}

}
