package assignment5;

public class RecursionTest {
	
	private static String vowels = "aeiou";
	private static String strBinary; 
	
    public static void main(String[] args){
        String s = "RohanAskedAQuestion";
        System.out.println("Count Vowels in RohanAskedAQuestion: "+countVowels(s));
        int[] arr1 = {2,45,234,567,876,900,976,999};
        System.out.println("Sum of array elements "+getSum(arr1,0));
        System.out.println("Binary of 10 is"+toBinary(10));
        System.out.println("ram is palindrome "+isPal("ram"));
        System.out.println("rasar is palindrome "+isPal("rasar"));
        int index = recursiveBinarySearch(arr1,0,arr1.length,45);
        System.out.println("Found 45 at "+index+" index");
        
    }

    private static int countVowels(String s) {
        if(s==null||s.length()==0)
        {
            return 0;
        }
        if(vowels.contains((CharSequence) s.substring(0, 1).toLowerCase())){
            return 1+countVowels(s.substring(1));
        }
        return 0+countVowels(s.substring(1));
    }
    
    private static int getSum(int[] array, int index) {
         if (index == array.length)
            return 0;
     
        else
            return array[index] + getSum(array, index + 1);
    }
      
    private static String toBinary(int num) {
    	if(num < 2) {
			strBinary = "" + num; 
			return strBinary; 
		} else {
			if(num != 0) {
				toBinary(num/2); 
				strBinary += ""+num%2; 
			} 
		} 
    	return strBinary; 
	} 
    
    public static boolean isPal(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPal(s.substring(1, s.length()-1));
        return false;
    }
    
    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
        
        if (start < end) {
            int mid = start + (end - start) / 2; 
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid, key);
                 
            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid+1, end , key);
                 
            } else {
                return mid;  
            }
        }
        return -(start + 1); 
    }
}
