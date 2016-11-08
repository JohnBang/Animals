/**
 * Created by User on 22.10.2016.
 */
public class Chicken extends Animal implements Animals {

    public Chicken(String name, int koefSpeed){
        this.name = name;
        legs = 2;
        maxSpeed(koefSpeed);
    }
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

}

