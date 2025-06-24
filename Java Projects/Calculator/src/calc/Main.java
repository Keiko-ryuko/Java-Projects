package calc;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operetor (+ - * /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        
        switch(op) {
            case '+': System.out.println("Result: " + (a + b));
            break;
            case '-': System.out.println("Result: " + (a - b));
            break;
            case '*': System.out.println("Result: " + (a * b));
            break;
            case '/': System.out.println(b != 0 ? "Result: " + (a / b) : "Cannot divide by zero");
            break;
            default: System.out.println("Invalid operator");
        }
        sc.close();
    }
    
}