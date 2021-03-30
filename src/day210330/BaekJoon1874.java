package day210330;
import java.util.*;

public class BaekJoon1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int []n = new int[a];
		for(int i=0; i<a; i++) {
			n[i]=sc.nextInt();
		}
		solve(n);
	}
	
	public static void solve(int []n) {
		int len = n.length;
		int m = 0;
		Stack<Integer> stack= new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int x : n) {
			if(x > m) {
				while(x > m) {
					stack.push(++m);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}
			else {
				if(stack.peek()!=x) {
					System.out.println("NO");
					return;
				}
				stack.pop();
				sb.append("-\n");
			}
		}
		System.out.println(sb);
	}
}
