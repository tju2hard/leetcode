package com.tjuwenchao.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.tjuwenchao.leetcode.bean.TreeNode;

public class TreeNodeSolution {

	// 102. Binary Tree Level Order Traversal
	// 层次遍历一颗树
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> retList=new LinkedList<List<Integer>>();
		LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
		if(null!=root){
			queue.addFirst(root);
			while(!queue.isEmpty()){
				int size=queue.size();
				List<Integer> cengList=new ArrayList<Integer>(size);
				for(int i=0;i<size;i++){
					TreeNode temp=queue.poll();
					cengList.add(temp.val);
					if(null!=temp.left) queue.addLast(temp.left);
					if(null!=temp.right) queue.addLast(temp.right);
				}
				retList.add(cengList);
			}
		}
		return retList;
	}
}
