import java.util.Scanner;

public class Purchase
{
    private String name;
    private int groupCount;//Part of price, like the 2 in 2 for $1.99.
    private double groupPrice;
                      //Part of price, like the $1.99 in 2 for $1.99.
    private int numberBought;//Total number being purchased.

    public void setName(String newName)
    {
        name = newName;
    }

    public void setPrice(int count, double costForCount)
    {
        if ((count <= 0) || (costForCount <= 0))
        {
            System.out.println("Error: Bad parameter in setPrice.");
            System.exit(0);
        }
        else
        {
            groupCount = count;
            groupPrice = costForCount;
        }
    }

    public void setNumberBought(int number)
    {
        if (number <= 0)
        {
            System.out.println("Error: Bad parameter in setNumberBought.");
            System.exit(0);
        }
        else
            numberBought = number;
    }

    public void readInput()
    {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter name of item you are purchasing on a separate line:");
        name = keyboard.nextLine(); // Keyboard is a special class that only reads from the keyboard
        System.out.println("Enter price of item on one or two lines.");
        System.out.println("For example, 3 for $2.99 is entered as either");
        System.out.println("3");
        System.out.println("2.99");
        System.out.println("or: 3 2.99");
        System.out.println("Enter price of item on one or two lines, now:");
        groupCount = keyboard.nextInt();
        groupPrice = keyboard.nextDouble();

        while ((groupCount <= 0) || (groupPrice <= 0))
        {
            //Try again:

            System.out.println("Both numbers must be positive. Try again.");
            System.out.println("Enter price of item on one or two lines as shown above:");
            groupCount = keyboard.nextInt();
            groupPrice = keyboard.nextDouble();
        }

        System.out.println("Enter number of items purchased:");
        numberBought = keyboard.nextInt();

        while (numberBought <= 0)
        {
            //Try again:

            System.out.println("Number must be positive. Try again.");
            System.out.println("Enter number of items purchased:");
            numberBought = keyboard.nextInt();
        }
    }

    /**
     Outputs price and number being purchased to screen.
    */
    public void writeOutput()
    {
        System.out.println(numberBought + " " + name);
        System.out.println("at " + groupCount
                                 + " for $" + groupPrice);
    }

    public String getName()
    {
        return name;
    }

    public double getTotalCost()
    {
        return ((groupPrice/groupCount)*numberBought);
    }

    public double getUnitCost()
    {
        return (groupPrice/groupCount);
    }

    public int getNumberBought()
    {
        return numberBought;
    }
	
	private static Purchase getInfo(String name)
	{
		Purchase item = new Purchase();
		System.out.println("This set of input requests is for " + name);
		item.readInput();
		return item;
	}	
	
	private static Purchase createItem(
		String name, int groupCount, double groupPrice)
	{
		Purchase item = new Purchase();
		item.setName(name);
		item.setPrice(groupCount, groupPrice);
		return item;
	}
	
	private static double printAndReturnTotal(Purchase item)
	{
		System.out.println(item.getNumberBought() + " " + item.getName() + 
							" at $" + item.getUnitCost() +
							" each cost $" + item.getTotalCost());
		return item.getTotalCost();
	}
	
	private static double printAndReturnTotal(
		Purchase item, int numberBought)
	{
		item.setNumberBought(numberBought);
		System.out.println(item.getNumberBought() + " " + item.getName() + 
							" at $" + item.getUnitCost() +
							" each cost $" + item.getTotalCost());
		return item.getTotalCost();
	}

	public static void main(String[] args)
    	{
	// Setting up each item and its prices and amounts given and printing their prices

		Purchase oranges = new Purchase();
		oranges.setPrice(10, 2.99); 
		oranges.setNumberBought(24);
		System.out.print("Total for 24 oranges is: $" + oranges.getTotalCost());

		Purchase eggs = new Purchase();
		eggs.setPrice(12, 1.69);
		eggs.setNumberBought(36);
		System.out.print("Total for 36 eggs is: $" + eggs.getTotalCost());
	
		Purchase apples = new Purchase();
		apples.setPrice(3, 1.00);
		apples.setNumberBought(20);
		System.out.print("Total for 20 apples is: $" + apples.getTotalCost());

		Purchase watermelons = new Purchase();
		watermelons.setPrice(1, 4.39);
		watermelons.setNumberBought(2);
		System.out.print("Total for 2 watermelons is: $" + watermelons.getTotalCost());

		Purchase bagels = new Purchase();
		bagels.setPrice(6, 3.50);
		bagels.setNumberBought(12);
		System.out.print("Total for 12 bagels is: $" + bagels.getTotalCost());

		// Setting up the totals for each item to add them all together 

		double total = 0;

		total += oranges.getTotalCost();
		total += eggs.getTotalCost();
		total += apples.getTotalCost();
		total += watermelons.getTotalCost();
		total += bagels.getTotalCost();
	

		System.out.println("The total price for all the groceries is: $" + total + "\n");
	
    	}

}