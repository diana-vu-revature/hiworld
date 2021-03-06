package src.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class App{
   public static void main(String[] args){
      //for connecting to postgres
      String url = "jdbc:postgresql://localhost:5432/postgres";
      String username = "postgres";
      String password = "password";

      try {
         Connection connection = DriverManager.getConnection(url, username, password);
         Statement statement = connection.createStatement();
         int rowCount = statement.executeUpdate("insert into customeres values (1, 'Diana', 'Vu')");
         System.out.println(rowCount + " rows affected.");

         ResultSet resultSet = statement.executeQuery("select * from customers");

         while(resultSet.next()){
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("fname"));
            System.out.println(resultSet.getString("lname"));
         }
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

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
