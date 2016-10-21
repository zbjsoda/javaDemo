package com.Exp2;

import java.util.HashMap;
import java.util.Map.Entry;

public class Task5 {
	public static void main(String[] args){
		HashMap<String, Item> cart = new HashMap<String, Item>();   
		
		//���в���һ��Item #1
		cart.put("#1", new Item("#1", 2, 1));
	
		//��ӵ�һ�� #2
		//�½�һ��Ҫ��ӽ����ﳵ��Item
		Item i1 = new Item("#2", 1, 1); //idΪ#2, �۸�Ϊ1, ����Ϊ1
		String key1 = i1.iid;
		
		//�жϹ��ﳵ�Ƿ��Ѵ��ڸ�Item
		if(cart.containsKey(key1)){
			//�����ڣ��޸�����
			Item temp = cart.get(key1);
			temp.amount += i1.amount;
			cart.remove(key1);
			cart.put(key1, temp);
		}else{
			//�������ڣ�ֱ�Ӽ���
			cart.put(key1, i1);
		}
		
		//����ڶ��� #2
		//�½�һ��Ҫ��ӽ����ﳵ��Item
		Item i2 = new Item("#2", 1, 1); //idΪ#2, �۸�Ϊ2�� ����Ϊ1
		String key2 = i2.iid;
				
		//�жϹ��ﳵ�Ƿ��Ѵ��ڸ�Item
		if(cart.containsKey(key2)){
			//�����ڣ��޸�����
			Item temp = cart.get(key2);
			temp.amount += i2.amount;
			cart.remove(key2);
			cart.put(key2, temp);
		}else{
			//�������ڣ�ֱ�Ӽ���
			cart.put(key2, i2);
		}
		
		//ѭ��������ﳵ���ݣ��������ܼ�
		int total = 0;
		for(Entry<String, Item> entry : cart.entrySet()) {
			Item temp = entry.getValue();
            System.out.println(entry.getKey() + "-->" + entry.getValue());
            total += temp.price * temp.amount;
        }
		System.out.println("���ﳵ����Ʒ�ܼ۸�Ϊ:" +total);
		
		
	}
	
}
