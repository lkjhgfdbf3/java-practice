package day210331;
import java.io.*;
import java.util.*;

public class BaekJoon17299 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // 7
		int a[] = new int[num]; // 1 1 2 3 4 2 1
		int ans[] = new int[num];
		String []temp = br.readLine().split(" ");
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		int count[]=new int[10000001];
		
		for(int i=0; i<num; i++) {
			a[i]=Integer.parseInt(temp[i]);
			count[a[i]]+=1;
		}
		
		for(int i=0; i<num; i++) {
			if(stack.isEmpty()) 	{
				stack.push(i);
			}
			while(!stack.isEmpty() && count[a[stack.peek()]] < count[a[i]]) {
				ans[stack.pop()]=a[i];
			}
			stack.push(i);
		}
		
		while(!stack.empty()) {
			ans[stack.pop()]=-1;
		}
		
		for(int i=0; i<num; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
