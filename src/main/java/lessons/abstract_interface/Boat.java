package lessons.abstract_interface;

public class Boat extends TransportAbstract {

    private final int riverLenth = 100;
    private int maxScore;

    public Boat(String type, String engineType, int capacity, int maxScore) {
        super(type, engineType, capacity);
        this.maxScore = maxScore;
    }

    @Override
    public boolean move(int x, int y) {
        if (Math.sqrt(x * x + y * y) > riverLenth) {
            return false;
        }
        return true;
    }
}