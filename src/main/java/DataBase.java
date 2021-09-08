import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DataBase {
    public void add(User user, Adress adress) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        user.setAdress(adress);
        session.save(user);
        session.save(adress);
        tx1.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }


}
