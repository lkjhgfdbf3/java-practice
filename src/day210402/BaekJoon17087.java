package day210402;
import java.util.*;

public class BaekJoon17087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 동생 n명
		int s = sc.nextInt(); // 현재 수빈이의 위치
		int []a = new int[n]; // 동생들의 위치
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int diff = Math.abs(x-s);
			a[i]=diff;
		}
		
		int ans = a[0];
		
		for(int i=1; i<n; i++) {
			ans = gcd(ans,a[i]);
		}
		System.out.println(ans);
	}
	
	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		else 
			return gcd(b,a%b);
	}
}
