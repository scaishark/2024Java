package ex02;

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
	
	void method(int c) {
		int a;
		
		a=10;
		
		class D {
			void method1() {
				int b = a;
				int d = c;
			}
		}
	}
}
