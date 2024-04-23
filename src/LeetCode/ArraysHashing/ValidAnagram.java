package LeetCode.ArraysHashing;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();

        for (char letter : s.toCharArray()) {
            if (maps.containsKey(letter)) {
                maps.put(letter, maps.get(letter) + 1);
            } else {
                maps.put(letter, 1);
            }
        }
        for (char letter : t.toCharArray()) {
            if (mapt.containsKey(letter)) {
                mapt.put(letter, mapt.get(letter) + 1);
            } else {
                mapt.put(letter, 1);
            }
        }
        boolean result = maps.equals(mapt);
        return result;
    }
    //make it easy
//    public boolean isAnagram(String s, String t) {
//        char[] sChars = s.toCharArray();
//        char[] tChars = t.toCharArray();
//
//        Arrays.sort(sChars);
//        Arrays.sort(tChars);
//
//        return Arrays.equals(sChars, tChars);
//    }


}
