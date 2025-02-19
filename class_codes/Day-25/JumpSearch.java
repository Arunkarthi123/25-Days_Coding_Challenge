public class JumpSearch
{
    public static void main(String[] args) {
        
    }
}
class Search
{
    public int indexOf(int val , int[] arr)
    {
        int i = arr.length ;
        while()
        {
            int step = (int) Math.floor(Math.sqrt(i));
            i = step - 1;
            int prev = i ;
            while( i < arr.length)
            {
                prev = i;
                if(arr[i] >= val)
                {
                    break;
                }
                i = i + step ;
            }
            if(arr.length <= i && prev + 1 >= arr.length)
            {
                return -1;
            }
            else if(arr.length <= i && prev + 1 < arr.length)
            {
                i = arr.length - 1;
            }
        }
    }
}