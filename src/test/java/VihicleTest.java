import lessons.oop.Cars;
import lessons.oop.Vehicle;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class VihicleTest {

    private Vehicle cars;

    @Test
    public void goByCoordinatesTest_1() {
        this.cars = new Cars(4, 2500, "", 200, "white", 8);
        boolean isValidCoordinates = cars.isValidCoordinates(1, 1);
        Assert.assertTrue(isValidCoordinates);
    }

    @Test
    public void goByCoordinatesTest_2() {
        this.cars = new Cars(4, 2500, "", 200, "white", 8);
        boolean isValidCoordinates = cars.isValidCoordinates(0, 1);
        Assert.assertFalse(isValidCoordinates);
    }

    @Test
    public void goByCoordinatesTest_3() {
        this.cars = new Cars(4, 2500, "", 200, "white", 8);
        boolean isValidCoordinates = cars.isValidCoordinates(1, 0);
        Assert.assertFalse(isValidCoordinates);
    }

    @Test
    public void goByCoordinatesTest_4() {
        this.cars = new Cars(4, 2500, "", 200, "white", 8);
        boolean isValidCoordinates = cars.isValidCoordinates(0, 0);
        Assert.assertFalse(isValidCoordinates);
    }

    @Test
    public void goByCoordinatesTest_5() {
        this.cars = new Cars(4, 2500, "", 200, "white", 8);
        boolean isValidCoordinates = cars.isValidCoordinates(-1, -1);
        Assert.assertFalse(isValidCoordinates);
    }

    @Test
    public void goByCoordinatesTest_6() {
        this.cars = new Cars(4, 2500, "", 200, "white", 8);
        boolean isValidCoordinates = cars.isValidCoordinates(-1, 0);
        Assert.assertFalse(isValidCoordinates);
    }

    @Test
    public void goByCoordinatesTest_7() {
        this.cars = new Cars(4, 2500, "", 200, "white", 8);
        boolean isValidCoordinates = cars.isValidCoordinates(0, -1);
        Assert.assertFalse(isValidCoordinates);
    }

    @Test
    public void goByCoordinatesTest_8() {
        this.cars = new Cars(4, 2500, "", 200, "white", 8);
        boolean isValidCoordinates = cars.isValidCoordinates(-1, 1);
        Assert.assertFalse(isValidCoordinates);
    }

    @Test
    public void goByCoordinatesTest_9() {
        this.cars = new Cars(4, 2500, "", 200, "white", 8);
        boolean isValidCoordinates = cars.isValidCoordinates(1, -1);
        Assert.assertFalse(isValidCoordinates);
    }

    @Test
    public void goByCoordinatesTest_10() {
        this.cars = new Cars(4, 2500, "", 200, "white", 8);
        boolean isValidCoordinates = cars.isValidCoordinates(1000000, 1000000);
        Assert.assertTrue(isValidCoordinates);
    }

    @Test
    public void goByCoordinatesTest_11() {
        this.cars = new Cars(4, 2500, "", 200, "white", 8);

        List<String> list = new ArrayList<>();

        boolean isValidCoordinates = cars.isValidCoordinates(new Object(), new ArrayList<String>());
        Assert.assertFalse(isValidCoordinates);
    }

}