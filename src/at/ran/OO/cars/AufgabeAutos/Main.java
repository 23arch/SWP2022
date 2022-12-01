package at.ran.OO.cars.AufgabeAutos;
public class Main
{
    public static void main(String[] args)
    {
        Engine e1 = new Engine(110, Engine.TYPE.DIESEL);
        Producer p1 = new Producer("Hans", "Morocco", 0.2f);
        Car c1 = new Car("red",123,8, e1, p1, 8000);
        c1.getDrive(100);
        System.out.println(c1.getPrice());
    }
}
