package day210406;
import java.util.*;

public class BaekJoon11053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int []A = new int[a];
		int []D = new int[a];
		int ans = 0;
		
		for(int i=0; i<a; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0; i<a; i++) {
			D[i]=1;
			for(int j=0; j<=i; j++) {
				if(A[j]<A[i] && D[i]<D[j]+1) {
					D[i]=D[j]+1;
				}
			}
		}
		
		for(int i=0; i<a; i++) {
			if(ans < D[i])
				ans = D[i];
		}
		System.out.println(ans);
	}
}
