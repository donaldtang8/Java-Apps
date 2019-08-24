public class PasswordGenerator
{
	
	public static void main(String[] args)
	{
			String password = passwordGenerator();
			System.out.println(password);
	}
	
	public static String passwordGenerator()
	{
		boolean noAlpha = true;
		boolean isValid = false;
		String password = "";
		while (!isValid)
		{
			password = getAlpha();
			int index = 1;
			int length = generatePassLength();
			while (index <= length)
			{
				 int chance = (int)(Math.random() * (2));
				 
				 if(chance == 0)
				 {
				 	password += getAlpha();
				 	index++;
				 }
				 if(chance == 1)
				 {
				 	password += getNum();
				 	index++;
				 }
				 if(noAlpha)
				 {
			 		int chance2 = (int)(Math.random() * (2));
			 		if (chance2 == 1)
			 		{
			 			password += getNonAlpha();
			 			index++;
			 			noAlpha = false;
			 		}
				 }
			}
			
			if(meetReq(password))
				isValid = true;	
		}
		return password;
		
	}
		
	public static boolean hasNumeric(String pass) //check for numeric values
	{
		String nums = "0123456789";
		boolean hasNum = false;
		for(int i = 1; i <= nums.length(); i++)
		{
			if(pass.indexOf(nums.substring(i-1, i)) != -1)
				hasNum = true;
		}
		return hasNum;
	}
	
	public static boolean hasUpperCase(String pass) //check for uppercase letters
	{
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean hasUpper = false;
		for(int i = 1; i <= upper.length(); i++)
		{
			if(pass.indexOf(upper.substring(i-1, i)) != -1)
				hasUpper = true;
		}
		return hasUpper;
	}
	
	public static boolean hasLowerCase(String pass) //check for lowercase letters
	{
		String lower = "abcdefghijklmnopqrstuvwxyz";
		boolean hasLow = false;
		for(int i = 1; i <= lower.length(); i++)
		{
			if(pass.indexOf(lower.substring(i-1, i)) != -1)
				hasLow = true;
		}
		return hasLow;
	}
	
	public static boolean hasNonAlpha(String pass) //check for non alphabetic characters
	{
		String non = "-_";
		boolean hasNon = false;
		for(int i = 1; i <= non.length(); i++)
		{
			if(pass.indexOf(non.substring(i-1, i)) != -1)
				hasNon = true;
		}
		return hasNon;
	}
	
	public static boolean meetReq(String pass)
	{
		return hasNumeric(pass) && hasUpperCase(pass) && hasLowerCase(pass) && hasNonAlpha(pass); //check constraints
	}
	
	public static String getNum()
	{
		String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"}; //get random number
		int numIndex = (int)(Math.random() * (10));
		return nums[numIndex];
		
	}
	
	public static String getNonAlpha()
	{
		String[] nonAlpha = {"_", "-"}; //get random non alphabetic character
		int nonIndex = (int)(Math.random() * (2));
		return nonAlpha[nonIndex];
	}
	
	public static String getAlpha()
	{
		String[] alphas = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; //get random alphabet letter
		int alphabetIndex = (int)(Math.random() * (26));
		String alpha = alphas[alphabetIndex];
		int low = (int)(Math.random() * (2));
		if(low == 0)
			alpha = alpha.toLowerCase();
		return alpha;
	}
	
	public static int generatePassLength() //get random password length
	{
		return (int)(Math.random() * (4) + 8);
	}
}