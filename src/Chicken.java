/**
 * Created by User on 22.10.2016.
 */
public class Chicken extends Animal {

    public Chicken(){
        legs = 2;
    }

    @Override
    protected int customMethod(int koef) {
        return legs * koef;
    }
}
