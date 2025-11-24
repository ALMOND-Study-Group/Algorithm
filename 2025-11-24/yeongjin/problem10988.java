import java.io.*;

public class problem10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean isPalindrome = true;
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.print(isPalindrome ? 1 : 0);
    }
}