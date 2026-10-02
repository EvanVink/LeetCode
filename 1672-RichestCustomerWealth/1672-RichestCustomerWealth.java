// Last updated: 10/2/2026, 11:15:55 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealthy = 0;

        for(int i = 0; i < accounts.length; i++){
            int tempCounter = 0;
            for(int j = 0; j < accounts[i].length; j++){
                tempCounter += accounts[i][j];
            }
            if(tempCounter > wealthy){
                wealthy = tempCounter;
            }
        }
        

        return wealthy;
    }
}