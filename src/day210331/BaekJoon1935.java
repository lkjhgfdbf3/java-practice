package day210331;
import java.io.*;
import java.util.*;

public class BaekJoon1935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		double []a = new double[n];
		Stack<Double> stack = new Stack<Double>();
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextDouble();
		}
		
		for(char ch : str.toCharArray()) {
			if(ch>='A' && ch<='Z') {
				stack.push(a[(int)(ch-'A')]); // 해당 알파벳에 대응하는 수 스택에 쌓기
			}
			else {
				double op2 = stack.pop();
				double op1 = stack.pop();
				if(ch=='+') {
					stack.push(op1+op2);
				}
				else if(ch=='-') {
					stack.push(op1-op2);
				}
				else if(ch=='*') {
					stack.push(op1*op2);
				}
				else if(ch=='/') {
					stack.push(op1/op2);
				}
			}
		}
		System.out.printf("%.2f\n", stack.pop());
	} 
}
