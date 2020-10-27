package testeautomatizado;

public class CalculadoraTeste {
	
	public boolean testeSoma() {
		
		int resultadoEsperado = 4;
		
		Calculadora calc = new Calculadora();
	
		int resultadoObtido = calc.soma(2, 2);
		
		return resultadoEsperado == resultadoObtido;
		
	}
	
	public boolean testeSubtracao() {
		int resultadoEsperado = 0;
		
		Calculadora calc = new Calculadora();
	
		int resultadoObtido = calc.subtracao(2, 2);
		
		return resultadoEsperado == resultadoObtido;
		
	}
	
	// 

}
