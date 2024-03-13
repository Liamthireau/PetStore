package EvalJava.petStore;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPetStore;
    private String name;
    private String managerName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "adress_id", referencedColumnName = "idAdress")
    private Adress address;

    @ManyToMany
    @JoinTable(
            name = "petstore_product", // Nom de la table d'association
            joinColumns = @JoinColumn(name = "idPetStore"), // Colonne de cette entité (PetStore)
            inverseJoinColumns = @JoinColumn(name = "idProduct") // Colonne de l'entité associée (Product)
    )
    private Set<Product> products;

    @OneToMany(mappedBy = "petStore")
    private Set<Animal> animals;

    // Constructeur par défaut
    public PetStore() {
    }

    // Getters et Setters
    public long getIdPetStore() {
        return idPetStore;
    }

    public void setIdPetStore(long idPetStore) {
        this.idPetStore = idPetStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }


    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
