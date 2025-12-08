import java.io.*;
import java.util.*;
import java.lang.*;

class Algo_재고정리 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>();

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            int value = Integer.parseInt(st.nextToken());

            map.merge(key, value, Integer::sum);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            sb.append(e.getKey()).append(" ").append(e.getValue()).append("\n");
        }

        System.out.print(sb.toString());
	}
}