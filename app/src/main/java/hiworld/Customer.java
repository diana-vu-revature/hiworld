package hiworld;

public class Customer {
    private int id;
    private String name;
    private String cheese;
    private String pepperoni;

    public Customer(int id, String name, String cheese, String pepperoni) {
        this.id = id;
        this.name = name;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(String pepperoni) {
        this.pepperoni = pepperoni;
    }

    
}  


