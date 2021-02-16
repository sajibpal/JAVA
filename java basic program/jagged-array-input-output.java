package basic;

import java.util.Scanner;

public class jaggedarrayinputoutput {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		int num[][]=new int[3][]; //jagged array declaration;
		num[0]=new int[4]; //column number define int[4];
		num[1]=new int[2]; //column number define int[2];
		num[2]=new int[1];  //column number define int[2];
		
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
