package com.Exp2;

public class Task2 {
	
	public static void main(String[] args){
		int rdm = 0;
		int i = 0;
		while(true){
			rdm = new java.util.Random().nextInt();
			if((rdm%2) == 0){
				continue;
			}else{
				System.out.println(rdm + ",");
			}
			if(i<100){
				i++;
			}else{
				break;
			}
		}
	}

}
