// to solve the below pattern 
//    3     
//    4 5
//    6 7 8
//    9 10 11 12
//    6 7 8
//    4 5
//    3



class Pattern2
{
    public static void main(String[] args) 
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
        x=x-n+1;
        for(int i=1;i<n;i++)
        {
            x=x-n;
            for(int j=i;j<n;j++)
            {
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
    }
}