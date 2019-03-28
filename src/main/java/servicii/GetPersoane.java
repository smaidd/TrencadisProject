package servicii;

import model.Persoana;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class GetPersoane {
    private static GetPersoane instance;


    private GetPersoane() {

    }

    public static GetPersoane getInstance() {
        if (instance == null) {
            instance = new GetPersoane();
        }
        return instance;
    }

    public List<Persoana> getPersoane() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersPersistance");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Query query = entityManager.createQuery("select e from Persoana e");
        List<Persoana> listaPers = query.getResultList();
        if (listaPers.isEmpty()) {
            return Collections.emptyList();
        } else {
            return listaPers;
        }
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

    public Persoana updatePersoana(Persoana p) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersPersistance");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Persoana persoana = null;
        try {
            entityManager.getTransaction().begin();

            persoana = entityManager.find(Persoana.class, p.getId());
            persoana.setCnp(p.getCnp());
            persoana.setNume(p.getNume());
            persoana.setPrenume(p.getPrenume());
            entityManager.persist(persoana);
            entityManager.getTransaction().commit();

            entityManager.close();
            entityManagerFactory.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return persoana;
    }

    public Persoana deletePersoana(Persoana persoana) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersPersistance");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Persoana p = null;
        try {
            entityManager.getTransaction().begin();
            p = entityManager.find(Persoana.class, persoana.getId());
            entityManager.remove(p);
            entityManager.getTransaction().commit();

            entityManager.close();
            entityManagerFactory.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return p;

    }
}
