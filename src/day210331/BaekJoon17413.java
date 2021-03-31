package day210331;
import java.io.*;
import java.util.*;

public class BaekJoon17413 {
	static void print(BufferedWriter bw, Stack<Character> stack) throws IOException {
		while(!stack.isEmpty()) {
			bw.write(stack.pop());
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean tag = false;
		Stack<Character> stack = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			if(ch=='<') {
				print(bw, stack);
				tag = true; // tag안에 문자을 처리하고 있는지 파악하기 위해서 사용
				bw.write(ch);
			}
			else if(ch=='>') {
				tag = false;
				bw.write(ch);
			}
			else if(tag) {
				bw.write(ch);
			}
			else {
				if(ch==' ') {
					print(bw,stack);
					bw.write(ch);
				}
				else {
					stack.push(ch);
				}
			}
		}
		bw.flush();
	}
}
