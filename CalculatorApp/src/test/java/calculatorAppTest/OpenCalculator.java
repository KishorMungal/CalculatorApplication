package calculatorAppTest;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OpenCalculator {
	public static void main(String[] args) {
		Map<String,String> userdetails=new HashMap<String,String>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Hello Users");
		System.out.println("First you need to register as user"
				+ "==>> please enter [SIGNUP]}");
	    String UserInput=sc.next();
	   
	    if(UserInput.equals("SIGNUP")){
	    	System.out.println("Enter UserName");
	    	String UserName=sc.next();
	    	System.out.println("Enter Password");
	    	String Password=sc.next();
	    	userdetails.put(UserName, Password);
	    	System.out.println("**Congratulation***"+"You have Successfully created account");
	    	System.out.println("please  Login Application");
	    }
	    System.out.println("Enter [LOGIN]");
	    String UserInput1=sc.next();
	     if(UserInput1 .equals("LOGIN")) {
	    	System.out.println("Enter UserName");
	    	String UserName=sc.next();
	    	System.out.println("Enter Password");
	    	String Password=sc.next();
	    	if(userdetails.containsKey(UserName)==true) {
	    		if(userdetails.containsValue(Password)==true) {
	    			CalculatorRunnerClass runner =new CalculatorRunnerClass();
	    			runner.Runnermethod();
	    		}
	    	}
	    	else {
	    		System.out.println("Username or password is wrong");
	    	}
	    }
	    }
		
		
	}


