package br.com.dio.gof.singleton;

/**
 * Singleton "Lazy Holder".
 *
 * @author eduardoAndujar
*/

public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	
	// Construtor privado garante que não seja possível instanciar esse padrão de projeto
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
	
}
