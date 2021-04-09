package day210409;
import java.util.*;

public class BaekJoon11057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long mod = 10007;
		int n = sc.nextInt();
		long [][]d = new long[10][n+1];
		long ans = 0;
		
		for(int i=0; i<=9; i++) {
			d[i][1]=1;
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=0; i<=9; i++) {
				for(int j=0; j<=i; j++) {
					d[i][k] += d[i-j][k-1];
					d[i][k]%=mod;
				}
			}
		}
		for(int i=0; i<=9; i++) {
			ans +=d[i][n];
		}
		System.out.println(ans%mod);
	}
}
