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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        return constructTree(preorder, map, 0, 0, inorder.length-1);
    }
    public TreeNode constructTree(int[] preorder, Map<Integer, Integer> result, int index, int left, int right){
        TreeNode root = new TreeNode(preorder[index]);
        int mid = result.get(preorder[index]);
        if(left<mid){
            root.left = constructTree(preorder, result, index+1, left, mid-1);
        }
        if(right>mid){
            root.right = constructTree(preorder, result, index+mid-left+1, mid+1, right);
        }
        return root;
    }
}