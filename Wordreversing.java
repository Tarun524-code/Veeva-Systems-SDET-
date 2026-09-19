import java.util.*;
import java.util.regex.*;
public class Wordreversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String reversed = reverseWordsPreserve(sentence);
        System.out.println("Reversed sentence: " + reversed);
        sc.close();
    }
    public static String reverseWordsPreserve(String sentence) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(sentence);

        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }

        Collections.reverse(words);
        Iterator<String> it = words.iterator();
        matcher.reset();
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, it.next());
        }
        matcher.appendTail(result);

        return result.toString();
    }
}
