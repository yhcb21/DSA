class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();

        int balance = 0;

        for (char c: s.toCharArray()) {
            if (c == '(') {
                balance++;
                if (balance > 1) {
                    str.append(c);
                }
            } 
            if (c == ')') {
                balance--;
                if(balance > 0) {
                    str.append(c);
                }
            }
        }

        return str.toString();
    }
}