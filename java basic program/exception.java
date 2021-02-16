package basic;

public class exception {

	public static void main(String[] args) {
		
     try{
    	 int a=100/5;
    	 System .out.println("A="+a);
    	
    	 int array[]=new int[5];
    	 array[10]=8;///index size is hi;
    	 System.out.println("array[2]="+array[2]);
    	 
    	 String nam = "sajib pal";
    	 System.out.println(nam.length());
    	 
     }
	catch(Exception e){
		
		System.out.println("not possible");
	}
	}

}
