/**
 * Created by User on 22.10.2016.
 */
public class MainClass {
    public static void main(String args[]){

        Cat cat = new Cat();
        Dog dog = new Dog();
        Chicken chicken = new Chicken();

        int catResult = cat.customMethod(12);
        int dogResult = dog.customMethod(10);
        int chickenResult = chicken.customMethod(8);

       System.out.println();
    }
}
