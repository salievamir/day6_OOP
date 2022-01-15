package com.geekbrains;

public abstract class Animal {
    private int run;
    private int swim;

    public int getRun(){ return run; }
    public void setRun(int name){ this.run = swim;}

    public int getSwim(){ return swim; }
    public void setSwim(int swim){ this.swim = swim;}

    public abstract void lengthRun(int meters);
    public abstract void lengthSwim(int meters);
}
