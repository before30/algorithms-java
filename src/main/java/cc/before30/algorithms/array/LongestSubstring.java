package cc.before30.algorithms.array;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * User: before30 
 * Date: 2017. 5. 15.
 * Time: PM 12:24
 */

/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/#/description
3. Longest Substring Without Repeating Characters

Given a string, find the length of the longest substring without repeating characters.

Examples:
 Given "abcabcbb", the answer is "abc", which the length is 3
 Given "bbbbb", the answer is "b", with the length of 1.
 Given "pwwkew", the answer is "wke", with the length of 3.
 Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

 Given "abdefgabef" -> "bdefga" and "defgab"
 Given "geeksforgeeks" -> "eksforg" and "ksforge"

 substring 내부에서 반복되는 characters가 없어야한다
 */
@Slf4j
public class LongestSubstring {

//
//	public static int lengthOfLongestSubstring(String s) {
//		int max = s.length()>0?1:0;
//		for (int i=0; i<=s.length();i++) {
//			for (int j=i; j<=s.length(); j++) {
//				String subStr = s.substring(i, j);
//				if (subStr.length() > max && isUniq(subStr)) {
////					System.out.println(subStr);
//					max = Math.max(max, subStr.length());
//				}
//			}
//		}
//
//		return max;
//	}
//
//	public static boolean isUniq(String s) {
//		HashMap<Character, Integer> map = new HashMap<>();
//		for (int i=0; i<s.length(); i++) {
//			if (map.get(s.charAt(i)) != null) {
//				return false;
//			} else {
//				map.put(s.charAt(i), 1);
//			}
//		}
//		return true;
//	}

	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<>();

		int n = s.length();
		int i = 0, j =0;
		int max = 0;

		while (i < n && j < n) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				max = Math.max(max, j - i);
			} else {
				set.remove(s.charAt(i));
				i++;
			}
		}

		return max;
	}
	public static void main(String[] args) {
		log.info("{}", lengthOfLongestSubstring(""));
		log.info("{}", lengthOfLongestSubstring("c"));
		log.info("{}", lengthOfLongestSubstring("au"));
		log.info("{}", lengthOfLongestSubstring("abcabcbb"));
		log.info("{}", lengthOfLongestSubstring("bbbbb"));
		log.info("{}", lengthOfLongestSubstring("pwwkew"));
		log.info("{}", lengthOfLongestSubstring("abdefgabef"));
		log.info("{}", lengthOfLongestSubstring("geeksforgeeks"));
		log.info("{}", lengthOfLongestSubstring("kdkzcvaykjtcnuljmzkzaryocauolcavimumjxmuggyvaleokqpljqblq"));

	}
}
