package basic;

public class oneclassmultipleinterinterfaceinheritance {

	public static void main(String[] args) {
		java obj=new java();
		obj.getdata();
		obj.showdata();

	}

}
interface job{
	
	 int mark=100;//public static final
	 void getdata();//public void getdata
	}
interface jobe{
	 int roll=154045;
	 int mark1=200;//public static final
	 void showdata();//public void getdata
	}
class java implements job,jobe{
		
		
		int sum=mark+mark1; //class.mark by asine value;
		public void getdata(){ //not define this function error
			
			System.out.println("roll="+roll);
			}
		public void showdata(){//define functuion
			
		System.out.println("sum="+sum);
		}
	}