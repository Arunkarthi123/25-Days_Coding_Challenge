public class Klarge1
{
    public static void main(String[] args) 
    {
        int[] arr = {7,3,5,4,1,6,2,4,8};
        int n = arr.length;
        for(int i = n-1 ; i>=n-4;i--)
        {
            for(int j = 0 ; j<i;j++)
            {
                if(arr[i]<arr[j])
                {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] -= arr[j];
                }
            }
        }
        for(int i = n-3 ; i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}