package com.tjuwenchao.leetcode.easy;

/**
 * reverseString1 从左往右一个个倒转
 * reverseString2 2分法，倒转
 * reverseString3 http://www.cnblogs.com/wanlipeng/archive/2011/01/27/1946441.html
 * 				  Character.isLowSurrogate(c2) java存储uicode有一些是两个char存储的
 * 				  Character.isHighSurrogate(c1)
 * reverseString4 最快，好吧，没太懂
 * @author tjuwenchao
 *
 */
public class StringSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String reverseString1(String str){
		StringBuffer ret=new StringBuffer();
		for(int i=str.length()-1;i>=0;i++){
			ret.append(str.charAt(i));
		}
		return ret.toString();
	}
	
	public static String reverseString2(String str){
		char[] chars=str.toCharArray();
		int n=str.length()-1;
		for(int i=(n-1)>>1;i>=0;i--){
			char temp=chars[i];
			chars[i]=chars[n-i];
			chars[n-i]=temp;
		}
		return new String(chars);
	}
	
	public static String reverseString3(String str){
		//
		return new StringBuffer(str).reverse().toString();
	}
	
	public static String reverseString4(String str){
		char[] chars=str.toCharArray();
		int n=str.length()-1;
		for(int i=(n-1)>>1;i>=0;i--){
			chars[i]^=chars[n-i];
			chars[n-i]^=chars[i];
			chars[i]^=chars[n-i];
		}
		return new String(chars);
	}

}
