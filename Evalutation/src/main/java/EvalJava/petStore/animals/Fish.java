package EvalJava.petStore.animals;

import EvalJava.petStore.Animal;
import EvalJava.petStore.FishLivEnv;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Fish")
public class Fish extends Animal {
    private FishLivEnv livingEnv;

    public Fish(){
        super();
    }

    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    // Setter pour livingEnv
    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}
