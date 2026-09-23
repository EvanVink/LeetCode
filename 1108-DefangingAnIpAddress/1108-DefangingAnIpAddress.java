// Last updated: 9/23/2026, 9:24:33 AM
class Solution {
    public String defangIPaddr(String address) {
        String s = address;
        String build = "";

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '.'){
                build += "[.]";
            }else {
                build += s.charAt(i);
            }
        }
        

        return build;
    }
}