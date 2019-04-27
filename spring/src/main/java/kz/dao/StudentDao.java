package kz.dao;

import kz.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    SessionFactory sessionFactory;
    public StudentDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public Student getStudent(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Student ss = session.get(Student.class, id);
        session.getTransaction().commit();
        return ss;
    }
}
