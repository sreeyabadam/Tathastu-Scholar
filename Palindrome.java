import java.io.*;
import java.util.Scanner;
class palindromeEx{
    public static void main(String[] args){
        String str,rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:" );
        str=sc.nextLine();

        int l=str.length();
        for(int i=l-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
