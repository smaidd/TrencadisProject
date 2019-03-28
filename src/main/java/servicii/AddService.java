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


}
