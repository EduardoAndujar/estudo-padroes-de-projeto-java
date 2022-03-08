package br.com.dio.gof.singleton;

/**
 * Singleton "pregui�oso".
 * 
 * @author eduardoAndujar
*/

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	// Construtor privado garante que n�o seja poss�vel instanciar esse padr�o de projeto
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
}
