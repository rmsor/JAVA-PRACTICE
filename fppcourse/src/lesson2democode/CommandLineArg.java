package lesson2democode;

public class CommandLineArg {
	public static void main(String[] args) {
		//int len = 0;
		//if(args != null) len = args.length;
		for(int i = 0; i < args.length; ++i) {  
			System.out.println("position " + i + ": " + args[i]);
} 
	}

}
