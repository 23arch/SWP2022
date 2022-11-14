package at.ran.OO;

import at.ran.car;

public class Auto {
    public static void main(String[] args) {
        car c1  = new car();
        c1.brand = "Audi";
        c1.fuelconsumption = 7;
        c1.serialNumber = "A1234";

        car c2  = new car();
        c2.brand = "Mercedes";
        c2.fuelconsumption = 6;
        c2.serialNumber = "B1234";

        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);

    }


}
