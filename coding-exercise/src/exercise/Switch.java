package exercise;

public class Switch {

    public IPhone iPhone;
    public Android android;
    public boolean isIPhoneOn;
    public boolean isAndroidOn;

    public Switch(IPhone iPhone, Android android) {
        this.iPhone = iPhone;
        this.android = android;
        this.isIPhoneOn = false;
        this.isAndroidOn = false;
    }

    public boolean getIsIphoneOn() {
        return isIPhoneOn;
    }

    public boolean getIsAndroidOn() {
        return isAndroidOn;
    }

    public void powerIphone() {
        boolean checkIphone = getIsIphoneOn();

        if (checkIphone) {
            iPhone.powerOff();
            isIPhoneOn = false;
        } else {
            iPhone.powerOn();
            isIPhoneOn = true;
        }
    }

    public void powerAndroid() {
        boolean checkAndroid = getIsAndroidOn();
        
        if (checkAndroid) {
            android.powerOff();
            isAndroidOn = false;
        } else {
            android.powerOn();
            isAndroidOn = true;
        } 
    }
}
