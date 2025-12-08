import java.io.*;
import java.util.*;

class Main {	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        long[] X = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            X[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(X);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < Q; i++) {
            long p = Long.parseLong(br.readLine());
            
            // 이진 탐색으로 p의 위치 찾기
            int idx = Arrays.binarySearch(X, p);
            
            if (idx >= 0) {
                // 정확히 p인 점이 있으면
                sb.append(X[idx]).append('\n');
            } else {
                // p가 없으면 가장 가까운 점 찾기
                idx = -(idx + 1); // 삽입 위치
                
                long result = X[0];
                long minDist = Math.abs(X[0] - p);
                
                // 왼쪽 점 확인
                if (idx > 0) {
                    long dist = Math.abs(X[idx - 1] - p);
                    if (dist < minDist) {
                        minDist = dist;
                        result = X[idx - 1];
                    }
                }
                // 오른쪽 점 확인
                if (idx < N) {
                    long dist = Math.abs(X[idx] - p);
                    if (dist < minDist) {
                        minDist = dist;
                        result = X[idx];
                    }
                }
                sb.append(result).append('\n');
            }
        }       
        System.out.print(sb);
    }
}