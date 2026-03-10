package fbs.lg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerErraetZahl {

    Scanner sc = new Scanner(System.in);
    GenerateRNDM randomKlasse = new GenerateRNDM();

    public void spielervsComputer() {
        List<Integer> zahlen = new ArrayList<>();

        int guessedNumber;
        int indexListe = -1;
        int max = 100;
        int min = 1;
        int rndm = -1;

        System.out.print("Gib eine Zahl ein die der Computer erraten soll (1-100) Eingabe: ");
        int zuErratendeZahl = sc.nextInt();
        sc.nextLine();

        while (true) {

            do {
                rndm = randomKlasse.generate(max, min);

                if (zahlen.size() >= 1) {

                    guessedNumber = randomKlasse.hälfteDerZahl(rndm, zahlen.get(indexListe));
                }

            } while (zahlen.contains(rndm));

            zahlen.add(rndm);
            guessedNumber = rndm;
            indexListe++;

            if (rndm == zuErratendeZahl) {
                break;
            }

            System.out
                    .print("Der Computer hat die Zahl: " + guessedNumber + " geraten, Gib an ob plus, minus\nEingabe:");
            String eingabePlusMinus = sc.nextLine();

            switch (eingabePlusMinus) {
                case "plus", "+":
                    min = rndm;
                    break;

                case "minus", "-":
                    max = rndm;
                    break;

                default:
                    break;
            }
        }
        System.out.print("Der Computer hat die Zahl erraten: " + zuErratendeZahl + ".");
    }

    public void playerVsPC() {

        int guessedNumber;
        int max = 100;
        int min = 1;

        System.out.print("Gib eine Zahl ein die der Computer erraten soll (1-100) Eingabe: ");
        int zuErratendeZahl = sc.nextInt();
        sc.nextLine();

        while (true) {

            guessedNumber = randomKlasse.hälfteDerZahl(max, min);

            if (guessedNumber == zuErratendeZahl) {
                break;
            }

            System.out
                    .print("Der Computer hat die Zahl: " + guessedNumber + " geraten, Gib an ob plus, minus\nEingabe:");
            String eingabePlusMinus = sc.nextLine();

            switch (eingabePlusMinus) {
                case "plus", "+":
                    min = guessedNumber;
                    break;

                case "minus", "-":
                    max = guessedNumber;
                    break;

                default:
                    break;
            }
        }
        System.out.print("Der Computer hat die Zahl erraten: " + zuErratendeZahl + ".");
    }
}