package at.ran.OO.Remote;

public class Remote {
    private Batterie batterie1;
    private Batterie batterie2;

    public Remote(Batterie batterie1, Batterie batterie2) {
        this.batterie1 = batterie1;
        this.batterie2 = batterie2;
    }


    public void turnOn()
    {
        this.batterie1.setChargingStatus(this.batterie1.getChargingStatus()-5);
        this.batterie2.setChargingStatus(this.batterie2.getChargingStatus()-5);
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public float getStatus(){
        float mw = (this.batterie1.getChargingStatus() + this.batterie2.getChargingStatus())/2;
        return mw;
    }
}
