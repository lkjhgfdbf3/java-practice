package day210402;
import java.util.*;

public class BaekJoon9613a {
	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n=sc.nextInt();
			int []a = new int[n];
			
			for(int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			
			long ans=0;
			
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					ans +=gcd(a[i], a[j]);
				}
			}
			System.out.println(ans);
		}
	}
}
