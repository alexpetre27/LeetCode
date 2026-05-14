import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new java.util.ArrayList<>();
        for (int i = 0; i <= rowIndex; ++i) {
            res.add(1);
            for(int j = i -1; j > 0; --j){
                res.set(j, res.get(j) + res.get(j - 1));
            }
    }
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow(4));
    }
}