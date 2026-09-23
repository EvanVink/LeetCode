// Last updated: 9/23/2026, 9:23:42 AM
class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int size = intervals.length;

        int intersections = 0;

        for(int i = 0; i < size - 1; i++){
            
            
            for(int j = 1 + i; j < size; j++){
                if(i != j){

                    if((intervals[i][0] <= intervals[j][1] && intervals[i][1] >= intervals[j][0])){
                        intersections++;
                    }
                }
            }


        }



        return intersections;
    }
}