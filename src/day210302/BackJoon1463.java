package day210302;
import java.io.*;

public class BackJoon1463 {
	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	
		int value = Integer.parseInt(bfr.readLine());
		System.out.println(recur(value,0));
	}
	
	static int recur(int value, int count) {
		if(value<2) {
			return count;
		}
		return Math.min(recur(value/2,count+1+(value%2)),recur(value/3,count+1+(value%3)));
	}
}
	
