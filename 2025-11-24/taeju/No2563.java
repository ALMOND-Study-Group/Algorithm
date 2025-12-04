import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        /**
        //크기가 10 * 10 인 정사각형, 즉 100칸을 가지고 있다.
         배열을 이용할까? 그럼 해당하는 하는 부위는 true로 하고 그것만 카운트 하면되잖아?
         심지어 이미 가로세로가 각각 100이라고 하니깐 2중 배열로 하면 되겠는데?
        // 첫줄에는 색종이의 수
        // 첫번째 자연수는 x축, 그다음은 y축, 그것들의 꼭짓점
        */

        boolean [][] white = new boolean[100][100]; //가로세로 각각 100인 흰색 도화지

        int num = Integer.parseInt(br.readLine()); //색종이의 수

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            int X = Integer.parseInt(st.nextToken()); //3+10
            int Y = Integer.parseInt(st.nextToken()); //7+10;

            for (int r = X; r < X + 10; r++) {
                for (int c = Y; c < Y + 10; c++) {
                    white[r][c] = true; // 겹쳐도 상관없음! 어차피 true면 검은색
                }
            }
        }

        int count = 0; // 면적 출력
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (white[i][j]) count++;//true여야지 이 실행문이 실행됨
            }
        }

        System.out.println(count);
        br.close();

    }
}
