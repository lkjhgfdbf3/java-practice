package Day210414;
import java.util.*;

public class BaekJoon1476 {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int e = 1;
		int s = 1;
		int m = 1;
		int ans =0;
		
		for(int i=1;; i++) {
			if(e==num1 && s==num2 && m==num3) {
				System.out.print(i);
				break;
			}
			e+=1;
			s+=1;
			m+=1;
			if(e==16) {
				e=1;
			}
			if(s==29) {
				s=1;
			}
			if(m==20) {
				m=1;
			}
		}
	}
}
