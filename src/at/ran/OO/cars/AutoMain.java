package at.ran.OO.cars;

public class AutoMain {
    public static void main(String[] args) {
        /* manuelle Erstellung
        car c1  = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.totalFuel = 20;
        c1.fuelAmount = 15;
        c1.serialNumber = "A1234";

        car c2  = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.totalFuel = 30;
        c2.fuelAmount = 20;
        c2.serialNumber = "B1234";
         */
        Car c3 = new Car(12,"Opel","C1234");
        System.out.println(c3.serialNumber);


         /* Ausgaben
        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);

        System.out.println(c2.fuelAmount);
        c2.drive();
        c2.drive();
        c2.drive();
        System.out.println(c2.fuelAmount);

        c2.turboBoost();
        c1.turboBoost();

        c1.honk(15);
        c2.getRemainingRange();

          */
    }


}
