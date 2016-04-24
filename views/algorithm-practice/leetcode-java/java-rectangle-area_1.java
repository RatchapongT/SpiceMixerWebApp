public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int rectA = (D - B) * (C - A);
        int rectB = (H - F) * (G - E);
        int width = Math.min(C, G) > Math.max(A, E) ? Math.min(C, G) - Math.max(A, E) : 0;
        int height = Math.min(D, H) > Math.max(B, F) ? Math.min(D, H) - Math.max(B, F) : 0;

        return rectA + rectB - width * height;
    }
}