package co.closeit.tfrais.playground.hibernate.persistence.repository;

import co.closeit.tfrais.playground.hibernate.persistence.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ClientRepository  extends CrudRepository<Client, Integer> {
}
