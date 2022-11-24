package at.ran.OO.cars;

import java.lang.reflect.Constructor;

public class Engine {
    private enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type; //Diesel, Benzin


    public void drive(int amount){

        System.out.println("The motor is running with " + amount);
    }
}
