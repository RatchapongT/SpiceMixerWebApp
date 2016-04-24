public class Solution {
    private final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public String reverseVowels(String s) {
        boolean[] map = new boolean[256];
        for (char c : vowels) map[c] = true;
        int i = 0;
        int j = s.length() - 1;
        char[] word = s.toCharArray();
        while (i < j) {
            while (i < j && !map[word[i]]) i++;
            while (i < j && !map[word[j]]) j--;
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
}