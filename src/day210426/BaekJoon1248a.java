package day210426;
import java.util.*;

public class BaekJoon1248a {
	static int n;
	static int [][]sign;
	static int []ans;
	public static boolean ok() {
		for(int i=0; i<n; i++) {
			int sum=0;
			for(int j=i; j<n; j++) {
				sum+=ans[j];
				if(sign[i][j]==0) {
					if(sum!=0) return false;
				}
				else if(sign[i][j]>0) {
					if(sum<=0) return false;
				}
				else if(sign[i][j]<0) {
					if(sum>=0) return false;
				}
			}
		}
		return true;
	}
	public static boolean go(int index) {
		if(index==n) {
			return ok();
		}
		if(sign[index][index]==0) {
			ans[index]=0;
			return go(index+1);
		}
		for(int i=1; i<=10; i++) {
			ans[index]=sign[index][index]*i;
			if(go(index+1)) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sign=new int[n][n];
		ans = new int[n];
		int cnt = 0;
		String str = sc.next();
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				char x = str.charAt(cnt);
				if(x=='0') {
					sign[i][j]=0;
				}
				else if(x=='+') {
					sign[i][j]=1;
				}
				else if(x=='-') {
					sign[i][j]=-1;
				}
				cnt+=1;
			}
		}
		go(0);
		for(int i=0; i<n; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();
	}
}
