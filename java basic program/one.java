package basic;

class example{
	
private int x,y,z;

public void setdata(int a,int b,int c){
 
	x=a;y=b;z=c;
 }
public void showdata(){
	System.out.println("x is="+x);
	System.out.println("y is="+y);
	System.out.println("z is="+z);
 }
}

public class one {

 public static void main(String[] args) {
	 
 example ob=new example(); //referance object
 ob.setdata(5, 10, 8);
 ob.showdata();

	}
}
