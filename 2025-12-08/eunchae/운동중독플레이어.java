import java.io.*;
import java.util.*;
class 운동중독플레이어 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		1. double로 문자열 변환
		2. double로 식 계산
		3. int로 형변환 후 출력

		*/
        StringTokenizer st = new StringTokenizer(br.readLine());

        double W = (double)Integer.parseInt(st.nextToken());
        double R = (double)Integer.parseInt(st.nextToken());

        double oneRM = W * (1 + R/30);

        int result = (int)oneRM;
        System.out.println(result);
    }
}