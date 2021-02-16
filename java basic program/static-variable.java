package basic;

class copy{

 static int roll=154045,mark; //static variable
}
public class staticvariable {

	public static void main(String[] args) {
		copy.mark=320; //obj.mark=320
		System.out.println("mark="+copy.mark);//("mark"+obj.mark)
		System.out.println("roll="+copy.roll);

	}

}
