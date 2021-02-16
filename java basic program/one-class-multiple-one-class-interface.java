package basic;

public class oneclassmultipleoneclassoneinterface {

	public static void main(String[] args) {
	
       R obj=new R();
       obj.showdata();
	}

}
class j{
	
	 int a=10;
	 int add(int y){
	  int b=y;
	  return(a+b);
	 }
	}
interface H{
	
	 int c=100;//public static final
	 void showdata();//public void getdata
	}
class R extends j implements H{
		
		
		int m=a+c; //class.mark by asine value;
		int sum=add(20);
		public void showdata(){ //not define this function error
			
			System.out.println("m="+m);
			System.out.println("sum="+sum);
			}
		
	}