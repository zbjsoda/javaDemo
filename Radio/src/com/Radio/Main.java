package com.Radio;

public class Main {
	public static void main(String[] args){
		Radio r = new Radio();
		r.show();
		r.switchOn();
		r.show();
		r.setVolume(10);
		r.show();
		r.setFrequency(2000);
		r.show();
		r.switchOn();
		r.show();
	}
}
