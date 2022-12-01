package at.ran.OO.cars;

public class AutoMain {
    public static void main(String[] args) {
        // manuelle Erstellung
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(200, Engine.TYPE.GAS);

        Car c1  = new Car(7,15,20,e1,"Audi","A1234","black");
        Car c2  = new Car(6,13,30,e2,"Mercedes","B1234","white");


         //Ausgaben
        System.out.println(c1.getSerialNumber());
        System.out.println(c2.getSerialNumber());

        System.out.println(c2.getFuelAmount());
        c2.drive();
        c2.drive();
        System.out.println(c2.getFuelAmount());
        c1.info();

        c2.turboBoost();
        c1.turboBoost();

        c1.honk(15);
        c2.getRemainingRange();
        c1.getRemainingRange();
        c1.getEngine();
    }


}
