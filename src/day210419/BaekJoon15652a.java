package day210419;
import java.util.*;

public class BaekJoon15652a {
	static int []cnt = new int[10];
	static StringBuilder go(int index, int select, int n, int m) {
		if(select==m) {
			StringBuilder sb = new StringBuilder();
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=cnt[i]; j++) {
					sb.append(i);
					sb.append(" ");
				}
			}
			sb.append("\n");
			return sb;
		}
		StringBuilder ans = new StringBuilder();
		if(index>n) {
			return ans;
		}
		for(int i=m-select; i>=1; i--) {
			cnt[index]=i; // index를 i번 넣었을 경우(m-select개부터 1개까지)
			ans.append(go(index+1,select+i,n,m));
		}
		cnt[index]=0;
		ans.append(go(index+1,select,n,m));
		return ans;
	}
	public static void mainI(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.print(go(1,0,n,m));
	}
}
