package com.spring.utill;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String related util
 */
public class StringUtil {

	/**
	 * private constructor
	 */
  
	private StringUtil(){}
	
	  /**
     * Remove specil characters from a string
     * @param str
     * @return String
     * 
     */
    public static String removeSpecialChar(String str) {

        str = str.toLowerCase();

        Pattern pt = Pattern.compile("[^a-z0-9]");
        Matcher match = pt.matcher(str);
        while (match.find()) {
            String s = match.group();
            str = str.replaceAll("\\" + s, "");
        }

        return str;
    }

}
