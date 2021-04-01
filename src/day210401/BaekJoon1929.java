package day210401;
import java.util.*;

public class BaekJoon1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean []check = new boolean[m+1];
		check[0]=check[1]=true;
		
		for(int i=2; i*i<=m; i++) {
			if(check[i]==true)
				continue;
			for(int j=i*2; j<=m; j+=i)
				check[j]=true;
		}
		
		for(int i=n; i<=m; i++) {
			if(check[i]==false) 
				System.out.println(i);
		}
	}
}
