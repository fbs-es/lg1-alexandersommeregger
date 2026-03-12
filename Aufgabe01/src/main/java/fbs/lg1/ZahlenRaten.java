package fbs.lg1;

import java.util.Scanner;

public class ZahlenRaten {

    Scanner sc = new Scanner(System.in);
    GenerateRNDM randomKlasse = new GenerateRNDM();

    public void startenvsComputer() {
        int rndm = randomKlasse.generate(100, 0);
        int count = 0;
        boolean nichtErraten = true;
        String rueckmeldung = "";

        while (nichtErraten) {
            count++;
            System.out.print("Du musst eine Zahl von 1-100 erraten! Eingabe: ");
            int eingabe = sc.nextInt();

            String nachricht = WarmKalt(eingabe, rndm);
            int zahlZürückGebenInt = Zahlzurückgeben(eingabe, rndm);

            switch (zahlZürückGebenInt) {

                case -1:
                    rueckmeldung = "Die eingegebene Zahl ist zu klein. Versuche: ";
                    break;

                case 1:
                    rueckmeldung = "Die eingegebene Zahl ist zu groß. Versuche: ";
                    break;

                default:
                    rueckmeldung = "Glückwunsch! Die Zahl war: " + rndm + ", Versuche: ";
                    nichtErraten = false;
                    break;
            }
            System.out.println(rueckmeldung + count + ", " + nachricht);
        }
        sc.close();
    }

    public int Zahlzurückgeben(int eingabe, int rndm) {
        int zurückgeben = 0;

        if (eingabe < rndm)
            return -1;
        if (eingabe > rndm)
            return 1;

        return zurückgeben;
    }

    public String WarmKalt(int eingabe, int rndm) {

        String nachricht = "kalt";
        int distanz = rndm - eingabe;

        if (distanz <= 5) {
            nachricht = "warm";
        }

        if (distanz == 0) {
            nachricht = "heiß";
        }

        return nachricht;
    }

    public int addieren(int i, int j) {
        return i + j;
    }
}