import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//여유 황금비 문제
public class Gold {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 t입력 받기
        /**
         * min*1.6 <= max <= max*1.63 ? true : false
         * */

        StringTokenizer st;
        int count = 0; //카운터


        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken()); //long은 8바이트
            long y = Long.parseLong(st.nextToken());

            //큰값 자동비교
            long min = Math.min(x, y);
            long max = Math.max(x, y);

            double MIN = min*1.6;
            double MAX = min*1.63; //더블도 8바이트

            System.out.println(min);
            System.out.println(max);
            System.out.println(MIN);
            System.out.println(MAX);

            if (MIN <= max && max <= MAX){ //더블 형변환
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
