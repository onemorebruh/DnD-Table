package com.onemorebruh.main;


import com.onemorebruh.main.diceRoll.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.Assert;

import java.util.Arrays;

@SpringBootTest(classes = D4.class)
class DiceRollTests {

    @Test
    void testRollD4() {
        D4 d4 = new D4();
        int testNumber = d4.roll();
        Assert.isTrue((testNumber < 5 && testNumber > 0), "Number is out of range");
    }

    @Test
    void testRollD6() {
        D6 d6 = new D6();
        int testNumber = d6.roll();
        Assert.isTrue((testNumber < 7 && testNumber > 0), "Number is out of range");
    }

    @Test
    void testRollD8() {
        D8 d8 = new D8();
        int testNumber = d8.roll();
        Assert.isTrue((testNumber < 9 && testNumber > 0), "Number is out of range");
    }

    @Test
    void testRollD10() {
        D10 d10 = new D10();
        int testNumber = d10.roll();
        Assert.isTrue((testNumber < 11 && testNumber > 0), "Number is out of range");
    }

    @Test
    void testRollD12() {
        D12 d12 = new D12();
        int testNumber = d12.roll();
        Assert.isTrue((testNumber < 13 && testNumber > 0), "Number is out of range");
    }

    @Test
    void testRollD20() {
        D20 d20 = new D20();
        int testNumber = d20.roll();
        Assert.isTrue((testNumber < 21 && testNumber > 0), "Number is out of range");
    }
}
