package day210419;
import java.util.*;

public class BaekJoon15652 {
	static int []a = new int[10];
	public static void go(int index, int start, int n, int m) {
		if(index==m) {
			for(int i=0; i<m; i++) {
				System.out.print(a[i]);
				if(i!=m-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
			return;
		}
		for(int i=start; i<=n; i++) {
			a[index]=i;
			go(index+1,i,n,m);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		go(0,1,n,m);
	}
}
