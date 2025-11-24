package silver.s5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] canvas = new boolean[100][100];
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int r = y; r < y + 10; r++) {
                for (int c = x; c < x + 10; c++) {
                    canvas[r][c] = true;
                }
            }
        }

        int totalArea = 0;

        for (int r = 0; r < 100; r++) {
            for (int c = 0; c < 100; c++) {
                if (canvas[r][c]) {
                    totalArea++;
                }
            }
        }

        System.out.println(totalArea);

        br.close();
    }
}
