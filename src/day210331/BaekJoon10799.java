package day210331;
import java.io.*;
import java.util.*;

public class BaekJoon10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Integer> stack = new Stack<Integer>();
		int ans=0;
		
		for(int k=0; k<str.length(); k++) {
			char c = str.charAt(k);
			if(c=='(') {
				stack.push(k);
			}
			else {
				if(stack.peek()+1==k) {   // 스택의 top과 1차이가 나기 때문에 레이저
					stack.pop();
					ans+=stack.size();
				}
				else {
					stack.pop();  // 막대의 길이 
					ans +=1;
				}
			}
		}
		System.out.println(ans);
	}
}
