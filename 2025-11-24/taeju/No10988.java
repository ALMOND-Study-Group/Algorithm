import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        boolean valid = true;
        for (int i = 0; i < str.length() / 2; i++) { // 절반으로 쪼개기 홀수면 자동으로 하나 버림됨
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) { //역으로 줄어들기
                valid = false;
                break;  // 불일치 시 조기 종료, 이게 제일 중요 이거 없으면 계속 반복됨
            }
        }
        System.out.println(valid ? 1 : 0); // 숫자로 표현하기 위해섬
    }
}
