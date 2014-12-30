package classpractice2;

public class CopyArray {
	public static void main(String args[]){
		int[] myArr={34,3,5,27,23,25,23,25,20,2};
		int[] oddArr=new int[10];
		int[] evenArr=new int[10];
		int x=0,y=0;
		for(int i=0;i<myArr.length;i++)
		{
			if(myArr[i]%2==0){
				evenArr[x]=myArr[i];
				x++;
			}else{
				oddArr[y]=myArr[i];
				y++;
			}
		}
		
		for(int i=0;i<oddArr.length;i++)
		{
			System.out.println(oddArr[i]);
		}
		
		for(int i=0;i<evenArr.length;i++)
		{
			System.out.println(evenArr[i]);
		}
	}
		
}
