package day210416;
import java.util.*;

public class BaekJoon1748 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			long ans = 0;
			
			for(long start = 1,len=1; start<=n; start*=10, len++) {
				long end = start*10-1;
				if(end > n) {
					end = n;
				}
				ans += ((end-start)+1)*len;
			}
			System.out.println(ans);
		}
}
