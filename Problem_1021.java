public class Problem_1021 {
        public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) ans.append(ch);
                depth++;
            } 
            else {
                depth--;
                if (depth > 0) ans.append(ch);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str= "(()()()()())(()())";
        System.out.println(removeOuterParentheses(str));
    }
}
