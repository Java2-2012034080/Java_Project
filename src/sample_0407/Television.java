package sample_0407;

public class Television {
	private int channel;
	private int volume;
	private boolean turnoff;
	
	public Television(){
		//this.channel=0;
		//this.volume=0;
		//this.turnoff=true;
		this(0,0,true);
	}
	
	public Television(int channel, int volume){
		this(channel,volume,true);
	}
	
	public Television(int channel, int volume, boolean turnoff){
		System.out.println("wow");
		this.channel=channel;
		this.volume=volume;
		this.turnoff=turnoff;
				
	}
	void print(){
		System.out.println("�ڷ������� ä���� "+channel+"�̰� ������ "+volume+"�Դϴ�.");
	}
	

	

}
