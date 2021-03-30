package day210330;
import java.util.*;
import java.io.*;

public class BaekJoon9093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(a-- > 0) {
			String str = br.readLine()+"\n";
			Stack<Character> stack = new Stack<>();
			for(char ch : str.toCharArray()) {
				if(ch == ' ' || ch == '\n') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(ch);
				}
				else stack.push(ch);			
				}
		}
		bw.flush();
	}
}
