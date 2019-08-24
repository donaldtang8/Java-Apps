import java.io.File;
import java.util.Scanner;

public class PeriodicTableDataReader
{
	public static void main(String[] args) throws Exception
	{
		String filename = "Elements.csv";
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
				
			PeriodicTable pt = new PeriodicTable(lineCount);
			
			lineCount = 0;
			String currentLine;
			String[] elementData;
			Element e;
			String name, symbol, family;
			int atomicNum, mostStableState;
			double weight;
			boolean metal;
			
			while (input.hasNextLine())
			{
				currentLine = input.nextLine();
				elementData = currentLine.split(",");
				name = elementData[0];
				atomicNum = Integer.parseInt(elementData[1]);
				symbol = elementData[2];
				weight = Double.parseDouble(elementData[3]);
				if(elementData[4].equals(""))
						mostStableState = -999;
				else
					mostStableState = Integer.parseInt(elementData[4]);
				family = elementData[5];
				if(elementData[6].equals("M"))
					metal = true;
				else
					metal = false;
					
				e = new Element(name, atomicNum, symbol, weight, mostStableState, family, metal);
				
				pt.setElement(lineCount, e);
				lineCount++;
			}
			input.close();
			
			System.out.println(pt);
			System.out.println();
		}
	}
}

