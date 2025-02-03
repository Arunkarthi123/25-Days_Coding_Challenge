import java.util.Scanner;
public class SecondLarge1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int j =0 ;j<=1;j++)
        {
            int max1 = arr[j];
            int max2 = Integer.MIN_VALUE;
            for(int i =j+2;i<n;i+=2)
            {
                if(max1<arr[i])
                {
                    max2 = max1;
                    max1 = arr[i];
                }
                else if(max2<arr[i] && arr[i] != max1)
                {
                    max2 = arr[i];
                }
            }
            sum += max2;
        }
        // System.out.println(max1);
        System.out.println("Sum of second largest of odd and even index : "+sum);

    }
}