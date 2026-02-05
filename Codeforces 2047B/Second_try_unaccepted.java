import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();

            // count frequency
            int[] freq = new int[26];
            for (char c : arr)
                freq[c - 'a']++;

            // find most frequent character
            int maxFreq = 0;
            char maxChar = arr[0];

            for (int i = 0; i < 26; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = (char)(i + 'a');
                }
            }

            // find index j where s[j] == maxChar
            int j = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == maxChar) {
                    j = i;
                    break;
                }
            }

            // find index i where s[i] != maxChar
            for (int i = 0; i < n; i++) {
                if (arr[i] != maxChar) {
                    arr[i] = arr[j];   // perform operation
                    break;
                }
            }

            System.out.println(new String(arr));
        }
    }
}
