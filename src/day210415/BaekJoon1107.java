package day210415;
import java.util.*;

public class BaekJoon1107 {
	static boolean[] broken = new boolean[10]; //망가진 리모컨 버튼은 true
	static int possible(int c) {
		if(c==0) {
			if(broken[0])
				return 0;
			else
				return 1;
		}
		int len = 0;
		while(c>0) {
			if(broken[c%10])
				return 0;
			len+=1;
			c/=10;
		}
		return len;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m = sc.nextInt();
	
		for(int i=0; i<m; i++) {
			int x = sc.nextInt();
			broken[x]=true;
		}
		
		int ans = n-100; // 숫자버튼을 누르지 않는 경우를 초기화
		if(ans<0) {
			ans=-ans;
		}
		
		for(int i=0; i<=1000000; i++) {
			int c=i; // 이동하려는 채널 결정
			int len=possible(c); // 숫자버튼을 몇번 눌러야하는지 결정
			if(len>0) {
				int press = c-n;
				if(press<0) {
					press = -press;
				}
				if(ans>len+press)
					ans = len+press;
			}
		}
		System.out.println(ans);
	}
}
