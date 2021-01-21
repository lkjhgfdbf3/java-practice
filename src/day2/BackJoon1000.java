package day2;
import java.io.*;
import java.util.StringTokenizer;

public class BackJoon1000 {
	public static void main(String[] args) throws IOException{
		InputStream inputstream = System.in;
		InputStreamReader isr = new InputStreamReader(inputstream);
		BufferedReader bfr = new BufferedReader(isr);
		
		String str = bfr.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
	}
}
