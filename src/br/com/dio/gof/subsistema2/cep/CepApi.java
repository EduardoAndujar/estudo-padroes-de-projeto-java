package br.com.dio.gof.subsistema2.cep;


public class CepApi {
	
private static CepApi instancia= new CepApi();;
	
	// Construtor privado garante que n�o seja poss�vel instanciar esse padr�o de projeto
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Maring�";
	}

	public String recuperarEstado(String cep) {
		return "Paran�";
	}

}
