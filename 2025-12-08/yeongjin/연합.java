import java.io.*;
import java.util.*;
class Main {
	static int[] parent; // 맨 처음의 노드 : 부모노드
		
	static int find(int x){ // 합친 노드를 찾을 때까지 재귀
		if (parent[x] == x) return x;  
	    return parent[x] = find(parent[x]); 
	}

	static void union(int a, int b){
		int rootA = find(a);
	    int rootB = find(b);
	    if (rootA != rootB) { // 합친 노드를 찾아 다르면 노드를 합침
		    parent[rootB] = rootA;
	    }
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

		// 부모 노드 init
		parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }
		// 다리 정보 init
		boolean [][] hasBridge = new boolean[N + 1][N + 1]; 
		for(int i = 0; i < M; i++){  
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			hasBridge[s][e] = true;
		}
		// 양방향 연결만 Union
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (hasBridge[i][j] && hasBridge[j][i]) {
                    union(i, j);
                }
            }
        }
		
		Set<Integer> roots = new HashSet<>();
		for (int i = 1; i <= N; i++) {
            roots.add(find(i));
        }
		System.out.println(roots.size());
	}
}