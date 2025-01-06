package ex04;

public class Button {
	OnClickListener listener;
	
	public Button SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
		return this;
	}
	
	public void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
