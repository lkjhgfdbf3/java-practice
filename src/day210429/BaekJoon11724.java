package day210429;
import java.util.*;

public class BaekJoon11724 {
	static void dfs(ArrayList<Integer>[]a, boolean[] c, int node) {
		if(c[node]) return;
		c[node]=true;
		for(int y : a[node]) {
			if(c[y]==false) {
				dfs(a,c,y);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer>[]a = (ArrayList<Integer>[]) new ArrayList[n+1];
		
		for(int i=1; i<=n; i++) {
			a[i]=new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			a[from].add(to);
			a[to].add(from);
		}
		
		boolean []c = new boolean[n+1];
		int ans=0;
		for(int i=1; i<=n; i++) {
			if(c[i]==false) {
				dfs(a,c,i);
				ans+=1;
			}
		}
		System.out.println(ans);
	}
}
