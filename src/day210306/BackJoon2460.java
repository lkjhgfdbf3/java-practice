package day210306;
import java.io.*;
import java.util.StringTokenizer;

public class BackJoon2460 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader((System.in)));
		int max = 0;
		int storage = 0;
		int []array = new int[11];
		array[0]=0;
		
		for(int i=1; i<=10; i++) {
			String str = new String(bfr.readLine());
			StringTokenizer st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			max = array[i-1]+b-a;
			array[i]=max;
			if(storage<=array[i]) {
				storage=array[i];
			}
		}
		System.out.println(storage);
	}
}
