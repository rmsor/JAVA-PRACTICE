package lesson2democode;

public class ArrayExample {
	public static void main(String args[]) {
		int [] arr = {4, 5, 12, 25};
		for(int x: arr) {
			System.out.println(x);
		}
		String t = "Hello,strings can be fun.They have many uses.";
				String[] result = t.split(",|\\.| ") ;
				for(String x1: result) {
					System.out.println(x1);
				}
				String[] favoriteTeams = new String[2];
				//favoriteTeams = {"Sonics", "Mets"};  
				//favoriteTeams = new String[]{"Sonics", "Mets", "Bulls"}; 

    
	} 
}
