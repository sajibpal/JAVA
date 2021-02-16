package basic;

public class oneclassoneinterface {

	public static void main(String[] args) {
		joy obj=new joy();
		obj.getdata();

	}

}
interface jo{
	
 int mark=100;//public static final
 void getdata();//public void getdata
}
class joy implements jo{
	
	int number=80;
	int sum=number+mark; //or int sum=number +jo.mark(mark static variable)
	public void getdata(){ //not define this function error
		
		System.out.println("number="+number);
		System.out.println("sum="+sum);
		System.out.println("mark="+mark);
	}
}