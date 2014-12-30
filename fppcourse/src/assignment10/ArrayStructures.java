package assignment10;

public class ArrayStructures {

			private int[] theArray = new int[50]; // Creates an array with the capacity of 50 	   
		    private int arraySize = 10; // Elements in theArray
		 	  
		    // Fills the Array with random values
		     
		    public void generateRandomArray(){	         
		        for(int i = 0; i < arraySize; i++){
			            theArray[i] = i*2;
		        }
		    }
		    public int[] getTheArray(){
		    	return theArray;
		    }
		     
		    public int getArraySize(){
		        return arraySize;
		    }
		     
		    // Prints the Array on the screen in a grid
	     
		    public void printArray(){
	         
	        System.out.println("----------");
	         
	        for(int i = 0; i < arraySize; i++){
		             
	            System.out.print("| " + i + " | ");
	             
		            System.out.println(theArray[i] + " |");
	             
	            System.out.println("----------");
	             
		        }
	        
		    }
		     
	    // Gets value at provided index
	     
		    public int getValueAtIndex(int index){
		         
		        if(index < arraySize) return theArray[index];
	         
		        return 0;
	         
	    }
		      // Returns true or false if a value is in the Array
		     
	   public boolean doesArrayContainThisValue(int searchValue){
	         
		        boolean valueInArray = false;
	         
		        for(int i = 0; i < arraySize; i++){
	             
	            if(theArray[i] == searchValue){
	                
		                valueInArray = true;
		                 
		            }
		             
		        }
		         
		        return valueInArray;
	         
	    }
	     	     
		    // Delete Array row for the index and move elements up
		     
	    public void deleteIndex(int index){
		         
		        if(index < arraySize){
		             
		            // Overwrite the value for the supplied index
		            // and then keep overwriting every index that follows
		            // until you get to the last index in the array
		             
	            for(int i = index; i < (arraySize - 1); i++){
	                 
	                theArray[i] = theArray[i+1];
		         
	            }
	             arraySize--;
		             
	        }
		         
	    }
		     
		    public void insertValue(int value){
		         
		        if(arraySize < 50){
		             
	            theArray[arraySize] = value;
	            
	            arraySize++;
	             
		        }
		         
		    }
		    
		    public void insertAtIndex(int index,int value){
		    	
		    	if(arraySize<50){
			    	arraySize++;
			    	for(int i = (arraySize - 1); i >= index ; i--){		                 
		                theArray[i+1] = theArray[i];			         
		            }
			    	theArray[index]=value;
		    	}
		    }
		    public int getMaxValue(){
		    		int max=theArray[0];
		    		for(int i = 0; i <arraySize; i++){		                 
		              	if(max<theArray[i]){
		              		max=theArray[i];
		              	}
		            }
			    	return max;
		    }
		    public int getMinValue(){
	    		int min=theArray[0];
	    		for(int i = 0; i <arraySize; i++){		                 
	              	if(min>theArray[i]){
	              		min=theArray[i];
	              	}
		            }
			    	return min;
		    }
		    public void sortArray(){
	    		int temp=0;
	    		for(int i = 0; i <arraySize; i++){		                 
		            for(int j=i+1;j<arraySize;j++){
		            	if(theArray[j]<theArray[i]){
		              		temp=theArray[i];
		              		theArray[i]=theArray[j];
		              		theArray[j]=temp;
		              	}
		            }
		        }
		    }
		    public int binarySearch(int intToSearch) {
		    	sortArray();
		    	int[] sortedArray=theArray;
		        int lower = 0;
		        int upper = sortedArray.length - 1;
		        while (lower <= upper) {
		            int mid = lower + (upper - lower) / 2;
		            if(intToSearch < sortedArray[mid]) 
		                upper = mid - 1;
		            else if (intToSearch > sortedArray[mid]) 
		                lower = mid + 1;
		            else 
		                return mid;
		        }
		        return -1; // Returns -1 if no match is found
		    }
		     
	    // Linear Search : Every index must be looked at
		     
		    public String linearSearchForValue(int value){
		         
		        boolean valueInArray = false;
	         
		        String indexsWithValue = "";
	             
		        System.out.print("The Value was Found in the Following Indexes: ");
		         
		        for(int i = 0; i < arraySize; i++){
	             
		            if(theArray[i] == value) {
	                valueInArray = true;
		                 
	                System.out.print(i + " ");
		                 
	               indexsWithValue+= i + " ";
		            }
		             
		        }
	         
		        if(!valueInArray){
		            indexsWithValue = "None";
	             
		            System.out.print(indexsWithValue);
		        }
		             
		        System.out.println();
	        
	       return indexsWithValue;
	             
		    }
	     
	    // This bubble sort will sort everything from
		    // smallest to largest
		     
		    	     
		    public static void main(String[] args){
		         
				ArrayStructures newArray = new ArrayStructures();
				 
				newArray.generateRandomArray();
				 
				newArray.printArray();
				
				System.out.println(newArray.getValueAtIndex(3));
				     
				System.out.println(newArray.doesArrayContainThisValue(18));
				     
				newArray.deleteIndex(4);
				 
				newArray.printArray();
				     
				newArray.insertValue(55);
//				 
				newArray.insertAtIndex(3, 50);
				
				newArray.printArray();
				     
				newArray.linearSearchForValue(10);
				
				newArray.printArray();
				
				System.out.println("Maximum Value: "+newArray.getMaxValue());
				
				System.out.println("Minimum Value: "+newArray.getMinValue());
		    }
		 
}
