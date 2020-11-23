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
	    System.out.println("Enter the Email ID: ");
	    String EmailId=sc.nextLine();
	    System.out.println("Enter the phone number");
	    String PhoneNumber=sc.nextLine();
	    System.out.println("Enter the password: ");
	    String Password=sc.nextLine();
	    String regexForName="[A-Z]{1}[a-z]{2,}";
	    String regexForEmail="^[a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";
	    String regexForPhoneNo="[91 ]{3}[6-9][0-9]{9}";
	    String regexForPassword="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&]).{8,}$";
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
	    if(Pattern.matches(regexForEmail, EmailId)) {
		    System.out.println("Valid Email Id");
	    }
	    else
		    System.out.println("Invalid Email Id");
	    if(Pattern.matches(regexForPhoneNo, PhoneNumber)) {
		    System.out.println("Valid Phone Number");
	    }
	    else
		    System.out.println("Invalid Phone Number");
	    if(Pattern.matches(regexForPassword, Password)) {
		    System.out.println("Valid Password");
	    }
	    else
		    System.out.println("Invalid Password");
	    }
	    
	

}
