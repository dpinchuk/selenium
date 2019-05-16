package lessons.abstract_interface;

public interface UsersDB {

    //public static final
    //String STR_INT = "123";

    String[] getAllUsers();

    boolean writeUser(User user);

    boolean deleteUser(User user);

    default int getParam(int num) {
        return num * num;
    }

}