/**
 * Created by User on 22.10.2016.
 */
public class Cat extends Animal {
    @Override
    protected int customMethod(int koef) {
        return legs*koef;
    }
}
