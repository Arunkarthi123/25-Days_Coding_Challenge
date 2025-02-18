public class Dp3
{   
	public static void main(String[] args) {
		int sum=5;
		int coins[]={1,2,5};
		int dp[][]=new int[coins.length+1][sum+1];
		for(int i=0;i<=coins.length;i++)
		dp[i][0]=1;
		for(int i=1;i<=sum;i++)
		dp[0][i]=0;
		for(int i=1;i<=coins.length;i++)
		{
		    for(int j=1;j<=sum;j++)
		    {
		        if(j<coins[i-1])
		        dp[i][j]=dp[i-1][j];
		        else
		        dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
		    }
		}
		System.out.println(dp[coins.length][sum]);
		
	}

}