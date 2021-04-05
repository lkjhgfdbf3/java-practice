package day210405;
import java.util.*;

public class BaekJoon1463 {
	public static int[]d;
	public static int go(int a) {
		if(a==1)
			return 0;
		if(d[a]>0)
			return d[a];
		d[a]=go(a-1)+1;
		if(a%2==0) {
			int temp = go(a/2)+1;
			if(d[a]>temp)
				d[a]=temp;
		}
		if(a%3==0) {
			int temp = go(a/3)+1;
			if(d[a]>temp)
				d[a]=temp;
		}
		return d[a];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		d = new int[a+1];
		System.out.println(go(a));
	}
	
}
