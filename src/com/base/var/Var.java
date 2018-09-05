package com.base.var;

/**
 * @author zhi
 *变量
 */
public class Var {

	/**
	 * @param args
	 * 八种基础变量
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte by = 'b';//8位 -128 to 127  -2^7 to 2^7-1 
		int i = 0x1_2; //32位   -2^31 to 2^31 - 1 20亿
		short s =1; //16位  -2^15 to 2^15 - 1
		long l = 0b11l; //64位

		float f = 3.5f; //32位 不能表示精确的值，有效位数6-7位
		double d = 2.00; //64 位 不能表示精确的值 有效位数15位
		
		char c = '\u005B'; //16位 存储Unicode码('\u1234'+4位16进制数)，用单引号赋值
		 
		boolean b = false;//true or false
		System.out.println(i);//18
		System.out.println(l);//3
		System.out.println(c);//3
		
		//转换无精度丢失
		//byte-->short-->int-->long
		//float-->double
		//char-->int
		//int-->double
		//有信息丢失
		//int-->float long-->float long-->double
		//强制类型转换
		i = (int)f;//去掉小数部分，3

	}

}
