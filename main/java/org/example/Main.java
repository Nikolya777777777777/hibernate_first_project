package org.example;

import org.example.model.Movie;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Movie movie = new Movie();
        movie.setTitle("Fast and Furious 7");
        session.save(movie);
        transaction.commit();
        session.close();
    }
}