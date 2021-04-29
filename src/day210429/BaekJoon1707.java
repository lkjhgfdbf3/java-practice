package day210429;
import java.util.*;

public class BaekJoon1707 {
	public static void dfs(ArrayList<Integer>[]a, int[]color, int x, int c) {
		color[x]=c;
		for(int y : a[x]) {
			if(color[y]==0) {
				dfs(a,color,y,3-c); //c로 그룹1번과 그룹2로 나누어 이분그래프 판단
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		while(k-->0) {
			int n=sc.nextInt(); 
			int m=sc.nextInt();
			ArrayList<Integer>[]a = (ArrayList<Integer>[])new ArrayList[n+1];
			for(int l=1; l<=n; l++) {
				a[l]=new ArrayList<Integer>();
			}
			for(int j=0; j<m; j++) {
				int from=sc.nextInt();
				int to = sc.nextInt();
				a[from].add(to);
				a[to].add(from);
			}
			int []color = new int[n+1];
			boolean ok = true;
			for(int i=1; i<=n; i++) {
				if(color[i]==0) {
					dfs(a,color,i,1);
				}
			}
			for(int i=1;i<n; i++) {
				for(int j : a[i]) {
					if(color[i]==color[j]) {
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
