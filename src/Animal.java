/**
 * Created by User on 22.10.2016.
 */

public abstract class Animal implements Animals{
    protected int legs = 4;
    protected String name;
    protected int days = 0;

    protected int speed;
    protected int maxSpeedValue;


    protected int weight = 0;
    protected int volume = 0;
    protected int time = 0;

    protected int allWeight= 0;
    protected int allVolume= 0;
    protected int allTime= 0;

    @Override
    public void maxSpeed(int koef) {
        this.speed = legs * koef;
        if (maxSpeedValue < speed) maxSpeedValue = speed;
    }
    @Override
    public void eat(int weight) {
        this.weight += weight;
    }

    @Override
    public void drink(int volume) {
        this.volume +=  volume;
    }

    @Override
    public void sleep(int time) {
        this.time  += time;
    }

    @Override
    public void printStates() {
        System.out.println("\n For today " + name + ":\n\t - eat " + weight + " kg of Food,");
        System.out.println("\t" + " - drink " + volume + " liters of water,");
        System.out.println("\t" + " - sleep " + time + " hour.");
        System.out.println("\t" + " - max speed equals " + speed);

    }
    @Override
    public void printAllStates() {
        System.out.println("\n For " + days + " days "  + name + ":\n\t - eat " + allWeight + " kg of Food,");
        System.out.println("\t" + " - drink " + allVolume + " liters of water,");
        System.out.println("\t" + " - sleep " + allTime + " hour,");
        System.out.println("\t" + " - max speed equals " + maxSpeedValue);
    }

    @Override
    public void nextDay() {
        allWeight+=weight;
        allVolume+=volume;
        allTime+=time;

        days++;
        reset();
    }

    protected void reset(){
        this.weight = 0;
        this.volume = 0;
        this.time = 0;
    }
}
