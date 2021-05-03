package day210503;
import java.util.*;

public class BaekJoon4963 {
	public static final int dx[] = {-1,0,1,-1,1,-1,0,1};
	public static final int dy[] = {-1,-1,-1,0,0,1,1,1};
	public static void bfs(int [][]a, int [][]group, int x, int y, int cnt, int n,int m) {
		Queue<Pair>q = new LinkedList<Pair>();
		group[x][y]=cnt;
		q.add(new Pair(x,y));
		while(!q.isEmpty()) {
			Pair p = q.remove();
			x=p.x;
			y=p.y;
			for(int i=0; i<8; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(0<=nx && nx<n && 0<=ny && ny<m) {
					if(a[nx][ny]==1 && group[nx][ny]==0) {
						q.add(new Pair(nx,ny));
						group[nx][ny]=cnt;
					}
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(n==0 && m==0) break;
			
			int a[][]=new int[n][m];
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					a[i][j]=sc.nextInt();
				}
			}
			
			int cnt = 0;
			int [][]group = new int[n][m];
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(a[i][j]==1 && group[i][j]==0) {
						bfs(a,group,i,j,++cnt,n,m);
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
