package day210205;
import java.util.Scanner;
import java.util.ArrayList;

public class BackJoon11022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		
		while(scanner.hasNextLine()) {
			String st = scanner.nextLine();	
			if(st==null || st.isEmpty()) {
				break;
			}
			al.add(st);
		}
		scanner.close();
		for(int i=0; i<=al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
