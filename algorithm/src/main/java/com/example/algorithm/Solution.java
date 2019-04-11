package com.example.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Description :
 *
 * @author : dd
 */
class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        char[] chars = strs[0].toCharArray();
        int end = help(strs, chars, chars.length - 1);
        if(end==-1){
            return  "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= end; i++){
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    private int help(String[] strs, char[] chars, int end) {
        for (int i = 1; i < strs.length; i++) {
            if(strs[i]==null||"".equals(strs[i])){
                return -1;
            }
            strs[i].indexOf()
            char[] temps = strs[i].toCharArray();
            int length = temps.length-1 > end ? end : temps.length-1;
            int j =0;
            for (; j <= length; j++) {
                if (temps[j] != chars[j]) {
                    end = j-1;
                    break;
                }
                end = j;
            }

        }
        return end;
    }
}

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return maxDepth(root.right) + 1;
        }
        if (root.right == null) {
            return maxDepth(root.left) + 1;
        }
        return Math.min(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        return levelProcess(0, results, root);
    }

    private static List<List<Integer>> levelProcess(int level, List<List<Integer>> results, TreeNode root) {
        if (root == null) {
            return results;
        }
        if (results.size() == level) {
            results.add(0, new ArrayList<>());
        }
        if (root.left != null) {
            levelProcess(level + 1, results, root.left);
        }
        if (root.right != null) {
            levelProcess(level + 1, results, root.right);
        }
        results.get(results.size() - 1 - level).add(root.val);
        return results;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(maxDepth(root));
    }
}
