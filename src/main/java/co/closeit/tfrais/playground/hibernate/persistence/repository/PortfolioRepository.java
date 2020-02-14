package co.closeit.tfrais.playground.hibernate.persistence.repository;

import co.closeit.tfrais.playground.hibernate.persistence.entity.Client;
import co.closeit.tfrais.playground.hibernate.persistence.entity.Portfolio;
import org.springframework.data.repository.CrudRepository;

public interface PortfolioRepository extends CrudRepository<Portfolio, Integer> {
}
