

public class Calculadora {
	
	private int num1, num2;
		
	public Calculadora(int a, int b){
		num1 = a;
		num2 = b;
	}
	
	public int suma(){
		int result=num1+num2;
		return result;
	}
	
	public int resta(){
		int result=num1-num2;
		return result;
	}
	
	public int multiplicacion(){
		int result=num1*num2;
		return result;
	}
	
	public int division(){
		int result=num1/num2;
		return result;
	}
	

}
