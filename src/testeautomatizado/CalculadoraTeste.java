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
	
	
	public boolean testeMultiplicacao() {
		int resultadoEsperado = 4;
		
		Calculadora calc = new Calculadora();
	
		int resultadoObtido = calc.multiplicacao(2, 2);
		
		return resultadoEsperado == resultadoObtido;
		
	}
	public boolean testeDivisao() {
		int resultadoEsperado = 1;
		
		Calculadora calc = new Calculadora();
	
		int resultadoObtido = calc.divisao(2, 2);
		
		return resultadoEsperado == resultadoObtido;
		
	}
	
	
	// 

}
