package leetcode;

import java.util.ArrayList;
import java.util.List;

import datastructures.TreeNode;

public class SymmetricTrees {

	public static void main(String[] args) {

		TreeNode ll = new TreeNode(3);
		TreeNode lr = new TreeNode(4);
		
		TreeNode rl = new TreeNode(3);
		TreeNode rr = new TreeNode(4);
		
		TreeNode left = new TreeNode(2);
		left.left = ll;
		left.right = lr;
		
		TreeNode right = new TreeNode(2);
		right.left = rl;
		right.right = rr;
		
		TreeNode root = new TreeNode(1);
		root.left = left;
		root.right = right;
		
		boolean ans = isSymmetric(root);
		System.out.println(ans);

	}
	
	
	public static boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) {
            return true;
        }
        
        if(root.left.val != root.right.val) {
            return false;
        }
            
        List<String> left = new ArrayList<>();
        inorder(root.left, left);
        System.out.println(left.toString());
        List<String> right = new ArrayList<>();
        inorder(root.right, right);
        System.out.println(right.toString());
        
        if(left.equals(right)) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public static void inorder(TreeNode node, List<String> list) {
        
        if(node == null) {
            return;
        }
        inorder(node.left, list);
        list.add(String.valueOf(node.val));
        inorder(node.right, list);
    }

}
