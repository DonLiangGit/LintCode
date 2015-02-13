class Solution {
    /**
     * param n: As description.
     * return: A list of strings.
     */
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<String>();
        
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                result.add("fizz buzz");
            } else if(i % 3 == 0) {
                result.add("fizz");
            } else if(i % 5 == 0) {
                result.add("buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        
        return result;
    }
}