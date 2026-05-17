class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String filtered = sb.toString();
        String reversed = sb.reverse().toString();
        return filtered.equals(reversed);       
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String testString = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(testString);     
        System.out.println("Is the string a palindrome? " + result);
}
}