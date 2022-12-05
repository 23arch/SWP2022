package at.ran.OO.lamp;

import at.ran.OO.Remote.Batterie;

public class Lamp {
    private Batterie batterie1;
    private Batterie batterie2;

    public void turnOn()
    {
        this.batterie1.getEle;
        this.batterie2.setElectricityConsumption(this.batterie2.getElectricityConsumption()+5);
        System.out.println("Mein Name ist XXX. Ich bin bereits eingeschaltet");
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }
}
