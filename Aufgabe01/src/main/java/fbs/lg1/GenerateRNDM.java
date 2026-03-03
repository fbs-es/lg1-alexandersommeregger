package fbs.lg1;

import java.util.Random;

public class GenerateRNDM {

    public int generate(int max, int min) {
        Random rand = new Random();
        int rndm = rand.nextInt(max - min + 1) + min;
        return rndm;
    }

    public int hälfteDerZahl(int a, int b) {
        int mitte = (a - b) / 2 + b;
        return mitte;
    }
}
