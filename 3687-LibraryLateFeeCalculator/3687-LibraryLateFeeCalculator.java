// Last updated: 9/23/2026, 9:23:49 AM
class Solution {
    public int lateFee(int[] daysLate) {
        int length = daysLate.length;
        int late = 0;

        for(int i = 0; i < length; i++){
            if(daysLate[i] == 1){
                late += daysLate[i];
            }else if(daysLate[i] >= 2 && daysLate[i] <= 5){
                late += (daysLate[i] * 2);
            } else if(daysLate[i] > 5){
                late += (daysLate[i] * 3);
            }
        }
        


        return late;
    }
}