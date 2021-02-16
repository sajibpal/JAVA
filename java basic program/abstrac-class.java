package basic;

public class abstracclass {

	public static void main(String[] args) {
		f obj=new f();
		obj.getdata();
       
	}

}
abstract class g{ //super class
	

abstract void getdata(){//abstract class
	
	}
}
class f extends g { //sub class
	
	void  getdata(){
		
	 System.out.println("abstract class define");
	}
}