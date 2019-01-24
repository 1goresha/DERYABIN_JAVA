package com.company;

import java.util.Random;

public class Channel {
    private final int PROGRAMS_COUNT = 5;
    private int currentCount;
    private String name;
    Random random;
    private Program programs[];
    public Channel(String name){
        this.currentCount = 0;
        this.programs = new Program[PROGRAMS_COUNT];
        this.name = name;
        this.random = new Random();
    }

    public void addProgram(Program program){
        if(currentCount < PROGRAMS_COUNT){
        this.programs[currentCount] = program;
        currentCount++;
        }else System.out.println("MAX SIZE OF ARRAY!");
    }

    public void showChannel() {
        System.out.println("You are watching " + this.name);
        this.programs[this.random.nextInt(currentCount)].programInfo();
    }
}
