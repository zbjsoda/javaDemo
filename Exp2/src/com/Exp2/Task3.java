package com.Exp2;

import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {
		ArrayList<Book> arr1 = new ArrayList();
		
		//���3����
		arr1.add(new Book("1","book1"));
		arr1.add(new Book("2","book2"));
		arr1.add(new Book("3","book3"));
		
		for(Book ele: arr1){
			System.out.println(ele);
		}
		
		//ɾ����һ����
		arr1.remove(0);
		
		for(Book ele: arr1){
			System.out.println("--" + ele);
		}
		

	}

}

