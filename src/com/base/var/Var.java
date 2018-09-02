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
		int i = 1; //32位   -2^31 to 2^31 - 1
		short s =1; //16位  -2^15 to 2^15 - 1
		long l = 2l; //64位
		float f = 3.0f; //32位 不能表示精确的值
		double d = 2.00; //64 位 不能表示精确的值 
		char c = 'a'; //16位 存储Unicode码，用单引号赋值
		byte by = 'b';//8位 -128 to 127  -2^7 to 2^7-1  
		boolean b = false;//true or false
		

	}

}
