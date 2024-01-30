
public class ConstructorExample {
	
	String ConstructorName;
	
	ConstructorExample(String name) {
		ConstructorName = name;
		
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorExample ce = new ConstructorExample("Mayuri");
	      System.out.println(ce.ConstructorName);
	}
}
