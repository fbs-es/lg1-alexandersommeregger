package fbs.lg1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Aufgabe13Test {

    BerechnungRabatt rabatt;

    @BeforeEach
    void SetUP() {
        rabatt = new BerechnungRabatt();
    }

    @Test
    void BerechnungRabattKleiner10Test() {
        double actual = rabatt.berechnungRabatt(8);
        assertEquals(0.0, actual);
    }

    @Test
    void BerechnungRabattKleiner10TestFail() {
        double actual = rabatt.berechnungRabatt(8);
        assertEquals(-2.0, actual);
    }

    @Test
    void BerechnungRabattGroesser10Kleiner50Test() {
        double actual = rabatt.berechnungRabatt(50);
        assertEquals(6.25, actual);
    }

    @Test
    void BerechnungRabattGroesser10Kleiner50TestFail() {
        double actual = rabatt.berechnungRabatt(50);
        assertEquals(-2.0, actual);
    }

    @Test
    void BerechnungRabattGroesser50Kleiner100Test() {
        double actual = rabatt.berechnungRabatt(51);
        assertEquals(12.75, actual);
    }

    @Test
    void BerechnungRabattGroesser50Kleiner100TestFail() {
        double actual = rabatt.berechnungRabatt(51);
        assertEquals(-2.0, actual);
    }

    @Test
    void BerechnungRabattGroesser100Test() {
        double actual = rabatt.berechnungRabatt(130);
        assertEquals(65, actual);
    }

    @Test
    void BerechnungRabattGroesser100TestFail() {
        double actual = rabatt.berechnungRabatt(130);
        assertEquals(-2.0, actual);
    }
}