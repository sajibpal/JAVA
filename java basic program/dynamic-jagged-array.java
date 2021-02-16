package basic;

import java.util.Scanner;

public class dynamicjaggedarray {

	public static void main(String[] args) {
	
			Scanner obj =new Scanner(System.in);
			
			System.out.println("enter the Array row=");
			int m=obj.nextInt(); 
			int num[][]=new int[m][]; //jagged array declaration;
			
			System.out.println("enter the Array column=");
			for(int i=0;i<m;i++){
			  
			 System.out.println("Array element "+ (i+1));	
			  int n=obj.nextInt();	
			  num[i]=new int[n];	
			}
			System.out.println("enter the array value=");
			
			for(int i=0;i<num.length;i++){//row length
			  for(int j=0;j<num[i].length;j++) //column length
			  {
				  num[i][j]=obj.nextInt();
			  }	
			}
	System.out.println(" the array value=");
			
			for(int i=0;i<num.length;i++){
			  for(int j=0;j<num[i].length;j++){
				System.out.print(num[i][j]+" ");
			  }	
			  System.out.println();
			}
			

	}

}
