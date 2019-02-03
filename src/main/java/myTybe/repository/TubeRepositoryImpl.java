package myTybe.repository;

import myTybe.domain.entities.Tube;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class TubeRepositoryImpl implements TubeRepository {

    private EntityManager entityManager;

    @Inject
    public TubeRepositoryImpl() {
        this.entityManager = Persistence
                .createEntityManagerFactory("metube")
                .createEntityManager();
    }

    @Override
    public Optional<Tube> findByName(String name) {

        Optional<Tube> entity = Optional.ofNullable(this.entityManager
                .createQuery("" +
                        "SELECT t " +
                        "FROM tubes t " +
                        "WHERE t.name = :name", Tube.class)
                .setParameter("name", name)
                .getSingleResult());

        return entity;
    }

    @Override
    public Tube save(Tube entity) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(entity);
        this.entityManager.getTransaction().commit();

        return entity;
    }

    @Override
    public List<Tube> allEntities() {
        return this.entityManager.createQuery("" +
                "SELECT t " +
                "FROM tubes t ", Tube.class)
                .getResultList();
    }

    @Override
    public Optional<Tube> findById(String id) {


        Optional<Tube> entity = Optional.ofNullable(this.entityManager
                .createQuery("" +
                        "SELECT t " +
                        "FROM tubes t " +
                        "WHERE t.id = :id", Tube.class)
                .setParameter("id", id)
                .getSingleResult());

        return entity;
    }
}
