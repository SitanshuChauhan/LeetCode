//https://leetcode.com/problems/defanging-an-ip-address/

class Solution {
    public String defangIPaddr(String address) {
        int i;
        String newAddress="";
        for(i=0;i<address.length();i++){
            if(address.charAt(i)=='.')
                newAddress+="[.]";
            else
                newAddress+=address.charAt(i);
            }
        return newAddress;
    }
}