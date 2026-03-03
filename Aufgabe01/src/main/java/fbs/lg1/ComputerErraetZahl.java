package fbs.lg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ComputerErraetZahl {

    Scanner sc = new Scanner(System.in);
    GenerateRNDM RandomKlasse = new GenerateRNDM();

    public void SpielervsComputer() {
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
                rndm = RandomKlasse.generate(max, min);

                if (zahlen.size() >= 1) {

                    guessedNumber = RandomKlasse.hälfteDerZahl(rndm, zahlen.get(indexListe));
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
                case "plus":
                case "+":
                    min = rndm;
                    break;

                case "minus":
                case "-":
                    max = rndm;
                    break;

                default:
                    break;
            }
        }
        System.out.print("Der Computer hat die Zahl erraten: " + zuErratendeZahl + ".");
    }

    public void PlayerVsPC() {

        int guessedNumber;
        int max = 100;
        int min = 1;

        System.out.print("Gib eine Zahl ein die der Computer erraten soll (1-100) Eingabe: ");
        int zuErratendeZahl = sc.nextInt();
        sc.nextLine();

        while (true) {

            guessedNumber = RandomKlasse.hälfteDerZahl(max, min);

            if (guessedNumber == zuErratendeZahl) {
                break;
            }

            System.out
                    .print("Der Computer hat die Zahl: " + guessedNumber + " geraten, Gib an ob plus, minus\nEingabe:");
            String eingabePlusMinus = sc.nextLine();

            switch (eingabePlusMinus) {
                case "plus":
                case "+":
                    min = guessedNumber;
                    break;

                case "minus":
                case "-":
                    max = guessedNumber;
                    break;

                default:
                    break;
            }
        }
        System.out.print("Der Computer hat die Zahl erraten: " + zuErratendeZahl + ".");
    }
}