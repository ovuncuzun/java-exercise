package exercise;

public class SwitchTest {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        Android android = new Android();
        Switch mySwitch = new Switch(iPhone, android);
        mySwitch.powerIphone();
        mySwitch.powerIphone();

        mySwitch.powerAndroid();
        mySwitch.powerAndroid();
    }
}
