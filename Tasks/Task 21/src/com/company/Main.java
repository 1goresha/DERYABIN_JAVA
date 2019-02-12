package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Program program11 = new Program("Animals","Rrrrrrrrrrrrr","lions are crying");
        Program program12 = new Program("Weapons","piu piu piu","somebody is shooting");
        Program program13 = new Program("MTV","la la la la la","somebody is singing");
        Program[] programs1 = {program11, program12, program13};
        Channel channel1 = new Channel("STS", programs1);
//        channel1.addProgram(program11);         //используется для решения задачи другим способом
//        channel1.addProgram(program12);         //используется для решения задачи другим способом
//        channel1.addProgram(program13);         //используется для решения задачи другим способом

        Program program21 = new Program("News","bla bla bla","some women and men are talking some kind of bullshit");
        Program program22 = new Program("Weather","today the weather will be so nice","one beautiful women is talking about the weather");
        Program program23 = new Program("Football","hit.... hit.... hit.... goal!!!!","22 millionaires are running and hitting a ball");
        Program[] programs2 = {program21, program22, program23};
        Channel channel2 = new Channel("Russia 24", programs2);
//        channel2.addProgram(program21);         //используется для решения задачи другим способом
//        channel2.addProgram(program22);         //используется для решения задачи другим способом
//        channel2.addProgram(program23);         //используется для решения задачи другим способом
        Channel[] channels = {channel1, channel2};
        Tv tv = new Tv(channels);
//        tv.addChannels(channel1);               //используется для решения задачи другим способом
//        tv.addChannels(channel2);               //используется для решения задачи другим способом
        RemoteController remoteController = new RemoteController(tv);

        remoteController.pressButton();
         int i =0;
    }
}
