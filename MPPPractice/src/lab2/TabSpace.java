package lab2;

public class TabSpace {

	public static String space(int n)
	{
		String space = "";
		
		for (int i = 0; i < n; i++)
		{
			space += "	";
		}
		return space;
	}
}
