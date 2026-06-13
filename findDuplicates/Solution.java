
import java.util.ArrayList;
import java.util.List;

public class Solution{
  public List<Integer> findDuplicate(int[] nums) {
    List<Integer> seen = new ArrayList<>();
    List<Integer> result = new ArrayList<>();

    for (int n : nums) {
        if (seen.contains(n) && !result.contains(n))
            result.add(n);
        else
            seen.add(n);
    }
    return result;
}
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3,  2, 3, 4, 5};
        int[] nums2 = {1,1,1,2};
        int[] nums3 = {1, 2, 3};
        System.out.println(sol.findDuplicate(nums));
        System.out.println(sol.findDuplicate(nums2));
        System.out.println(sol.findDuplicate(nums3));
    }

}