package co.closeit.tfrais.playground.hibernate;

import co.closeit.tfrais.playground.hibernate.persistence.entity.Client;
import co.closeit.tfrais.playground.hibernate.persistence.entity.Portfolio;
import co.closeit.tfrais.playground.hibernate.persistence.repository.PortfolioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.persistence.EntityManager;

import static co.closeit.tfrais.playground.hibernate.Constants.FETCHING_DATA_MESSAGE;
import static co.closeit.tfrais.playground.hibernate.Constants.LOADING_DATA_MESSAGE;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(HibernateApplication.class, args);
		PortfolioRepository portfolioRepository = (PortfolioRepository) applicationContext.getBean("portfolioRepository");
		DummyDataLoader dummyDataLoader = (DummyDataLoader) applicationContext.getBean("dummyDataLoader");

		System.out.println(LOADING_DATA_MESSAGE);
		dummyDataLoader.generateData();

		System.out.println(FETCHING_DATA_MESSAGE);
		// getting all data
		long timerStart = System.currentTimeMillis();
		Iterable<Portfolio> portfolios =  portfolioRepository.findAll();
		long timerStop = System.currentTimeMillis();

		// counting transactions based on the objects in memory
		int numberOfTransactions = 0;
		for (Portfolio portfolio : portfolios) {
			for (Client client : portfolio.getClients()) {
				numberOfTransactions += client.getTransactions().size();
			}
		}
		System.out.println("total number of transactions fetched : " + numberOfTransactions);
		System.out.println("fetching took " + (timerStop - timerStart) + " ms");
	}

}
