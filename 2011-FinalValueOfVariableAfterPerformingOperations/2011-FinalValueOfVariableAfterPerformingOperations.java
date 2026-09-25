// Last updated: 9/25/2026, 7:41:20 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int length = operations.length;
        int counter = 0;

        for(int i = 0; i < length; i++){
            if(operations[i].contains("--X") || operations[i].contains("X--")){
                counter = counter - 1;
            } else{
                counter = counter + 1;
            }
        }

        return counter;
    }
}