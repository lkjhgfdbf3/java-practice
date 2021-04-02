package day210402;
import java.util.*;

public class BaekJoon17103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> primes = new ArrayList<>();
		boolean check[] = new boolean[1000001];
	
		for(int i=2; i<=1000000; i++) { // i*i가 아니라 모든 경우의 수 전부 검사해야함
			if(check[i]==true)
				continue;
			for(int j=i*2; j<=1000000; j+=i) {
				check[j]=true;
			}
			check[i]=false;
			primes.add(i);
		}
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int num =sc.nextInt();
			int ans = 0;
			for(int p : primes) {
				if(num-p>=2 && p <= num-p) { // 지정범위 없으면 에러뜸
					if(check[num-p]==false) {
						ans+=1;
					}	
				}
			}
			System.out.println(ans);
		}
	}
}
