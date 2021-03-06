package day210305;
import java.util.Scanner;

public class BackJoon2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int []array = new int[a+1];
		int count=0;
		
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
					array[count]=i;
					count++;
			}	
		}
		System.out.println(array[b-1]);
	}
}