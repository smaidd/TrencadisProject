package servicii;

import model.Persoana;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
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

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select e from Persoana e");
        List<Persoana> listaPers = query.getResultList();
        if (listaPers.isEmpty()) {
            return Collections.emptyList();
        } else {
            return listaPers;
        }
    }
}
