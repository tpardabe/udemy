import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        //Student student = new Student("Daffy", "Daniel", "DDaniel@gmail.com");
        try{
            session.beginTransaction();
            //session.save(student);
            session.getTransaction().commit();

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            //Student student1 = session.get(Student.class, student.getId());
            //System.out.println(student1);
            session.getTransaction().commit();

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            List<Student> students= session.createQuery("from Student s WHERE s.firstName = 'Daffy'").list();
            for(Student s: students) {
                System.out.println(s.getLastName());
            }
        } finally {
            sessionFactory.close();
        }

    }
}
