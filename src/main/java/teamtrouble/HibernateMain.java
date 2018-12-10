package teamtrouble;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class HibernateMain {

    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Configuration config = new Configuration();
        config.configure();
        config.addAnnotatedClass(hMovie.class);

        config.addAnnotatedClass(hGenre.class);

        config.addAnnotatedClass(hMovieCharacter.class);

        config.addAnnotatedClass(hPerson.class);


        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        factory = config.buildSessionFactory(serviceRegistry);

        HibernateMain hbTest = new HibernateMain();
        hbTest.insertMovie();

    }


    private long insertMovie(){
        Session session = factory.openSession();
        Transaction tx = null;
        Long movIdSaved = null;
        try {
            tx = session.beginTransaction();
            hMovie movie = new hMovie();
            movie.setTitle("HIBERNATE TEST MOV2");
            movie.setType('T');
            movie.setYear(2018);
            movIdSaved = (Long) session.save(movie);
            tx.commit();

        } catch (HibernateException he) {
            if( tx != null) {
                tx.rollback();
                he.printStackTrace();
            }
             session.close();
            }
        return movIdSaved;
    }


}
