package day210428;
import java.util.*;

public class BaekJoon1260 {
	static ArrayList<Integer>[]a;
	static boolean[]c;
	public static void dfs(int v) {
		if(c[v]) return;
		c[v]=true;
		System.out.print(v+" ");
		for(int y : a[v]) {
			if(c[y]==false) {
				dfs(y);
			}
		}
	}
	public static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		c[v]=true;
		while(!queue.isEmpty()) {
			int x = queue.remove();
			System.out.print(x+" ");
			for(int y : a[x]) {
				if(c[y]==false) {
					c[y]=true;
					queue.add(y);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		a = (ArrayList<Integer>[])new ArrayList[n+1];
		
		for(int i=1; i<=n; i++) {
			a[i]=new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			a[num1].add(num2);
			a[num2].add(num1);
		}
		
		for(int i=1; i<=n; i++) {
			Collections.sort(a[i]);
		}
		
		c = new boolean[n+1];
		dfs(v);
		System.out.println();
		c = new boolean[n+1];
		bfs(v);
		System.out.println();
	}
}
