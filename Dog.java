import java.util.Scanner;

public class Dog
{
	public String name;
	public String breed;
	public int age;

	public void writeOutput()
	{
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Age in calendar years: " + age);
		System.out.println("Age in human years: " + getAgeInHumanYears());
		System.out.println();
	}
	
	public String getName() 
	{
    		return name;
  	}

  	public void setName(String name) 
	{
    		this.name = name;
  	}

 	public String getBreed() 
	{
    		return breed;
 	}

  	public void setBreed(String breed) 
	{
    		this.breed = breed;
  	}

  	public int getAge() 
	{
    		return age;
  	}

  	public void setAge(int age) 
	{
    		this.age = age;
  	}
	
	
	public int getAgeInHumanYears()
	{
		int humanYears = 0;
		if (age <= 2)
		{
			humanYears = age * 11;
		}
		else
		{
			humanYears = 22 + ((age-2) * 5);
		}
		return humanYears;
	}

    public static void main(String[] args)
    {
	Dog balto = new Dog();
   	balto.setName("Balto");
    	balto.setBreed("Siberian Husky");
    	balto.setAge(8);
    	balto.writeOutput();

    	Dog scooby = new Dog();
    	scooby.setName("Scooby");
    	scooby.setBreed("Great Dane");
    	scooby.setAge(42);
    	scooby.writeOutput();

    	System.out.println("Are scooby and balto the same? " + scooby.equals(balto));

    	Dog baltoJunior = new Dog();
    	baltoJunior.setName("Balto");
    	baltoJunior.setBreed("Siberian Husky");
    	baltoJunior.setAge(balto.getAge()-4);
    	System.out.println("Are baltoJunior and balto the same? " + baltoJunior.equals(balto));

    	Dog baltoClone = new Dog();
   	baltoClone.setName("Balto");
    	baltoClone.setBreed("Siberian Husky");
    	baltoClone.setAge(8);
    	System.out.println("Are baltoClone and balto the same? " + baltoClone.equals(balto));
	
    }

}