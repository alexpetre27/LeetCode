import java.util.ArrayList;
import java.util.List;

public class Solution{
    public int[] groupEvenOdd(int[] nums){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int num : nums)
            if(num %2 ==0 )
                even.add(num);
            else
                odd.add(num);
        even.addAll(odd);
        int[] res = new int[even.size()];
        for(int i=0; i<even.size(); i++)            res[i] = even.get(i);
        return res;

    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3,1,2};
        int[] c = {2,4,6};
        System.out.println(sol.groupEvenOdd(a));
        System.out.println(sol.groupEvenOdd(b));
        System.out.println(sol.groupEvenOdd(c));
    }
}