package rocks.zipcode.io.generics;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class GenericUtils {
    /**
     * @param collection - collection to be converted to an array
     * @param <T>        - type of collection
     * @return array with contents identical to `collection`
     */
    public static <T> T[] toArray(Collection<T> collection) {
        T[] t = (T[]) collection.stream().map(s-> (T) s).toArray();
        return t;
    }
}
