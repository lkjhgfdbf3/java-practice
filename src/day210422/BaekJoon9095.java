package day210422;
import java.util.*;

public class BaekJoon9095 {
	public static int go(int goal, int sum) {
		if(sum>goal) {
			return 0;
		}
		if(sum==goal) {
			return 1;
		}
		int ans=0;
		for(int i=1; i<=3; i++) {
			ans+=go(goal,sum+i);
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			System.out.println(go(a,0));
		}
	}

}
