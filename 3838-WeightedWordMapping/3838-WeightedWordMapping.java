// Last updated: 9/25/2026, 7:40:46 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int place = 0;
        StringBuffer sb = new StringBuffer(words.length);

        int[] arr = new int[words.length];
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                place = (int)words[i].charAt(j) - 97;

                arr[i] += weights[place];
            }

            arr[i] = arr[i] % 26;
        }

        for(int num : arr){
            num = 122 - num;
            sb.append((char)num);
        }

        return sb.toString();
    }
}