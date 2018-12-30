package concessionaria;

import concessionaria.infra.EMFactory;

import javax.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {
        final EntityManager entityManager = EMFactory.getEntityManager();
        entityManager.close();
        EMFactory.close();
    }

}
