package ex03;

public class Button {
	OnClickListener listener;
	
	public void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
