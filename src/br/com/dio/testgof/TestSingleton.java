package br.com.dio.testgof;

import br.com.dio.gof.singleton.SingletonEager;
import br.com.dio.gof.singleton.SingletonLazy;
import br.com.dio.gof.singleton.SingletonLazyHolder;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lH = SingletonLazyHolder.getInstancia();
		System.out.println(lH);
		lH = SingletonLazyHolder.getInstancia();
		System.out.println(lH);
	}
}
