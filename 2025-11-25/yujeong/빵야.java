import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        long answer = 0;
		
		int[] arr = Arrays.stream(br.readLine().split(" "))
						  .mapToInt(Integer::parseInt)
						  .toArray();
		
		int index = 0;
		
		for(int i=0; i<n; i++){
			// 1) 먼저 4-사이클 단위로 처리, 한 사이클 합 = 1+2+3+4 = 10
			long cycles = arr[i] / 10; // 몇 번 4개 단위로 때릴 수 있는 지 계산
			answer += cycles * 4; // 때린 만큼 answer에 더하기
			arr[i] -= cycles * 10; // 10 이하의 남은 체력, 사이클이 0일 수도 있음 
			
			// 2) 남은 값만 while로 처리 (최대 9이므로 빠름)
			while(arr[i] > 0) {
				long h = (index % 4) + 1;
				arr[i] -= h;
				answer++;
				index++;
			}
		}

        System.out.println(answer);
	}
}