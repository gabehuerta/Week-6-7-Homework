import java.util.Scanner;

public class Movie
{
	private String movieName;
	private String MPAARating;
	private int numRate[];

	public Movie()
	{
		movieName = null;
		MPAARating = null;
		numRate = new int[5];
		numRate[0] = 0;
		numRate[1] = 0;
		numRate[2] = 0;
		numRate[3] = 0;
		numRate[4] = 0;
	}
		
	public String getMovieName()
	{
		return movieName;
	}
	public void setMovieName (String str)
	{
		this.movieName = str;
	}
	public String getMPAARating()
	{
		return MPAARating;
	}
	public void setMPAARating (String str)
	{
		this.MPAARating = str;
	}
	public void addRating(int num)
	{
		if(num>0 && num<=5)
		{
			numRate[num-1]++;
		}else{
			System.out.println("Number Value Out of Range");
		}
	}
	public double getAverage()
	{
		return (double)(numRate[0]*1 +numRate[1]*2 +numRate[2]*3 +numRate[3]*4 +numRate[4]*5) / (numRate[0] + numRate[1] + numRate[2] + numRate[3] + numRate[4]);
	}
	public static void main(String[] args) 
	{
		Movie obj1 = new Movie();
		Movie obj2 = new Movie();

		obj1.addRating(2);
		obj1.addRating(2);
		obj1.addRating(5);
		obj1.addRating(4);
		obj1.addRating(4);
		obj1.addRating(2);
		obj1.addRating(2);
		obj1.addRating(5);
		obj1.addRating(4);
		obj1.addRating(4);
		obj2.addRating(5);
		obj2.addRating(4);
		obj2.addRating(3);
		obj2.addRating(4);
		obj2.addRating(5);
		obj2.addRating(5);
		obj2.addRating(4);
		obj2.addRating(3);
		obj2.addRating(4);
		obj2.addRating(5);

		obj1.setMovieName("Avengers - Infinity War");
		obj2.setMovieName("Avatar");

		System.out.println("Movie Name: " + obj1.getMovieName() + "\n" + "Rating: " + obj1.getAverage());
		System.out.println("Movie Name: " + obj2.getMovieName() + "\n" + "Rating: " + obj2.getAverage());
	}

}