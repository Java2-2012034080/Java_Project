package sample_0526;

public class AutoCar implements operateCar {
	
	public void start(){
		System.out.println("�ڵ����� ����մϴ�.");
	}
	
	public void stop(){
		System.out.println("�ڵ����� �����մϴ�.");
	}
	
	public void setSpeed(int s){
		System.out.println("�ڵ����� �ӵ��� "+s+"km/s�� �ٲߴϴ�.");
	}
	
	public void turn(int t){
		System.out.println("�ڵ����� ������ " + t+ "�� ��ŭ �ٲߴϴ�.");
	}

}
