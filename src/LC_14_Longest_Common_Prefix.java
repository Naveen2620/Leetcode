public class LC_14_Longest_Common_Prefix {

    static String prefix(String[] str){

        StringBuilder ans = new StringBuilder();

        String first = str[0];

        String last = str[str.length-1];

        for (int i=0; i<Math.min(first.length(), last.length()); i++){
            if (first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }

            ans.append(first.charAt(i));
        }
        return "";
    }

    public static void main(String[] args){
        String[] str = {"flower", "flow", "flight"};
        System.out.println(prefix(str));
    }
}
