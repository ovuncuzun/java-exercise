package solution;

public class PhoneSwitch implements Switch{
	public Switchable phone;
	public boolean on;
	public PhoneSwitch(Switchable phone) {
		this.phone = phone;
		this.on = false;
	}
	public boolean isOn() {
		return this.on;
	}
	public void power(){
		boolean checkOn = isOn();
		if (checkOn) {
			phone.powerOff();
			this.on = false;
		} else {
			phone.powerOn();
			this.on = true;
		}
	}

}
