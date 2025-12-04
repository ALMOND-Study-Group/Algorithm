import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.awt.Point;

public class Algo_복제로봇 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 로봇 초기 좌표
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(br.readLine());
        Point[] pond = new Point[num];

        for(int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            pond[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int q = Integer.parseInt(br.readLine());
        String[] control = new String[q];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<q; i++) {
            control[i] = st.nextToken();
        }

        // 구현
        for(String c: control) {
             // 이미 움직인 좌표 가져옴
            Point point = direction(c, n, m);

            // 웅덩이 있는 지 확인할 flag
            boolean flag = false;

            // 이미 가져온 좌표와 웅덩이 비교 시작
            for(Point p: pond) {
                if(point.equals(p)) { // 웅덩이랑 좌표랑 같은 거 만나면 더이상의 웅덩이 좌표를 돌 필요가 없다
                    flag = true;
                    continue;
                }
            }

            if(!flag) { // 웅덩이 좌표를 끝까지 안 만나고 나와야 비로소 n, m 저장
                n = point.x;
                m = point.y;
            }
        }

        System.out.println(n + " " + m);
	}

    public static Point direction(String c, int n, int m) {
        switch (c) {
            case "L":
                return new Point(n - 1, m);
            case "R":
                return new Point(n + 1, m);
            case "U":
                return new Point(n, m + 1);
            case "D":
                return new Point(n, m - 1);
            default:
                return new Point(n, m);
        }
    }
}