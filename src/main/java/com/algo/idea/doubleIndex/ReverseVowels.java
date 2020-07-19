package com.algo.idea.doubleIndex;

import java.util.HashMap;

/**
 *
 * 反转字符串中的元音字符
 *  元音字符：aeiou
 *
 * */
public class ReverseVowels {
    public static void main(String[] args) {
        String str = "leetcode";
    }

    // 使用双指针来做
    public static String getReverseVowels(String str){
        HashMap<String, Boolean> hashmap = new HashMap<String, Boolean>(5);
        hashmap.put("a",true);
        hashmap.put("e",true);
        hashmap.put("i",true);
        hashmap.put("o",true);
        hashmap.put("u",true);
        int length = str.length();
        int i = 0;
        int j = length - 1;
        char[] result = new char[length];
        while (i < j){
            char head = str.charAt(i);
            char tail = str.charAt(j);
            if(!hashmap.containsKey(head)) { // 当满足条件的时候，指针是不动的
                result[i]=str.charAt(i);
                i++;
            }
            if(!hashmap.containsKey(tail)){
                result[j]= str.charAt(j);
                j++;
            }
            if(hashmap.containsKey(head) && hashmap.containsKey(tail)){
                result[i++] = tail;
                result[j--] = head;
            }
        }
        return  new String(result);
    }

}
