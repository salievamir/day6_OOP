package com.geekbrains;

public class Dog extends Animal{
    private static final int runMeter = 500;
    private static final int swimMeter = 10;

    public void lengthRun(int meters){
        if(meters <= runMeter){
            System.out.println("Собака пробежала " + meters + " метров");
        }else {
            System.out.println("Собака столько не пробежит");
        }
    }
    public void lengthSwim(int meters){
        if(meters <= swimMeter) {
            System.out.println("Собака проплыла " + meters + " метров");
        }else {
            System.out.println("Собака столько не проплывёт");
        }
    }

}

