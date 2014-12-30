package classpractice2;

public class Prog2 {

	public static void main(String[] args) {
		double[] numbers={1.27, 3.881, 9.6, 5.231};
		
		//float[] num={1.27f, 3.81f, 9.6f, 5.21f};
		
		int sumInt=0,sumRoundInt=0;
		for(int i=0;i<numbers.length;i++){
			sumInt+=(int)numbers[i];
			sumRoundInt+=Math.round(numbers[i]);			
		}
		System.out.println("Sum of Floats Using Type Cast:"+sumInt);
		System.out.println("Sum of Floats Using Round:"+sumRoundInt);
	}

}
