package day210311;
import java.io.*;
import java.util.StringTokenizer;

public class BackJoon1806 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		long S = Long.parseLong(st.nextToken());
		int []arr = new int[N];
		
		for(int i=0; i<=(N-1); i++) {
			int number = Integer.parseInt(st2.nextToken()); 
			arr[i]=number;
		}
		
		int ans=100001; int sum=0;
		int firstPointer=0; int secondPointer=0;
		
		while(true) {
			if(sum<=S) {
				secondPointer++;
				sum+=arr[secondPointer];
			}
			else if(secondPointer==(N-1)) break;
			else {
				firstPointer++;
				sum-=arr[firstPointer];
				ans=Math.min(ans, secondPointer-firstPointer);
			}
		}
		if(ans==100001) {
			bw.write(0+"\n");
		}
		else {
			bw.write(ans+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
