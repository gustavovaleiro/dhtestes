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

}
