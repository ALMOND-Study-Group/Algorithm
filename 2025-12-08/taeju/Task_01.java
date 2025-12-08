import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 가장 가까운 점 찾기
 *
 */
public class Task_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //첫줄 입력, 점의 개수(N), 질문개수(Q)
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()); //둘째 줄 각점의 좌표

        TreeSet<Integer> point = new TreeSet<>(); //메서드 이용하기
        for (int i = 0; i < N; i++) {
            point.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < Q; i++) { //Q개의 P를 입력받는다.
            int P = Integer.parseInt(br.readLine()); //P, 이걸로 점들의 좌표들과 가까운곳을 자리를 잡는다.
            //그럼 절대값으로 길이를 찾아서 넣어본다.

            Integer leftPoint = point.floor(P); // P보다 작거나 같은 가장 큰 점
            Integer rightPoint = point.ceiling(P); //P보다 크거나 같은 가장 작은 점

            long distanceLeft = (leftPoint != null) ? Math.abs((long) leftPoint - P) : Long.MAX_VALUE;
            long distanceRight = (rightPoint != null) ? Math.abs((long) rightPoint - P) : Long.MAX_VALUE;
            //초기값 Long.MAX_VALUE으로 설정하면 어떤값도 이것보다 작으니 작은 값으로 만들수가있음.

            //점에 가장 가까운 과표를 담기위한 변수
            int nearestPoint;

            if (distanceLeft > distanceRight) {
                nearestPoint = rightPoint;

            } else if (distanceLeft < distanceRight) {
                nearestPoint = leftPoint;

            } else { //둘다 같은값이면 그중에서 제일 작은값
                nearestPoint = leftPoint;
            }
            sb.append(nearestPoint).append("\n");
        }

        System.out.println(sb);

    }
}
