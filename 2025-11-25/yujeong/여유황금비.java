import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

		int n = Integer.parseInt(br.readLine());
        int count = 0;

		for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            
            long min = Math.min(a, b);
            long max = Math.max(a, b);

            if(min * 160 <= max && min * 163 >= max) { // 부동소수점 고려하기
                count++;
            }
		}

        System.out.println(count);
	}
}