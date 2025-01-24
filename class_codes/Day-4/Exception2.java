public class Exception2 
{
    public static void main(String [] arg)
    {
        int[] arr = new int[5];
        try
        {
            arr[10]=20;
        }
        // System.out.println("Hai"); // Its is not premitted to use .
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
// Output :
    // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
