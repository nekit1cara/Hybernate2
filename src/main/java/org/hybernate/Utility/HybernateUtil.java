package org.hybernate.Utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

//спец дажава класс для создания hybernate
public class HybernateUtil {

                                    //Connection JDBC

    //Фабрика для создания сессиий
    private static final SessionFactory sessionFactory = initSessionFactory();


    //этот метод вызывается автоматически так как он вызывается из статичной переменной
    private static SessionFactory initSessionFactory() {

        try {
            return new Configuration().configure(new File("src/main/resources/hibernate.cfg.xml")).buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial Session Factory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }

    }


    //метод будем вызывать когда потребуется SessionFactory
    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            initSessionFactory();
        }

        return sessionFactory;
    }


    //закрыть все соединения с помощью SessionFactory
    public static void close() {
        getSessionFactory().close();
    }


}
