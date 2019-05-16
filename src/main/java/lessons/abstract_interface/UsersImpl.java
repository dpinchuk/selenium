package lessons.abstract_interface;

public class UsersImpl implements UsersDB {

    @Override
    public String[] getAllUsers() {
        if (true) {
            return new String[]{""};
        }
        return new String[0];
    }

    @Override
    public boolean writeUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }
}