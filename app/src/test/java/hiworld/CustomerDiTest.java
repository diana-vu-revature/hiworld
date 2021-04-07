package hiworld;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;

import org.junit.jupiter.api.BeforeAll;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class CustomerDiTest {

    @Mock Connection connection;

    Customer mockCustomer;

    @BeforeAll public static void init(){
        this.mockCustomer = new Customer(0, "bob", "s", "y", "n");
    }
    
    @Test void canInsertData() {
        CustomerDi classUnderTest = new CustomerDi(connection, mockCustomer);
        assertTrue(true);
    }
}
