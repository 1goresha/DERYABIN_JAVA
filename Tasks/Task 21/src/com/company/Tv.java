package com.company;

import java.util.Random;
import java.util.Scanner;

public class Tv {
    private int currentCount;
    private Channel[] channels;
    private final int CHANNEL_COUNT = 5;
    private Random random;
    private Scanner scanner;
    public Tv(){                                        //OVERLOAD
        this.currentCount = 0;
        this.channels = new Channel[CHANNEL_COUNT];
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public Tv(Channel[] channels){                     //OVERLOAD
        this.currentCount = channels.length;
        this.channels = channels;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    void addChannels(Channel channel){                //используется для решения задачи другим способом
        if (currentCount < CHANNEL_COUNT){
            this.channels[currentCount] = channel;
            currentCount++;
        } else System.out.println("MAX SIZE OF ARRAY");
    }

    void control(){
        System.out.println("Press button ");
        int temp = this.scanner.nextInt();
        if (temp > currentCount || temp < 0){
            System.out.println("Error!");
            return;
        }
        if (channels[temp] != null && temp < currentCount && temp >=0){
            channels[temp].showChannel();
        } else System.out.println("<<<<<<<<<<<<PROPHYLAXIS>>>>>>>>>>>>");
    }
}
