/**
 * Created by User on 05.11.2016.
 */
public interface Animals {
    int maxSpeed(int koef);
    void eat(int weight);
    void sleep(int time);
    void drink(int volume);

    void printStates();
}
