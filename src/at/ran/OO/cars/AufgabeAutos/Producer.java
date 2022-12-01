package at.ran.OO.cars.AufgabeAutos;

public class Producer {
    private String name;
    private String country;
    private float rabatt;

    public Producer(String name, String country, float rabatt) {
        this.name = name;
        this.country = country;
        this.rabatt = rabatt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getRabatt() {
        return rabatt;
    }

    public void setRabatt(float rabatt) {
        this.rabatt = rabatt;
    }
}
