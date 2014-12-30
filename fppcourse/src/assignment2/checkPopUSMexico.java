package assignment2;

public class checkPopUSMexico {
	public static void main(String[] args){
		long popMex=114000000;
		long popUs=312000000;
		int years=1;
		while(true){
			System.out.println("In Year :"+years);
			System.out.println("Population of Mexico :"+popMex);
			System.out.println("Population of USA :"+popUs);
			popMex=(long)(popMex*1.1001);
			popUs=(long)(popUs*0.9485);
			if(popMex>popUs){
				System.out.println();
				System.out.println("It Took :"+(years-1)+" years for population of Mexico to Exceed population of USA");
				break;
			}
			years++;
		}
	}
}
