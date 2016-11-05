/**
 * Created by User on 05.11.2016.
 */
public interface Animals {

    void maxSpeed(int koef);
    void eat(int weight);
    void sleep(int time);
    void drink(int volume);

    void printStates();
    void printAllStates();
    void nextDay();
}
