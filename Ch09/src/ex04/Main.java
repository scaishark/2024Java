package ex04;

public class Main {

	public static void main(String[] args) {
		new Button().SetOnClickListener(
			new Button.OnClickListener() {
				public void onClick() {
					System.out.println("Make a phone call.");
				}
			}
		).touch();
		//btn.touch();
			
			//btn.SetOnClickListener(new MessageListener());
		new Button().SetOnClickListener(
			new Button.OnClickListener() {
				public void onClick() {
					System.out.println("Send a message.");
				}
			}
		).touch();
			//btn.touch();
	}
}
