package co.closeit.tfrais.playground.hibernate;

import co.closeit.tfrais.playground.hibernate.persistence.entity.Client;
import co.closeit.tfrais.playground.hibernate.persistence.entity.Portfolio;
import co.closeit.tfrais.playground.hibernate.persistence.repository.PortfolioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(HibernateApplication.class, args);

		PortfolioRepository portfolioRepository = (PortfolioRepository) applicationContext.getBean("portfolioRepository");

		// getting all data in 3 select queries
		Iterable<Portfolio> portfolios =  portfolioRepository.findAll();

		// counting transactions based on the objects in memory
		int numberOfTransactions = 0;
		for (Portfolio portfolio : portfolios) {
			for (Client client : portfolio.getClients()) {
				numberOfTransactions += client.getTransactions().size();
			}
		}
		System.out.println(numberOfTransactions);
	}

}
