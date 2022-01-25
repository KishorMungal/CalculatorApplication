package calculatorApp;

public class CalculatorBusinessLogic {
	
	public static  int addition(int num1,int num2) {
		int Addition=num1+num2;
		System.out.println("result After Adding numbers : "+Addition);
		return Addition;
	}
	
	public static  int substraction(int largernum,int smallernum) {
		int substraction=largernum-smallernum;
		System.out.println("result After substract numbers : "+substraction);
		return substraction;
	}
	public static  int multiplication(int num1,int num2) {
		int multiplication=num1*num2;
		System.out.println("result After multiplying numbers : "+multiplication);
		return multiplication;
	}
	public static  int division(int num1,int num2) {
		int division=num1/num2;
		System.out.println("result After divide numbers : "+division);
		return division;
	}
	public static  int square(int num1) {
		int square=num1*num1;
		System.out.println("square of given numbers is : "+square);
		return square;
	}
	public static int  squareroot(int num) {
		int i;
		for( i=1;i<num;i++) {
			if(num/i==i) {
				System.out.println("square root given number is : "+i);
			break;}
		}
		return i;	
	}
	public static  int cube(int num1){
		int cube=num1*num1*num1;
		System.out.println("cube of given number is : "+cube);
		return cube;
	}
	public static int cuberoot(int num) {
		int i;
		for(i=1;i<num;i++) {
			if(i*i*i==num){
				System.out.println("cuberoot of given number is : "+i);
			}
		}
		return i;	
	}
	public static int facorial(int num) {
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of given number is : "+fact);

		return fact;
	}
	

}
