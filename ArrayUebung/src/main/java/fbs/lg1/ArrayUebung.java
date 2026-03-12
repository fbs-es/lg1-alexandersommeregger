package fbs.lg1;

public class ArrayUebung {
    public void run() {
        // Deklaration von Eindimensionalen Array
        int[] iarray;
        // Initialisierung von Eindimensionalen Array mit 4 Elementen
        iarray = new int[4];

        // Befüllen des Arrays
        for (int i = 0; i < iarray.length; i++) {
            iarray[i] = i + 1;
        }

        // durchlaufen des Arrays mit for-each Schleife
        for (int element : iarray) {
            System.out.println(element);
        }

        // durchlaufen des Arrays mit for-Schleife von hinten nach vorne
        for (int i = iarray.length - 1; i >= 0; i--) {
            System.out.println(iarray[i]);
        }

        // Deklaration von String Array
        String[] sarray;
        // String Array Initialisieren mit 4 Elementen
        sarray = new String[4];

        // Array befüllen mit String Objekten
        sarray[0] = new String("Alexander");
        sarray[1] = new String("Melissa");
        sarray[2] = new String("Marcel");
        sarray[3] = new String("Jasmin");
        // durchlaufen des String Arrays mit for-each Schleife
        for (String element : sarray) {
            System.out.println(element);
        }
        // Deklaration von Zweidimensionalen Array
        int[][] twoDimensionalArray;
        // Initialisierung von Zweidimensionalen Array mit 2 Zeilen und 2 Spalten
        twoDimensionalArray = new int[2][2];

        // durchlaufen der Zeilen
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            // durchlaufen der Spalten
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                // Befüllen des Arrays mit der Summe der Zeilen- und Spaltenindex
                twoDimensionalArray[i][j] = i + j;
            }
        }

        // Deklaration von Zweidimensionalen Array mit unregelmäßigen Spalten
        int[][] secondTwoDimensionalArray;
        // Initialisierung von Zweidimensionalen Array mit 2 Zeilen und unregelmäßigen
        // Spalten
        secondTwoDimensionalArray = new int[2][];

        // durchlaufen der Zeilen
        for (int i = 0; i < secondTwoDimensionalArray.length; i++) {
            // Initialisierung der Spalten mit 2 Spalten
            secondTwoDimensionalArray[i] = new int[2];
            // durchlaufen der Spalten
            for (int j = 0; j < secondTwoDimensionalArray[i].length; j++) {
                // Befüllen des Arrays mit der Summe der Zeilen- und Spaltenindex
                secondTwoDimensionalArray[i][j] = i + j;
            } // 6-7
        }

        // Deklaration von Dreidimensionalen Array
        int[][][] threeDimensionalArray;
        // Initialisierung von Dreidimensionalen Array mit 2 Zeilen, unregelmäßigen
        // Spalten und 2 Tiefen
        threeDimensionalArray = new int[2][][];

        // durchlaufen der Zeilen
        for (int i = 0; i < threeDimensionalArray.length; i++) {
            // Initialisierung der Spalten mit 2 Spalten
            threeDimensionalArray[i] = new int[2][];
            // durchlaufen der Spalten
            for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                // Initialisierung der Tiefen mit 2 Tiefen
                threeDimensionalArray[i][j] = new int[2];
                // durchlaufen der Tiefen
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                    // Befüllen des Arrays mit der Summe der Zeilen-, Spalten- und Tiefenindex
                    threeDimensionalArray[i][j][k] = i + j + k;
                }
            }
        }
    }
}
