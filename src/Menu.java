/**
 * Created by User on 05.11.2016.
 */
public class Menu {
    void showMenu(Animal ob1,Animal ob2, Animal ob3){
        System.out.println("\tMenu");

        System.out.println("Chose your pet: ");

        System.out.println("1. " + ob1.name + " ;");
        System.out.println("2. " + ob2.name + " ;");
        System.out.println("3. " + ob3.name + " .");

        System.out.println("Enter to console number of pet...");
    }
}
