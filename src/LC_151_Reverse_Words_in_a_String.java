/*

Input: s = "welcome to the jungle"
Output: "jungle the to welcome"
Explanation: The words in the input string are "welcome", "to", "the", and "jungle". Reversing the order of these words gives "jungle", "the", "to", and "welcome". 
The output string should have exactly one space between each word.

Input: s = " amazing coding skills "
Output: "skills coding amazing"
Explanation: The input string has leading and trailing spaces, as well as multiple spaces between the words "amazing", "coding", and "skills". 
After trimming the leading and trailing spaces and reducing the multiple spaces between words to a single space, the words are "amazing", "coding", and "skills". 
Reversing the order of these words gives "skills", "coding", and "amazing". The output string should not have any leading or trailing spaces and should have exactly one space between each word.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC_151_Reverse_Words_in_a_String {

    static String reverseWords(String s){
        List<String> words = new ArrayList<>();

        StringBuilder result = new StringBuilder();

        StringBuilder word = new StringBuilder();

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) != ' '){
                word.append(s.charAt(i));
            } else {
                words.add(word.toString());
                word.setLength(0);
            }
        }

        if (word.length() > 0) {
            words.add(word.toString());
        }

        Collections.reverse(words);

        for (int i=0; i<words.size(); i++){
            result.append(words.get(i));
            if (i != words.size()-1){
                result.append(' ');
            }
        }
        return result.toString();

    }

    public static void main(String[] args){
        String s = "the sky is blue";
        String output = reverseWords(s);
        System.out.println(output);
    }
}

