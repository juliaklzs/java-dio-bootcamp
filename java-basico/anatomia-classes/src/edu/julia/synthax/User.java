package edu.julia.synthax;

public class User {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        smartTv.on();
        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.setChannel(13);

        System.out.println("A tv está ligada? " + smartTv.isOn);
        System.out.println("Canal " + smartTv.channel);
        System.out.println("Volume "+smartTv.volume);
    }
}
