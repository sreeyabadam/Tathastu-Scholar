//Write a Java program to perform basic Calculator operations.
import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        double n1,n2,ans;
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        n1=sc.nextDouble();
        n2=sc.nextDouble();
        System.out.println("Enter an operator(+,-,*,/): ");
        op=sc.next().charAt(0);
        switch(op){
            case '+': ans = n1 + n2;
            break;
            case '-': ans = n1 - n2;
            break;
            case '*': ans = n1 * n2;
            break;
            case '/': ans = n1 / n2;
            break;
            default: System.out.println("Enter a valid operator.");
            return;
        }
        System.out.println("Result: ");
        System.out.println(n1+" "+op+" "+n2+ "="+ans);
    }
}