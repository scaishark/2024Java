package ex05;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		RemoteController tv = new RemoteController() {
			public void TurnOn() {}
			public void TurnOff() {}
		};
		m.TurnOnAndTurnOff(tv);
	}
	
	void TurnOnAndTurnOff(RemoteController rc) {
		rc.TurnOn();
		rc.TurnOff();
	}
}
