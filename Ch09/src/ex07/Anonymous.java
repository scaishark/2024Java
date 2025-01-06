package ex07;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 1;
		int var2 = 2;
		
		field = 10;
		
		//arg2 = 20;
		//var2 = 30;
		
		Calculatable calc = new Calculatable() {
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
	}
}
