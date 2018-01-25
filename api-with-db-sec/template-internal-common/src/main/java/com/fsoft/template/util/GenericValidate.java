/**
 * 
 */
package com.fsoft.template.util;

import org.springframework.util.StringUtils;

/**
 * @author YenDV
 *
 */
public class GenericValidate {
	private static final String  dateRegex = "d{4}-\\d{2}-\\d{2}";
	private static final String longRegex = "^-?\\d{1,19}$";
	
	public static Boolean validateDate(String dateStr){
		return StringUtils.isEmpty(dateStr) ? 
							false :  dateStr.trim().matches(dateRegex) ? true : false;
	}
	
	public static Boolean validateLong(String longStr){
		return StringUtils.isEmpty(longStr) ? 
							false :  longStr.trim().matches(longRegex) ? true : false;
	}
}
