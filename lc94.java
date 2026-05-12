import java.util.ArrayList;
import java.util.List;
class lc94 {
 public List<Integer> inorderTraversal(TreeNodelc94 root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }
    private void traverse(TreeNodelc94 root, List<Integer> result) {
        if (root == null) {
            return;
        }
        traverse(root.left, result);
        result.add(root.val);
        traverse(root.right, result);
    }
    public static void main(String[] args) {
        lc94 solution = new lc94();
        TreeNodelc94 root = new TreeNodelc94(1);
        root.right = new TreeNodelc94(2);
        root.right.left = new TreeNodelc94(3);
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result); 
    }
}