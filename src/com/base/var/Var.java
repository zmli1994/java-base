package com.base.var;

/**
 * @author zhi
 *����
 */
public class Var {

	/**
	 * @param args
	 * ���ֻ�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte by = 'b';//8λ -128 to 127  -2^7 to 2^7-1 
		int i = 0x1_2; //32λ   -2^31 to 2^31 - 1 20��
		short s =1; //16λ  -2^15 to 2^15 - 1
		long l = 0b11l; //64λ

		float f = 3.5f; //32λ ���ܱ�ʾ��ȷ��ֵ����Чλ��6-7λ
		double d = 2.00; //64 λ ���ܱ�ʾ��ȷ��ֵ ��Чλ��15λ
		
		char c = '\u005B'; //16λ �洢Unicode��('\u1234'+4λ16������)���õ����Ÿ�ֵ
		 
		boolean b = false;//true or false
		System.out.println(i);//18
		System.out.println(l);//3
		System.out.println(c);//3
		
		//ת���޾��ȶ�ʧ
		//byte-->short-->int-->long
		//float-->double
		//char-->int
		//int-->double
		//����Ϣ��ʧ
		//int-->float long-->float long-->double
		//ǿ������ת��
		i = (int)f;//ȥ��С�����֣�3

	}

}
