package day210406;
import java.util.*;

public class BaekJoon1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []A = new int[n];
		int []D = new int[n];
		
		for(int i=0; i<n; i++) {
			A[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			D[i]=A[i];
			if(i==0)
				continue;
			if(D[i]<D[i-1]+A[i])
				D[i]=D[i-1]+A[i];
		}
		
		int ans=D[0];
		for(int i=0; i<n; i++) {
			if(ans < D[i])
				ans=D[i];
		}
		System.out.println(ans);
	}
}
