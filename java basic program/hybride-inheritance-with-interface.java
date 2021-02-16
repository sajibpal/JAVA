package basic;

public class hybrideinheritancewithinterface {

	public static void main(String[] args) {
         M obj=new M();
         obj.display();
	}

}
class W{
	
int mark=20;
int roll=154045;
}
class K extends W{
	
 int particalmark=50;
 int totalmark=particalmark+mark;
}
interface G{
	
 int report=60;
 void display();
}
class M extends K implements G{
	
	int sum=totalmark+report;
	public void display(){
		
		System.out.println("sum="+sum);
		System.out.println("roll="+roll);
		System.out.println("totalmark="+totalmark);
	}
}