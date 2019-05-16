package lessons.oop;

public class Cars extends Vehicle {

    public Cars(int weels, int weight, String engineType, double enginePower, String color, int places) {
        super(weels, weight, engineType, enginePower, color, places);
    }

    public Cars() {}

    public void sound() {
        System.out.println("Sound!");
    }

}