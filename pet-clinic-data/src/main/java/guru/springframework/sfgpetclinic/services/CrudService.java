package guru.springframework.sfgpetclinic.services;

import java.util.Set;

// it takes a type and an id
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
