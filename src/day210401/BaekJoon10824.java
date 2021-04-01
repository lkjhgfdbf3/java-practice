package day210401;
import java.io.*;

public class BaekJoon10824 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String[] input = br.readLine().split(" ");
		Long num1 = Long.parseLong(input[0]+input[1]);
		Long num2 = Long.parseLong(input[2]+input[3]);
		
		System.out.println(num1+num2);
	}
}
