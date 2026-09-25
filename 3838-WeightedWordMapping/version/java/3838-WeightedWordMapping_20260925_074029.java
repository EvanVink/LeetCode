// Last updated: 9/25/2026, 7:40:29 AM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        int place = 0;
4        StringBuffer sb = new StringBuffer(words.length);
5
6        int[] arr = new int[words.length];
7        for(int i = 0; i < words.length; i++){
8            for(int j = 0; j < words[i].length(); j++){
9                place = (int)words[i].charAt(j) - 97;
10
11                arr[i] += weights[place];
12            }
13
14            arr[i] = arr[i] % 26;
15        }
16
17        for(int num : arr){
18            num = 122 - num;
19            sb.append((char)num);
20        }
21
22        return sb.toString();
23    }
24}