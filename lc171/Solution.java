class Solution {
    public int titleToNumber(String columnTitle) {
        StringBuilder sb = new StringBuilder(columnTitle);
        int result = 0;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}