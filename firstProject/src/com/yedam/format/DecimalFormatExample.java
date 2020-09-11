package com.yedam.format;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		//10진수 빈자리는 0으로
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		//소수점.0 까지
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		//빈자리는 0으로 채움
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		//10진수 빈자리는 채우지 않음
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
	}
}
