// Last updated: 9/23/2026, 9:23:50 AM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> hash = new HashSet<>();
        int[] result = new int[friends.length];
        int knownFriends = 0;


        for(int i = 0; i < friends.length; i++){
            hash.add(friends[i]);
        }

        System.err.println(hash);

        for(int i = 0; i < order.length; i++){
            if(hash.contains(order[i])){
                result[knownFriends] = order[i];
                knownFriends++;
            }

        }

        return result;
    }
}