package day210402;
import java.util.*;

public class BaekJoon10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ans = 1;
		
		for(int i=1; i<=a; i++) {
			ans *= i;
		}
		
		System.out.println(ans);
	}
}
