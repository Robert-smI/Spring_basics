package project;

public class Order implements IOrder {

    private static IPizza pizza;


    public Order(IPizza pizza) {
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("project.Order: "+"\""+pizza.getName()+"\"" + ", price: " + pizza.getPrice());
    }
}
