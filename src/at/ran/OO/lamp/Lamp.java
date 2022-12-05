package at.ran.OO.lamp;

import at.ran.OO.lamp.Batterie;

public class Lamp {
    private Batterie batterie1;


    public Lamp(Batterie batterie1, Batterie batterie2) {
        this.batterie1 = batterie1;
    }

    public void turnOn()
    {
        this.batterie1.setElectricityConsumption(this.batterie1.getElectricityConsumption()+5);
        System.out.println("Mein Name ist "+ batterie1.getName() +". Ich bin bereits eingeschaltet");
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    //addLightElement(LightElement):void um ein Glühelement dazu zu geben.

    //turnAllOn():void - Da werden alle Glühelemente eingeschaltet.

    //getOverallPowerUsage(): double - Liefert den bisher verbrauchten Strom aller Glühelemente zurück.

    //printNamesOfLightElements():void - Printet die Namen aller Lichtelemen auf die Konsole.




}
