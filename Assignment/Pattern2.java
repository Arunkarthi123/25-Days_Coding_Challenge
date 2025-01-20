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
		int i,j;
		int k =3 , n =4;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(k++ +" ");
			}	
			System.out.println();
		}
		k = k-(n-1);
		for(i=n ; i>1;i--) 
        {		
			for(j=i ; j>1; j--)		
            {
				System.out.print(k-j + " ");
			}
			k = k-i+1;
			System.out.println();
	    }
    }
}