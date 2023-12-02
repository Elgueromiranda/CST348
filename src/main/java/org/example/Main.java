package org.example;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Die die_one = new Die();
        Die die_two = new Die();
        Die die_three = new Die();
        Die die_four = new Die();
        Die die_five = new Die();
        Die die_six = new Die();

        String input = JOptionPane.showInputDialog("Would you like to roll the six die? Enter y to reroll:\n");

        

       if (input.equals("y")) {
           die_one.roll();
           die_two.roll();
           die_three.roll();
           die_four.roll();
           die_five.roll();
           die_six.roll();
           System.out.println(die_one.value + " " + die_two.value + " " + die_three.value + " " + die_four.value + " " + die_five.value + " " + die_six.value);

       } else {
           System.out.println("Goodbye");
       }


    }
}