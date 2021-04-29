package day210429;
import java.util.*;

public class BaekJoon1707a {
	public static void bfs(ArrayList<Integer>[]a, int []color, int x, int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(x);
		color[x]=i;
		while(!q.isEmpty()) {
			int next = q.remove();
			for(int y : a[next]) {
				if(color[y]==0) {
					q.add(y);
					color[y]=color[next]*-1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
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
			int color[]=new int[n+1];
			boolean ok=true;
			
			for(int i=1; i<=n; i++) {
				if(color[i]==0) {
					bfs(a,color,i,1);
				}
			}
			
			for(int i=1; i<=n; i++) {
				for(int y:a[i]) {
					if(color[i]==color[y]) {
						ok=false;
					}
				}
			}
			if(ok) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
