package ex01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button();
		
		btn.SetOnClickListener(new CallListener());
		btn.touch();
		
		btn.SetOnClickListener(new MessageListener());
		btn.touch();
	}
}
