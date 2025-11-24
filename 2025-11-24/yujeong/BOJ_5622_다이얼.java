import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5622_다이얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int time = 0;
        String str = br.readLine();
        char[] arr = str.toCharArray();

        for(char c : arr) {
            time += getTime(c);
        }

        System.out.println(time);
    }
    
    public static int getTime(char c) {
        if(c >= 'A' && c <= 'C') return 3;
        if(c >= 'D' && c <= 'F') return 4;
        if(c >= 'G' && c <= 'I') return 5;
        if(c >= 'J' && c <= 'L') return 6;
        if(c >= 'M' && c <= 'O') return 7;
        if(c >= 'P' && c <= 'S') return 8;
        if(c >= 'T' && c <= 'V') return 9;
        if(c >= 'W' && c <= 'Z') return 10;
        return 0;
    }
}
