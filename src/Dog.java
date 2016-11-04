/**
        * Created by User on 22.10.2016.
        */
public class Dog extends Animal implements Animals {
    public Dog(String name){
        this.name = name;
    }

    @Override
    public int maxSpeed(int koef) {
        return legs*koef;
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
