import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            char[] arr = s.toCharArray();
  
            int[] freq = new int[26];
            for (char c : arr) {
                freq[c - 'a']++;
            }

            int maxFreq = 0;
            char target = 'a';
            for (int i = 0; i < 26; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    target = (char) (i + 'a');
                }
            }

            boolean changed = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] != target) {
                    arr[i] = target;
                    changed = true;
                    break;
                }
            }

            System.out.println(new String(arr));
        }

        sc.close();
    }
}
