class Solution {
    public int primePalindrome(int n) {

        if (n <= 11) {
            int[] a = {2, 3, 5, 7, 11};
            for (int x : a)
                if (x >= n) return x;
        }

        for (int x = 1; x < 100000; x++) {

            String s = String.valueOf(x);
            String rev = new StringBuilder(s).reverse().toString();

            int p = Integer.parseInt(s + rev.substring(1));

            if (p >= n && prime(p))
                return p;
        }

        return -1;
    }

    boolean prime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}