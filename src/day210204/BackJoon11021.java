package day210204;
import java.io.*;
import java.util.StringTokenizer;

public class BackJoon11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(bfr.readLine());
		
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		for(int i=1; i<=a; i++) {
			st = new StringTokenizer(bfr.readLine()," ");
			sb.append("case #");
			sb.append(i);
			sb.append(":");
			sb.append((Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken())));
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
