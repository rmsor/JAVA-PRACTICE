package assignment3;

public class Television {
	
	private int channel;
	private int volumeLevel;
	private boolean on;
	
	public Television(){
		channel=0;
		volumeLevel=0;
		on=false;
	}
	public void turnOn(){
		if(on==false){
			on=true;
			System.out.println("TV Turned On");
		}
	}
	public void turnOff(){
		if(on==true){
			on=false;
			System.out.println("TV Turned Off");
		}
	}
	public void setChannel(int ch){
		if(ch>=1 && ch<=120 && on==true){
			channel=ch;
			System.out.println("Channel Changed Successufully to "+channel);
		}else{
			System.out.println("Invalid Channel");
		}
	}
	public void setVolume(int vl){
		if(vl>=1 && vl<=7 && on==true){
			volumeLevel=vl;
			System.out.println("Volume Changed Successufully to "+volumeLevel);
		}else{
			System.out.println("Invalid Volume");
		}
	}
	
	public void channelUp(){
		if(channel!=127 && on==true){
			channel++;
			System.out.println("Channel Changed Successufully to "+channel);
		}else{
			System.out.println("Invalid Channel");
		}
	}
	public void channelDown(){
		if(channel!=0 && on==true){
			channel--;
			System.out.println("Channel Changed Successufully to "+channel);
		}else{
			System.out.println("Invalid Channel");
		}
	}
	public void volumeUp(){
		if(volumeLevel!=7 && on==true){
			volumeLevel++;
			System.out.println("Volume Changed Successufully to "+volumeLevel);
		}else{
			System.out.println("Invalid Volume");
		}
	}
	
	public void volumeDown(){
		if(volumeLevel!=0 && on==true){
			volumeLevel--;
			System.out.println("Volume Changed Successufully to "+volumeLevel);
		}else{
			System.out.println("Invalid Volume");
		}
	}
	
	public static void main(String[] args) {
		Television tv=new Television();
		tv.turnOn();
		tv.setVolume(5);
		tv.setChannel(25);
		tv.channelDown();
		tv.channelUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();

	}

}
