package day210126;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BackJoon10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bfr.readLine());
		String str = bfr.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int []array = new int[N];
		int index = 0;
		
		while(st.hasMoreTokens()) {
			 array[index]=Integer.parseInt(st.nextToken());
	        index++;
		}
		Arrays.sort(array);
		System.out.println(array[0]+" "+array[N-1]);
	}
}
