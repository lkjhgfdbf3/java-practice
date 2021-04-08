package day210408;
import java.util.*;

public class BaekJoon15988 {
	public static long mod = 1000000009;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long[]d = new long[1000001];
		d[0]=1;
		d[1]=1;
		d[2]=2;
		
		for(int i=3; i<d.length; i++) {
			d[i]=d[i-3]+d[i-2]+d[i-1];
			d[i]%=mod;
		}
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			System.out.println(d[n]);
		}
	}
}
