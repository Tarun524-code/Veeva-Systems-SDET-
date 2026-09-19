import java.util.*;
public class MinMaxInString {
    public static void FindMinMaxInString(String s) {
        if(s==null || s.isEmpty()) {
            System.out.println("String is Empty...!");
            return;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean Found = false;
        int num = 0;
        boolean sequence = false;
        for(int i=0;i<=s.length();i++) {
            if(i < s.length() && Character.isDigit(s.charAt(i))) {
                num = num*10+(s.charAt(i)-'0');
                sequence = true;
            }else {
                if(sequence) {
                    if(num > max) max = num;
                    if(num < min) min = num;
                    Found = true;
                    num = 0;
                    sequence = false;
                }
            }
        }
        if(Found) {
            System.out.println("Max Number in the String Sequence is : "+max);
            System.out.println("Min Number in the String Sequence is : "+min);
        } else {
            System.out.println("No Numbers found in the String");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        FindMinMaxInString(s);
        sc.close();
    }
}
