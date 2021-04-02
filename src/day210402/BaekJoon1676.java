package day210402;
import java.util.*;

public class BaekJoon1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count=0;

		for(int i=5; i<=a; i*=5) {
			count +=a/i;
		}
		
		System.out.println(count);
	}
}
