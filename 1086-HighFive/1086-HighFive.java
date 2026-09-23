// Last updated: 9/23/2026, 9:24:32 AM
class Solution {
    public int[][] highFive(int[][] items) {
         HashMap<Integer, ArrayList<Integer>> hash = new HashMap<>();

        


        for(int i = 0; i < items.length; i++){
            ArrayList<Integer> current = hash.getOrDefault(items[i][0], new ArrayList<Integer>());
            current.add(items[i][1]);
            hash.put(items[i][0], current);


        }

        int[][] arr = new int[hash.keySet().size()][2]; 
        

        int counter = 0;
        
        for(int num : hash.keySet()){
            ArrayList<Integer> c = hash.get(num);

            int avg = 0;
            
            Collections.sort(c);
            c.sort(Comparator.reverseOrder());

            for(int i = 0; i < 5; i++){
                avg = avg + c.get(i);
            }

            avg = avg / 5;

            c.removeAll(c);
            c.add(avg);

            System.err.println(num + " " + c);

            arr[counter][0] = num;
            arr[counter][1] = c.get(0);

            counter++;

        }

        return arr;
    }
}