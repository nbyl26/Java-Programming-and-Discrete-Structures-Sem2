package TV;

public class TV {
    int channel;
    int volumeLevel;
    boolean on;

    public TV(){
        on = false;
        channel = 1;
        volumeLevel = 1;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOf(){
        on = false;
    }

    public void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }

    public void setVolume(int newVolume){
        if (on && newVolume >= 1 && newVolume <= 7){
            volumeLevel = newVolume;
        }
    }

    void channelUp(){
        if(on && channel < 120)
            channel++;
    }

    void channelDown(){
        if (on && channel > 1){
            channel--;
        }
    }

    void volumeUp(){
        if (on && volumeLevel < 7){
            volumeLevel++;
        }
    }

    void volumeDown(){
        if (on && volumeLevel > 0)
            volumeLevel--;
    }
}
