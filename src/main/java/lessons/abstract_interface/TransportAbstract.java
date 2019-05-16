package lessons.abstract_interface;

public abstract class TransportAbstract {

    String type;
    String engineType;
    int capacity;

    public TransportAbstract(String type, String engineType, int capacity) {
        this.type = type;
        this.engineType = engineType;
        this.capacity = capacity;
    }

    public abstract boolean move(int x, int y);

    public void getSound(String sound) {
        System.out.println(sound);
    }

}