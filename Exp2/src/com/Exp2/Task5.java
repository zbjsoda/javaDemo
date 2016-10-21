package com.Exp2;

import java.util.HashMap;
import java.util.Map.Entry;

public class Task5 {
	public static void main(String[] args){
		HashMap<String, Item> cart = new HashMap<String, Item>();   
		
		//先行插入一个Item #1
		cart.put("#1", new Item("#1", 2, 1));
	
		//添加第一个 #2
		//新建一个要添加进购物车的Item
		Item i1 = new Item("#2", 1, 1); //id为#2, 价格为1, 数量为1
		String key1 = i1.iid;
		
		//判断购物车是否已存在该Item
		if(cart.containsKey(key1)){
			//若存在，修改数量
			Item temp = cart.get(key1);
			temp.amount += i1.amount;
			cart.remove(key1);
			cart.put(key1, temp);
		}else{
			//若不存在，直接加入
			cart.put(key1, i1);
		}
		
		//插入第二个 #2
		//新建一个要添加进购物车的Item
		Item i2 = new Item("#2", 1, 1); //id为#2, 价格为2， 数量为1
		String key2 = i2.iid;
				
		//判断购物车是否已存在该Item
		if(cart.containsKey(key2)){
			//若存在，修改数量
			Item temp = cart.get(key2);
			temp.amount += i2.amount;
			cart.remove(key2);
			cart.put(key2, temp);
		}else{
			//若不存在，直接加入
			cart.put(key2, i2);
		}
		
		//循环输出购物车内容，并计算总价
		int total = 0;
		for(Entry<String, Item> entry : cart.entrySet()) {
			Item temp = entry.getValue();
            System.out.println(entry.getKey() + "-->" + entry.getValue());
            total += temp.price * temp.amount;
        }
		System.out.println("购物车中物品总价格为:" +total);
		
		
	}
	
}
