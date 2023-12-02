package org.example;

import java.util.Random;

public class Die {
    Random rand = new Random();
    public int value = rand.nextInt(6) + 1;
    public void roll() {
        value = rand.nextInt(6) + 1;
    }
}
