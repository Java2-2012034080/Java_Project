package sample_0526;

public class AutoCar implements operateCar {
	
	public void start(){
		System.out.println("자동차가 출발합니다.");
	}
	
	public void stop(){
		System.out.println("자동차가 정지합니다.");
	}
	
	public void setSpeed(int s){
		System.out.println("자동차가 속도를 "+s+"km/s로 바꿉니다.");
	}
	
	public void turn(int t){
		System.out.println("자동차가 방향을 " + t+ "도 만큼 바꿉니다.");
	}

}
