package Anagram;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean isAnagram(String str1, String str2) {
        
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("hello", "world"));
        System.out.println(isAnagram("Dormitory", "Dirty room"));
    }
}
