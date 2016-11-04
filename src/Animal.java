/**
 * Created by User on 22.10.2016.
 */

public abstract class Animal {
    protected int legs = 4;
    protected String name;

    protected int weight = 0;
    protected int volume = 0;
    protected int time = 0;

    protected void reset(){
        this.weight = 0;
        this.volume = 0;
        this.time = 0;
    }
}
