package co.closeit.tfrais.playground.hibernate;

import co.closeit.tfrais.playground.hibernate.persistence.entity.Client;
import co.closeit.tfrais.playground.hibernate.persistence.entity.Portfolio;
import co.closeit.tfrais.playground.hibernate.persistence.entity.Transaction;
import co.closeit.tfrais.playground.hibernate.persistence.repository.ClientRepository;
import co.closeit.tfrais.playground.hibernate.persistence.repository.PortfolioRepository;
import co.closeit.tfrais.playground.hibernate.persistence.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Service
public class DummyDataLoader {

    private final PortfolioRepository portfolioRepository;
    private final ClientRepository clientRepository;
    private final TransactionRepository transactionRepository;

    @Autowired
    public DummyDataLoader(PortfolioRepository portfolioRepository, ClientRepository clientRepository, TransactionRepository transactionRepository) {
        this.portfolioRepository = portfolioRepository;
        this.clientRepository = clientRepository;
        this.transactionRepository = transactionRepository;
    }

    public void generateData() {
        // 10 portfolios
        // each portfolio has 200 clients
        // there are 10 transactions for each clients
        // i.e., 20,000 transactions in total
        for (int p = 0; p < 10; p++) {
            Portfolio portfolio = new Portfolio();
            Set<Client> clients = new HashSet<>();
            for (int c = 0; c < 200; c++) {
                Client client = new Client();
                Set<Transaction> transactions = new HashSet<>();
                for (int t = 0; t < 10; t++) {
                    transactions.add(transactionRepository.save(new Transaction()));
                }
                client.setTransactions(transactions);
                clients.add(clientRepository.save(client));
            }
            portfolio.setClients(clients);
            portfolioRepository.save(portfolio);
        }
    }
}
