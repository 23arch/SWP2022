package at.ran.OO.cars;

public class Car {
    // Instanz /Gedächtnis
    public int fuelConsumption;
    public int fuelAmount;
    public int totalFuel;
    public String brand;
    public String serialNumber;
    public String color;


    public Car(int fuelConsumption, String brand, String serialNumber) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    //Methode
    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        if (fuelAmount >= fuelConsumption)
        System.out.println("I am driving");
    }

    public void break2() {
        System.out.println("Ich bremse aus");
    }

    public void turboBoost() {
        if (fuelAmount > totalFuel * 0.1)
            System.out.println("SuperBoostMode");
        else
            System.out.println("Not enough fuel to go to SuperBoost");
    }

    public void honk(int amountOfRepetitions) {
        //for(int i = 0; i < 10; i++)
        for (int i = amountOfRepetitions; i > 0; i--)
            System.out.println("Tuuut");
    }

    public void getRemainingRange() {
        // fuelConsumption, fuelAmount
        System.out.println(fuelAmount / (double) fuelConsumption);
    }
}
