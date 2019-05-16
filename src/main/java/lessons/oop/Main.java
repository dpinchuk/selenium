package lessons.oop;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(
                4,
                1500,
                "injector_diesel",
                200,
                "red",
                4);

        Vehicle vehicleNull = new Vehicle();

        vehicleNull.setColor("gray");
        vehicleNull.setWeels(6);


//        System.out.println(vehicle.getWeels());
//        System.out.println(vehicle.getColor());

        vehicle.setWeels(12);
        vehicle.setColor("green");

//        System.out.println(vehicle.getWeels());
//        System.out.println(vehicle.getColor());

        Cars cars = new Cars(4, 2500, "", 200, "white", 8);

        boolean isValidCoordinates1 = cars.isValidCoordinates(10, 10);
        System.out.println(isValidCoordinates1);

        boolean isValidCoordinates2 = cars.isValidCoordinates(-10, 10);
        System.out.println(isValidCoordinates2);

        boolean isValidCoordinates3 = cars.isValidCoordinates(10, -10);
        System.out.println(isValidCoordinates3);

        boolean isValidCoordinates4 = cars.isValidCoordinates(0, 0);
        System.out.println(isValidCoordinates4);

    }

}