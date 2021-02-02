package day210203;
import java.util.Scanner;


public class BackJoon2562 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []arrays = { scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
		int max=0;
		int count=0;
		int index=0;
		
		for(int value : arrays) {
			count++;
			
			if(value>max) {
				max=value;
				index=count;
			}
		}
		System.out.println(max+"\n"+index);
	}
}
