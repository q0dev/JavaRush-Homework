package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return this.horses;
    }
    
    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Stan", 3, 0));
        horses.add(new Horse("Chuck", 3, 0));
        horses.add(new Horse("Grag", 3, 0));

        game = new Hippodrome(horses);
        game.run();
    }

    public void move() {
        for(Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for(Horse horse : horses) {
            horse.print();
        }
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void run() throws InterruptedException {
        for(int i = 1; i <= 100; i++) {
            this.move();
            this.print();
            Thread.sleep(200);
        }
    }

    public Horse getWinner() {
        Horse winner;
        if (horses.get(0).getDistance() > horses.get(1).getDistance()) {
            if (horses.get(0).getDistance() > horses.get(2).getDistance()) {
                winner = horses.get(0);
            } else {
                winner = horses.get(2);
            }
        } else {
            if (horses.get(1).getDistance() > horses.get(2).getDistance()) {
                winner = horses.get(1);
            } else {
                winner = horses.get(2);
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
