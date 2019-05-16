package lessons.override_overload;

public class EntityImpl implements Overload {

    public void move() {

    }

    public void move(int x, int y) {

    }

    public String move(String str) {
        return null;
    }
}
