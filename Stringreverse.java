import java.util.*;
class Stringreverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String strrev=sc.nextLine();
        String[] sarr=strrev.split(" ");
        for(int i=0;i<sarr.length;i++){
            char[] ch=sarr[i].toCharArray();
            for (int j=ch.length-1;j>=0;j--){
                System.out.print(ch[j]);
            }
            System.out.print("  ");
        }
    }
}
