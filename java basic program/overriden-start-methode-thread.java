package basic;

class Ai extends Thread{

 public void start(){
  super.start();
  System.out.println("start");
	} 
public void run(){
	
	System.out.println("run");
}

}

public class overridenstartmethodethread {

	public static void main(String[] args) {
	
     Ai ob=new Ai();
     ob.start();
	}

}
