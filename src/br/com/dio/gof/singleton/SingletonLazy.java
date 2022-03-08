package br.com.dio.gof.singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author eduardoAndujar
*/

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	// Construtor privado garante que não seja possível instanciar esse padrão de projeto
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
