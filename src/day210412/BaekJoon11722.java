package day210412;
import java.util.*;

public class BaekJoon11722 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		int []d = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=n-1; i>=0; i--) {
			d[i]=1;
			for(int j=n-1; j>=i; j--) {
				if(a[j]<a[i] && d[i]<d[j]+1) {
					d[i]=d[j]+1;
				}
			}
		}
		
		int ans = 0;
		for(int i=n-1; i>=0; i--) {
			if(ans<d[i]) {
				ans = d[i];
			}
		}
		System.out.println(ans);
	}
}
