package com.javaex.ex07;

public class Tv {

	private int channel;
	private int volume;
	private boolean power;
	
	
	
	//생성자
	public Tv() {
	
	}
	public Tv(boolean power, int volume) {
		this.power = power;
		this.volume = volume;
	}

	public Tv(boolean volume) {
		}

	public Tv(int channel, int volume, boolean power) {

		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public Tv(int channel) {
		this.channel = channel;
	}

	//메소드 get set
	
	
	public int getChannel(int channel) {
		if(channel>0 && channel<255)
		return this.channel = channel;
		return channel;
	}
	
	public int getChannel(boolean up){
		if(up == true) {
			channel++;
		}else if(up == false) {
			channel--;
		}
		return channel;
	}
	
	
	
	
	public int getVolume(int volume) {
		if(volume>=0 && volume<100)
			this.volume = volume;
			return volume;	
	}
	public int getVolume(boolean v_up) {
		if(v_up == true) {
			volume++;
		}else if(v_up == false) {
			volume--;
		}
		return volume;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean getPower(boolean action) {
		if (action = true) {
			System.out.println("power_on");
		}else if(action = false) {
			System.out.println("power_off");
			;
		}
		return power;
	}






	public String status() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
