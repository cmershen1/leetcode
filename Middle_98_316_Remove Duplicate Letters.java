public class Solution {
    public String removeDuplicateLetters(String s) {
        /**
         * First loop: use an array cnt[] to count the number of times
         * appeared for each letter in s.
         * 
         * Second loop (Greedy): use a stack, pop() while (!stack.isEmpty()
         * && (sc = stack.peek()) >= c && cnt[sc] > 0)
         */

        int i, n = s.length();
        int[] cnt = new int[128];
        boolean[] inRes = new boolean[128]; // whether a char is in res[]
        char[] res = s.toCharArray(); // simulate a stack

        for (i = 0; i < n; i++)
            cnt[res[i]]++;

        char c, sc;
        int end = -1;
        // now cnt[c] means the remaining count of the char c
        for (i = 0; i < n; i++) {
            c = res[i];
            if (inRes[c]) {
                cnt[c]--;
                continue;
            }

            while (end >= 0 && (sc = res[end]) >= c && cnt[sc] > 0) {
                end--;
                inRes[sc] = false;
            }

            res[++end] = c;
            cnt[c]--;
            inRes[c] = true;
        }
        return String.valueOf(res).substring(0, end + 1);
    }
}
