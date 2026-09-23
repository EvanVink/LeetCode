// Last updated: 9/23/2026, 9:23:38 AM
class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }

    public static int reverse(int n){

        String s = Integer.toString(n);
        StringBuilder a = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--){
            a.append(s.charAt(i));
        }

        return Integer.parseInt(a + "");
    }
}