package tv;

public class TV {
	private int channel;	//1~255
	private int volume;		//0~100
	private boolean power;
	
	public TV(int channel,int volume,boolean power) {
		channel(channel);
		volume(volume);
		power(power);
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	public void channel(int channel) {
		if(channel>255) {
			this.channel=255;
		}
		else if(channel<1) {
			this.channel=1;
		}
		else {
			this.channel=channel;
		}
	}
	public void channel(boolean up) {
		if(up) {
			channel(++this.channel);
		}
		else {
			channel(--this.channel);
		}
	}
	public void volume(int volume) {
		if(volume>120) {
			this.volume=120;
		}
		else if(volume<0) {
			this.volume=0;
		}
		else {
			this.volume=volume;
		}
	}
	public void volume(boolean up) {
		if(up) {
			volume(++this.volume);
		}
		else {
			volume(--this.volume);
		}
	}
	
	
	public void status() {
		System.out.printf("TV[power=%s,channel=%d,volume=%d]\n",(power ? "on":"off"),channel,volume);
	}
}
