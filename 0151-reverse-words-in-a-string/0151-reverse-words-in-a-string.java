class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        reverse(arr, 0, n - 1);

        int start = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != ' ') {
                if (idx > 0) arr[idx++] = ' ';
                while (i < n && arr[i] != ' ') {
                    arr[idx++] = arr[i++];
                }
            }
        }

        return new String(arr, 0, idx);
    }
    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
