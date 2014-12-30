package classpractice2;

public class CumulativeSum {
	
	public static void main(String args[]){
		double[] myArr={5,3,5,7.5,3,5,2,8,7,2};
		double[] cumArr=new double[10];
		double sum=0.00;
		for(int i=0;i<myArr.length;i++){
			sum=sum+myArr[i];
			cumArr[i]=sum;
		}
//		for(int i=0;i<cumArr.length;i++){
//			System.out.println(cumArr[i]);
//		}
		for(double i:cumArr){
			System.out.println(i);
		}
	}
}
