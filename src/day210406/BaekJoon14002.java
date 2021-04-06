package day210406;
import java.util.*;

public class BaekJoon14002 {
	static int []A;
	static int []D;
	static int []V;
	static void go(int p) {
		if(p==-1) {
			return;
		}
		go(V[p]);
		System.out.print(A[p] + " ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		A = new int[n];
		D = new int[n];
		V = new int[n];
		
		for(int i=0; i<n; i++) {
			A[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			D[i]=1;
			V[i]=-1;
			for(int j=0; j<i; j++) {
				if(A[j]<A[i] && D[i]<D[j]+1) {
					D[i]=D[j]+1;
					V[i]=j;
				}
			}
 		}
		
		int ans=D[0];
		int p =0;
		for(int i=0; i<n; i++) {
			if(ans<D[i]) {
				ans=D[i];
				p=i;
			}
		}
		System.out.println(ans);
		go(p);
		System.out.println();
	}
}
