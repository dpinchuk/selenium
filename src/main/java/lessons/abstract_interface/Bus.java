package lessons.abstract_interface;

public class Bus extends TransportAbstract {

    public Bus(String type, String engineType, int capacity) {
        super(type, engineType, capacity);
    }

    @Override
    public boolean move(int x, int y) {
        if (x > 0 && y > 0 ) {
            return true;
        }
        return false;
    }

}