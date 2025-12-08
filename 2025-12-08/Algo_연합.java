import java.io.*;
import java.util.*;

class Algo_연합 {
    static boolean[] visited;
    static Map<Integer, Set<Integer>> dir;
    static Map<Integer, Set<Integer>> biDir;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        dir = new HashMap<>();
        biDir = new HashMap<>();

        // 일단 점들마다 Set을 만들어줌
        for (int i=1; i<=n; i++) {
            dir.put(i, new HashSet<>());
            biDir.put(i, new HashSet<>());
        }

        // 입력
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            dir.get(a).add(b);
        }

        for(int a=1; a<=n; a++) {
            for(int b: dir.get(a)) {
                if(dir.get(b).contains(a)) { // 양방향일 때에 저장해둠
                    biDir.get(a).add(b);
                    biDir.get(b).add(a);
                }
            }
        }

        visited = new boolean[n + 1];
        int count = 0;

        for(int i=1; i<=n; i++) {
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
	}

    static void dfs(int node) {
        visited[node] = true;
        for(int next: biDir.get(node)) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}