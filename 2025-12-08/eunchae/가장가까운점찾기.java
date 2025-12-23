import java.io.*;
import java.util.*;
class 가장가까운점찾기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        long[] X = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            X[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(X);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Q; i++) {
            long P = Long.parseLong(br.readLine());
            int index = Arrays.binarySearch(X, P);
            long resultX;

            if (index >= 0) {
                resultX = X[index];
            } else {
                int insertionPoint = -(index + 1);

                long candidate1 = 0;
                long candidate2 = 0;
                long dist1 = Long.MAX_VALUE;
                long dist2 = Long.MAX_VALUE;

                if (insertionPoint > 0) {
                    candidate1 = X[insertionPoint - 1];
                    dist1 = P - candidate1;
                }

                if (insertionPoint < N) {
                    candidate2 = X[insertionPoint];
                    dist2 = candidate2 - P;
                }

                if (dist1 < dist2) {
                    resultX = candidate1;
                } else if (dist2 < dist1) {
                    resultX = candidate2;
                } else {
                    resultX = candidate1;
                }
            }
            sb.append(resultX).append("\n");
        }
        System.out.print(sb.toString());
    }
}