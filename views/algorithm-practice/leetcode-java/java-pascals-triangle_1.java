public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            result.add(getRow(i));
        }
        return result;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList();
        list.add(1);
        for (int i = 1; i < rowIndex + 1; i++) {
            double digit = list.get(i - 1) * ((double) (rowIndex - i + 1) / i);
            list.add((int) (Math.round(digit)));
        }
        return list;

    }
}