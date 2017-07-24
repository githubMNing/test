package demo2;

public class CalculatorImp implements Calculator {

	@Override
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	@Override
	public int decrease(int a, int b) {
		int result = a - b;
		return result;
	}
		


	@Override
	public int div(int a, int b) {
		int result = a / b;
		return result;
	}
		

}
