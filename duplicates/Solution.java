import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class Solution{
    public List<Integer> findDuplicates(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int num : nums) {
            if(!seen.contains(num))
                seen.add(num);
            else
                duplicates.add(num);
        }
        return new ArrayList<>(duplicates);
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3,2, 4,3, 5};
        int[] nums2 = {1, 1,1,2};
        int[] nums3 = {1, 2, 3};
        System.out.println(sol.findDuplicates(nums1));
        System.out.println(sol.findDuplicates(nums2));
        System.out.println(sol.findDuplicates(nums3));
    }
}