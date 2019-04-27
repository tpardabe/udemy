package kz.config;

import kz.dao.StudentDao;
import kz.entity.Student;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public  SessionFactory sessionFactory () {
        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        return  sessionFactory;
    }
    @Bean
    public StudentDao studentDao(SessionFactory sessionFactory){
        return new StudentDao(sessionFactory);
    }
}
