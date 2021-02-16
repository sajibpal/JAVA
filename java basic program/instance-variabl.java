package basic;

class Test{

protected int mark; ///instance variable no use private/public;
int roll=154045;
}

public class instancevariabl {

 public static void main(String[] args) {
	Test ob=new Test();
	ob.mark=30;
	System.out.println("mark="+ob.mark);
	System.out.println("roll="+ob.roll);

	}

}
