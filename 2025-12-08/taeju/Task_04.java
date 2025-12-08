import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 운동 중독 플레이어
 * */
public class Task_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int RM = (int)(W * (1 + R / 30.0)); // 소수를 곱해서 double, type 변환

        System.out.println(RM);

    }
}
/*
*  (int)1RM = W *( 1+ 30분의 R)
* 1 SET = 무게(W), 반복횟수(R)
* */