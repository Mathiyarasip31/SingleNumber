import java.util.Scanner;

public class SingleNumber {
    static void singleNum(int arr[],int n)
    {
        int result=0;
        for (int i=0;i<arr.length;i++)
        {
            result=result^arr[i];
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        singleNum(arr,n);
    }
}