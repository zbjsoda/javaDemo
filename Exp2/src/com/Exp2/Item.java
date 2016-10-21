package com.Exp2;

public class Item {
    //其中包含了物品信息，物品价格、数量，等等
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
