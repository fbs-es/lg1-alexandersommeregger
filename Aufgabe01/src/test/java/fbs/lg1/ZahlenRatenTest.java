package fbs.lg1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ZahlenRatenTest {

    static ZahlenRaten rZ;

    @BeforeAll
    static void setUpClass() {
        rZ = new ZahlenRaten();
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, kalt",
            "10, 20, warm",
            "10, 10, heiß"
    })
    void TestWarmKalt(int rndm, int eingabe, String expected) {
        ZahlenRaten rz = new ZahlenRaten();
        String actual = rz.WarmKalt(eingabe, rndm);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAnswerWithTrue() {
        ZahlenRaten t = new ZahlenRaten();
        assertEquals(2, t.addieren(1, 1));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, 1",
            "10, 10, 0",
            "10, 12, -1"
    })
    void TestZahlZurückGeben(int rndm, int eingabe, int expected) {
        ZahlenRaten rz = new ZahlenRaten();
        int actual = rz.Zahlzurückgeben(rndm, eingabe);
        assertEquals(expected, actual);
    }
}