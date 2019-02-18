package com.zipcodewilmington.assessment1.part1;

import com.zipcodewilmington.assessment1.part2.StringUtils;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String swr = str.substring(0, 1).toUpperCase() + str.substring(1);
        return swr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reverse = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            reverse = reverse + str.charAt(j);
        }
        return reverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String swr = reverse(str);
        swr = camelCase(swr);
        return swr;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String stepOne = StringUtils.removeCharacterAtIndex(str, 0);
        String stepTwo = StringUtils.removeCharacterAtIndex(stepOne, stepOne.length() - 1);
        return stepTwo;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char test = charArray[i];

            if (Character.isUpperCase(test)) {

                charArray[i] = Character.toLowerCase(test);
            } else if (Character.isLowerCase(test)) {
                charArray[i] = Character.toUpperCase(test);
            }
        }
        return new String(charArray);
    }
}
