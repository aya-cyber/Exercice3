Description
Le projet "Gestion de Projet" vise à développer une application permettant de suivre le temps passé sur différents projets afin d'imputer ce temps à leur coût global. Cette application est conçue pour les bureaux d'études afin d'améliorer la gestion des projets, des tâches et des employés impliqués.

Technologies Utilisées
Java : Langage de programmation utilisé pour le développement de l'application.
Hibernate : Framework de gestion de la persistance des données via JPA.
MySQL : Système de gestion de base de données relationnelle utilisé pour stocker les informations sur les projets, les tâches et les employés.
JDBC : API Java pour interagir avec la base de données.
Structure du Projet

A. Couche Persistance
Classes Entités : Développées dans le package ma.projet.classes, ces classes représentent les objets de la base de données (projets, tâches, employés, etc.).
Fichier de Configuration : hibernate.cfg.xml est créé dans le package ma.projet.config pour configurer la connexion à la base de données.
Classe HibernateUtil : Située dans le package ma.projet.util, elle permet de créer une instance de SessionFactory pour gérer les sessions Hibernate.

B. Couche Service
Interface Générique IDao : Définie dans le package ma.projet.dao, cette interface fournit les méthodes de base pour l'accès aux données.

Classes Services :
ProjetService : Gère les opérations liées aux projets.
TacheService : Gère les opérations liées aux tâches.
EmployeService : Gère les opérations liées aux employés.
EmployeTacheService : Gère les relations entre les employés et les tâches.
