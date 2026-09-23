// Last updated: 9/23/2026, 9:24:02 AM
class Solution {
    public int scoreOfString(String s) {
        int amount = 0;
        int length = s.length() - 1;

        for(int i = 0; i < length; i++){
            int calc = (int)s.charAt(i) - (int)s.charAt(i + 1);

            if(calc < 0){
                calc *= -1;
            }


            amount = amount + calc;
        }




        return amount;
    }
}