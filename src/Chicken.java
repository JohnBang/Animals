/**
 * Created by User on 22.10.2016.
 */
public class Chicken extends Animal implements Animals {

    public Chicken(String name){
        legs = 2;
    }

    @Override
    public int maxSpeed(int koef) {
        return legs * koef;
    }
    @Override
    public void eat(int weight) {

    }

    @Override
    public void drink(int volume) {

    }

    @Override
    public void sleep(int time) {

    }

    @Override
    public void printStates() {

    }
}
