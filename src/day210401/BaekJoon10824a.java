package day210401;
import java.util.*;

public class BaekJoon10824a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = String.valueOf(sc.nextInt());
		String b = String.valueOf(sc.nextInt());
		String c = String.valueOf(sc.nextInt());
		String d = String.valueOf(sc.nextInt());
		a+=b;
		c+=d;
		Long ans1 = Long.valueOf(a);
		Long ans2 = Long.valueOf(c);
		System.out.println(ans1+ans2);
	}
}
