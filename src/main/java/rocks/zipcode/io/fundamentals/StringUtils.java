package rocks.zipcode.io.fundamentals;


import java.util.Arrays;
import java.util.Collection;

/**
 * @author leon on 10/01/2019.
 */

// TODO Missing method
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        // get length of string
        // get range of length
        // get power-set of range

        // for every set in power-set
            // uppercase indices of string using set

        Integer iLength = 0;
        Integer sLength = string.length();
        String r = "";
        String[] output = new String[ (int) Math.pow(2,sLength)];
        Collection<String> coloutput = Arrays.asList(output);

        for (int i = 0; i < output.length; i++) {
            iLength = Integer.toBinaryString(i).length();
            r = iLength < sLength
                    ? (new String(new char[sLength - iLength]).replace("\0", "0") + Integer.toBinaryString(i) )
                    : Integer.toBinaryString(i);
            String s = "";
            for (int j = 0; j < sLength; j++) {
                s += r.substring(j, j + 1).equals("0")
                        ? string.substring(j, j + 1).toLowerCase()
                        : string.substring(j, j + 1).toUpperCase();
            }
            output[i] = s;
        }
        return coloutput;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        for (int i = 0; i < indices.length; i++) {
            string = replaceAtIndex(string,string.substring(indices[i], indices[i] + 1).toUpperCase().charAt(0),indices[i]);
        }
        return string;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        StringBuilder strB = new StringBuilder();
        strB.append(stringToBeManipulated);
        strB.insert(index,valueToBeInserted);
        return strB.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder strB = new StringBuilder();
        strB.append(stringToBeManipulated);
        strB.replace(index,index+1,replacementValue.toString());
        return strB.toString();
    }
}