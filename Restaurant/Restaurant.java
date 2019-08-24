public class Restaurant
{
	 private String name;
	 private String restaurantType;
	 private String location;
	 private String lAppetizer;
	 private String lEntree;
	 private String dAppetizer;
	 private String dEntree;
	 private String dessert;
	 private String beverage;
	 private int cost;
	 private int rank;
	 private Restaurant[] table;
	
	public Restaurant(String name, String rType, String location, String lApp, String lEnt, String dApp, String dEnt, String dessert, String beverage, int cost, int rank)
	{
		this.name = name;
		restaurantType = rType;
		this.location = location;
		lAppetizer = lApp;
		lEntree = lEnt;
		dAppetizer = dApp;
		dEntree = dEnt;
		this.dessert = dessert;
		this.beverage = beverage;
		this.cost = cost;
		this.rank = rank;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getRestaurantType()
	{
		return restaurantType;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public String getLAppetizer()
	{
		return lAppetizer;
	}
	
	public String getLEntree()
	{
		return lEntree;
	}
	
	public String getDAppetizer()
	{
		return dAppetizer;
	}
	
	public String getDEntree()
	{
		return dEntree;
	}
	
	public String getDessert()
	{
		return dessert;
	}
	
	public String getBeverage()
	{
		return beverage;
	}
	
	public int getCost()
	{
		return cost;
	}
	
	public int getRank()
	{
		return rank;
	}
	
	public double getAvgCost() //get average cost of a meal of all of the restaurants
	{
		int sum = 0;
		
		for (int i = 0; i < table.length; i++)
		{
			sum += table[i].getCost();
		}
		
		return (double)(sum / table.length);
	}
	
	public String getBestRankedRestaurant()
	{
		String rankRest = "";
		
		for(int i = 0; i < table.length; i++)
		{
			if(table[i].getRank()==1)
			{
				rankRest = table[i].getName();
			}
		}
		return rankRest;
	}
	
	public String[] getRestaurantByLocation(String location) //return list of restaurant names that matches location
	{
		String[] locRestaurant = new String[table.length];
		
		for(int i = 0; i < table.length; i++)
		{
			if(table[i].getLocation().equals(location))
			{
				locRestaurant[i] = table[i].getName();
			}
		}
		return locRestaurant;
	}
	
	public String[] getRestaurantByType(String type) //finds and returns a list of restaurant names based on restaurant type
	{
		String[] typeRestaurant = new String[table.length];
		
		for(int i = 0; i < table.length; i++)
		{
			if(table[i].getRestaurantType().equals(type))
			{
				typeRestaurant[i] = table[i].getName();
			}
		}
		return typeRestaurant;
	}
	
	public String[] getRestaurant(String type, int price) //finds and returns a list of restaurant names based on specified restaurant type and cost
	{	
		String[] match = new String[table.length];
		
		for(int i = 0; i < table.length; i++)
		{
			if((table[i].getRestaurantType().equals(type)) && (table[i].getCost()== price))
			{
				match[i] = (table[i].getName());
			}
		}
		return match;
	}
	
	public String toString()
	{
		String output = "";
		
		output += name;
		output += getSpaces(23 - name.length());
		output += restaurantType;
		output += getSpaces(11 - restaurantType.length());
		output += lEntree;
		output += getSpaces(17 - lEntree.length());
		output += dEntree;
		output += getSpaces(12 - dEntree.length());
		output += "$" + cost;
		output += getSpaces(5 - (String.valueOf(cost).length()));
		output += rank;
		//output += getSpaces(5 - rank.length());
		//output += dessert;
		//output += getSpaces(15 - dessert.length());
		//output += beverage;
		
		return output;
	}
	
	public String getSpaces(int spaces)
	{
		String x = "";
		for (int i = 0; i < spaces; i++)
			x += " ";
			
		return x;
	}
} 