package at.ran.OO.cars;

public class AutoMain {
    public static void main(String[] args) {
        // manuelle Erstellung
        Car c1  = new Car(7,"Audi","A1234");
        c1.setTotalFuel(20);
        c1.setFuelAmount(15);
        c1.setColor("green");
        c1.setHorsePower(140);

        Car c2  = new Car(6,"Mercedes","B1234");
        c2.setTotalFuel(30);
        c2.setFuelAmount(13);
        c2.setColor("white");
        c2.setHorsePower(90);

        Car c3 = new Car(12,"Opel","C1234");
        System.out.println(c3.getSerialNumber());


         //Ausgaben
        System.out.println(c1.getSerialNumber());
        System.out.println(c2.getSerialNumber());

        System.out.println(c2.getFuelAmount());
        c2.drive();
        c2.drive();
        System.out.println(c2.getFuelAmount());

        c2.turboBoost();
        c1.turboBoost();

        c1.honk(15);
        c2.getRemainingRange();
        c1.getRemainingRange();
    }


}
