package basic;

class father{ //super class
	
	int a,b;
	void getdata(int x,int y){
		
		a=x;b=y;
	}
}
class son extends father { //sub class
	
	int add(){
		
	 int sum=a+b;
	 return sum;
	}
	void display(){
		
	 System.out.println("a="+a);
	 System.out.println("b="+b);
	 System.out.println("sum="+add());
	}
}
public class singleinheritance {

	public static void main(String[] args) {
	
       son obj=new son();
       obj.getdata(10, 30);
       obj.display();
	}

}
