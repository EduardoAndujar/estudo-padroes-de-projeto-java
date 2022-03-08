package br.com.dio.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author eduardoAndujar
*/

public class SingletonEager {
	
	private static SingletonEager instancia= new SingletonEager();;
	
	// Construtor privado garante que não seja possível instanciar esse padrão de projeto
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
	
}
