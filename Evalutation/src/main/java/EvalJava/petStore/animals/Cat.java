package EvalJava.petStore.animals;

import EvalJava.petStore.Animal;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Cat")
public class Cat extends Animal {
    private String chipId;

    // Constructeur par défaut
    public Cat() {
        super();
    }

    // Getter pour chipId
    public String getChipId() {
        return chipId;
    }

    // Setter pour chipId
    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
}

