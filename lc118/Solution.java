import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new java.util.ArrayList<>();
        if(numRows == 0)
            return List.of();
        for(int i = 0; i < numRows; i++) {
            List<Integer> newrows = new java.util.ArrayList<>();
            for(int j = 0; j <= i; j++) 
                if(j == 0 || j == i) 
                    newrows.add(1);
                else 
                    newrows.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                
            
            res.add(newrows);
        }
        return res;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.generate(5));
    }
}