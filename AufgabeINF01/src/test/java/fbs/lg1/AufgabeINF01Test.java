package fbs.lg1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AufgabeINF01Test {
    @Test
    void testSagHallo() {
        AufgabeINF01 aufgabe = new AufgabeINF01();
        assertThat(aufgabe.sagHallo()).contains("Hallo");
    }
}
