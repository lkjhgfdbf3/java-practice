package day210307;
import java.util.Scanner;

public class BackJoon10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int []array = new int[a+1];
		array[0]=0;
		array[1]=1;
		
		for(int i=2; i<=a; i++) {
			array[i]=array[i-1]+array[i-2];
		}
		System.out.println(array[a]);
	}
}
