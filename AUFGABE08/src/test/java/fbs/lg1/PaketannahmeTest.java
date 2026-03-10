package fbs.lg1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PaketannahmeTest {
    static Paketannahme pruefen;

    @BeforeAll
    static void setUpClass() {
        pruefen = new Paketannahme();
    }

    @Test
    void AblehnenTestTrue() {
        assertEquals(EnumAbnahme.ABLEHNEN, pruefen.annahmePruefen(true, false, false, true));
    }

    @Test
    void AblehnenTestFail() {
        assertEquals(EnumAbnahme.ABLEHNEN, pruefen.annahmePruefen(false, false, false, false));
    }

    @Test
    void AnnahmeTestTrue() {
        assertEquals(EnumAbnahme.ANNAHME, pruefen.annahmePruefen(false, false, false, false));
    }

    @Test
    void AnnahmeTestFail() {
        assertEquals(EnumAbnahme.ANNAHME, pruefen.annahmePruefen(true, false, false, true));
    }

    @Test
    void SperrgutTestTrue() {
        assertEquals(EnumAbnahme.SPERRGUT, pruefen.annahmePruefen(false, true, false, false));
    }

    @Test
    void SperrgutTestFail() {
        assertEquals(EnumAbnahme.SPERRGUT, pruefen.annahmePruefen(false, false, false, false));
    }

    @Test
    void AnnahmeZerbrechlichTestTrue() {
        assertEquals(EnumAbnahme.ANNAHME_ZERBRECHLICH, pruefen.annahmePruefen(false, false, false, true));
    }

    @Test
    void AnnahmeZerbrechlichTestFail() {
        assertEquals(EnumAbnahme.ANNAHME_ZERBRECHLICH, pruefen.annahmePruefen(false, false, false, false));
    }
}