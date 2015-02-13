public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if(A.length() == 0 && B.length() == 0) {
            return true;
        }
        
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        char[] charArray = B.toCharArray();
        for(char c : charArray) {
            if(!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, (hashMap.get(c)+1));
            }
        }
        
        charArray = A.toCharArray();
        for(char c : charArray) {
            if(hashMap.containsKey(c)) {
                hashMap.put(c, (hashMap.get(c)-1));
                if(hashMap.get(c) == 0) {
                    hashMap.remove(c);
                }
            }
        }
        if(!hashMap.isEmpty()){
            return false;
        }
        return true;
    }
}
