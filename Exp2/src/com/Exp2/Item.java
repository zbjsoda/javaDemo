package com.Exp2;

public class Item {
    //���а�������Ʒ��Ϣ����Ʒ�۸��������ȵ�
	String iid;
	int price;
	int amount;
	
	public Item(String iid, int price, int amount){
		this.iid = iid;
		this.price = price;
		this.amount = amount;
	}
	
	public String toString(){
		return "Id:"+this.iid+";"+"Price:"+this.price+";"+"Amount:"+this.amount+";" ;
	}
}
