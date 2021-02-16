package basic;

class book{
	
	int x,y;
	double z,h;
	book(){ }
	book(int a){
		x=a;
	 System.out.println("x="+x);	
	}
	book(double a,double b){
		z=a; h=b;
	 System.out.println("z="+z);
	 System.out.println("h="+h);
	} 
	book(int a,float b){
		y=a; h=b;
		 System.out.println("y="+ y);
		 System.out.println("h="+h);
	}
}
public class overlodingconstructor {

	public static void main(String[] args) {
		
		book ob=new book();
		book ob1=new book(10);
		book ob2=new book(3.5, 4.5);
		book ob3=new book(9,8.2);

  }

}
