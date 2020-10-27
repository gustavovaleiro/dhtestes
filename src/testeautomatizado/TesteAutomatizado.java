package testeautomatizado;

public class TesteAutomatizado {

	public static void main(String[] args) {
		CalculadoraTeste calcTeste = new CalculadoraTeste();
		QuadradoTeste quadradoTeste = new QuadradoTeste();
		JurosSimplesTeste jurosSimplesTeste = new JurosSimplesTeste();

		System.out.println("calcTeste.testeSoma() : " + calcTeste.testeSoma());
		System.out.println("calcTeste.testeSubtracao() : " + calcTeste.testeSubtracao());
		System.out.println("calcTeste.testeMultiplicacao() : " + calcTeste.testeMultiplicacao());
		System.out.println("calcTeste.testeDivisao() : " + calcTeste.testeDivisao());
		System.out.println("quadradoTeste.testaConstrutorSucesso() : " + quadradoTeste.testeConstrutorSucesso());
		System.out.println("quadradoTeste.testaConstrutorFalha() : " + quadradoTeste.testeConstrutorFalha());
		System.out.println("quadradoTeste.testeCalcularPerimetro() : " + quadradoTeste.testeCalcularPerimetro());
		System.out.println("quadradoTeste.testeCalcularArea() : " + quadradoTeste.testeCalcularArea());
		System.out.println("jurosSimplesTeste.testaConstrutorSucesso() : " + jurosSimplesTeste.testeConstrutorSucesso());
		System.out.println("jurosSimplesTeste.testaConstrutorFalha() : " + jurosSimplesTeste.testeConstrutorFalha());
		System.out.println("jurosSimplesTeste.calcularMontanteFinalParaSucesso() : " + jurosSimplesTeste.calcularMontanteFinalParaSucesso());
		System.out.println("jurosSimplesTeste.calcularMontanteFinalParaFalha() : " + jurosSimplesTeste.calcularMontanteFinalParaFalha());
		
	}

}
