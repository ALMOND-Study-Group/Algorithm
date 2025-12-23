import java.io.*;
import java.util.StringTokenizer;
import java.lang.*;

class Algo_가장가까운점찾기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] dot = new int[n];
        for (int i=0; i<n; i++) {
            dot[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<q; i++) {
            int qd = Integer.parseInt(br.readLine());
            int close = Integer.MAX_VALUE;
            int answer = dot[0];

            for(int d: dot) {
                int compareClose = Math.abs(qd - d);
                if (compareClose < close || compareClose == close && d < answer) {
                    close = compareClose;
                    answer = d;
                }
            }
            
            System.out.println(answer);   
        }
	}
}