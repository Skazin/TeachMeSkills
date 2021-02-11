package Lesson5;

public class AirTransport extends Transport {

    private int wingspan;
    private int minRunwayStripLength;

    public AirTransport (String brand, int power, int maxSpeed, int mass, int wingspan, int minRunwayStripLength) {
        super(brand, power, maxSpeed, mass);
        this.wingspan = wingspan;
        this.minRunwayStripLength = minRunwayStripLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinRunwayStripLength() {
        return minRunwayStripLength;
    }

    public void setMinRunwayStripLength(int minRunwayStripLength) {
        this.minRunwayStripLength = minRunwayStripLength;
    }
}
