package java_chap08;

public class Taxi implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	public void faseRun() {
		System.out.println("택시가 달립니다.");
	}
	
}
