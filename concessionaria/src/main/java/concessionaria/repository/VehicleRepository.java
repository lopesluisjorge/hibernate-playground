package concessionaria.repository;

import concessionaria.entity.Vehicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class VehicleRepository {

    private EntityManager entityManager;

    public VehicleRepository(EntityManager em) {
        this.entityManager = em;
    }

    public void save(Vehicle vehicle) {
        final EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(vehicle);
        transaction.commit();
    }

    public Vehicle findBy(Long id) {
        return entityManager.find(Vehicle.class, id);
    }

    public Vehicle findBy(Integer id) {
        return entityManager.getReference(Vehicle.class, id.longValue());
    }

    public List<Vehicle> list() {
        return entityManager.createQuery("from Vehicle").getResultList();
    }

    public void update(Vehicle vehicle) {
        entityManager.merge(vehicle);
    }

    public void destroy(Vehicle vehicle) {
        entityManager.remove(vehicle);
    }

}
