import java.util.Scanner;
public class MirrorInverse {
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int arr[] ={4,5,2,6,9};
        if (isMirrorInverse(arr))
            System.out.println("The given array is mirror inverse");
        else
            System.out.println("The given array is not mirror inverse");
    }
}
