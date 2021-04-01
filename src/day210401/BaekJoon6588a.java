package day210401;
import java.util.*;

public class BaekJoon6588a {
	public static final int Max = 1000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check[] = new boolean[Max+1];
		ArrayList<Integer> prime = new ArrayList<Integer>();
		check[0]=check[1]=true;
		
		for(int i=2; i*i<=Max; i++) {
			if(check[i]==true)
				continue;
			prime.add(i);
			for(int j=i*2; j<=Max; j+=i) {
				check[j]=true;
			}
		}
		
		while(true) {
			int n=sc.nextInt();
			if(n==0)
				break;
			for(int i=1; i<prime.size(); i++) {
				int p = prime.get(i);
				if(check[n-p]==false) {
					System.out.println(n + " = " + p + " + " + (n-p));
					break;
				}
			}
		}
	}
}
