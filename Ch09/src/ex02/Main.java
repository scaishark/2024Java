package ex02;

import ex01.Button;
import ex01.CallListener;
import ex01.MessageListener;

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
