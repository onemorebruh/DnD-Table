package com.onemorebruh.main.diceRoll;

import java.util.Random;

public class D6 extends DiceRoll {
    @Override
    public int roll() {
        Random random = new Random();
        return random.nextInt(1, 7);
    }
}