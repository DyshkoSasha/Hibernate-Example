import model.Adress;
import model.User;
import repository.DataBase;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        User user1 = new User("Yuzik", "Labeckiy", 33,
                new Adress("Minsk", "Nezavisimosti", 27));
        dataBase.add(user1);

        User user2 = new User("Arkadiy", "Petyshinskiy", 33,
                new Adress("Minsk", "Nezavisimosti", 28));
        dataBase.add(user2);

        User user3 = new User("Andrei", "Kynin", 33,
                new Adress("Minsk", "Nezavisimosti", 29));
        dataBase.add(user3);

        User user4 = new User("Sasha", "Soroka", 33,
                new Adress("Minsk", "Nezavisimosti", 87));
        dataBase.add(user4);

        User user5 = new User("Enakentiy", "Mokronosov", 44,
                new Adress("Minsk", "Nezavisimosti", 27));
        dataBase.add(user5);

        dataBase.delete(user4);

        List<User> list = dataBase.findByHouse(27);
        System.out.println(list);
    }
}
