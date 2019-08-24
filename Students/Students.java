public class Students
{
	private Student[] students;
	
	public Students(int numOfStudents)
	{
		students = new Student[numOfStudents];
	}
	
	public boolean setStudent(int index, Student s)
	{
		if (index < students.length)
		{
			students[index] = s;
			return true;
		}
		else
			return false;
	}
	
	//descending sort
	public void sortByAvg()
	{
		
	}
	
	public void sortByName()
	{
		
	}
	
	//descending sort
	public void sortByAvgWithoutLowestGrade()
	{
		
	}
	
	public String toString()
	{
		String output = "";
		for (Student s : students)
			output += s.toString() + "\n";
		output += "\n";
		return output;
	}
}