import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bbang {
    static int N;
    static long[] H;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); //적의 수
        StringTokenizer st = new StringTokenizer(br.readLine()); //공백 제거는 default

        H = new long[N]; //적의 수를 입력받기
        
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0; //총알의 수
        int phase = 0;  // 0:1, 1:2, 2:3, 3:4


        for (int i = 0; i < N; i++) {
            //17
            //1+2+3+4 =10
            long cycle = H[i] / 10; //10의 배수만큼 처리, 총 데미지가 10이니 1~9까지만 처리하면됨. 즉 나머지만 처리하면됨
            count += cycle * 4; //주기 만큼 총알을 4번씩 쐈으니깐
            H[i] -= cycle * 10; // 주기마다 총 10의 데미지를 받으니깐
//            H[i] -= (int)(cycles * 10);


            //첫발부터 쏘면됨 
            while (H[i] > 0) {
                int damage = phase + 1;  // 1,2,3,4
                H[i] -= damage;
                count++;
                phase = (phase + 1) % 4;

/**
                H[i] = H[i] - damage;
                damage = (damage+1) % 4;
                count++;
----------
                H[i] -= ((damage - 1) % 4) + 1; //1~4를 반복
                count++;
                damage++;
 */
            }

        }
        System.out.println(count);
    }
}
/* 시간복잡도를 생각을 안했음 너무 만힝 늘어남
* long[] H = new long[N]; //배열의 적의 H를 넣어줌
        for (int i = 0; i < N; i++) {
            H[i] = Long.parseLong(st.nextToken());
        }
        //무한반복
        while (true){
            count++;
            int damege = (((count-1)%4)+1); //1,2,3,4,1,2 ...
            //적들을 계속 반복해서 맞추어야되니깐 맞출적의 번호

            int idx = ((count-1)%N); // 이러면 0,1,2,3의 반복

            if (H[idx] > 0){
                H[idx] = H[idx] -damege;
                if (H[idx]<0) H[idx] = 0; //음수방지
            }

            //다죽었는지 확인하기
            boolean alldead = true;
            for(long h : H){
                if (h > 0){
                    alldead = false;
                    break;
                }
            }
            //탈출문
            if (alldead) {
                System.out.println(count);
                return;
            }
        }
* */
/*
        for (int i = 0; i < N ; i++) {
        if(arr[i] > 0){
            arr[i] = arr[i] - (((count-1)%4)+1);
            count++; //이게 여기 있으면 안됨
        }else{
        continue;
        }

        if(i == N - 1){ //다시 반복핳지 결정하기
            int hap =0;
                for(int j = 0; j < N; j++){ //향상된 for문 사용
                    hap+=arr[j];
        }
        if(hap == 0){
        System.out.println(count);
        } else{
              i =0;
        }
        }
        }
        총평 읽기 복잡함. while문으로 고쳐야될듯
*/

/*
N = 적의 수
H는 적의 체력
i는 총의 발사 즉 i는 증가 i++
*/
