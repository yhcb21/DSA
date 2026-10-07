class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            if (part.equals("") || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!st.empty()) {
                    st.pop();
                }
            }
            else {
                st.push(part);
            }
        }

        String ans = "";

        while (!st.empty()) {
            ans = "/" + st.pop() + ans;
        }

        return ans.equals("") ? "/" : ans;
    }
}