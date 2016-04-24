public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] versions1 = version1.split("\\.");
        String[] versions2 = version2.split("\\.");
        int i = 0;
        while (i < versions1.length || i < versions2.length) {
            int v1 = (i < versions1.length) ? Integer.parseInt(versions1[i]) : 0;
            int v2 = (i < versions2.length) ? Integer.parseInt(versions2[i]) : 0;
            if (v2 < v1) {
                return 1;
            }
            if (v1 < v2) {
                return -1;
            }
            i++;
        }
        return 0;
    }
}