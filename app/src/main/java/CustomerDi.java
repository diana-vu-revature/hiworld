package hiworld;

import java.sql.Connection;

public class CustomerDi {
    Connection connection;

    public void create(Customer customer){

    }

    public CustomerDi(Connection connection) {
        this.connection = connection;
    }

    
    
}
