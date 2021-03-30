package day210330;
import java.io.*;
import java.util.*;

public class BaekJoon10828 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = sc.nextInt();
		int[]stack = new int[a];
		int size = 0;
		
		while(a-->0) {
			String cmd = sc.next();
			if(cmd.equals("push")) {
				int num = Integer.parseInt(sc.next());
				stack[size++] = num;
			}
			else if(cmd.equals("top")) {
				if(size==0) {
					bw.write("-1\n");
				}
				else {
					bw.write(stack[size-1]+"\n");
				}
			}
			else if(cmd.equals("size")) {
				bw.write(size);
			}
			else if(cmd.equals("empty")) {
				if(size==0) {
					bw.write("1\n");
				}
				else bw.write("0\n");
			}
			else if(cmd.equals("pop")) {
				if(size==0) {
					bw.write("-1\n");
				}
				else {
					bw.write(stack[size-1]+"\n");
					size -=1;
				}
			}
		}
		bw.flush();
	}
}
