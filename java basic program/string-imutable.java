package basic;

public class stringimutable {

	public static void main(String[] args) {
		
		String str=new String("sajib");
		  //str="pal"; this us use show pal;
		 String str1=str.concat(" pal");
		 System.out.println("str1="+str1);
		 
		 StringBuffer str2=new StringBuffer("sajib");
		 str2.append(" pal");//no variable assine
		 System.out.println("str1="+str2);


	}

}
