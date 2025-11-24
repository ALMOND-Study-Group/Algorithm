import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int [] arr = new int [31]; //배열 선언
        //boolean으로 해도된다.

        for (int i = 1; i <= 28; i++) {// 배열 크기 중 28번 입력
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i <= 30; i++) {
            if (arr[i] != 1) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
        br.close();

    }
}
