package com.base.var;

/**
 * @author zhi
 *�����
 */
public class Arithmetic extends Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int j = 2;
		System.out.println(2*i++);//4
		System.out.println(2*++j);//6
		//ǰ++�����++����ʹ������1������++i�ڱ��ʽ��ʹ��i+1,i++ʹ��i
		
		//��ϵ�����
		//< , > , <= ,>= ,
		//���������
		//&& ||  !=
		//��Ŀ�����
		char a = 1 > 2 ? 't':'f';
		//λ�����
		//>> << >>>
		int b = 0b110;
		System.out.println(b>>1);//0b11 3
		System.out.println(b<<1);//0b1100 12
		System.out.println(b>>>1);//0b11 3
		//��long������������Ҳ�����%32������1�� 35 = 1 �� 3 ��long %64
		

	}

}
