/**
 * Created by User on 22.10.2016.
 */
public class Cat extends Animal implements Animals{
    public Cat(String name){
        this.name = name;
    }

    @Override
    public int maxSpeed(int koef) {
        return legs*koef;
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

    }
}
