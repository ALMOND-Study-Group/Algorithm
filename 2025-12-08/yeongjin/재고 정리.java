import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Map<String, Integer> map = new HashMap<>();

		for(int i = 0; i < N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			int A = Integer.parseInt(st.nextToken());
			map.put(S, map.getOrDefault(S, 0) + A);
		}

		List<Map.Entry<String, Integer>> foods = new ArrayList<>(map.entrySet());
		foods.sort(Map.Entry.comparingByKey());

		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String, Integer> food: foods){
			sb.append(food.getKey()).append(" ").
				append(food.getValue()).append("\n");
		}
		System.out.println(sb);
	}
}