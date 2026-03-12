package fbs.lg1;

import java.util.Random;

public class GenerateRNDM {

    public int generate(int max, int min) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    public int hälfteDerZahl(int a, int b) {
        return ((a + b) / 2);
    }
}
