package src.main;

public class App{
   public static void main(String[] args){
      Pizza order = new Pizza();    //creating a new pizza order

      greetCustomer();

      //run ordering system
      order.getOrder();
      order.reviewOrder();
   }

   public static void greetCustomer(){
      System.out.println("*** Welcome to the online pizza ordering system! ***\n");
      System.out.println("*** Please make your selections below: ***\n");
   }
}
