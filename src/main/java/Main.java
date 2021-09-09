import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        User user1 = new User("Yuzik", "Labeckiy", 33);
        Adress adress1 = new Adress("Minsk", "Nezavisimosti", 27);
        dataBase.add(user1, adress1);

        User user2 = new User("Arkadiy", "Petyshinskiy", 33);
        Adress adress2 = new Adress("Minsk", "Nezavisimosti", 28);
        dataBase.add(user2, adress2);

        User user3 = new User("Andrei", "Kynin", 33);
        Adress adress3 = new Adress("Minsk", "Nezavisimosti", 29);
        dataBase.add(user3, adress3);

        User user4 = new User("Sasha", "Soroka", 33);
        Adress adress4 = new Adress("Minsk", "Nezavisimosti", 87);
        dataBase.add(user4, adress4);

        User user5 = new User("Enakentiy", "Mokronosov", 44);
        Adress adress5 = new Adress("Minsk", "Nezavisimosti", 27);
        dataBase.add(user5, adress5);

        dataBase.delete(user4);

       List<User> list = dataBase.findAll(27);
        System.out.println(list);
    }
}
