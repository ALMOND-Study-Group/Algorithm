import java.util.Scanner;

public class BOJ_2563_색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean [][] map = new boolean[101][101];
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int a=x; a<x+10; a++) {
				for(int b=y; b<y+10; b++) {
					map[a][b] = true;
				}
			}
		}
		
		int cnt = 0;
		
		for(int a=1; a<101; a++) {
			for(int b=1; b<101; b++) {
				if(map[a][b] == true) cnt++;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}