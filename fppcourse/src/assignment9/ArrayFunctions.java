package assignment9;

public class ArrayFunctions {
	int arr[]={10,4,5,8,6,7,9,1,2,3,6,9,1};
	
	public class InnerArrary{
		public int getMax(){
			int max=arr[0];
			for(int i=0;i<arr.length;i++){
				if(arr[i]>max){
					max=arr[i];
				}
			}
			return max;
		}
		public int getMin(){
			int min=arr[0];
			for(int i=0;i<arr.length;i++){
				if(arr[i]<min){
					min=arr[i];
				}
			}
			return min;
		}
		public int getAvg(){
			int sum=0;
			for(int i=0;i<arr.length;i++){
				sum+=arr[i];
			}
			return (sum/arr.length);
		}
	}
	public static void main(String[] args) {
		ArrayFunctions.InnerArrary on=new ArrayFunctions().new InnerArrary();
		System.out.println("Max of Array Values: "+on.getMax());
		System.out.println("Min of Array Values: "+on.getMin());
		System.out.println("Avg of Array Values: "+on.getAvg());
	}

}
