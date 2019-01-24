package com.company;

public class Program {
    private String name;
    private String programSound;
    private String programPicture;
    public Program(String name, String programSound, String programPicture) {
        this.name = name;
        this.programSound = programSound;
        this.programPicture = programPicture;
    }
    void programInfo(){
        System.out.println("SOUND : " + this.programSound );
        System.out.println("PICTURE : " + this.programPicture);
    }
}
