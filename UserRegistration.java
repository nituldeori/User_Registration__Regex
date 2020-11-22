package userRegistration;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the First Name: ");
	    String FirstName=sc.nextLine();
	    String regex="[A-Z]{1}[a-z]{2,}";
	    if(Pattern.matches(regex, FirstName)) {
		    System.out.println("Valid First Name");
	    }
	    else
		    System.out.println("Invalid First Name");
	    sc.close();
	    }
	

}
