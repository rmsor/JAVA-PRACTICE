package assignment9;

public class LocalClass {
	int arr[]={10,4,5,8,6,7,9,1,2,3,6,9,1};
	
	public void oddEvenOriented(){
		
		class checkOEOriented{
			
			public String check(){
				String isOr;
				int evenSum=0,oddSum=0;
				for(int i=0;i<arr.length;i++){
					if(arr[i]%2==0){
						evenSum+=arr[i];
					}else{
						oddSum+=arr[i];
					}
				}
				isOr=(evenSum>oddSum)?"Even Oriented":"Odd Oriented";
				return isOr;
			}
		}

		checkOEOriented oe=new checkOEOriented();
		System.out.println("Array is : "+oe.check());
		
	}
	public static void main(String[] args) {
		LocalClass lc=new LocalClass();
		lc.oddEvenOriented();

	}

}
