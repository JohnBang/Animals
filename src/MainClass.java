import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 22.10.2016.
 */
public class MainClass {
    public static void main(String args[]){

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Cat cat = new Cat("Jasper", 4);
        Dog dog = new Dog("Barsik", 2);
        Chicken chicken = new Chicken("Fred", 1);

        Animals animals = null;

        new Menu().showMenu(cat,dog,chicken);

        try {
            switch(Integer.parseInt(bufferedReader.readLine())){
                case 1:animals = cat ; break;
                case 2:animals = dog; break;
                case 3:animals = chicken;break;
                default:
                    System.out.println("Wrong number!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Animal between lanch :)\n");
        animals.printStates();


        animals.eat(10);
        animals.drink(3);

        System.out.println("\nAnimal before lanch \n");

        animals.sleep(10);

        animals.printStates();

        System.out.println("Between next day!");

        animals.nextDay();

        System.out.println("\nNext Day!!");

        System.out.println("Animal is hungry");

        animals.printStates();

        System.out.println("Animal already don't eat, drink or sleep =)");

        animals.printAllStates();

        System.out.println("\n Animal eat, drink and sleep in past. ");




        System.out.println();
    }
}
