package basic;

public class stringinputoutputlength {

	public static void main(String[] args) {
		
		String name[]=new String[3];
		name[0]="sajib";
		name[1]="pal";
		name[2]="father";
		
		for(int i=0;i<3;i++){
			
			System.out.println("name["+i+"]="+name[i]);
			System.out.println("length["+i+"]="+name[i].length());
		}

	}

}
