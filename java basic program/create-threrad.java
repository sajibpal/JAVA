package basic;

class Mythread extends Thread{
	
		
      public	void run(){
    	  
    	  for(int i=0;i<3;i++){
   	
			System.out.println("child thread");
				}
		
		}
}

public class createthrerad {

	public static void main(String[] args) {
	
		  Mythread obj= new Mythread();
	      obj.start();
	      for(int i=0;i<3;i++){
	    	  
	       System.out.println("main thread"); 	  
	      }
	      
	}

}
