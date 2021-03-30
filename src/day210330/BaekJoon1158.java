package day210330;
import java.io.*;
import java.util.*;

public class BaekJoon1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		for(int i=1; i<=a; i++) {
			queue.offer(i);
		}
		
		for(int i=0; i<a-1; i++) {
			for(int j=0; j<b-1; j++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()+" ,");
		}
		sb.append(queue.poll()+">");
		System.out.println(sb);
	}
}
