package day210416;
import java.util.*;

public class BaekJoon6064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int m =sc.nextInt();
			int n = sc.nextInt();
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			boolean bool = false;
			
			for(int j=x;j<(n*m);j+=m) {
				if(j%n==y) {
					System.out.println(j+1);
					bool = true;
					break;
				}
			}
			if(!bool) {
				System.out.println(-1);
			}
		}
	}
}
