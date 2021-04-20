package day210420;
import java.util.*;

public class BaekJoon15656 {
	static int num[]=new int[10];
	static int a[]=new int[10];
	public static StringBuilder go(int index, int n, int m) {
		if(index==m) {
			StringBuilder sb= new StringBuilder();
			for(int i=0; i<m; i++) {
				sb.append(num[a[i]]);
				if(i!=m-1) sb.append(" ");
			}
			sb.append("\n");
			return sb;
		}
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<n; i++) {
			if(index>=n) return ans;
			a[index]=i;
			ans.append(go(index+1,n,m));
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			num[i]=sc.nextInt();
		}
		Arrays.sort(num,0,n);
		System.out.print(go(0,n,m));
	}
}
