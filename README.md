# PetStore

Évaluation PetStore avec JPA


# Caractéristiques

Modélisation des entités de base du domaine d'animalerie : PetStore, Product, Animal et ses sous-classes Cat et Fish.
Utilisation des annotations JPA pour définir le mappage objet-relationnel.
Création d'une base de données relationnelle avec des relations OneToOne, OneToMany, et ManyToMany.
Insertion et requête de données en utilisant l'EntityManager de JPA.

# Entités et Relations

PetStore : Représente un magasin d'animaux, lié à une adresse unique (Adress) et pouvant avoir plusieurs animaux (Animal) et vendre plusieurs types de produits (Product).
Adress : Stocke les informations d'adresse pour chaque PetStore.
Animal : Une classe de base pour les animaux, avec des sous-classes spécifiques pour les chats (Cat) et les poissons (Fish), illustrant l'héritage d'entités.
Product : Représente les produits vendus dans les magasins, avec une énumération ProdType pour définir les catégories de produits.

# Démarrage rapide

Assurez-vous d'avoir Java et une base de données relationnelle MySQL installés et configurés sur votre système. 

# (Pour mon projet j'ai utilisé une base via clever-cloud)

Configurez votre source de données dans le fichier persistence.xml.
Exécutez la classe Main pour peupler votre base de données avec des données initiales.

# Technologies utilisées

Java
Jakarta Persistence (JPA)
Hibernate comme fournisseur de persistance
MySQL / PostgreSQL

