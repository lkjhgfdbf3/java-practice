package day210416;
import java.util.*;

public class BaekJoon15649 {
	static int []a=new int[10]; // 출력하는 수열
	static boolean []c=new boolean[10]; // 사용한 수는 true 사용하지 않은 수는 false
	public static void go(int index, int n, int m) {
		if(index==m) {
			for(int i=0; i<m; i++) {
				System.out.print(a[i]);
				if(i!=m-1) System.out.print(' ');
			}
			System.out.println();
			return;
		}
		for(int i=1; i<=n; i++) {
			if(c[i]) continue;
			a[index]=i; // index번째에 수 i 대입
			c[i]=true;
			go(index+1,n,m);
			c[i]=false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		go(0,n,m);
	}
}
