
public class Operacoes {
	public Operacoes() {
		
	}
	public int somar(String num1, String num2) {
		try {
			int int_num1 = Integer.parseInt(num1);
			int int_num2 = Integer.parseInt(num2);
			return int_num1 + int_num2;
		} catch (Exception e) {
			new TelaErro();
		}
		return 0;
	}
	
	public int subtrair(String num1, String num2) {
		try {
			int int_num1 = Integer.parseInt(num1);
			int int_num2 = Integer.parseInt(num2);
			return int_num1 - int_num2;
		} catch (Exception e) {
			new TelaErro();
		}
		return 0;
	}
	
	public float dividir(String num1, String num2) {
		try {
			int int_num1 = Integer.parseInt(num1);
			int int_num2 = Integer.parseInt(num2);
			return int_num1 / int_num2;
		} catch (Exception e) {
			new TelaErro();
		}
		return 0;
	}
	
	public int multiplicar(String num1, String num2) {
		try {
			int int_num1 = Integer.parseInt(num1);
			int int_num2 = Integer.parseInt(num2);
			return int_num1 * int_num2;
		} catch (Exception e) {
			new TelaErro();
		}
		return 0;
	}
}
