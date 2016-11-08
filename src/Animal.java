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



    protected void reset(){
        this.weight = 0;
        this.volume = 0;
        this.time = 0;
    }
}
