package day210406;
import java.util.*;

public class BaekJoon2193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]d = new int[n+1][2];
		int []ans = new int[n+1];
		d[1][0]=0;
		d[1][1]=1;
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=1; j++) {
				if(j==0) {
					d[n][0]=d[n-1][0]+d[n-1][1];
				}
				if(j==1) {
					d[n][1]=d[n-1][0];
				}
				ans[i] = d[n][0]+d[n][1];
			}
		}
		System.out.println(ans[n]);
	}
}
