package com.LoSet.LogSetting;

import org.apache.log4j.Logger;

public class NumberFormat {
	public static Logger logg = Logger.getLogger(NumberFormat.class.getName());

	public static void main(String[] args) {
		int a = 8;
		int b = 6;
		logg.fatal("hey we are calling add()" + a + "" + b);
		System.out.println(add(a, b));
		multi();
		div();
	
	}
	public static int add(int a, int b) {
		int c = a + b;
		logg.info("Hey we are inside add()" + c);
		return c;
	}
	public static void multi()
	{
//		System.out.println("hi");
		logg.error("Imcomplte");
	}
	public static void div()
	{
//		System.out.println("hi");
		logg.trace("Imcomplte methods");
	}
	
}