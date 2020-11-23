package userRegistration;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the First Name: ");
	    String FirstName=sc.nextLine();
	    System.out.println("Enter the Last Name: ");
	    String LastName=sc.nextLine();
	    String regexForName="[A-Z]{1}[a-z]{2,}";
	    if(Pattern.matches(regexForName, FirstName)) {
		    System.out.println("Valid First Name");
	    }
	    else
		    System.out.println("Invalid First Name");
	    if(Pattern.matches(regexForName, LastName)) {
		    System.out.println("Valid Last Name");
	    }
	    else
		    System.out.println("Invalid Last Name");
	    sc.close();
	    }
	

}
