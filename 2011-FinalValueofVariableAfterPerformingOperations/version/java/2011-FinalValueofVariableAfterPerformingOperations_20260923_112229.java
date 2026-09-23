// Last updated: 9/23/2026, 11:22:29 AM
1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int length = operations.length;
4        int counter = 0;
5
6        for(int i = 0; i < length; i++){
7            if(operations[i].contains("--X") || operations[i].contains("X--")){
8                counter = counter - 1;
9            } else{
10                counter = counter + 1;
11            }
12        }
13
14        return counter;
15    }
16}