package com.javarush.task.task21.task2113;

//Наши лошади будут бежать просто определенное время (100 секунд/"шагов").
//Будем определять победителя, как лошадь, пробежавшую наибольшую дистанцию.

public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse (String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return this.distance;
    }
}
