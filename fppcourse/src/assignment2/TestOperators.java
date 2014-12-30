package assignment2;

public class TestOperators {

	public static void main(String[] args) {
		 int i = 32, j = 65, k, l, m, n, o, p;
		 k = i | 35;        
		 l = ~k;        
		 m = i & j;       
		 n = j ^ 32;       
		 o = j << 2;        
		 p = i >> 5;        
		 System.out.println("k = " + k + " m = " + m + " n = " + n);        
		 System.out.println(" o = " + o + " p = " + p); 
		 
		 long distance = 129L;        
		 byte taken = (byte)distance;        
		 System.out.println(taken);
		 
		 int a = 0 ;        
		 int b = 0 ;        
		 boolean tr = true;        
		 boolean fa;        
		 fa = (tr  &  0 < (a += 1));        
		 fa = (tr  &&  0 < (a += 2));        
		 fa = (tr  |  0 < (b += 1));        
		 fa = (tr  ||  0 < (b += 2));        
		 System.out.println(a + " " + b); 
		 
		 int x = 2;            
		 int y = ++x + x++ + + x;            
		 System.out.println(y); 
		 
		 int d,e,f;            
		 f = 100;            
		 d = e = f = 130;            
		 System.out.println(e); 
		 
		 System.out.println(- -2 - 6 * 12 / 8 - 1); 

	}

}
