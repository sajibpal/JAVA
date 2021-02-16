package basic;

public class stringequalmethode {

	public static void main(String[] args) {
		
		String st="sajib";
		String st1="sajib";
		String st2="pal";
		String st3="SAJIB";
		System.out.println(st.equals(st1));
		System.out.println(st.equals(st2));
		System.out.println(st.equals(st3));
		System.out.println(st.equals("SAJIB"));
		
		System.out.println("case ignore=");
		System.out.println(st.equalsIgnoreCase(st1));
		System.out.println(st.equalsIgnoreCase(st2));
		System.out.println(st.equalsIgnoreCase(st3));
		System.out.println(st.equalsIgnoreCase("SAJIB"));
		
		

	}

}
