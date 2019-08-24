import java.io.File;
import java.util.Scanner;

public class RestaurantDataReader
{
	public static void main(String[] args) throws Exception
	{
		String filename = "Restaurants.csv";
		File inputFile = new File(filename);
		if(!inputFile.exists())
		{
			System.out.println(filename + " cannot be found.");
		}
		else
		{
			Scanner input = new Scanner(inputFile);
			int lineCount = 0;
			
			while(input.hasNextLine())
			{
				input.nextLine();
				lineCount++;
			}
			
			input.close();
			input = new Scanner(inputFile);
				
			RestaurantTable rt = new RestaurantTable(lineCount);
			
			lineCount = 0;
			String currentLine;
			String[] restaurantData;
			Restaurant e;
			String name, rType, location, lApp, lEnt, dApp, dEnt, dessert, beverage;
			int cost, rank;
			
			while (input.hasNextLine())
			{
				currentLine = input.nextLine();
				restaurantData = currentLine.split(",");
				name = restaurantData[0];
				rType = restaurantData[1];
				location = restaurantData[2];
				lApp = restaurantData[3];
				lEnt = restaurantData[4];
				dApp = restaurantData[5];
				dEnt = restaurantData[6];
				dessert = restaurantData[7];
				beverage = restaurantData[8];
				cost = Integer.parseInt(restaurantData[9]);
				rank = Integer.parseInt(restaurantData[10]);
					
				e = new Restaurant(name, rType, location, lApp, lEnt, dApp, dEnt, dessert, beverage, cost, rank);
				
				rt.setRestaurant(lineCount, e);
				lineCount++;
			}
			input.close();
			
			System.out.println(rt);
			System.out.println();
			System.out.println("**Sort By Name**");
			rt.sortByName();
			System.out.println(rt);
			System.out.println();
			System.out.println("**Sort By Cost**");
			rt.sortByCost();
			System.out.println(rt);
			System.out.println();
			System.out.println("**Sort By Rank**");
			rt.sortByRank();
			System.out.println(rt);
			System.out.println();
		}
	}
}