//import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class NobleInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int size=sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter Elements:");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result=NobleInteger(arr);
        System.out.println(result);


    }
    private static int NobleInteger(int[] arr){
        Arrays.sort(arr);
        int count=0;
        int n=arr.length;
        for (int i=0;i<(arr.length)-1;i++){
            if (arr[i]==arr[i+1]){
                    continue;
            }
            count = n - i - 1;
            if (arr[i]==count){
                return 1;
            }
        }
        return -1;
    }
}
