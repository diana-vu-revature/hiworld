package src.main;
import java.util.Scanner;

public class Pizza {
    //int n = 0;

    //get the order from the customer
    public void getOrder(){
        System.out.println("\n .....Starting new piza order.....");

        Scanner reader = new Scanner(System.in);
        System.out.println("How many Pizzas?: ");
        int n = reader.nextInt();
        reader.close();

        //create a new pizza for every number of pizza they want
        for(int i = 1; i <= n; i++){
            System.out.println(".....Create your pizza for pizza" + i + ".....\n");
            createPizza();
        }

    }

    public void createPizza(){

        Scanner input = new Scanner(System.in);
        System.out.println("Size of pizza: \n");
        char size = input.nextChar();
    }
}
