INSERT INTO client (id, name) VALUES (1, 'Client 001');
INSERT INTO client (id, name) VALUES (2, 'Client 002');
INSERT INTO client (id, name) VALUES (3, 'Client 003');
INSERT INTO client (id, name) VALUES (4, 'Client 004');
INSERT INTO client (id, name) VALUES (5, 'Client 005');

INSERT INTO transaction (id) VALUES (1);
INSERT INTO transaction (id) VALUES (2);
INSERT INTO transaction (id) VALUES (3);
INSERT INTO transaction (id) VALUES (4);
INSERT INTO transaction (id) VALUES (5);
INSERT INTO transaction (id) VALUES (6);
INSERT INTO transaction (id) VALUES (7);
INSERT INTO transaction (id) VALUES (8);
INSERT INTO transaction (id) VALUES (9);
INSERT INTO transaction (id) VALUES (10);
INSERT INTO transaction (id) VALUES (11);
INSERT INTO transaction (id) VALUES (12);
INSERT INTO transaction (id) VALUES (13);
INSERT INTO transaction (id) VALUES (14);
INSERT INTO transaction (id) VALUES (15);
INSERT INTO transaction (id) VALUES (16);
INSERT INTO transaction (id) VALUES (17);

INSERT INTO client_transactions (client_id, transactions_id) VALUES (1, 1);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (1, 2);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (1, 3);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (2, 4);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (2, 5);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (2, 6);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (2, 7);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (3, 8);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (3, 9);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (3, 10);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (3, 11);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (4, 12);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (4, 13);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (4, 14);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (4, 15);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (4, 16);
INSERT INTO client_transactions (client_id, transactions_id) VALUES (5, 17);





INSERT INTO portfolio (id) VALUES (1);
INSERT INTO portfolio (id) VALUES (2);

INSERT INTO portfolio_clients (portfolio_id, clients_id) VALUES (1, 1);
INSERT INTO portfolio_clients (portfolio_id, clients_id) VALUES (2, 2);
INSERT INTO portfolio_clients (portfolio_id, clients_id) VALUES (2, 3);
INSERT INTO portfolio_clients (portfolio_id, clients_id) VALUES (2, 4);
INSERT INTO portfolio_clients (portfolio_id, clients_id) VALUES (2, 5);