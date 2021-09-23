import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        User user1 = new User("Yuzik", "Labeckiy", 33);
        dataBase.addUser(user1);

        User user2 = new User("Arkadiy", "Petyshinskiy", 33);
        dataBase.addUser(user2);

        User user3 = new User("Andrei", "Kynin", 33);
        dataBase.addUser(user3);

        User user4 = new User("Sasha", "Soroka", 33);
        dataBase.addUser(user4);

        User user5 = new User("Enakentiy", "Mokronosov", 44);


//        dataBase.deleteUser(user4);
//        dataBase.deleteByIdUser(2);
//        dataBase.updateUser(user5);

//        User user6 = dataBase.findByIdUser(1);
//
//        dataBase.addUser(user6);
//
//        List<User> userList = dataBase.findAll();
//
//        dataBase.deleteUsers(userList);
    }
}
