import java.io.*;
import java.util.Scanner;
class permutationcombination{
    static int fact(int n){
        int fact =1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        System.out.println("Enter r value: ");
        int r=sc.nextInt();
        try{
            int ncr=fact(n)/(fact(n-r)*fact(r));
            int npr=fact(n)/fact(n-r);
            System.out.println("Permutation: "+npr+"\n"+"Combination: "+ncr);
        }
        catch (ArithmeticException e){
            System.out.println("There is an exception raised");
        }
        
    }
}
