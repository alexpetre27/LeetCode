
public class Solution {
public int secondLargest(int[] nums) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : nums) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num < largest) {
            secondLargest = num;
        }
    }

    return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
}
 public static void main(String[] args){
    System.out.println("marcel");
    Solution s = new Solution();
    int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
    System.out.println(s.secondLargest(nums));
 }
}