package com.mhuiq.demo.algorithm;

public class BinaryTree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int length = pre.length;
        if (length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        if (length == 1) {
            return root;
        }
        int midRootIndex = 0;
        while (midRootIndex < length) {
            if (in[midRootIndex] == root.val) {
                break;
            }
            midRootIndex ++;
        }
        int[] subPre = new int[midRootIndex];
        int[] subIn = new int[midRootIndex];
        for (int i = 0; i < midRootIndex ; i++) {
            subPre[i] = pre[i+1];
            subIn[i] = in[i];
        }
        root.left = reConstructBinaryTree(subPre, subIn);
        subPre = new int[length - midRootIndex - 1];
        subIn = new int[length - midRootIndex - 1];
        for (int i = midRootIndex + 1, j=0; i < length ; i++, j++) {
            subPre[j] = pre[i];
            subIn[j] = in[i];
        }
        root.right = reConstructBinaryTree(subPre, subIn);
        return root;
    }
}
