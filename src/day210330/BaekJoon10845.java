package day210330;
import java.io.*;
import java.util.*;

public class BaekJoon10845 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int begin = 0;
		int end = 0;
		int []queue = new int[num];
		
		while(num-- > 0) {
			String str = sc.next();
			if(str.equals("push")) {
				int n = sc.nextInt();
				queue[end++]=n;
			}
			else if(str.equals("size")) {
				System.out.println(end-begin);
			}
			else if(str.equals("pop")) {
				if(begin==end) 
					System.out.println("-1");
				else {
					System.out.println(queue[begin]);
					begin+=1;
				}
			}
			else if(str.equals("empty")) {
				if(begin==end) 
					System.out.println("1");
				else
					System.out.println("0");
			}
			else if(str.equals("front")) {
				if(begin==end) 
					System.out.println("-1");
				else
					System.out.println(queue[begin]);
			}
			else if(str.equals("back")) {
				if(begin==end) 
					System.out.println("-1");
				else
					System.out.println(queue[end-1]);
			}
		}
	}
}
