public class KnightTour1
{
    public static void main(String[] args) 
    {
                
    }
}
class Knight
{
    int arr[][];
    int n ;
    int tour;
    int[] row = {-2 , -2 , -1 , 2 , 2, -1 ,1};
    int[] col = { -1 , 1 , -2 , -2 , -1 , 1 , 2 , 2} ;
    public Knight(int size)
    {
        this.n = size;
        this.arr = new int[n][n];
        this.tour = 0;
    }
    public void BulidTour(int row , int col)
    {
        if(this.tour == n - 1)
            return ;
        
    }
}