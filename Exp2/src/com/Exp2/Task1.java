package com.Exp2;

public class Task1 {

	public static void main(String[] args) {
		String d1 = "1996-11-01";
		String d2 = "1996-11-02";
		System.out.println(d1+ " is earlier than " + d2 + " ? --> " + isBefore(d1,d2));
		

		d1 = "1996-11-03";
		d2 = "1996-11-02";
		System.out.println(d1+ " is earlier than " + d2 + " ? --> " + isBefore(d1,d2));
		
	}
	
	//���ڱȽϺ���
	public static boolean isBefore(String d1, String d2){

		String[] arr1 = d1.split("-");
	    String[] arr2 = d2.split("-");
	    int id1 = 0;
	    int id2 = 0;
	    
	    //ѭ����Sting��ʽ����ת���� int �ԱȽ�
	    int i = 1;
	    for(String ele: arr1){
	    	id1 += Integer.parseInt(ele) * i;
	    	i *= 10;
	    }
	    
	    i = 1;
	    for(String ele: arr2){
	    	id2 += Integer.parseInt(ele) * i;
	    	i *= 10;
	    }
	    
	    //�Ƚ�
	    if(id1 < id2){
	    	return true;
	    }
	    
	    return false;
	}

}
