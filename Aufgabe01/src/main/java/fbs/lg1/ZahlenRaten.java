package fbs.lg1;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {

    public int generate() {
        Random rand = new Random();
        int rndm = rand.nextInt(100) + 1;
        return rndm;
    }

    public void starten() {
        int rndm = generate();
        int count = 0;
        Scanner sc = new Scanner(System.in);
        boolean nichtErraten = true;
        String rückmeldung = "";

        while (nichtErraten) {
            count++;
            System.out.print("Du musst eine Zahl von 1-100 erraten! Eingabe: ");
            int eingabe = sc.nextInt();

            String nachricht = WarmKalt(eingabe, rndm);
            int zahlZürückGebenInt = Zahlzurückgeben(rndm, eingabe);

            switch (zahlZürückGebenInt) {

                case -1:
                    rückmeldung = "Die eingegebene Zahl ist zu klein. Versuche: ";
                    break;

                case 1:
                    rückmeldung = "Die eingegebene Zahl ist zu groß. Versuche: ";
                    break;

                default:
                    rückmeldung = "Glückwunsch! Die Zahl war: " + rndm + ", Versuche: ";
                    nichtErraten = false;
                    break;
            }
            System.out.println(rückmeldung + count + ", " + nachricht);
        }
        sc.close();
    }

    public int Zahlzurückgeben(int rndm, int eingabe) {
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
