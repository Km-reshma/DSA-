class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String s : sentences) {
            int count = 1;            // At least one word exists in the sentences
            
            for (char c : s.toCharArray()) {

                if (c == ' ') {     //if white space found means next word is started in the first sentences then increment count.
                    count++;
                }
            }
            
            max = Math.max(max, count);
        }

        return max;
    }
}