import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
        double number1 = sc.nextDouble();
		System.out.println("Enter second number");
        double number2 = sc.nextDouble();
        double addition = number1+number2;
        double subtraction = number1-number2;
        double multiplication = number1*number2;
        double division = number1/number2;
        
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers is :"
		+ addition + ", " + subtraction + ", " + multiplication + " and " + division);
    }
}
