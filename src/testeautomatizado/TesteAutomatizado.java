package testeautomatizado;

public class TesteAutomatizado {

	public static void main(String[] args) {
		CalculadoraTeste calcTeste = new CalculadoraTeste();
		QuadradoTeste quadradoTeste = new QuadradoTeste();
		
		System.out.println("calcTeste.testeSoma() : " + calcTeste.testeSoma());
		System.out.println("calcTeste.testeSubtracao() : " + calcTeste.testeSubtracao());
		System.out.println("quadradoTeste.testaConstrutorSucesso() : " + quadradoTeste.testeConstrutorSucesso());
		System.out.println("quadradoTeste.testaConstrutorFalha() : " + quadradoTeste.testeConstrutorFalha());

	}

}
