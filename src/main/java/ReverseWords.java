import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords{

    public static String reverseWords(String str) {
        List<String> stringList = Arrays.asList(str.split(" "));
        Collections.reverse(stringList);
        return String.join(" ", stringList);
    }
}