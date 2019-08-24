import java.io.File;
import java.util.Scanner;

public class StudentDataReader
{
	public static void main(String[] args) throws Exception
	{
		String filename = "students.csv";
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
				
			Students st = new Students(lineCount);
			
			lineCount = 0;
			String currentLine;
			String[] studentData;
			Student e;
			String lname, fname;
			
			while (input.hasNextLine())
			{
				currentLine = input.nextLine();
				studentData = currentLine.split(",");
				lname = studentData[0];
				fname = studentData[1];
				int[] grades = new int[4];
				grades[0] = Integer.parseInt(studentData[2]);
				grades[1] = Integer.parseInt(studentData[3]);
				grades[2] = Integer.parseInt(studentData[4]);
				grades[3] = Integer.parseInt(studentData[5]);
				
				e = new Student(lname, fname, grades);
				
				st.setStudent(lineCount, e);
				lineCount++;
			}
			input.close();
			
			System.out.println(st);
			System.out
				.println();
		}
	}
}

