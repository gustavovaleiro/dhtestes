package testeautomatizado;

public class QuadradoTeste {

	public boolean testeConstrutorSucesso() {

		try {

			new Quadrado(1);
			return true;
		} catch (RuntimeException ex) {

			return false;

		}

	}

	public boolean testeConstrutorFalha() {

		try {
			new Quadrado(0);
			return false;
		} catch (RuntimeException ex) {
			return true;
		}

	}
	
	public boolean testeCalcularPerimetro() {
		int resultadoEsperado = 8;
		
		Quadrado quadrado = new Quadrado(2);
		
		int resultadoObtido = quadrado.calcularPerimetro();
		
		return resultadoEsperado == resultadoObtido;
	}
	
	public boolean testeCalcularArea() {
		int resultadoEsperado = 4;
		
		Quadrado quadrado = new Quadrado(2);
		
		int resultadoObtido = quadrado.calcularArea();
		
		return resultadoEsperado == resultadoObtido;
	}

}
