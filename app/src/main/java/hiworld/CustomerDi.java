package hiworld;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import hiworld.Customer;

public class CustomerDi {
    Connection connection;

    public void create(Customer customer){
        try{
            PreparedStatement pStatement = connection.prepareStatement("insert into customers(name, size, cheese, pepperoni) values (?, ?, ?, ?)");
            pStatement.setString(1, customer.getName());
            pStatement.setString(2, customer.getSize());
            pStatement.setString(3, customer.getCheese());
            pStatement.setString(4, customer.getPepperoni());
            pStatement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public CustomerDi(Connection connection) {
        this.connection = connection;
    }

    
    
}
