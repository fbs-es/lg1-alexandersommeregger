package fbs.lg1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GenerateRNDMTest {

    GenerateRNDM randomKlasse = new GenerateRNDM();

    @ParameterizedTest
    @CsvSource({
            "1, 100",
            "50, 100",
            "50, 50",
            "-100, -50"
    })
    void generateTest(int min, int max) {
        int wert = randomKlasse.generate(max, min);
        assertTrue(wert >= min && wert <= max);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, 6",
            "10, 3, 6",
            "50, 40, 45"
    })
    void TesthälfteDerZahl(int a, int b, int expected) {
        int actual = randomKlasse.hälfteDerZahl(a, b);
        assertEquals(actual, expected);
    }
}
