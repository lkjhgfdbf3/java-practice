package day210203;
import java.util.Scanner;

public class BackJoon2577 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int value = (scanner.nextInt()*scanner.nextInt()*scanner.nextInt());
			String str = Integer.toString(value);
			int count = 0;
			
			for(int i=0; i<10; i++) {
				count++;
				
				for(int j=0; j<str.length(); j++) {
					if((str.charAt(j)-'0')==i)
						System.out.println(count);
				}
			}
			
		}

}
