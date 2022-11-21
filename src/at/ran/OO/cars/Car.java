package at.ran.OO.cars;

public class Car {
    // Instanz /Gedächtnis
    public int fuelConsumption;
    public int fuelAmount;
    public int totalFuel;
    public String brand;
    public String serialNumber;
    private String color;


    public Car(int fc, String b, String s) {
        this.fuelConsumption = fc;
        this.brand = b;
        this.serialNumber = s;
    }

    //Methode
    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
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
