package day210419;
import java.util.*;

public class BaekJoon15650 {
	static int []a = new int[10];
	public static void go(int index, int select, int n, int m) { // index라는 수를 o/x로 결정, select는 지금까지 선택한 수의 개수
		if(select==m) {
			for(int i=0; i<m; i++) {
				System.out.print(a[i]);
				if(i!=m-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
			return;
		}
		
		if(index>n) {
			return;
		}
		a[select]=index;
		go(index+1,select+1,n,m); // index를 결과에 추가
		a[select]=0;
		go(index+1,select,n,m); // index를 결과에 추가하지않음
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		go(1,0,n,m);
	}
}
