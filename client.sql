-- Script DDL pour l'entité Client
CREATE TABLE Client (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(100) NOT NULL,
    prenoms VARCHAR(100) NOT NULL,
    telephone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL,
    date_enregistrement TIMESTAMP NOT NULL,
    adresse VARCHAR(255)
);

-- Script DML exemple pour Client
INSERT INTO Client (nom, prenoms, telephone, email, date_enregistrement, adresse) VALUES
('Dupont', 'Jean', '+22501020304', 'jean.dupont@email.com', NOW(), 'Abidjan'),
('Doe', 'Jane', '+22505060708', 'jane.doe@email.com', NOW(), 'Yamoussoukro');
