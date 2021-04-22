package day210422;
import java.util.*;

public class BaekJoon1759 {
	public static boolean check(String pw) {
		int ja =0;
		int mo =0;
		for(char x : pw.toCharArray()) {
			if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u') {
				mo+=1;
			}
			else {
				ja+=1;
			}
		}
		return ja>=2 && mo>=1;
	}
	public static void go(int n, String[] alpha, String pw, int i) { //n: 만들어야 하는 암호의 길이, alpha: 사용할 수 있는 알파벳, password: 현재까지 만든 암호, i: 사용할지 말지 결정해야 하는 알파벳의 인덱스
		if(pw.length()==n) {
			if(check(pw)) {
				System.out.println(pw);
			}
			return;
		}
		if(i>=alpha.length) {
			return;
		}
		go(n,alpha,pw+alpha[i],i+1);
		go(n,alpha,pw,i+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String []alpha = new String[m];
		
		for(int i=0; i<m; i++) {
			alpha[i] = sc.next();
		}
		Arrays.sort(alpha);
		go(n,alpha,"",0);
	}
}
