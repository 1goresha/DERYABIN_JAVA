package com.company;

import java.util.Random;

public class Channel {
    private final int PROGRAMS_COUNT = 5;
    private int currentCount;
    private String name;
    Random random;
    private Program[] programs;
    public Channel(String name){                      // constructor #1       OVERLOAD
        this.currentCount = 0;
        this.programs = new Program[PROGRAMS_COUNT];
        this.name = name;
        this.random = new Random();
    }

    public Channel(String name, Program[] programs){  // constructor #2       OVERLOAD
        this.currentCount = programs.length;
        this.programs = programs;
        this.name = name;
        this.random = new Random();
    }

//    public void addProgram(Program program){       //используется для решения задачи другим способом
//        if(currentCount < PROGRAMS_COUNT){
//        this.programs[currentCount] = program;
//        currentCount++;
//        }else System.out.println("MAX SIZE OF ARRAY!");
//    }


    public void showChannel() {
        System.out.println("You are watching " + this.name);
        this.programs[this.random.nextInt(currentCount)].programInfo();
    }

}
