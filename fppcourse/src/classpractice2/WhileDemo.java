package classpractice2;
import java.util.Scanner;

public class WhileDemo {

		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			int pin = 12345;

			System.out.println("WELCOME TO THE MIDWEST ONE BANK.");
			System.out.print("ENTER YOUR PIN: ");
			int entry = keyboard.nextInt();
			int count=1;
			while ( entry != pin )
			{
				if(count==3){
					System.out.println("“Your card has been blocked! Come to bank to activate your card”");
					break;
				}
				System.out.println("\nINCORRECT PIN. TRY AGAIN.");
				System.out.print("ENTER YOUR PIN: ");
				entry = keyboard.nextInt();
				count++;
			}
			keyboard.close();

			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}

}