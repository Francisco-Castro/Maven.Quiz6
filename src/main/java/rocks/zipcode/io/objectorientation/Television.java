package rocks.zipcode.io.objectorientation;

public class Television {

    TVChannel arr[] = TVChannel.values();
    Integer channelNumber;
    Boolean isOn = false;

    public void turnOn() {
        isOn = true;
    }

    public void setChannel(Integer channel) {

        if (isOn){
            this.channelNumber = channel;
        }
        else {
            throw new IllegalStateException();
        }
    }

    public TVChannel getChannel() {
        return arr[this.channelNumber];
    }
}
