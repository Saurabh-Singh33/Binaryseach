import java.util.ArrayList;

public class StringAndBuilder {
    public static void main(String[] args) {
        String str = "abcba";
/* System.out.println(56);
 System.out.println("Saurabh");
 String name = null;
 System.out.println(name);

 // prityprinting

        float a = 432.234123f;
        //System.out.printf("formatted number is %.2f" , a);
        //System.out.printf("pie : %.3f",Math.PI);
        // System.out.printf("Hello my name is %s and i am %s" , "Saurabh", "cool\n");
        //Operators
        System.out.println('a' +'a');
        System.out.println('a' + 'A');
        System.out.println('A' + 1);
        System.out.println("A" + 1);
        System.out.println("Saurabh" + new ArrayList<>());

        // String Builder
        String Name = "Saurabh Singh";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            builder.append(ch);

        }
        System.out.println(builder);
        builder.deleteCharAt(3);
        System.out.println(builder);
        System.out.println(Name.indexOf('r'));

        System.out.println("       Saurabh    " .strip());
        System.out.println("       Saurabh    " .trim());*/

        // To check it is palindrome or not
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i <str.length()/2 ; i++) {
            char start = str.charAt(i);
            char end =str.charAt(str.length()-1-i);

            if(start !=end){
                return false;
            }
        }
        return  true;
    }
}
