package edu.julia.synthax;

public class SmartTV {
    boolean isOn = false;
    int channel = 1;
    int volume = 25;

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

    public void volumeUp() {
        volume++;
        System.out.println(volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println(volume);
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
    }

    public void previousChannel() {
        channel --;
    }
    public void nextChannel() {
        channel ++;
    }
}
