package br.com.dio.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author eduardoAndujar
*/

public class SingletonEager {
	
	private static SingletonEager instancia= new SingletonEager();;
	
	// Construtor privado garante que n�o seja poss�vel instanciar esse padr�o de projeto
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
	
}
