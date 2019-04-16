package rocks.zipcode.io.fundamentals;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        return String.valueOf(chars);
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        return Arrays.stream(chars).map( c -> String.valueOf(c)).collect(Collectors.joining());
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        return Arrays.stream(string.split(""))
                .filter(s -> "aeiou".indexOf(s.toLowerCase()) < 0 ).collect(Collectors.joining());
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {

        String result = "";
        Boolean flag;
        for (String s : string.split("")) {
            flag = false;
            for (String s1 : charactersToRemove.split("")) {
                flag = flag || s.contains(s1);
            }
            result += flag ? "" : s;
        }

        return result;
    }
}
