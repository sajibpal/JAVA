package basic;

class L implements Runnable {

 public void run(){
	for(int i=0;i<4;i++){
		
	 System.out.println("runable A"+i);	
	}
 }
}
class B implements Runnable {

	 public void run(){
		for(int i=0;i<4;i++){
			
		 System.out.println("runable B"+i);	
		}
	  }
	}

public class runableinterfacethread {

	public static void main(String[] args) {
		
   Thread t= new Thread(new L());
   Thread t1= new Thread(new B());
   t.start();
   t1.start();
	}

}
