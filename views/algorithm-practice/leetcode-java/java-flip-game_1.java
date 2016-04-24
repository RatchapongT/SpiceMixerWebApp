public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        char[] charArray = s.toCharArray();
        List<String> list = new LinkedList<>();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == '+' && charArray[i - 1] == '+') {
                charArray[i - 1] = '-';
                charArray[i] = '-';
                list.add(new String(charArray));
                charArray[i - 1] = '+';
                charArray[i] = '+';
            }
        }
        return list;
    }
}