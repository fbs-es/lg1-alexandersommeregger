import fbs.lg1.ComputerErraetZahl;
import fbs.lg1.GenerateRNDM;
import fbs.lg1.ZahlenRaten;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComputerErraetZahl cez = new ComputerErraetZahl();
        ZahlenRaten rZ = new ZahlenRaten();
        GenerateRNDM gen = new GenerateRNDM();

        Scanner sc = new Scanner(System.in);
        System.out
                .print("1: Computer vs Spieler\n2: PlayerVsPc / 2\n3: Spieler vs Computer\n4: Mitte Rechner\nEingabe: ");
        String eingabeNutzer = sc.nextLine();

        switch (eingabeNutzer) {
            case "1":
                rZ.startenvsComputer();
                break;
            case "2":
                cez.PlayerVsPC();
                break;

            case "3":
                cez.SpielervsComputer();
                break;
            case "4":
                int i = gen.hälfteDerZahl(50, 40);
                System.out.print(i);
                break;
            default:
                System.out.print("Die Eingabe: " + eingabeNutzer + " war nicht gültig.");
                break;
        }
        sc.close();
    }
}