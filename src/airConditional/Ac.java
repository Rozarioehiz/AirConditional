package airConditional;

public class Ac {

    public boolean isOn;
    public boolean isOff;
    public int speed = 0;

    public static boolean isOn(){
        return isOn();
    }

    public void turnOn() {
        isOn = true;
    }

    public int getSpeed() {
        return speed;
    }
}
