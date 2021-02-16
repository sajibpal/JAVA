package basic;

class A{
	
	int x; //instance variable;
	static int y,z; //static variable;
    static void getdata(){z=12;} //(x=5)not use static member variable in static mathode
	
  /* static class type{
	 static string country="bangladesh";
	 } //static class;*/
}
public class staticmathode {

	public static void main(String[] args) {	
    A.y=10;
    A.getdata();
    System.out.println(A.y);
    System.out.println(A.z);
    //System.out.println(A.type.country);
	}
 }
