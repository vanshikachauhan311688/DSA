import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Agar opening bracket ho, stack me push karo
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Agar closing bracket ho, check karo stack top
            else {
                if (stack.isEmpty()) {
                    return false; // closing bracket ke liye koi opening nahi hai
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // mismatch
                }
            }
        }

        // Agar stack empty hai to valid, nahi to invalid
        return stack.isEmpty();
    }
}
