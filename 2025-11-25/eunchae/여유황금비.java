import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Long A = Long.parseLong(st.nextToken());
            Long B = Long.parseLong(st.nextToken());

            Long minNum = Math.min(A, B);
            Long maxNum = Math.max(A, B);

            boolean minCondition = maxNum >= (minNum * 1.6);
            boolean maxCondition = maxNum <= (minNum * 1.63);

            if (minCondition && maxCondition) {
                count++;
            }
        }

        System.out.println(count);
        br.close();

    }
}
