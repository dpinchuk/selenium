package lessons.abstract_interface;

public class ModeratorsImpl implements UsersDB {

    @Override
    public String[] getAllUsers() {
        System.out.println("afssdvsvvs");
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
