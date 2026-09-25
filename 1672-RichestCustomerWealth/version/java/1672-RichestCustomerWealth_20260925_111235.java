// Last updated: 9/25/2026, 11:12:35 AM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int wealthy = 0;
4
5        for(int i = 0; i < accounts.length; i++){
6            int tempCounter = 0;
7            for(int j = 0; j < accounts[i].length; j++){
8                tempCounter += accounts[i][j];
9            }
10            if(tempCounter > wealthy){
11                wealthy = tempCounter;
12            }
13        }
14        
15
16        return wealthy;
17    }
18}