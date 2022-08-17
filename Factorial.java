import java.util.Scanner;
class factorial{
    static int Factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return (n*Factorial(n-1));
        }
    }
    public static void main(String args[]){
        int fact=1,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        fact *=Factorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
}