package EvalJava.petStore;

import jakarta.persistence.*;

@Entity
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAdress;
    private String number;
    private String street;
    private String zipCode;
    private String city;

    // Constructeur par défaut
    public Adress() {
    }

    // Getters et Setters pour chaque attribut
    public long getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(long idAdress) {
        this.idAdress = idAdress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
