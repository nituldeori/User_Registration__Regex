package userRegistration;
import java.util.regex.Pattern;
import java.util.Scanner;
interface UserRegistrationInterface {
	boolean validate(String parameter);

}
public class UserRegistration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String regexForName="[A-Z]{1}[a-z]{2,}";
	    String regexForEmail="^[a-zA-Z]+([._+-]{0,1}[0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$";
	    String regexForPhoneNo="[91 ]{3}[6-9][0-9]{9}";
	    String regexForPassword="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&]).{8,}$";
	    UserRegistrationInterface FirstName=(String firstName)->(Pattern.matches(regexForName, firstName));
	    UserRegistrationInterface LastName=(String lastName)->(Pattern.matches(regexForName, lastName));
	    UserRegistrationInterface Email=(String email)->(Pattern.matches(regexForEmail, email));
	    UserRegistrationInterface PhoneNo=(String phoneNo)->(Pattern.matches(regexForPhoneNo, phoneNo));
	    UserRegistrationInterface Password=(String password)->(Pattern.matches(regexForPassword, password));
	    
	    System.out.println("Enter the First Name: ");
        String firstName=sc.nextLine();
        System.out.println("Enter the Last Name: ");
        String lastName=sc.nextLine();
        System.out.println("Enter the Email ID: ");
        String emailId=sc.nextLine();
        System.out.println("Enter the phone number");
        String phoneNumber=sc.nextLine();
        System.out.println("Enter the password: ");
        String password=sc.nextLine();
        
        if(FirstName.validate(firstName)) {
        	System.out.println("Valid First Name");
        }
        else
        	System.out.println("Invalid First Name");
        
        if(LastName.validate(lastName)) {
        	System.out.println("Valid Last Name");
        }
        else
        	System.out.println("Invalid Last Name");
        
        if(Email.validate(emailId)) {
        	System.out.println("Valid Email");
        }
        else
        	System.out.println("Invalid Email");
        
        if(PhoneNo.validate(phoneNumber)) {
        	System.out.println("Valid Phone Number");
        }
        else
        	System.out.println("Invalid Phone Number");
        
        if(Password.validate(password)) {
        	System.out.println("Valid Password");
        }
        else
        	System.out.println("Invalid Password");
        
        sc.close();
	}
	    
	

}
