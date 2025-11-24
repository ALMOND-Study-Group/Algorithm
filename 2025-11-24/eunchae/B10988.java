package bronze.b3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int isPalindrome = 1;
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = 0;
                break;
            }

            left++;
            right--;
        }

        System.out.println(isPalindrome);

        br.close();
    }
}