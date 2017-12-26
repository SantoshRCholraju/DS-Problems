package datastructures.trees;

import datastructures.TreeNode;

class MergeTrees {
	TreeNode head = null;
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        TreeNode cur = null;
        
        if(t1 != null && t2 != null) {
            
            TreeNode newNode = new TreeNode(t1.val + t2.val);
            if (head == null) {
                head = newNode;
                cur = head;
            }
             
			cur = newNode; 
            cur.left = mergeTrees(t1.left, t2.left);
            cur.right = mergeTrees(t1.right, t2.right);
            
            return cur;
        }
        
        if(t1 != null) {
            TreeNode newNode = new TreeNode(t1.val);
            if (head == null) {
                head = newNode;
                cur = head;
            }
			
			cur = newNode;
			cur.left = mergeTrees(t1.left, null);
            cur.right = mergeTrees(t1.right, null);
            
            return cur;
        }
        
        if(t2 != null) {
            TreeNode newNode = new TreeNode(t2.val);
            if (head == null) {
                head = newNode;
                cur = head;
            }
			
			cur = newNode;
			cur.left = mergeTrees(null, t2.left);
			cur.right = mergeTrees(null, t2.right);
			
			return cur;
        }
		
		return cur;
    }
}