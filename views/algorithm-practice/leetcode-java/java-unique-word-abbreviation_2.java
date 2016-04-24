public class ValidWordAbbr {
    private Map<String, String> map = new HashMap<>();

    public ValidWordAbbr(String[] dictionary) {
        for (String word : dictionary) {
            String key = getAbbreviation(word);
            if (key != null) {
                if (map.containsKey(key)) {
                    map.put(key, "*"); //Invalidate input
                }
                else {
                    map.put(key, word);
                }
            }
        }
    }

    public boolean isUnique(String word) {
        String key = getAbbreviation(word);
        return !map.containsKey(key) || map.get(key).equals(word);
    }

    private String getAbbreviation(String s) {
        int l = s.length();
        if (l <= 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0)).append(l - 2).append(s.charAt(l - 1));
        return sb.toString();
    }
}