
public class ResultOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResultOperator obj = new ResultOperator ();

		String output = obj.myMethod(10,10);
		
        System.out.println(output);
        
	}

	String myMethod(int a, int b) {
		return((a+b)+"\n" +(a-b)+"\n"+(a*b)+"\n"+(a/b)+"\n...Developing by Mayuri...");
	}
	
}
