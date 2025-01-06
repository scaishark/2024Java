package ex03;

public class Main {

	public static void main(String[] args) {
		Button btn = new Button();
		
		//btn.SetOnClickListener(new CallListener());
		btn.SetOnClickListener(
			new Button.OnClickListener() {
				public void onClick() {
					System.out.println("Make a phone call.");
				}
			}
		);
		btn.touch();
		
		//btn.SetOnClickListener(new MessageListener());
		btn.SetOnClickListener(
				new Button.OnClickListener() {
					public void onClick() {
						System.out.println("Send a message.");
				}
			}
		);
		btn.touch();
	}
}
