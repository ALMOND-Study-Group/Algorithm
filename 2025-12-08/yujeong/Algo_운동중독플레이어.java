import java.io.*;
import java.util.StringTokenizer;

class Algo_운동중독플레이어 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

        double W = Double.parseDouble(st.nextToken());
        double R = Double.parseDouble(st.nextToken());

        double RM = W * (1 + R / 30);

		System.out.println((int)RM);
	}
}