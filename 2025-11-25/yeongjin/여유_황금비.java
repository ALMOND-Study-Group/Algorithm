import java.io.*;
import java.util.StringTokenizer;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int result = 0;
		for(int t = 0; t < T;t++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			long A = Long.parseLong(st.nextToken());// int는 약 10^9보다 조금 더 크므로 입력값이 10^13이므로 long(10^18)으로 값을 입력받는다.
			long B = Long.parseLong(st.nextToken());

			// 큰 값을 B에 저장
			if(A > B){
				long temp = A;
				A = B;
				B = temp;
			}
			// 실수오차 대비 정수로 변환하여 계산함 문제에서 제시하는 소숫점 2번재 자리까지이므로 100을 곱함
            // B가 큰 값이므로 B 기준으로 비교
            long scaledMax = B * 100;
            if (A * 160 <= scaledMax && scaledMax <= A * 163) {
                result++;
            }
		}
		System.out.println(result);
	}
}