package at.ran.basics;

import java.util.Random;

import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        Random random = new Random();
        int winsofPLayer= 0;
        int winsofComputer= 0;
        int amountsofdraw= 0;
        System.out.println("Game starts");

        for (int i = 0; i < 6; i++) {
        int randomPlayer = random.nextInt(6)+1;
        int randomComputer = random.nextInt(6)+1;

        if (randomPlayer>randomComputer){
            winsofPLayer++;
            System.out.println("player");
        } else if (randomPlayer<randomComputer) {
            winsofComputer++;
            System.out.println("compi");
        } else {
            amountsofdraw++;
                System.out.println("draw");
            }


        System.out.println("compi " + randomComputer + " player " + randomPlayer);
        }
        System.out.println("Compi " + winsofComputer);
        System.out.println("player " + winsofPLayer);
        System.out.println("draws " + amountsofdraw);

        if (winsofPLayer>winsofComputer) {
            System.out.println("Winner: Player");
        }
            else if (winsofComputer>winsofPLayer){
                System.out.println("Winner: Computer");
            }
            else if (winsofComputer == winsofPLayer) {
            System.out.println("Draw");
        }
        }
}
