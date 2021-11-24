package day7code;

import java.util.Scanner;

public class SwapCombineSum {

	public static void main(String[] args) {
		int x= 67;
		int y= 89;
		int temp ;  
	    int sum;     
	         
	       temp = x;  
	       x = y;  
	       y = temp;
	       sum= x+y;
	       System.out.println("Swap: "+x +"   " + y); 
	       System.out.println("Combine:"+y+x); 
	       System.out.println(sum);
	}
	
}
	   	

	
	

