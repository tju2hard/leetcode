package com.tjuwenchao.leetcode.easy;

import com.tjuwenchao.leetcode.VersionControl;

public class BinarySearch extends VersionControl {
	
	public static void main(String[] args){
		System.out.println(new BinarySearch().firstBadVersion(2));
	}
	
	public int firstBadVersion(int length){
		
		int start=1;
		int end=length;
		int mid=0;
		while(start<end){
			mid=start+(end-start)/2;
			if(isBadVersion(mid)){
				start=mid+1;
			}else{
				end=mid;
			}
		}
		
		return start;
	}

}
