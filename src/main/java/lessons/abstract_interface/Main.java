package lessons.abstract_interface;

public class Main {

    public static void main(String[] args) {

        TransportAbstract bus1;
        TransportAbstract bus2;
        TransportAbstract bus3;
        TransportAbstract bus4;
        TransportAbstract bus5;

        Bus bus = new Bus("bus", "diesel", 9);

        TransportAbstract busBus = new Bus("bus", "diesel", 19);

        UsersDB user = new UsersImpl();

        int param = user.getParam(2);

        System.out.println(param);

    }

}