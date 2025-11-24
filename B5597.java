package bronze.b3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class B5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 제출 여부 기록
        boolean[] isSubmitted = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int studentNum = Integer.parseInt(br.readLine());
            isSubmitted[studentNum] = true;
        }

        // 미제출 학생 찾기
        for (int i = 1; i <= 30; i++) {
            if (!isSubmitted[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.print(sb);
        br.close();
    }
}