package TestSimulator;
import java.util.Scanner;

public class TestSimulator {

    public static void main(String[] args) {
        int selection;
        do {
            selection = getSelection();
            if (selection == 1){
                System.out.println("New Test selected.");
                System.out.println("");

            }
            if (selection == 2){
                System.out.println("Test Summary selected.");
                System.out.println("");

            }
        }while(selection != 3);
        System.out.println("Exiting program....");

    }
    public static int getSelection(){
      /*  int choice;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Welcome to the TestSimulator program menu.");
        System.out.println("Select from one of the following options.");
        System.out.println("(1) New test.");
        System.out.println("(2) Test summary.");
        System.out.println("(3) Exit.");
        System.out.printf("Enter your selection:  ");
        while(input.nextInt()){
            System.out.println("Error");
            input.next();
        }
        choice = input.nextInt();
        }while (choice <=0);
        return choice;

       */
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome to the TestSimulator program menu.");
            System.out.println("Select from one of the following options.");
            System.out.println("(1) New test.");
            System.out.println("(2) Test summary.");
            System.out.println("(3) Exit.");
            System.out.printf("Enter your selection:  ");
            while (!sc.hasNextInt()) {
                System.out.println("");
                System.out.println("Welcome to the TestSimulator program menu.");
                System.out.println("Select from one of the following options.");
                System.out.println("(1) New test.");
                System.out.println("(2) Test summary.");
                System.out.println("(3) Exit.");
                System.out.printf("Enter your selection:  ");
                System.out.println("");
                sc.next(); // this is important!
            }
            choice = sc.nextInt();
        } while (!(choice > 0 && choice <= 3));
        return choice;
    }
}
