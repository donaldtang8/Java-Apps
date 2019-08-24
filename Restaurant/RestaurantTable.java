public class RestaurantTable
{
	private Restaurant[] table;
	
	public RestaurantTable(int numOfRestaurants)
	{
		table = new Restaurant[numOfRestaurants];
	}
	
	public void setRestaurant(int i, Restaurant e)
	{
		table[i] = e;
	}
	
	public Restaurant getRestaurant(String name)
	{
		for(Restaurant e: table)
			if(e.getName().equals(name))
				return e;
			
		return null;
	}
	
	public void sortByName()
	{
		for(int j = 0; j < table.length - 1; j++)
		{
			int minIndex = j;
			for(int k = j+1; k < table.length; k++)
			{
				if((table[k].getName()).compareTo(table[minIndex].getName()) < 0)
				{
					minIndex = k;
				}
			}
			swap(table, j, minIndex);
		}
	}
	
	public void sortByCost()
	{
		for(int j = 0; j < table.length - 1; j++)
		{
			int minIndex = j;
			for(int k = j+1; k < table.length; k++)
			{
				if(table[k].getCost() < table[minIndex].getCost())
				{
					minIndex = k;
				}
			}
			swap(table, j, minIndex);
		}
	}
	
	public void sortByRank()
	{
		for(int j = 0; j < table.length - 1; j++)
		{
			int minIndex = j;
			for(int k = j+1; k < table.length; k++)
			{
				if(table[k].getRank() < table[minIndex].getRank())
				{
					minIndex = k;
				}
			}
			swap(table, j, minIndex);
		}
	}
	
	public static void swap(Restaurant[] table, int j, int k)
	{
		Restaurant temp = table[j];
		table[j] = table[k];
		table[k] = temp;
	}
			
	public String toString()
	{
		String output = "";
		for (Restaurant e : table)
			output += e.toString() + "\n";
			
			return output;
	}

}
