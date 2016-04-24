public class ValidWordAbbr {
    Map<String, Set<String>> map;

    public ValidWordAbbr(String[] dictionary) {
        map = new HashMap<>();
        for (String word : dictionary) {
            String abbreviation = getAbbreviation(word);
            if (abbreviation != null) {
                if (!map.containsKey(abbreviation)) {
                    map.put(abbreviation, new HashSet<>());
                }
                map.get(abbreviation).add(word);
            }
        }
    }

    public boolean isUnique(String word) {
        String abbreviation = getAbbreviation(word);
        if (!map.containsKey(abbreviation)) return true;
        return map.get(abbreviation).size() == 1 && map.get(abbreviation).contains(word);
    }

    public String getAbbreviation(String s) {
        int l = s.length();
        if (l <= 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0)).append(l - 2).append(s.charAt(l - 1));
        return sb.toString();
    }
}


// Your ValidWordAbbr object will be instantiated and called as such:
// ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
// vwa.isUnique("Word");
// vwa.isUnique("anotherWord");