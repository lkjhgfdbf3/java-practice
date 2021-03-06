package day210306;
import java.util.Scanner;

public class BackJoon3460 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			int b = sc.nextInt();
			String binary = Integer.toBinaryString(b);
			String binArr[] = binary.split("");
			
			for(int k=binArr.length-1;k>=0; k--) {
				if(binArr[k].equals("1")) System.out.print(binArr.length-k-1+" ");
			}
		}
		
	}
} 
