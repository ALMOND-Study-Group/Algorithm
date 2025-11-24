import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /**
         * 1은 0배열로 따지면 0번 인덱스, 2초
         * 2 는 abc로 총 3개, 3초 1번인덱스
         * 3 은 def로 총 3개 4초
         *
         * */

        int count = 0;

        //e.g. UNUCIC 868242, 6글자
        //char로 바꾸어서 아스키 코드로 비교

        for(int i = 0 ; i < str.length() ; i++) {

            switch(str.charAt(i)) {
                case 'A' : case 'B': case 'C' :
                    count += 3;
                    break;

                case 'D' : case 'E': case 'F' :
                    count += 4;
                    break;

                case 'G' : case 'H': case 'I' :
                    count += 5;
                    break;

                case 'J' : case 'K': case 'L' :
                    count += 6;
                    break;

                case 'M' : case 'N': case 'O' :
                    count += 7;
                    break;

                case 'P' : case 'Q': case 'R' : case 'S' :
                    count += 8;
                    break;

                case 'T' : case 'U': case 'V' :
                    count += 9;
                    break;

                case 'W' : case 'X': case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }
        }
        System.out.println(count);

        br.close();

    }
}
