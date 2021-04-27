package day210427;
import java.util.*;

class Edge {
	int from,to;
	Edge(int from, int to) {
		this.from = from;
		this.to = to;
	}
}

public class BaekJoon13023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean [][]a = new boolean[n][n]; //인접행렬
		ArrayList<Integer>[] g = (ArrayList<Integer>[]) new ArrayList[n]; //인접리스트
		ArrayList<Edge> edges = new ArrayList<Edge>(); //간선리스트
		
		for(int i=0; i<n; i++) {
			g[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			edges.add(new Edge(from,to)); //양방향 간선을 모두 저장
			edges.add(new Edge(to,from));
			a[from][to] = a[to][from] =true;
			g[from].add(to); //양방향 간선을 모두 저장
			g[to].add(from);
		}
		
		m*=2; //간선의 개수 2배(양방향)
		for(int i=0; i<m; i++) {
			for(int j=0; j<m; j++) {
				//A->B 간선리스트
				int A = edges.get(i).from;
				int B = edges.get(i).to;
				//C->D 간선리스트
				int C = edges.get(j).from;
				int D = edges.get(j).to;
				if(A == B || A == C || A == D || B == C || B == D || C == D) { //같은 사람이 있는지 검사
					continue;
				}
				//B->C 인접행렬
				if(!a[B][C]) continue; //B->C로 가는 간선이 없는 경우 건너뛰기
				
				//ABCD까지 찾은 경우 D->E 인접리스트
				for(int E : g[D]) {
					if(A == E || B == E || C == E || D == E) {
						continue;
					}
					System.out.println(1);
					System.exit(0);
				}
			}
		}
		System.out.println(0);
	}
}
