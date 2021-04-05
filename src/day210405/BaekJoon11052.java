package day210405;
import java.util.*;

public class BaekJoon11052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int card=sc.nextInt(); // 구매하려고 하는 카드의 개수
		int []p = new int[card+1];
		
		for(int i=1; i<=card; i++) { // 카드팩 당 가격
			p[i] = sc.nextInt();
		}
		
		int d[] = new int[card+1]; //카드 n개 구매하는 최대 비용
		for(int n=1; n<=card; n++) {
			d[n]=-1; // 아직 정답을 구하지 않았다는 의미
			for(int i=1; i<=n; i++) {
				if(d[n]<d[n-i]+p[i]) {
					d[n]=d[n-i]+p[i];
				}
			}
		}
		System.out.println(d[card]);
	}
}
