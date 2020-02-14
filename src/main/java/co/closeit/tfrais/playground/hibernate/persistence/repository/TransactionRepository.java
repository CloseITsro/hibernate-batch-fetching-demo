package co.closeit.tfrais.playground.hibernate.persistence.repository;

import co.closeit.tfrais.playground.hibernate.persistence.entity.Client;
import co.closeit.tfrais.playground.hibernate.persistence.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
}
