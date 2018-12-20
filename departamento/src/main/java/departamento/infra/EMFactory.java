package departamento.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

final public class EMFactory {

    private static final EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("departamento");

    public EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public void close() {
        factory.close();
    }

}
