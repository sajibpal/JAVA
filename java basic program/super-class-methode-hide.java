package basic;

public class superclassmethodehide {

	public static void main(String[] args) {
		go obj=new go();
		obj.display();

	}

}
class Too{
	
void getdata(){
	
	int a=25;
	System.out.println("a="+a);
 }	
}
class go extends Too{
	
void getdata(){
	 
	  int b=30;
	  System.out.println("B="+b);
	}
void display(){
	super.getdata();
	getdata();
} 
}
