class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean isFound=false;
        int count=0;
        for(String a:words){
            for(int i=0;i<a.length();i++){
                isFound=false;
                char c1=a.charAt(i);
                for(int j=0;j<allowed.length();j++){
…                count++;
            }
        }
        return count;
    }
}