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
	private static final String  dateRegex = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
	private static final String longRegex = "^-?\\d{1,19}$";
	private static final String bigDecimalRegex = "-?(?:\\d+(?:\\.\\d+)?|\\.\\d+)";
	
	public static Boolean validateDate(String dateStr){
		return StringUtils.isEmpty(dateStr) ? 
							false :  dateStr.trim().matches(dateRegex) ;
	}
	
	public static Boolean validateLong(String longStr){
		return StringUtils.isEmpty(longStr) ? 
							false :  longStr.trim().matches(longRegex);
	}
	
	public static Boolean validateBigDecimal(String longStr){
		return StringUtils.isEmpty(longStr) ? 
							false :  longStr.trim().matches(bigDecimalRegex);
	}
}
