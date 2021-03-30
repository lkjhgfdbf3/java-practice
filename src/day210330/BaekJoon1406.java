package day210330;
import java.io.*;
import java.util.*;

public class BaekJoon1406 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(br.readLine());
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<str.length(); i++) {
			left.push(str.charAt(i));
		}
		
		while(num-- > 0) {
			String []line = br.readLine().split(" ");
			char k = line[0].charAt(0);
			if(k=='L') {
				if(!left.isEmpty()) 
				right.push(left.pop());
			}
			else if(k=='D') {
				if(!right.isEmpty()) 
				left.push(right.pop());
			}
			else if(k=='B') {
				if(!left.isEmpty())
				left.pop();
			}
			else if(k=='P') {
				char c = line[1].charAt(0);
				left.push(c);
			}
		}
		
		while(!left.empty()) {
			right.push(left.pop());
		}
		
		while(!right.empty()) {
			sb.append(right.pop());
		}
		System.out.print(sb);
	}
}
