package day210405;
import java.util.*;

public class BaekJoon1463a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int []d = new int[a+1];
		d[1]=0;
		
		for(int i=2; i<=a; i++) {
			d[i]=d[i-1]+1;
			if(i%2==0 && d[i]>d[i/2]+1) {
				d[i]=d[i/2]+1;
			}
			if(i%3==0 && d[i]>d[i/2]+1) {
				d[i]=d[i/3]+1;
			}
		}
		System.out.println(d[a]);
	}
}
