class Solution {
    /**
     * Returns a index to the first occurrence of target in source, or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //write your code here
        if(source == null || target == null) {
            return -1;
        }
        int sourceLength = source.length();
        int targetLength = target.length();
        if((sourceLength == 0 && targetLength == 0) || (sourceLength > 0 && targetLength == 0)) {
            return 0;
        } else if(sourceLength < targetLength) {
            return -1;
        }
        
        for(int i = 0; i < sourceLength - targetLength; i++) {
            int sourceP = i;
            int targetP = 0;
            while(source.charAt(sourceP) == target.charAt(targetP) && targetP < targetLength) {
                sourceP++;
                targetP++;
                if(targetP == targetLength) {
                    return 1;
                }
            }
        }
        return -1;
    }
}