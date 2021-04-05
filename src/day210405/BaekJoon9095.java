package day210405;
import java.util.*;

public class BaekJoon9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int []d = new int[12];
		d[1]=1;
		d[0]=1;
		d[2]=2;
		
		for(int j=3; j<=11; j++) {
			d[j]=d[j-1]+d[j-2]+d[j-3];
		}
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			System.out.println(d[n]);
		}
	}
}
