package basic;

import java.util.Scanner;

public class arrayinputoutput {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		int num[]=new int[5]; //array declaration;
		System.out.println("enter the array value=");
		
		for(int i=0;i<5;i++){
			num[i]=obj.nextInt();
		 }
		int mux[]=new int[6];//new array declaration;
		mux=num; //array copy;
		
		System.out.println(" Array value=");
		for(int i=0;i<5;i++){
	     System.out.println(mux[i]);
		}

	}

}
