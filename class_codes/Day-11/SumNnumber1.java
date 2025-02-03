public class SumNnumber1
{
    public static void main(String [] args)
    {
        System.out.println("Sum of 1st 5 numbers :"+SumNnum(5));
    }
    static int SumNnum(int n)
    {
        return (n*(n+1))>>1;
    }
}