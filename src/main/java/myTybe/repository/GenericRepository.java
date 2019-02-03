package myTybe.repository;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

public interface GenericRepository<E,V> {

    E save(E entity);

    List<E> allEntities();

    Optional<E> findById(V id);
}
