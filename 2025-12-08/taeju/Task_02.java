import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;
/**
 * 재고 정리문제
 * */


public class Task_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        StringTokenizer st;
        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(reader.readLine());
            String key = st.nextToken(); //key값
            int value = Integer.parseInt(st.nextToken()); //밸류값

            if (map.containsKey(key)) { //키가 있으면 값을 더하기
                map.put(key, map.get(key) + value);
            } else  { //없으면 그대로 입력
                map.put(key, value);
            }
        }
        map.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
