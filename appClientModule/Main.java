import java.util.Base64;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		boolean cont= true;	
		Main clinetApp = null;
		
		while (cont) {		
			System.out.print ("Please Enter Your First Number : ");
			String fstNum = scn.next();
			System.out.print ("\nPlease Enter Your Second Number :");
			String scndNum = scn.next();
			System.out.print ("\nPlease Enter Your Operation :");
			String operation = scn.next();
			System.out.print ("\nPlease Enter Your Method :");
			String method = scn.next();
			
			String encodedOperation = Base64.getEncoder().encodeToString(operation.getBytes());			
			Connection con =  new Connection ();
			
			String ans = con.getResponseFromServer(fstNum, scndNum, encodedOperation);			
			System.out.println (ans);		
			
			System.out.print ("\nDo You Wish To Continue [true/false] :");
			cont = scn.nextBoolean();
			System.out.println ("");
		}
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}