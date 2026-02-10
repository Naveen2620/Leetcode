/*
Example 1:
Input:
 s = "((()))"
Output:
 "(())"
Explanation:
 The input string is a single primitive: "((()))".
Removing the outermost layer yields: "(())".

Example 2:
Input:
 s = "()(()())(())"
Output:
 "(()())()"
Explanation:
 Primitive decomposition: "()" + "(()())" + "(())"
After removing outermost parentheses: "" + "()()" + "()"
Final result: "(()())()".
*/

public class LT_1021_Remove_Outermost_Parentheses {

    static String removeOuterParentheses(String s){
        int count = 0;

        StringBuilder ans = new StringBuilder();

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                if (count>0){
                   ans.append(s.charAt(i));
                }
                count++;
            }

            if (s.charAt(i) == ')'){
                count--;
                if (count>0){
                    ans.append(s.charAt(i));
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args){
        String s = "((()))";
        //String s = "()(()())(())";
        String answer = removeOuterParentheses(s);
        System.out.println(answer);
    }
}




