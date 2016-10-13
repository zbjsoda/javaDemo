package com.Radio;

public class Radio {
/*	自行设计该类的属性；模拟开关；调音；调频以及显示当前状态（显示音量和当前频率值）的四个行为。
	自动添加构造方法
	自动添加getter()与setter()方法，理解其作用
	完善收音机类代码，加入限定修饰符，说明从外部可以访问收音机对象的那些方法，那些属性。
	如果属性定义为private类型，外部如何访问对象的状态值？
	getter()和setter()方法有什么作用？
	对于音量范围和频率范围，通过常量进行定义，并修改调音和调频两个方法。*/
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
	    	System.out.println("电源已打开");
	    }else{
			System.out.println("电源已关闭");
	    }
	}
	
	public void show(){
		if(isPower()){
			System.out.println("当前音量为: " + getVolume());
			System.out.println("当前频率为: " + getFrequency());
	    }else{
			System.out.println("电源未打开");
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
			System.out.println("超过最大音量！");
		}else{
			this.volume = volume;
		}
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		if(frequency > MAXFREQUENCY){
			System.out.println("超过最大音量！");
		}else{
			this.frequency = frequency;
		}
		
	}
	
	
	

}
