package LeetCode.ArraysHashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str:strs){
            char [] chars = str.toCharArray();
            Arrays.sort(chars);
            String word = new String(chars);
            if(!map.containsKey(word)){
                map.put(word, new ArrayList<>());
            }
            map.get(word).add(str);
        }
        return new ArrayList<>(map.values());

    }
}
