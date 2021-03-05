package day210305;
import java.io.*;

public class BackJoon9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(bfr.readLine());
		int []array = new int[11];
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=number; i++) {
			int testcase = Integer.parseInt(bfr.readLine());
			sb.append(testcase).append("\n");
			
			for(int k=1; k<=testcase; k++) {
			if(k==1) array[k]=1;
			else if(k==2) array[k]=2;
			else if(k==3) array[k]=4;
			else array[k]=array[k-3]+array[k-2]+array[k-1];
		    }
			System.out.println(sb);
			System.out.println(array[testcase]);
		}
	}
}
