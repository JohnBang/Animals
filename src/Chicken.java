/**
 * Created by User on 22.10.2016.
 */
public class Chicken extends Animal implements Animals {

    public Chicken(String name, int koefSpeed){
        this.name = name;
        legs = 2;
        maxSpeed(koefSpeed);
    }

}

