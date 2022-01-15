package com.geekbrains;

public class Cat extends Animal{
    private static final int runMeter = 200;
    private static final int swimMeter = 0;

    public void lengthRun(int meters){
        if(meters <= runMeter){
            System.out.println("Кот пробежал " + meters + " метров");
        }else {
            System.out.println("Кот столько не пробежит");
        }
    }
    public void lengthSwim(int meters){
        System.out.println("Коты не плавают");
    }

}
