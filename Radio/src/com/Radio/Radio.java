package com.Radio;

public class Radio {
/*	������Ƹ�������ԣ�ģ�⿪�أ���������Ƶ�Լ���ʾ��ǰ״̬����ʾ�����͵�ǰƵ��ֵ�����ĸ���Ϊ��
	�Զ���ӹ��췽��
	�Զ����getter()��setter()���������������
	��������������룬�����޶����η���˵�����ⲿ���Է����������������Щ��������Щ���ԡ�
	������Զ���Ϊprivate���ͣ��ⲿ��η��ʶ����״ֵ̬��
	getter()��setter()������ʲô���ã�
	����������Χ��Ƶ�ʷ�Χ��ͨ���������ж��壬���޸ĵ����͵�Ƶ����������*/
	private boolean power;
	private int volume;
	private int frequency;
	static int MAXVOLUME = 100;
	static int MAXFREQUENCY = 1000;
	
	public Radio(){
		setPower(false);
		setVolume(0);
		setFrequency(0);
	}
	
	public void switchOn(){
	    setPower(!isPower());
	    if(isPower()){
	    	System.out.println("��Դ�Ѵ�");
	    }else{
			System.out.println("��Դ�ѹر�");
	    }
	}
	
	public void show(){
		if(isPower()){
			System.out.println("��ǰ����Ϊ: " + getVolume());
			System.out.println("��ǰƵ��Ϊ: " + getFrequency());
	    }else{
			System.out.println("��Դδ��");
	    }
	}
	
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > MAXVOLUME){
			System.out.println("�������������");
		}else{
			this.volume = volume;
		}
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		if(frequency > MAXFREQUENCY){
			System.out.println("�������������");
		}else{
			this.frequency = frequency;
		}
		
	}
	
	
	

}
