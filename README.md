# transport-admin

Une application d’administration conçue pour optimiser la gestion du transport. Elle centralise la supervision des véhicules, trajets, chauffeurs et utilisateurs, tout en fournissant des outils de suivi, de reporting et de configuration adaptés aux besoins des gestionnaires de flottes ou de services de transport.

## Fonctionnalités principales

- **Gestion des véhicules** : Ajout, modification, suivi de l’état.
- **Planification des trajets** : Création, suivi et gestion des itinéraires.
- **Administration des utilisateurs** : Gestion des accès et des rôles.
- **Suivi des chauffeurs** : Affectation, suivi et gestion.
- **Tableaux de bord et reporting** : Statistiques personnalisées, rapports d’activité.
- **Paramétrage flexible** : Adaptable à différents types de transport (urbain, scolaire, marchandises, etc.).

## Technologies

- **Langage principal** : Java
- **Framework** : Java EE (JEE)
- **Serveur d’application** : GlassFish Server
- **Base de données** : PostgreSQL
- **Gestion de projet** : Maven (`pom.xml`)

## Prérequis

- Java 8 ou supérieur
- Maven 3.6+
- PostgreSQL
- Serveur d’application compatible Java EE (ex. GlassFish)

## Installation

1. **Cloner le dépôt**
   ```bash
   git clone https://github.com/bradlab/transport-admin.git
   cd transport-admin
   ```
2. **Configurer la base de données**
   - Créer une base PostgreSQL dédiée.
   - Adapter la configuration de connexion dans les ressources (voir `src/main/resources` ou directement dans le serveur d’application).

3. **Compiler le projet**
   ```bash
   mvn clean install
   ```

4. **Déployer sur le serveur**
   - Déployer l’archive générée (`.war`) depuis le dossier `target/` sur GlassFish ou tout autre serveur compatible.

## Structure du projet

- `src/` — Code source de l’application
- `pom.xml` — Fichier de configuration Maven
- `faces-config.NavData` — Configuration de navigation JSF
- `nb-configuration.xml` — Configuration NetBeans

## Contribution

Les contributions sont les bienvenues !  
Veuillez ouvrir une issue ou une pull request pour proposer des améliorations.

## Licence

Ce projet n’a pas encore de licence officielle.

## Auteur

[bradlab](https://github.com/bradlab)
