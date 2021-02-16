package basic;

class books{ //super class
	
	int a,b;
	void getdata(int x,int y){
		
		a=x;b=y;
	}
}
class ebook extends books { //intermidate sub class
	
	int c=15;
	
	int add(){
	
	 int sum=a+b+c;
	 return sum;
	}
}
class grantbook extends ebook{ //sun class
	
	void display(){
		
	 System.out.println("a="+a);
	 System.out.println("b="+b);
	 System.out.println("c="+c);
	 System.out.println("sum="+add());
	}
}
public class multilabelinheritance {

	public static void main(String[] args) {
 
     grantbook obj=new grantbook();
     obj.getdata(10, 30);
     obj.display();
	}

}
