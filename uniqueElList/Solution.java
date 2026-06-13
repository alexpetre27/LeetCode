import java.util.*;

public class Solution {
    public List<Integer> uniqueElements(int[] nums){
        HashMap<Integer, Integer> countMap = new HashMap<>();
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1) {
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }
public static void  main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {1,2,3,2,4,3,5};
    int[] nums2 = {1,1,2,2};
    int[] nums3 = {5,3,5,7};
    System.out.println(sol.uniqueElements(nums)); 
    System.out.println(sol.uniqueElements(nums2)); 
    System.out.println(sol.uniqueElements(nums3)); 
}
}
