import java.io.*;
import java.util.*;
class 재고정리 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		1. 전체 개수 N 파악
		2. 음식이름, 음식 개수 해시맵으로
		3. 반복문으로 N개 재고 정리 돌리기
		4. 해시맵 오름차순으로
		5. 결과 출력
		*/
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> inventory = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String foodName = st.nextToken();
            int count = Integer.parseInt(st.nextToken());

            inventory.put(foodName, inventory.getOrDefault(foodName, 0) + count);
        }
        ArrayList<String> foodNames = new ArrayList<>(inventory.keySet());
        Collections.sort(foodNames);

        StringBuilder sb = new StringBuilder();

        for (String name : foodNames) {
            int totalCount = inventory.get(name);

            sb.append(name).append(" ").append(totalCount).append("\n");
        }
        System.out.print(sb.toString());
    }
}
