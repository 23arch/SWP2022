package at.ran.basics;

import java.util.Scanner;

public class Bankomatbeispiel {
    public static void main(String[] args) {
        boolean finish = false;
        int Kontostand = 0;
        System.out.println("Wählen Sie eine Funktion");
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Abbruch");
        Scanner scan = new Scanner(System.in);
        int selection = scan.nextInt();
        while (!finish) {
            System.out.println("Wählen Sie eine Funktion");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Abbruch");
            selection = scan.nextInt();

            if (selection == 1) {
                System.out.println("Geben sie den Betrag ein, den Sie einzahlen möchten");
                int Einzahlung = scan.nextInt();

                Kontostand = Kontostand + Einzahlung;
                System.out.println("Sie haben " + Einzahlung + "€ eingezahlt!");
            }
            if (selection == 2) {
                System.out.println("Wie viel € wollen Sie abheben?");
                int Auszahlung = scan.nextInt();
                Kontostand = Kontostand - Auszahlung;
                System.out.println("Sie haben " + Auszahlung + "€ abgehoben!");
            }
            if (selection == 3) {
                System.out.println("Der Kontostand beträgt:" + Kontostand + "€");
            }

            if (selection == 4) {
                finish = true;
                System.out.println("Vorgang abgebrochen!");
            }
        }
    }
}

