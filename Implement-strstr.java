class Solution {
    public int strStr(String haystack, String needle) {
        
        int isFound = haystack.indexOf(needle) !=-1? haystack.indexOf(needle): -1;
        return isFound;
    }
}
