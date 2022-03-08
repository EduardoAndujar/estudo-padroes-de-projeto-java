package br.com.dio.gof.subsistema2.cep;


public class CepApi {
	
private static CepApi instancia= new CepApi();;
	
	// Construtor privado garante que não seja possível instanciar esse padrão de projeto
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Maringá";
	}

	public String recuperarEstado(String cep) {
		return "Paraná";
	}

}
