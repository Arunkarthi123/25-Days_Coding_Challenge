public class MissingElement1
{
    public static void main(String[] args) {
        int[] arr = { 4,1,3,6,5 };
        int result = 0 , i;
        for(i = 1 ; i<= arr.length ; i++)
        {
            result = result ^ i ^arr[i-1];
            //  System.out.println(result);
    
        }
        // for(int i = 0 ;i<arr.length;i++)
        // {
        //     result ^= arr[i];
        // }
        System.out.println(result^i);
    }
}