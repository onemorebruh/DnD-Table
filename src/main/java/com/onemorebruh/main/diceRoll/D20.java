package com.onemorebruh.main.diceRoll;

import java.util.Random;

public class D20 extends DiceRoll {
    @Override
    int roll() {
        Random random = new Random();
        return random.nextInt(1, 21);
    }
}
