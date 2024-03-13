package EvalJava.petStore;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal_type", discriminatorType = DiscriminatorType.STRING)
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAnimal;
    private LocalDate birth;
    private String color;

    @ManyToOne
    @JoinColumn(name = "petStore_id") // Clé étrangère dans 'Animal' référençant 'PetStore'
    private PetStore petStore;


    public Animal() {

    }

    // Getters et Setters
    public long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }
}
