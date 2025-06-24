/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list1 = new ArrayList<>();
        if(root == null) return list1;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            List<Integer> list2 = new ArrayList<>();
            int size = qu.size();
            for(int i=0;i<size;i++){
                TreeNode current = qu.poll();
                list2.add(current.val);
                if(current.left!= null) qu.add(current.left);
                if(current.right!= null) qu.add(current.right);
            }
            list1.add(list2);
        }
        return list1;
    }
}