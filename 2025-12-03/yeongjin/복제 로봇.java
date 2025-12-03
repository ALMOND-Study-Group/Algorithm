import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//초기 x, y
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
		//웅덩이 셋팅
        int N = Integer.parseInt(br.readLine());
        Set<String> puddles = new HashSet<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());
            puddles.add(px + " " + py);
        }
        int Q = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < Q; i++) {
		    char C = st.nextToken().charAt(0);
		    int nx = x;
			int ny = y;
		    if (C == 'L') nx = x - 1;
		    else if (C == 'R') nx = x + 1;
		    else if (C == 'U') ny = y + 1;
		    else if (C == 'D') ny = y - 1;
		    // 웅덩이 판별
		    if (!puddles.contains(nx + " " + ny)) {
		        x = nx;
		        y = ny;
		    }
		}
        System.out.println(x + " " + y);
    }
}
