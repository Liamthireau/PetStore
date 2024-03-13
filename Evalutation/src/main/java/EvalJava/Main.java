package EvalJava;

import EvalJava.petStore.Adress;
import EvalJava.petStore.PetStore;
import EvalJava.petStore.ProdType;
import EvalJava.petStore.Product;
import EvalJava.petStore.animals.Cat;
import EvalJava.petStore.animals.Fish;
import EvalJava.petStore.ProdType;
import EvalJava.petStore.FishLivEnv;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("eval");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        // Insertion des Stores
        PetStore store1 = new PetStore();
        store1.setName("Maxi Zoo");
        store1.setManagerName("Toto");

        PetStore store2 = new PetStore();
        store2.setName("La Croquetterie");
        store2.setManagerName("Tata");

        PetStore store3 = new PetStore();
        store3.setName("L'Animalerie Nantaise");
        store3.setManagerName("Titi");

        em.persist(store1);
        em.persist(store2);
        em.persist(store3);

        // Insertion des adresses
        Adress adr1 = new Adress();
        adr1.setStreet("123 Sunshine Street");
        adr1.setCity("Sunnyville");
        adr1.setZipCode("12345");
        store1.setAddress(adr1);

        Adress adr2 = new Adress();
        adr2.setStreet("456 Moonlight Avenue");
        adr2.setCity("Moonville");
        adr2.setZipCode("67890");
        store2.setAddress(adr2);

        Adress adr3 = new Adress();
        adr3.setStreet("789 Starlight Boulevard");
        adr3.setCity("Starville");
        adr3.setZipCode("13579");
        store3.setAddress(adr3);

        em.persist(adr1);
        em.persist(adr2);
        em.persist(adr3);

        // Insertion des produits
        Product product1 = new Product();
        product1.setCode("FOOD01");
        product1.setLabel("Cat Food Premium");
        product1.setType(ProdType.FOOD);
        product1.setPrice(14.99);

        Product product2 = new Product();
        product2.setCode("ACC02");
        product2.setLabel("Leather Collar");
        product2.setType(ProdType.ACCESSORY);
        product2.setPrice(9.99);

        Product product3 = new Product();
        product3.setCode("CLEAN03");
        product3.setLabel("Shampoo for Sensitive Skin");
        product3.setType(ProdType.CLEANING);
        product3.setPrice(19.99);

        em.persist(product1);
        em.persist(product2);
        em.persist(product3);

        // Insertion des Animaux (Cats et Fish) par magasin
        Cat cat1 = new Cat();
        cat1.setColor("Black");
        cat1.setChipId("CHIP001");
        cat1.setPetStore(store1);

        Cat cat2 = new Cat();
        cat2.setColor("White");
        cat2.setChipId("CHIP002");
        cat2.setPetStore(store2);

        Cat cat3 = new Cat();
        cat3.setColor("Brown");
        cat3.setChipId("CHIP003");
        cat3.setPetStore(store3);

        em.persist(cat1);
        em.persist(cat2);
        em.persist(cat3);

        Fish fish1 = new Fish();
        fish1.setColor("Gold");
        fish1.setLivingEnv(FishLivEnv.FRESH_WATER);
        fish1.setPetStore(store1);

        Fish fish2 = new Fish();
        fish2.setColor("Red");
        fish2.setLivingEnv(FishLivEnv.SEA_WATER);
        fish2.setPetStore(store2);

        Fish fish3 = new Fish();
        fish3.setColor("Blue");
        fish3.setLivingEnv(FishLivEnv.FRESH_WATER);
        fish3.setPetStore(store3);

        em.persist(fish1);
        em.persist(fish2);
        em.persist(fish3);

        et.commit();

        em.close();
        emf.close();
    }
}