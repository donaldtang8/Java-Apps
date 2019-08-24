public class Element
{
	private String name;
	private int atomicNumber;
	private String symbol;
	private double atomicWeight;
	private int mostStableOxidationState;
	private String family;
	private boolean metal;
	
	public Element(String name, int num, String symbol, double weight, int mostStableOxidationState, String family, boolean metal)
	{
		this.name = name;
		atomicNumber = num;
		this.symbol = symbol;
		atomicWeight = weight;
		this.mostStableOxidationState = mostStableOxidationState;
		this.family = family;
		this.metal = metal;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAtomicNumber()
	{
		return atomicNumber;
	}
	
	public String getSymbol()
	{
		return symbol;
	}
	
	public double getWeight()
	{
		return atomicWeight;
	}
	
	public int getOxidationNumber()
	{
		return mostStableOxidationState;
	}
	
	public String getFamily()
	{
		return family;
	}
	
	public boolean getMetal()
	{
		return metal;
	}
	
	public String toString()
	{
		String output = "";
		
		if (atomicNumber < 10)
			output += getSpaces(2) + atomicNumber;
		else if (atomicNumber < 100)
			output += getSpaces(1) + atomicNumber;
		else
			output += atomicNumber;
			
		output = getSpaces(2);
		
		output += name;
		output += getSpaces(15 - name.length());
		
		output += symbol + getSpaces(5 - symbol.length());
		
		String weight = "";
		if (atomicWeight < 10.0)
			weight = getSpaces(2) + atomicWeight;
		else if (atomicWeight < 100.0)
			weight = getSpaces(1) + atomicWeight;
		else
			weight = "" + atomicWeight;
			
		
		output+= weight + getSpaces(10-weight.length());
		String oxidationState = "" + mostStableOxidationState;
		output += oxidationState + getSpaces(5 - oxidationState.length());
		output += family + getSpaces(20-family.length());
		String trueMetal = "";
		if(metal)
		{
			trueMetal = "Metal";
		}
		else
		if(!metal)
		{
			trueMetal = "Non-Metal";
		}
		output+= trueMetal + getSpaces(10-trueMetal.length());
		
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