import java.util.*;

class Solution {
    public int digits(int n) {
        int cnt = 0;

        while (n > 0) {
            cnt++;
            n /= 10;
        }

        return cnt;
    }

    public int compress(char[] chars) {
        int res = 0;

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            int count = 0;

            while (i + 1 < chars.length && ch == chars[i + 1]) {
                i++;
                count++;
            }

            i++;

            res++;

            int totalD = digits(count) ;

            res += totalD > 1 ? totalD : 0;

        }

        return res;
    }
}