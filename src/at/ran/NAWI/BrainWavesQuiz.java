package at.ran.NAWI;
import java.util.Scanner;

public class BrainWavesQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zum Gehirnwellen-Quiz!");
        System.out.println("Beantworte die folgenden Fragen:");
        System.out.println();

        // Frage 1
        System.out.println("Frage 1: In welchem Frequenzbereich treten Delta-Wellen auf?");
        System.out.println("a) 0,5 bis 4 Hz");
        System.out.println("b) 4 bis 8 Hz");
        System.out.println("c) 8 bis 12 Hz");
        System.out.println("d) 12 bis 30 Hz");
        String antwort1 = scanner.nextLine();
        if (antwort1.equalsIgnoreCase("a")) {
            System.out.println("Richtig!");
        } else {
            System.out.println("Falsch. Die richtige Antwort ist a) 0,5 bis 4 Hz.");
        }
        System.out.println();

        // Frage 2
        System.out.println("Frage 2: Mit welchem mentalen Zustand sind Theta-Wellen verbunden?");
        System.out.println("a) Konzentration und Fokus");
        System.out.println("b) Kreativität und Intuition");
        System.out.println("c) Regeneration und Erholung");
        System.out.println("d) Lernen und Informationsverarbeitung");
        String antwort2 = scanner.nextLine();
        if (antwort2.equalsIgnoreCase("b")) {
            System.out.println("Richtig!");
        } else {
            System.out.println("Falsch. Die richtige Antwort ist b) Kreativität und Intuition.");
        }
        System.out.println();

        // Frage 3
        System.out.println("Frage 3: In welchem Zustand treten Alpha-Wellen auf?");
        System.out.println("a) Tiefschlaf");
        System.out.println("b) Leichter Schlaf");
        System.out.println("c) Entspannter Wachzustand");
        System.out.println("d) Aktiver Wachzustand");
        String antwort3 = scanner.nextLine();
        if (antwort3.equalsIgnoreCase("c")) {
            System.out.println("Richtig!");
        } else {
            System.out.println("Falsch. Die richtige Antwort ist c) Entspannter Wachzustand.");
        }
        System.out.println();

        // Frage 4
        System.out.println("Frage 4: Mit welchen kognitiven Funktionen sind Beta-Wellen verbunden?");
        System.out.println("a) Regeneration und Erholung");
        System.out.println("b) Kreativität und Intuition");
        System.out.println("c) Konzentration und Fokus");
        System.out.println("d) Wahrnehmung und Informationsverarbeitung");
        String antwort4 = scanner.nextLine();
        if (antwort4.equalsIgnoreCase("c")) {
            System.out.println("Richtig!");
        } else {
            System.out.println("Falsch. Die richtige Antwort ist c) Konzentration und Fokus.");
        }
        System.out.println();

        // Frage 5
        System.out.println("Frage 5: Welcher Frequenzbereich ist mit erhöhter kognitiver Leistung und Wahr...nehmung verbunden?");
        System.out.println("a) Gamma-Wellen (30 bis 100 Hz)");
        System.out.println("b) Beta-Wellen (12 bis 30 Hz)");
        System.out.println("c) Alpha-Wellen (8 bis 12 Hz)");
        System.out.println("d) Theta-Wellen (4 bis 8 Hz)");
        String antwort5 = scanner.nextLine();
        if (antwort5.equalsIgnoreCase("a")) {
            System.out.println("Richtig!");
        } else {
            System.out.println("Falsch. Die richtige Antwort ist a) Gamma-Wellen (30 bis 100 Hz).");
        }
        System.out.println();

        // Abschließende Ausgabe
        System.out.println("Das Quiz ist beendet. Vielen Dank fürs Spielen!");
    }
}
