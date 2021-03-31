package day210331;
import java.io.*;
import java.util.*;

public class BaekJoon17298 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // 4
		int []a = new int[num]; // 3 5 2 7
		int []ans = new int[num]; // 오큰수
		String []temp = br.readLine().split(" ");
		
		for(int i=0; i<num; i++) {
			a[i] = Integer.parseInt(temp[i]);
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		for(int i=0; i<num; i++) {
			if(stack.isEmpty()) {
				stack.push(i); // a배열의 인덱스를 스택에 저장
			}
			while(!stack.isEmpty() && a[stack.peek()]<a[i]) { 
				ans[stack.pop()]=a[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			ans[stack.pop()]=-1;
		}
		
		for(int i=0; i<num; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
