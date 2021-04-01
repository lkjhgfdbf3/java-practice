package day210401;
import java.util.*;

public class BaekJoon1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		boolean ans;
		
		while(n-- > 0) {
			int b = sc.nextInt();
			ans = prime(b);
			if(ans==true)
				count+=1;
		}
		System.out.println(count);
	}
	
	public static boolean prime(int a) {
		if(a<2) {
			return false;
		}
		for(int i=2; i*i<a; i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}
