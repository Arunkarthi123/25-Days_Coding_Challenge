public class Dp1
{   
	public static void main(String[] args) {
		
	int cap=10;
	int weight[]={2,3,5,7};
	int profit[]={5,6,15,14};
	int w=4;
	int p=4;
	int dp[][]=new int[p+1][cap+1];
	for(int i=1;i<=p;i++)
	{
	    for(int j=1;j<=cap;j++)
	    {
	        if(j<weight[i-1])
	        dp[i][j]=dp[i-1][j];
	        else{
	            dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+profit[i-1]);
	        }
	    }
	}
	System.out.print(dp[p][cap]);
	}

}