package solution;

public class PhoneSwitchTest {

	public static void main(String[] args) {
		Switchable switchableIphone = new Iphone();
		Switch iPhoneSwitch = new PhoneSwitch(switchableIphone);
		iPhoneSwitch.power();
		iPhoneSwitch.power();

		Switchable switchableFan= new Android();
		Switch androidSwitch = new PhoneSwitch(switchableFan);
		androidSwitch.power();
		androidSwitch.power();
	}
}
