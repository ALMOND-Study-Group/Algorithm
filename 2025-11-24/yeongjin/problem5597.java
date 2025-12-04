import java.io.*;

public class problem5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1부터 30까지 학생의 제출 여부를 추적하는 배열
        // n(1 ≤ n ≤ 30) 입력 범위가 30까지 있으므로 31개의 boolean 배열을 생성
        boolean[] submitted = new boolean[31]; // 인덱스 1~30 사용

        // 28명의 제출자 출석번호 입력받기
        for (int i = 0; i < 28; i++) {
            int studentNumber = Integer.parseInt(br.readLine());
            submitted[studentNumber] = true;
        }

        // 제출하지 않은 학생 찾기
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                System.out.println(i);
            }
        }
    }
}