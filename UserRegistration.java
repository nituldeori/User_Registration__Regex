package userRegistration;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Last Name: ");
	    String LastName=sc.nextLine();
	    String regex="[A-Z]{1}[a-z]{2,}";
	    if(Pattern.matches(regex, LastName)) {
		    System.out.println("Valid Last Name");
	    }
	    else
		    System.out.println("Invalid Last Name");
	    sc.close();
	    }
	

}
