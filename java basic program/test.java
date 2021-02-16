package basic;

//import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	
		//Scanner obj =new Scanner(System.in);
		int num[][]=new int[3][]; //jagged array declaration;
	int[0]num={2,5,6}; 
	int[1]num={5,6}; 
	int[2]num={7}; 
		
	for(int i=0;i<num.length;i++){
		  for(int j=0;j<num[i].length;j++){
			System.out.print(num[i][j]+" ");
		  }	
		  System.out.println();
		}
	}

}
