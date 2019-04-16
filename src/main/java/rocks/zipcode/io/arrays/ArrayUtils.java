package rocks.zipcode.io.arrays;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        return IntStream.range(start,end + 1).mapToObj(element -> element).toArray(Integer[]::new);
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char[] characters = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            characters[i] = array[i];
        }
        return characters;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        Character[] characters = new Character[array.length];
        for (int i = 0; i < array.length; i++) {
            characters[i] = array[i];
        }
        return characters;
    }
}
