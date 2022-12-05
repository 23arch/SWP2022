package at.ran.OO.lamp;

import at.ran.OO.cars.Engine;

import java.awt.font.GlyphJustificationInfo;

public class Main {
    public static void main(String[] args) {
        Batterie b1 = new Batterie("Gl1", "blue", 4, Batterie.STATUS.ON);
        Lamp l1 = new Lamp(b1);
    }

}
