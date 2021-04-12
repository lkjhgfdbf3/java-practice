package day210412;
import java.util.*;

public class BaekJoon13398 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		int []d = new int[n]; // i번째에서 끝나는 연속합
		int []dr = new int[n]; // i번째에서 시작하는 연속합
		
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			d[i]=a[i];
			if(i>0 && d[i]<d[i-1]+a[i]) {
				d[i]=d[i-1]+a[i];
			}
		}
		
		for(int i=n-1; i>=0; i--) {
			dr[i]=a[i];
			if(i<n-1 && dr[i]<dr[i+1]+a[i]) {
				dr[i]=dr[i+1]+a[i];
			}
		}
		
		int ans = d[0];
		for(int i=1; i<n; i++) {
			if(ans<d[i]) {
				ans=d[i];
			}
		}
		for(int i=1; i<n-1; i++) {
			if(ans<d[i-1]+dr[i+1]) {
				ans=d[i-1]+dr[i+1];
			}
		}
		System.out.println(ans);
	}
}
