import java.io.*;

public class problem2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];
        int result = 0;
        
        for (int i = 0; i < input; i++) {
            String[] position = br.readLine().split(" ");
            int x = Integer.parseInt(position[0]);
            int y = Integer.parseInt(position[1]);
            // 10 * 10 크기의 정사각형 색종이 붙이기
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = true;
                }
            }
        }
        // 영역 100 * 100  전체를 탐색하여 검은 영역의 넓이를 구함
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == true) {
                    result++;
                }
            }
        }
        System.out.print(result);
    }
}