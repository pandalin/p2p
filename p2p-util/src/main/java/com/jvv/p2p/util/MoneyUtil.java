package com.jvv.p2p.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;

public class MoneyUtil {

	/**
	 * 
	 * @param formatMoney
	 * @return
	 * @throws ParseException
	 */
	public static BigDecimal parseFormat(String formatMoney) throws ParseException {
		// Create a DecimalFormat that fits your requirements
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setGroupingSeparator(',');
		symbols.setDecimalSeparator('.');
		String pattern = "#,##0.0#";
		DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
		decimalFormat.setParseBigDecimal(true);

		// parse the string
		BigDecimal bigDecimal = (BigDecimal) decimalFormat.parse(formatMoney);
		return bigDecimal;
	}
}
