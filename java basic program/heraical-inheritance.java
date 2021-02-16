package basic;

public class heraicalinheritance {

	public static void main(String[] args) {
		S obj=new S();
		 obj.getdata(10,15);
		 obj.display();
		D obj1=new D();
		 obj1.getdata(20,25);
		 obj1.display();
	}

}
class F{ //super class
	
	int a,b;
	void getdata(int x,int y){
		
		a=x;b=y;
	}
}
class S extends F { //sub class
	
	int c=15;
	
	int add(){
	
	 int sum=a+b+c;
	 return sum;
	}
	void display(){
		
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 System.out.println("c="+c);
		 System.out.println("sum="+add());
		}
}
class D extends F{ //sub class
	int d=23;
	int mul(){
		
	 int result=b*d;
	  return result;
	}
	void display(){
		
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 System.out.println("d="+d);
		 System.out.println("mul="+mul());
		}
}
