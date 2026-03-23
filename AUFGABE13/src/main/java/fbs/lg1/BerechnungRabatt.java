package fbs.lg1;

public class BerechnungRabatt {

    public double berechnungRabatt(int paketAnzahl) {

        double rabattinEuro = -12;

        if (paketAnzahl <= 10) {
            rabattinEuro = 0;
        } else if (paketAnzahl >= 11 && paketAnzahl <= 50) {
            rabattinEuro = (2.50 * 0.05) * paketAnzahl;
        } else if (paketAnzahl >= 51 && paketAnzahl <= 100) {
            rabattinEuro = (2.50 * 0.10) * paketAnzahl;

        } else if (paketAnzahl >= 101) {
            rabattinEuro = (2.50 * 0.20) * paketAnzahl;
        }

        return rabattinEuro;
    }
}