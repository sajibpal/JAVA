package basic;

class ki extends Thread{

	 public void run(){
		for(int i=0;i<4;i++){
			
		 System.out.println("runable A"+i);	
		}
	 }
	}
 class Ci extends Thread {

		 public void run(){
			for(int i=0;i<4;i++){
				
			 System.out.println("runable B"+i);	
			}
		  }
		}

public class threadclasse {

	public static void main(String[] args) {
		
		 ki t=new ki();
	      Ci t1=new Ci();
	      t.start();
	      t1.start();
	}

}
