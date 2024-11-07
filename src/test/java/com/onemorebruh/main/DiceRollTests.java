package com.onemorebruh.main;


import com.onemorebruh.main.diceRoll.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest(classes = D4.class)
class DiceRollTests {

    @Test
    void testRollD4() {
        D4 d4 = new D4();
    }

    @Test
    void testRollD6() {
        D6 d6 = new D6();
    }

    @Test
    void testRollD8() {
        D8 d8 = new D8();
    }

    @Test
    void testRollD10() {
        D10 d10 = new D10();
    }

    @Test
    void testRollD12() {
        D12 d12 = new D12();
    }

    @Test
    void testRollD20() {
        D20 d20 = new D20();
    }
}
