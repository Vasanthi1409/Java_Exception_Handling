package Exception_Handling.com;

public class Try_Catch_Finally {

	public static void main(String[] args) {

		int a = 10, b = 0;
		int c;
		try {
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {	//if error occurred in try then only catch block executed
			e.printStackTrace();
		} finally {			// whether an error occurred in try block or not, finally block executed  
			System.out.println("Java");
		}
	}
}
