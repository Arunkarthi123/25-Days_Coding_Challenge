// to solve the below pattern 
//    3
//    4 5
//    6 7 8
//    9 10 11 12
public class Pattern1
{
    static public void main(String[] args)
    {
        int n = 4,x=3;
        for(int i = 1;i<=n;i++)
        {
            for(int j=n-i;j<n;j++)
            {
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
    }

}