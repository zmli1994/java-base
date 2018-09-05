package com.base.var;

/**
 * @author zhi
 *运算符
 */
public class Arithmetic extends Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j = 2;
		System.out.println(2*i++);//4
		System.out.println(2*++j);//6
		//前++，与后++都会使变量增1，但是++i在表达式中使用i+1,i++使用i
		
		//关系运算符
		//< , > , <= ,>= ,
		//布尔运算符
		//&& ||  !=
		//三目运算符
		char a = 1 > 2 ? 't':'f';
		//位运算符
		//>> << >>>
		int b = 0b110;
		System.out.println(b>>1);//0b11 3
		System.out.println(b<<1);//0b1100 12
		System.out.println(b>>>1);//0b11 3
		//非long的左操作数，右操作数%32，比如1《 35 = 1 《 3 ，long %64
		

	}

}
