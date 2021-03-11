package day210310;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BackJoon2504 {
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		Stack<String>stack = new Stack<>();
		int round=0;
		int square=0;
		
		for(int i=0; i<=str.length(); i++) {
			switch(str.charAt(i)) {
			case '(': 
				round++;
				stack.push("(");
				break;
			case ')':
				round--;
				if(round>-1) {
					if(stack.peek().equals("(")) {
						stack.pop();
						stack.push("2");
					}
					else {
						int roundResult =0;
						while(!stack.isEmpty()) {
							if(stack.peek().equals("[")) {
								bw.write("0");
								bw.flush();
								return;
							}
							else if(stack.peek().equals("(")) {
								stack.pop();
								roundResult*=2;
								stack.push(String.valueOf(roundResult));
								break;
							}
							else {
								roundResult += Integer.parseInt(stack.pop());
							}
						}
					}
				}
				break;
			case '[':
				square++;
				stack.push("[");
				break;
			case ']':
				square--;
				if(square>-1) {
					if(stack.peek().equals("[")) {
						stack.pop();
						stack.push("3");
					}
					else {
						int roundResult =0;
						while(!stack.isEmpty()) {
							if(stack.peek().equals("(")) {
								bw.write("0");
								bw.flush();
								return;
							}
							else if(stack.peek().equals("[")) {
								stack.pop();
								roundResult*=3;
								stack.push(String.valueOf(roundResult));
								break;
							}
							else {
								roundResult += Integer.parseInt(stack.pop());
							}
						}
					}
				}
				break;
			}
			if(round<0 || square<0) {
				bw.write("0");
				bw.flush();
			}
		}
		if(round!=0 || square!=0) {
			bw.write("0");
			bw.flush();
		}
		int output=0;
		while(!stack.isEmpty()) {
			output+=Integer.parseInt(stack.pop());
		}
		bw.write(String.valueOf(output));
		bw.flush();
	}
}
