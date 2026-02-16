/*

Example 1
Input:
 s = "5347"
Output:
 "5347"
Explanation:
 The odd numbers formed by the given string are → 5, 3, 53, 347, 5347.
 The largest odd number without leading zeroes is 5347.

Example 2
Input:
 s = "0214638"
Output:
 "21463"
Explanation:
 The odd numbers formed by the string are → 1, 3, 21, 63, 463, 1463, 21463.
 We can't use numbers starting with 0, so the largest valid odd number is 21463.

*/


public class LC_1903_Largest_Odd_Number_in_String {

    static String oddnumber(String s){
        int lenght = s.length()-1;
        while (lenght>=0){
            int d = s.charAt(lenght)-'0';
            if (d%2 !=0){
                return s.substring(0,lenght+1);
            }
            lenght--;
        }
        return "";
    }

    public static void main(String[] args){
        //String s = "5347";
        String s = "214638";

        System.out.println(oddnumber(s));
    }
}


