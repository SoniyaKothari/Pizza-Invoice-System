import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("| Welcome to Dominos Pizza, where excellence meets every delicious bite | ");
        System.out.println("-------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name:- ");
        String n=sc.nextLine();
        Customer c = new Customer(n);
        boolean more = true;
        while(more)
        {
            System.out.print("Please enter the name of your pizza (eg Margherita, Pepperoni, Veggie Supreme):- ");
            String pn=sc.nextLine();
            System.out.print("Please select the size of your pizza: (Small, Medium, Large):- ");
            String s=sc.nextLine();
            System.out.print("Choose your preferred crust type: (Thin, Thick, Regular):- ");
            String cru=sc.nextLine();
            Pizza p = new Pizza(pn,s,cru);
            System.out.print("Choose your toppings (eg Olives, Mushrooms, Capsicum, Jalapenos, Corns) or type 'done' when you're finished\n" );
            while (true) 
            {
                String top=sc.nextLine();
                if(top.equalsIgnoreCase("done"))
                {
                    break;
                }
                p.addTooping(top);
            }
            c.addPizza(p);
            System.out.print("Do u want to add another pizza? (yes/no): ");
            String input=sc.nextLine();
            if(input.equalsIgnoreCase("no"))
            {
                more=false;
            }
        }
        c.displayCustomerDetails();     
    }
}
