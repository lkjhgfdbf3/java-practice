package day210304;
import java.io.*;

public class BackJoon11726 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bfr.readLine());
		int dp[] = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			if(i==1) {
				dp[i]=1;
			}
			else if(i==2) {
				dp[i]=2;
			}
			else {
				dp[i]=(dp[i-2]+dp[i-1])%10007;
			}
		}
		System.out.println(dp[N]);
	}
}
