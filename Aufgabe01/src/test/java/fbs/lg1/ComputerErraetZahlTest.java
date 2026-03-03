package fbs.lg1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ComputerErraetZahlTest {

    GenerateRNDM gen = new GenerateRNDM();

    @ParameterizedTest
    @CsvSource({
            "1, 100",
            "50, 100",
            "50, 50",
            "-100, -50"
    })
    void generateTest(int min, int max) {
        int wert = gen.generate(max, min);
        assertTrue(wert >= min && wert <= max);
    }
}
