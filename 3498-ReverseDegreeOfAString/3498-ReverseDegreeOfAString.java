// Last updated: 9/23/2026, 9:23:52 AM
class Solution {
    public int reverseDegree(String s) {
        int amount = 0;
        int length = s.length();

        for (int i = 0; i < length; i++){
            int c = (int)(s.charAt(i)) - 123;
            amount = amount + (c * -(i + 1));
        }

        

        return amount;
    }
}