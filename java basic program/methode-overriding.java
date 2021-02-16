package basic;

public class mathodeoverriding {

	public static void main(String[] args) {
		
      home obj=new home();//function name same so every class need new obj for cassing
      obj.getdata(15);
      house obj1=new house();
      obj1.getdata(20);
      obj1.display();
	}

}
class home{ //super class
	
	int a=12,b;
	void getdata(int x){//methode overriding
		
		a=x;
	 System.out.println("a="+a);
	}
}
class house extends home { //sub class
	int sum;
	void  getdata(int x){//methode overriding
		b=x;
	  sum=a+b;
	 
	}
	void display(){
		
	
	 System.out.println("b="+b);
	 System.out.println("sum="+sum);
	 System.out.println("a="+a);
	}
}