package basic;

public class superclassconstructorhide {

	public static void main(String[] args) {
		good obj=new good();

	}

}
class Took{
	
Took(int x){
	
	int a=x;
	System.out.println("a="+a);
 }	
}
class good extends Took{
	
  good(){
	  super(40);
	  int b=30;
	  System.out.println("B="+b);
	}
}
