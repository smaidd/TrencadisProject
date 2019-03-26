package servicii;

import model.Persoana;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddService {
    private static AddService instace;

    private AddService() {

    }

    public static AddService getInstance() {
        if (instace == null) {
            instace = new AddService();
        }
        return instace;
    }

    public Persoana addPersoana(Persoana persoana) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersPersistance");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();

            entityManager.persist(persoana);
            entityManager.getTransaction().commit();

            entityManager.close();
            entityManagerFactory.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return persoana;
    }
}
