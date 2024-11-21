import java.util.ArrayList;
import java.util.List;
class Customer 
{
    String name;
    List<Pizza> details;
    public Customer(String name)
    {
        this.name=name;
        this.details=new ArrayList<>();
    }
    public void addPizza(Pizza pizza)
    {
        details.add(pizza);
    }
    public void displayCustomerDetails()
    {
        double totalPrice=0;
        for(Pizza list: details)
        {
            list.displayPizzaDetails();
            totalPrice+=list.calculatePrice();
        }
        System.out.println("Total Amount-> "+totalPrice);
        System.out.println("--------------------------------------");
        System.out.println("ThankYou for choosing Dominos "+name+" :)");
        System.out.println("Your Pizza is just a bite away ");
        System.out.println("--------------------------------------");
    }
}
