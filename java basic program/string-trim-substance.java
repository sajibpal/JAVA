package basic;

public class stringtrimsubstance {

	public static void main(String[] args) {
		
		String str="  sajib pal   ";
		System.out.println(str.trim());//space remove;
		
		System.out.println("subsrtring show=");
		String name="sajibpal";
		System.out.println(name.substring(2));
		System.out.println(name.substring(2,6));
		
		System.out.println("replace=");
		System.out.println(name.replace('b','B'));
     
	}

}
