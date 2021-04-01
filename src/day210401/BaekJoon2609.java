package day210401;
import java.util.*;

public class BaekJoon2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans1, ans2;
		
		ans1=gcd(a,b); // 최대공약수
		ans2=(a*b)/ans1; // 최소공배수
		
		System.out.println(ans1);
		System.out.println(ans2);
	}
	
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		else{
			return gcd(b,a%b);
		}
	}
}
