package basic;

import java.util.Scanner;

public class Enhancedforloop1Darray {

	public static void main(String[] args) {
	  Scanner obj=new Scanner(System.in);
	  System.out.println("enter the  array size");
	   int m=obj.nextInt();
	   int num[]=new int[m];
	   System.out.println("enter the  array element");
	   for(int i=0;i<m;i++){
		   num[i]=obj.nextInt();
	   }
      for(int i:num){ //enhanced for loop for 1D array;
    	  
       System.out.println(i);	  
      }
	}

}
