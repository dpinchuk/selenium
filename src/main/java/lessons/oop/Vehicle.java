package lessons.oop;

public class Vehicle <T> {

    private int weels;
    private int weight;
    private String engineType;
    private double enginePower;
    private String color;
    private int places;

    public Vehicle(int weels, int weight, String engineType, double enginePower, String color, int places) {
        this.weels = weels;
        this.weight = weight;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.color = color;
        this.places = places;
    }

    public Vehicle() {}

    public int getWeels() {
        return weels;
    }

    public void setWeels(int weels) {
        this.weels = weels;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public boolean isValidCoordinates(int x, int y) {
        if (x <=0 || y <= 0) {
            return false;
        }
        return true;
    }

    public boolean isValidCoordinates(T xs, T ys) {
        int x = 0;
        int y = 0;
        try {
            x = Integer.parseInt(String.valueOf(xs));
            y = Integer.parseInt(String.valueOf(ys));
        } catch (NumberFormatException e) {
            System.out.println("Error parsing!");
        }
        if (x <=0 || y <= 0) {
            return false;
        }
        return true;
    }
    
}