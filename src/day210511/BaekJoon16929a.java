package day210511;
import java.util.*;

public class BaekJoon16929a {
	static char[][]a;
	static boolean[][]check;
	static int n,m;
	public static final int dx[]= {0,0,1,-1};
	public static final int dy[]= {1,-1,0,0};
	public static boolean go(int x, int y, int px, int py,char color) {
		if(check[x][y]) {
			return true;
		}
		check[x][y]=true;
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(0<=nx && nx<n && 0<=ny && ny<m) {
				if(!(nx==px && ny==py)) { // (px,py)->(x,y)->(nx,ny)
					if(a[nx][ny]==color) {
						if(go(nx,ny,x,y,color)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a=new char[n][m];
		check = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			a[i]=sc.next().toCharArray();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(check[i][j]) continue;
				boolean ok = go(i,j,-1,-1,a[i][j]);
				if(ok) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}
		System.out.println("No");
	}
}
