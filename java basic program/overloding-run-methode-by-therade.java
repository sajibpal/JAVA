package basic;

class Mythread extends Thread{
	
 public	void run(){
		
	System.out.println("no arrgument");
		}
public void run(int i){
			
		System.out.println("no arrgument="+i);
	}
}

public class overlodingrunmethodebytherade {

	public static void main(String[] args) {
	
     Mythread obj= new Mythread();
      obj.start();//
      obj.run(10);//thread ovreloding remove;
	}

}
