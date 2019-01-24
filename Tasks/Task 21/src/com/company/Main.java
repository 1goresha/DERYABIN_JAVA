package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Program program11 = new Program("Animals","Rrrrrrrrrrrrr","lions are crying");
        Program program12 = new Program("Weapons","piu piu piu","somebody is shooting");
        Program program13 = new Program("MTV","la la la la la","somebody is singing");
        Channel channel1 = new Channel("STS");
        channel1.addProgram(program11);
        channel1.addProgram(program12);
        channel1.addProgram(program13);

        Program program21 = new Program("News","bla bla bla","some women and men are talking some kind of bullshit");
        Program program22 = new Program("Weather","today the weather will be so nice","one beautiful women is talking about the weather");
        Program program23 = new Program("Football","hit.... hit.... hit.... goal!!!!","22 millionaires are running and hitting a ball");
        Channel channel2 = new Channel("Russia 24");
        channel2.addProgram(program21);
        channel2.addProgram(program22);
        channel2.addProgram(program23);

        Tv tv = new Tv();
        tv.addChannels(channel1);
        tv.addChannels(channel2);
        RemoteController remoteController = new RemoteController(tv);
        remoteController.pressButton();

    }
}
