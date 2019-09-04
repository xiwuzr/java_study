package exercise;

public class leet_112 {
}

class Solution112 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    static boolean fla=false;

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            if(sum==0){
                fla=true;
            }
        }
        else
        {
            hasPathSum(root.left,sum-root.val);
            hasPathSum(root.right,sum-root.val);
        }
        return fla;
        //正解

//        public boolean hasPathSum(TreeNode root, int sum) {
//            if (root == null) {
//                return false;
//            }
//            if (root.left == null && root.right == null) {
//                return sum - root.val == 0;
//            }
//            return hasPathSum(root.left, sum - root.val)
//                    || hasPathSum(root.right, sum - root.val);
//        }
    }


}
