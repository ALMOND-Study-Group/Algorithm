import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long totalShots = 0;
        for (int i = 1; i <= N; i++) {
            long H = Long.parseLong(st.nextToken());
			totalShots += ( H / 10) * 4;
			H %= 10;
			while(0 < H && H < 10){
				totalShots++;
				int damage = (int)((totalShots - 1) % 4) + 1; //[1,2,3,4]
				H -= damage;
			}
        }
        System.out.println(totalShots);
    }
}