import java.util.ArrayList;
import java.util.List;
class Pizza
{
    String pizzaName,size,crust;
    List<String> toppings;
    double basePrice;
    public Pizza(String pizzaName, String size, String crust)
    {
        this.pizzaName=pizzaName;
        this.size=size;
        this.crust=crust;
        this.toppings = new ArrayList<>();
        this.basePrice=calculatePrice();
    }
    public void addTooping(String topping)
    {
        toppings.add(topping);
    }
    public double calculatePrice()
    {
        double calc=0;
        switch (size.toLowerCase()) 
        {
            case "small":
                calc+=100;
                break;
            case "medium":
                calc+=200;
                break;
            case "large":
                calc+=300;
                break;
            default:
                throw new IllegalArgumentException("Invalid choice! "+this.size);
        }
        switch (crust.toLowerCase()) 
        {
            case "thin":
                calc+=50;
                break;
            case "thick":
                calc+=250;
                break;
            case "regular":
                calc+=150;
                break;
            default:
            throw new IllegalArgumentException("Invalid choice! "+this.crust);
        }
        calc+=this.toppings.size()*50;
        return calc;
    }
    public void displayPizzaDetails()
    {
        System.out.println("--------------------------------------");
        System.out.println("Pizza Order Summary");
        System.out.println("--------------------------------------");
        System.out.println("Pizza type -> "+this.pizzaName);
        System.out.println("Pizza size -> "+this.size);
        System.out.println("Pizza crust type -> "+this.crust);
        if(this.toppings.isEmpty())
        {
            System.out.println("No toppings added");
        }
        else
        {
            System.out.println("Pizza toppings -> "+this.toppings);
        }
    }
}